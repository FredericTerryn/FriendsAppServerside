package fi.haagahelia.friends;



import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;
import static org.assertj.core.api.Assertions.assertThat;

import fi.haagahelia.friends.domain.Movie;
import fi.haagahelia.friends.domain.MovieRepository;
import fi.haagahelia.friends.domain.User;
import fi.haagahelia.friends.domain.UserRepository;

@RunWith(SpringRunner.class)
@DataJpaTest //tests focus on JPA components
public class StudentRepositoryTest {
	
	@Autowired
	private TestEntityManager entityManager;
	@Autowired
	private UserRepository userrepo;
	@Autowired
	private MovieRepository movierepo;
	
	//test: add a new movie to database
	/*@Test
	public void saveMovie() {
		Movie movie = new Movie("Memento", "Christopher Nolan", 1999, 9);
		entityManager.persistAndFlush(movie);
		assertThat(movie.getId()).isNotNull();
	}
	
	//test: delete all movies results in empty table
	@Test
	public void deleteMovies() {
		entityManager.persistAndFlush(new Movie("The hunger games", "Suzanne Collins", 2014, 7));
		entityManager.persistAndFlush(new Movie("Shutter island", "Christopher Nolan", 2009, 9));
		
		movierepo.deleteAll();
		assertThat(movierepo.findAll()).isEmpty();
	}
	
	//test if you can get users out of repo (will never be null because there's always the admin)
	@Test
	public void findallUserShouldReturnAList() {
		List<User> users = (List<User>) userrepo.findAll();
		assertThat(users).isNotNull();
	}
	*/
}











