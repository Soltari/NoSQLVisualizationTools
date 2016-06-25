package schema;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;

import Extended_NoSQL_Schema.NoSQLDataModel;
import NoSQL_Schema.NoSQLSchema;
import schema.transform.M2M;
import schema.utils.io.ENoSQLSchemaIO;
import schema.utils.io.NoSQLSchemaIO;
import schema.utils.serializer.ENoSQLSchemaSerializer;
import schema.utils.serializer.NoSQLSchemaSerializer;

public class Main
{
	private static final String MODEL_INPUT_FOLDER = "examples/models/";

	private static final String MODEL_OUTPUT_FOLDER = "examples/schemas/";

	private static final String INPUT_MODEL_EXT = ".nosql_schema";

	private static final String OUTPUT_MODEL_EXT = ".extended_nosql_schema";

	public static void main(String[] args)
	{
		NoSQLSchemaIO nosql_io = NoSQLSchemaIO.getInstance();
		ENoSQLSchemaIO enosql_io = ENoSQLSchemaIO.getInstance();

		// If no arguments were provided, get the default folder and start generating schemas for each model.
		if (args.length == 0)
		{
			System.out.println("WARNING: No models were provided. Working with default settings.\n");
			System.out.println("Working with models in folder: " + MODEL_INPUT_FOLDER);
			System.out.println("Generating schemas in folder: " + MODEL_OUTPUT_FOLDER);

			File inputFolder = new File(MODEL_INPUT_FOLDER);

			if (!inputFolder.exists())
				System.out.println("Default folder doesn't exist.");

			for (File file : inputFolder.listFiles())
			{
				System.out.println("Generating schemas for " + file.getPath());
				enosql_io.write(M2M.getInstance().transform(nosql_io.readNoSQLSchema(file.getPath())), MODEL_OUTPUT_FOLDER + file.getName().replace(INPUT_MODEL_EXT, OUTPUT_MODEL_EXT));
			}
		}
		// Parse arguments if they were provided.
		else
		{
			Collection<File> modelList = new ArrayList<File>();
			boolean verbose = false;
			String outputRoute = MODEL_OUTPUT_FOLDER;

			for (String param : args)
			{
				// Verbose mode.
				if (param.equals("--v"))
					verbose = true;

				// Output folder.
				else if (param.startsWith("--o="))
					outputRoute = param.replace("--o=", "");

				else
					modelList.add(new File(param));
			}

			System.out.println("Generating schemas in folder: " + outputRoute);

			// Generate schemas for each given model.
			for (File inputModel : modelList)
			{
				if (!inputModel.exists())
				{
					System.err.println(inputModel + " doesn't exist. Skipping generation.");
					continue;
				}

				System.out.println("Generating schemas for " + inputModel.getPath());

				NoSQLSchema schemaObject = nosql_io.readNoSQLSchema(inputModel.getPath());

				if (verbose)
					System.out.println(NoSQLSchemaSerializer.getInstance().stringify(schemaObject));

				NoSQLDataModel dataModelObject = M2M.getInstance().transform(schemaObject);

				if (verbose)
					System.out.println(ENoSQLSchemaSerializer.getInstance().stringify(dataModelObject));

				enosql_io.write(dataModelObject, outputRoute + inputModel.getName().replace(INPUT_MODEL_EXT, OUTPUT_MODEL_EXT));
			}
		}
	}
}
