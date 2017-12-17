package com.javainuse.main;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

import com.javainuse.model.Location;
import com.javainuse.model.Product;

public class DroolsTest {

	public static final void main(String[] args) {
		KieServices ks = KieServices.Factory.get();
		KieContainer kContainer = ks.getKieClasspathContainer();
		KieSession ksession = kContainer.newKieSession("ksession-rule");

		Location location = new Location("Europe", "World");
		Product product1 = new Product("Books", 10, location);
		Product product2 = new Product("Computer", 15, location);
		Product product3 = new Product("CD", 20, location);
		
		
		ksession.insert(location);
		
		ksession.insert(product1);
		ksession.insert(product2);
		ksession.insert(product3);

		ksession.fireAllRules();
	}

}
