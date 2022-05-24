## Reasoning with knowledge graphs and ontologies

Here we apply reasoning (inferencing) to an existing ontology 

* to infer new information that is somehow implicitly represented.
* to entail a fact based on some defined rules.


In this study we developed knowledge graphs on metadata level as well as on actual data. 

### Reasoner on metadata level

As mentioned in the ontology section, we used protégé to develop ontologies on metadata. Protégé contains built-in reasoners that extracts new relationships between concepts (classes), properties and data properties. Some examples of inference rules are like:

* (X R Y), (R subPropertyOf Q) => (X Q Y) 
* (X R Y), (R domain C) => (X type C) 
* (X type C), (C subClassOf D) => (X type D)


### Reasoner on actual data

For actual relational data, we first of all create a mapping of relational data into RDF triples (subject, predicate, and object). We write an R2RML mapping document to get a more customized mapping. 

Once the triples are ready, we utilize Apache Jena which is a free and opensource Java framework for building and managing any RDF data applications. The framework contains different APIs interacting together to process RDF data.

[This website](https://jena.apache.org/tutorials/) is a good resource to learn Apache Jena. 

Apache Jena provides a set of Java APIs including Reasoner, ReasonerFactory, 
InfModel, OntModelSpec, OntModel and more. Please visit  http://jena.apache.org/documentation/inference/index.html for more details. 




  
