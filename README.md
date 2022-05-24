# KnowledgeGraphs
## What is a graph database?

* A graph consists of two elements: a node and relationship.

* Each node represents an entity, and each relationship represents how two nodes are related.

* Relations have the highest priority in the graph database.

* We connect the data…

* But a simple connection is not just enough…data needs to be named somehow.

* The RDF triples enter the game…


## RDF triples (a labelled connection between two resources)

* An RDF triple (s,p,o) is such that:

   * s, p and o stand for subject, property (predicate), and object.

  * s, p are URI-s, i.e., resources on the web; o is a URI or a literal (a constant value).


* RDF is a general model for such triples (with machine readable formats like RDF/XML, Turtle, JasonDB, RXR,…).


## Why do we need a graph database?

* Using graph databases will allow us to generate insight from our existing data.

* Not only graph databases store data relationships; they’re also flexible when expanding a data model or conforming to changing business needs.

* Basic queries run hundreds of times faster on graph databases than relational databases.

* The graph database improves performance increasingly.


## Use cases

* Real-time recommendation engines

* Master data management (MDM)

* Identity and access management (IAM)

* Fraud detection


## How do we build a graph database?
### RDB2RML Mapping 

https://www.w3.org/2001/sw/rdb2rdf/r2rml/

https://rml.io/specs/rml/#named-graph

* A mapping takes as input a logical table.

* A logical table is mapped to a set of triples by a rule called 
     *  triples map

* A triples map has two parts: 
     *  a subject map
     *  several predicate-object maps 
       
## TripleMaps

* Input of a map: 

     *  a row of the logical table


 * Output of a map for each row :

      *  a subject resource, often generated from primary key values 

*  several triples with the same subject, but varying predicates and objects, generated from the attributes of the row



We produce triples by:

* Subject maps
* Predicate maps
* Object maps

## Example

ClientInfo

| LoanNumber | FirstName | DateOfBirth |
| --- | --- | --- |
| 123 | Fred | 1965-10-02 |

* The subject IRI is generated from the LoanNumber column by the template http://qlRDF.com/ClientInfo/{LoanNumber}
* The predicate IRI is the constant ql:Fname
* The object is the literal ”Fred”, that is copied from the FirstName column

## Output

Set of RDF triples

<http://qlRDF.com/ClientInfo/123 >  rdf:type   ql:ClientInfo.

<http://qlRDF.com/ClientInfo/123 >  ql:fname ”Fred".

<http://qlRDF.com/ClientInfo/123 >  ql:dob 1965-10-02.
