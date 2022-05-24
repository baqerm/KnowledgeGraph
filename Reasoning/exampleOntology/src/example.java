package exampleOntology;


import org.apache.jena.rdf.model.InfModel;
import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.ModelFactory;
import org.apache.jena.rdf.model.Property;
import org.apache.jena.rdf.model.RDFNode;
import org.apache.jena.rdf.model.Resource;
import org.apache.jena.rdf.model.Statement;
import org.apache.jena.rdf.model.StmtIterator;
import org.apache.jena.reasoner.Reasoner;
import org.apache.jena.reasoner.rulesys.GenericRuleReasoner;
import org.apache.jena.reasoner.rulesys.Rule;
import org.apache.jena.vocabulary.RDFS;
import org.apache.jena.vocabulary.OWL;

public class example
{

	public static void main(String[] args) 
	{
		Model model = ModelFactory.createDefaultModel();
		model.read( "example.ttl" );
		
		Reasoner reasoner = new GenericRuleReasoner( Rule.rulesFromURL( "rules.txt" ) );
		
		InfModel infModel = ModelFactory.createInfModel( reasoner, model );
		String URI1 = "http://qlRDF.com/hasSamePhone";
		String URI2 = "http://qlRDF.com/phoneNumber";
		Resource hasSamePhone = (Resource) model.getProperty(URI1);
		Resource phoneNumber = (Resource) model.getProperty(URI2);
		infModel.add(hasSamePhone, RDFS.subPropertyOf, phoneNumber);

		// print out the statements in the model
		StmtIterator it = infModel.listStatements();
		
		while ( it.hasNext() )
		{
			Statement stmt = it.nextStatement();
			
			Resource subject = stmt.getSubject();
			Property predicate = stmt.getPredicate();
			RDFNode object = stmt.getObject();

			System.out.println( subject.toString() + " " + predicate.toString() + " " + object.toString() );
		}
		infModel.write(System.out, "Turtle");
	}
}



