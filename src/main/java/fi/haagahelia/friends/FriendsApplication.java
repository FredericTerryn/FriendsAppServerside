package fi.haagahelia.friends;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
// import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.context.annotation.Bean;

import fi.haagahelia.friends.domain.Event;

import fi.haagahelia.friends.domain.Movie;
import fi.haagahelia.friends.domain.MovieRepository;
import fi.haagahelia.friends.domain.User;
import fi.haagahelia.friends.domain.UserRepository;


@SpringBootApplication
// @EnableOAuth2Sso
public class FriendsApplication implements CommandLineRunner {
	
	@Autowired 
	private MovieRepository movieRepository; 
	@Autowired 
	private UserRepository userRepository;

	public static void main(String[] args) {
		SpringApplication.run(FriendsApplication.class, args);
		
	}
	
	@Bean 
	CommandLineRunner runner() {
		return args -> {
			
			// username: user password: user
		      userRepository.save(new User("user",
		      "$2a$04$1.YhMIgNX/8TkCKGFUONWO1waedKhQ5KrnB30fl0Q01QKqmzLf.Zi",
		      "USER"));
		      // username: admin password: admin
		      User admin = new User("admin",
				      "$2a$04$KNLUwOWHVQZVpXyMBNc7JOzbLiBjb9Tk9bP7KNcPI12ICuvzXQQKG", 
				      "ADMIN");
		      userRepository.save(admin);
		      
		      movieRepository.save(new Movie("Inception", "Christopher Nolan", 2009, 9, admin));
		};
	}
	
	@Override
	public void run(String... args) throws Exception {

	}
	}
