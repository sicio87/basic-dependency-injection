package eu.karols.springtutorial;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import eu.karols.springtutorial.api.UsersRepository;

public class MainSpring {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("configuration.xml");

		UsersRepository usersRepository = context.getBean("repositoryUsers", UsersRepository.class);
		usersRepository.createUser("Mietek");
	}

}
