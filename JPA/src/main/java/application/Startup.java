package application;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import domain.Person;

public class Startup {
	
	public static void main(String[] args) {
		
		Person person = new Person();
		person.setId(null);
		person.setName("Jo?o Gabriel Carvalho");
		person.setEmail("27.joaogabriel@gmai.com");
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		entityManager.getTransaction().begin();
		entityManager.persist(person);
		entityManager.getTransaction().commit();
		
		Person result = entityManager.find(Person.class, 1);
		
		entityManager.close();
		entityManagerFactory.close();
		
		
		System.out.println(result);
	}

}
