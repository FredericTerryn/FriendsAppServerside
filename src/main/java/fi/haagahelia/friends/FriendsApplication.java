package fi.haagahelia.friends;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

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
public class FriendsApplication  implements CommandLineRunner {

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

			movieRepository.save(new Movie("Inception", "Christopher Nolan", 2009, 9));
			movieRepository.save(new Movie("Interstellar", "Christopher Nolan", 2009, 9));
			movieRepository.save(new Movie("True Grit", "The Nolan Brothers", 2009, 9));
			movieRepository.save(new Movie("Memento", "Christopher Nolan", 2009, 9));
			movieRepository.save(new Movie("Shawshank Redemption", "Frank Darabont", 2009, 9));
			movieRepository.save(new Movie("The Godfather", "Francis coppola", 1972, 9));
			movieRepository.save(new Movie("Dark Knight", "Christopher Nolan", 2008, 9));
			movieRepository.save(new Movie("12 Angry men", "Sidney Lumet", 2009, 9));
			movieRepository.save(new Movie("Schindlers List ", "Steven Spielberg", 1993, 9));
			eventRepository.save(new Event("Party at Heidis beer bar", 19, "2018-11-20", "Iepersestraat 89, 8890 Moorslede"));
			eventRepository.save(new Event("Party at Maxine", 20, "2018-11-21", "Iepersestraat 89, 8890 Moorslede"));
			eventRepository.save(new Event("Drinks", 18, "2018-11-22", "Iepersestraat 89, 8890 Moorslede"));
			eventRepository.save(new Event("MovieNight", 20, "2018-11-22", "Iepersestraat 89, 8890 Moorslede"));
			eventRepository.save(new Event("Happy afternoon", 12, "2018-11-27", "Iepersestraat 89, 8890 Moorslede"));
			eventRepository.save(new Event("Tea-time", 15, "2018-11-24", "Iepersestraat 89, 8890 Moorslede"));
			eventRepository.save(new Event("Nuuksio-trip", 8, "2018-11-29", "Iepersestraat 89, 8890 Moorslede"));
			eventRepository.save(new Event("Party", 21, "2018-11-15", "Iepersestraat 89, 8890 Moorslede"));
			eventRepository.save(new Event("Party", 21, "2018-11-14", "Iepersestraat 89, 8890 Moorslede"));
			eventRepository.save(new Event("Party at Maxine", 20, "2018-11-13", "Iepersestraat 89, 8890 Moorslede"));
			debtRepository.save(new Debt(15, "Johnny", "Jason", "MovieTickets"));
			System.out.println(new Date());
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
