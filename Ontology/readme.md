## Ontology

An ontology 

* is a formal description of knowledge (ideas, facts, things—whatever) in a way that defines the relationships and classifications of concepts within a specified domain.

* consists of a collection of classes, properties, and optionally instances. 

* enables us to define a variety of useful relationships among items of knowledge.

* is understandable by machines and allows reasoning.

RDFs, OWL (Web Ontology Language), FOAF are some popular predefined vocabularies for representing an ontology. 

### Why develop an ontology?

* To share common understanding of the structure of information.

* To enable reuse of domain knowledge.

* To analyze domain knowledge

### Ontology development tools

* There are so many ontology editors available for free. Some of them are like: Apollo, OntoStudio, Protégé, Swoop and TopBraid.


The ontologies for level 1 (person-party metadata) and level 2 (logical metadata) are developed in Protégé. 

### Protégé

Protégé is one of the most widely used ontology development tools which is a free, open-source platform to construct domain models and knowledge-based applications with Ontologies. 

It is an ontology editor which we can use to define classes and hierarchy, relationships between classes and properties of these relationships.  

Download, Install and Start Protégé Desktop from the [Protege website](https://protege.stanford.edu/). You only need to follow the step-by-step instuctions to install it on your own machine. 

Here are some good resources for learning Protégé, if someone is interested:

https://ontology101tutorial.readthedocs.io/en/latest/StartingProtege.html

https://people.cs.vt.edu/~kafura/ComputationalThinking/Class-Notes/Tutorial-Highlighted-Day1.pdf

### An ontology development processes

Steps to develope an ontology includes:

* defining classes (i.e.  in the ontology, Classes describe concepts in the domain; Person, LoanInfo, Address for instance)

* arranging the classes in a taxonomic (subclass–superclass) hierarchy,

* defining relationships between classes (i.e. object properties) and describing allowed values for them (i.e. assigning domains and ranges).

* arranging data properties in a taxonomic (subproperty-superproperty) hierarchy and defining constraints.

 Protege uses the Manchester OWL syntax to describe the relationships between concepts and their properties. 


![Class Hierarchy](/Ontology/classHierarchy.png)


![Visualization of Ontology](/Ontology/visual.png)




