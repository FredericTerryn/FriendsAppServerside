package fi.haagahelia.friends;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
// import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.context.annotation.Bean;

import fi.haagahelia.friends.domain.Borrower;
import fi.haagahelia.friends.domain.BorrowerRepository;
import fi.haagahelia.friends.domain.Debt;
import fi.haagahelia.friends.domain.DebtRepository;
import fi.haagahelia.friends.domain.Event;
import fi.haagahelia.friends.domain.EventRepository;
import fi.haagahelia.friends.domain.Lender;
import fi.haagahelia.friends.domain.LenderRepository;
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
	@Autowired
	private EventRepository eventRepository; 
	@Autowired
	private DebtRepository debtRepository; 
	@Autowired
	private LenderRepository lenderRepository; 
	@Autowired
	private BorrowerRepository borrowerRepository; 

	public static void main(String[] args) {
		SpringApplication.run(FriendsApplication.class, args);

	}

	@Bean
	CommandLineRunner runner() {
		return args -> {

			// username: user password: user
			userRepository
					.save(new User("user", "$2a$04$1.YhMIgNX/8TkCKGFUONWO1waedKhQ5KrnB30fl0Q01QKqmzLf.Zi", "USER"));
			// username: admin password: admin
			User admin = new User("admin", "$2a$04$KNLUwOWHVQZVpXyMBNc7JOzbLiBjb9Tk9bP7KNcPI12ICuvzXQQKG", "ADMIN");
			userRepository.save(admin);

			movieRepository.save(new Movie("Inception", "Christopher Nolan", 2009, 9, admin));
			
			eventRepository.save(new Event("Party at Heidis beer bar", 19, (new Date()), admin));
			eventRepository.save(new Event("Party at Maxine", 20, (new Date(118, 10, 20)), admin));
			debtRepository.save(new Debt(15, "Johnny", "Jason", "MovieTickets"));
			
			lenderRepository.save(new Lender("Frederic Terryn "));
			lenderRepository.save(new Lender("Max Schwind"));
			lenderRepository.save(new Lender("Guillem Nadal"));
			lenderRepository.save(new Lender("Nick Stunnenberg"));
			
			borrowerRepository.save(new Borrower("Frederic Terryn "));
			borrowerRepository.save(new Borrower("Max Schwind"));
			borrowerRepository.save(new Borrower("Guillem Nadal"));
			borrowerRepository.save(new Borrower("Nick StunnenBerg"));
			
		};
	}

	@Override
	public void run(String... args) throws Exception {

	}
}
