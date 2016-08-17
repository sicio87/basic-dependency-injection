package eu.karols.springtutorial.api;

import eu.karols.springtutorial.domain.User;

public interface UsersRepository {
	User createUser(String name);
	void setLogger(Logger logger);
}
