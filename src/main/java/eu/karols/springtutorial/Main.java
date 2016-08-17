package eu.karols.springtutorial;

import eu.karols.springtutorial.api.Logger;
import eu.karols.springtutorial.api.UsersRepository;
import eu.karols.springtutorial.domain.User;
import eu.karols.springtutorial.implementations.LoggerImpl;
import eu.karols.springtutorial.implementations.UsersRepositoryImpl;

public class Main {

	public static void main(String[] args) {
		Logger logger = new LoggerImpl();
		UsersRepository usersRepository = new UsersRepositoryImpl();
		usersRepository.setLogger(logger);
		
		User user = usersRepository.createUser("Janek");
		
	}

}
