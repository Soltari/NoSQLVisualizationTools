package schema.utils.io;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import Extended_NoSQL_Schema.Extended_NoSQL_SchemaPackage;
import Extended_NoSQL_Schema.NoSQLDataModel;

/**
 * Class used to read an Extended_NoSQL_Schema model from an input file or a String.
 * Implemented as a Singleton.
 * @author Alberto Hernández Chillón
 */
public class ENoSQLSchemaIO
{
	/**
	 * Singleton reference.
	 */
	private static ENoSQLSchemaIO instance;

	/**
	 * ResourceSet used to generate resource models.
	 */
	private ResourceSet resourceSet;

	/**
	 * Method used to get the ENoSQLSchemaIO instance.
	 * @return NoSQLSchemaIO instance.
	 */
	public static ENoSQLSchemaIO getInstance()
	{
		if (instance == null)
			instance = new ENoSQLSchemaIO();

		return instance;
	}

	/**
	 * Default private constructor. Initializes the ResourceSet and the factory.
	 */
	private ENoSQLSchemaIO()
	{
		resourceSet = new ResourceSetImpl();
		resourceSet.getPackageRegistry().put(EcorePackage.eNS_URI, EcorePackage.eINSTANCE);
		resourceSet.getPackageRegistry().put(Extended_NoSQL_SchemaPackage.eNS_URI, Extended_NoSQL_SchemaPackage.eINSTANCE);		// Extended_NoSQL_Schema metamodel
		Map<String, Object> options = resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap();
		options.put(Resource.Factory.Registry.DEFAULT_EXTENSION, new XMIResourceFactoryImpl());
		options.put("ecore", new EcoreResourceFactoryImpl());
	}
	/**
	 * Method used to read a model from a local file and create a NoSQLSDataModel model from it.
	 * @param routeToModel The route to the model file in a string.
	 * @return A NoSQLDataModel object containing the file model.
	 */
	public NoSQLDataModel readNoSQLDataModel(String routeToModel)
	{
		File theSchemaFile = new File(routeToModel);

		if (!theSchemaFile.exists() || !theSchemaFile.isFile())
			return null;

		Resource resource = resourceSet.getResource(URI.createFileURI(theSchemaFile.getAbsolutePath()), true);

		if (resource != null && !resource.getContents().isEmpty())
			return (NoSQLDataModel)resource.getContents().get(0);
		else
			return null;
	}

	/**
	 * Method used to read a model from a string and create a NoSQLDataModel model from it.
	 * @param dummy_model_uri The model route, just to create a key in the ResourceSet.
	 * @param model_text The textual model.
	 * @return A NoSQLDataModel object containing the textual model.
	 * @throws IOException
	 */
	public NoSQLDataModel readNoSQLDataModel(String dummy_model_uri, String model_text) throws IOException 
	{
		Resource resource = resourceSet.createResource(URI.createURI(dummy_model_uri));
		resource.load(new ByteArrayInputStream(model_text.getBytes()), resourceSet.getLoadOptions());

		if (resource != null && !resource.getContents().isEmpty())
			return (NoSQLDataModel)resource.getContents().get(0);
		else
			return null;
	}

	/**
	 * Method used to write a NoSQLDataModel model into a given file.
	 * @param schema The schema to be written.
	 * @param modelPath The route to the file which will contain the model.
	 */
	public void write(NoSQLDataModel schema, String modelPath)
	{
		Resource resource = resourceSet.createResource(URI.createFileURI(modelPath));
		resource.getContents().add(schema);

		try
		{
			resource.save(Collections.EMPTY_MAP);
		} catch (IOException e1)
		{
			e1.printStackTrace();
		}
	}
}
