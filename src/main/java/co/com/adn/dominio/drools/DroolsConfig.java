package co.com.adn.dominio.drools;

import org.drools.KnowledgeBase;
import org.drools.KnowledgeBaseFactory;
import org.drools.builder.KnowledgeBuilder;
import org.drools.builder.KnowledgeBuilderFactory;
import org.drools.builder.ResourceType;
import org.drools.io.ResourceFactory;
import org.drools.runtime.StatefulKnowledgeSession;

import co.com.adn.dominio.excepcion.ExcepcionReglaDroolsAfiliacion;

public class DroolsConfig {
	
	private static KnowledgeBase knowledgeBase;
	
	private DroolsConfig() {}

	private static StatefulKnowledgeSession getSession() {
		return getIntanceKnowledgeBase().newStatefulKnowledgeSession();
	}
	
	private static KnowledgeBase getIntanceKnowledgeBase() {
		if (knowledgeBase == null) {
			KnowledgeBuilder builder = KnowledgeBuilderFactory.newKnowledgeBuilder();

			builder.add(ResourceFactory.newClassPathResource("drools/reglas.drl"), ResourceType.DRL);
			if (builder.hasErrors()) {
				System.out.println("Errores al crear el builder: " + builder.getErrors().toString());
				throw new ExcepcionReglaDroolsAfiliacion(builder.getErrors().toString());
			}
			knowledgeBase = KnowledgeBaseFactory.newKnowledgeBase();
			knowledgeBase.addKnowledgePackages(builder.getKnowledgePackages());
			System.out.println("Se define nueva sesion de KnowledgeBase");
		}
		return knowledgeBase;
	}
	
	public static int aplicarReglasDrools(Object object) {
		StatefulKnowledgeSession session = getSession();
        session.insert(object);
        int total = session.fireAllRules();
        session.dispose();
		return total;
	}
	
}
