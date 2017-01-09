**If you are looking for the newest versions of all of the NoSQL engineering projects (the base model, the inference process, the visualization tools...), please refer to our official GitHub repository in https://github.com/catedrasaes-umu/NoSQLDataEngineering**

**-* NoSQLVisualizationTools is a M.Sc.Thesis on New Technologies in Computer Science from the University of Murcia. It provides a serie of projects for NoSQL Data and Schema visualization *-** 

These projects are divided into two visualization tools with different purposes: Schema visualization and Data visualization on NoSQL databases. There is also a 'Documents' folder in which the following content is stored:

* This project's Master Thesis PDF and slides, in spanish.
* 2016 SiriusCon abstract and slides used in the talk, in english.

# Schema visualization

<figure>
	<img src="figures/schemaprocess.png" alt="schemaprocess" align="center">
</figure>
<br/>

The first tool is designed to represent schemas and schema versions in a friendly way using Sirius (https://eclipse.org/sirius/). Sirius is a modeling tool used to generate graphical DSLs in an easy way, but also to define a suitable representation for a given model. A NoSQL schema is a schema used to define which data and in which format is being stored in a NoSQL database. This schema is not explicitly defined but inferred by a data-oriented infererence process. As a result of this inference progress a NoSQL\_Schema model is given, and this model is the input for the visualization process.

<figure>
	<img src="figures/nosqlschema.png" alt="nosqlschema" align="center">
</figure>
<br/>

This NoSQL\_Schema model is then transformed by a m2m transformation into an Extended\_NoSQL\_Schema which is a model with the same structure as the given input model but also with inferred schema versions on it. Schema versions are generated for each root version (an entity version hich is not aggregated by anything) and is compounded by that root version and all the entities and versions aggregated and/or referenced from it.

<figure>
	<img src="figures/enosqlschema.png" alt="enosqlschema" align="center">
</figure>
<br/>

Once an Extended\_NoSQL\_Schema model is generated the Sirius workbench can be used to visualize the result. The graphic suite represents a model by giving several viewpoints representations:

* A tree representation in which all schema versions are listed as well as the entity versions (ordered alphabetically).

<figure>
	<img src="figures/treeentityview.png" alt="treeentityview" align="center">
</figure>
<br/>

* A diagram representation to visualize the global schema with its entities, versions and attributes.

<figure>
	<img src="figures/globalview.png" alt="globalview" align="center">
</figure>
<br/>

* Two diagram representations associated with each schema version.

<figure>
	<img src="figures/schema2view.png" alt="schema2view" align="center">
</figure>
<br/>

* A diagram representation associated to each entity.

The projects involved in this visualization tool are the following:

* NoSQLSchema: Project with the NoSQL\_Schema and the Extended\_NoSQL\_Schema metamodel definitions and the m2m transformation to generate Extended\_NoSQL\_Schema models.
* NoSQLSchema.edit and NoSQLSchema.editor: Projects used by the modeling infrastructure to generate an Eclipse model editor.
* NoSQLSchema.FeatureProject: The feature project to group the NoSQLSchema metamodel plugins.
* NoSQLSchema.design: The Sirius workbench project in which the viewpoints are defined.
* NoSQLSchemaVisualization.FeatureProject: The feature project in which the Sirius visualization plugin is stored.
* NoSQLSchema.UpdateSite: The update site containing the defined feature projects.

# Data visualization

<figure>
	<img src="figures/dataprocess.png" alt="dataprocess" align="center">
</figure>
<br/>

This second visualization tool is used to draw different graphics representing the data classification of a NoSQL database. Every database has a way of exporting its data as a JSON object collection. The only requirement for this process is (i) to define a NoSQL\_Schema model for the database involved and (b) making sure each object of the JSON input file has a defined id field of some kind as well as a "type" attribute indicating its type (the entity it belongs to).

<figure>
	<img src="figures/versiondiff.png" alt="versiondiff" align="center">
</figure>
<br/>

The NoSQL\_Schema model will then be transformed by a m2m transformation into a Version\_Diff model which defines, for each version entity (each JSON object) a collection of HasField and HasNotField defining how the version is composed, by which properties and with which types. Now a m2t transformation can be executed which in the end will generate JavaScript.

<figure>
	<img src="figures/versiondiffexample.png" alt="versiondiffexample" align="center">
</figure>
<br/>

Once the m2t transformation is finished a HTML5/JS project is created with an index.html. Giving a proper JSON object collection file it is possible to classify this collection into its entities and versions and represent the results with D3.js graphics.

<figure>
	<img src="figures/d3donuts.png" alt="d3donuts" align="center">
</figure>
<br/>

<figure>
	<img src="figures/d3tree.png" alt="d3tree" align="center">
</figure>
<br/>

The projects involved in this visualization tool are the following:

* NoSQLDataVisualization: Project with the Version\_Diff metamodel definition. It also contains all the m2m and m2t transformations, and references the NoSQLSchema project.
* NoSQLDataVisualization.edit and NoSQLDataVisualization.editor: Projects used by the modeling infrastructure to generate an Eclipse model editor.
* NoSQLDataVisualization.FeatureProject: The feature project in which the Version\_Diff metamodel is contained.

Also in the NoSQLDataIndex project several examples can be found. Each example is contained in a folder with the JavaScript code already generated. To start each example, just open the index.html file in a web browser.

Cheers!
