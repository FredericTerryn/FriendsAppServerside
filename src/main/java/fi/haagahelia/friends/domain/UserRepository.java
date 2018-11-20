package fi.haagahelia.friends.domain;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@Repository
@RepositoryRestResource
public interface UserRepository extends CrudRepository<User, Long> {

	// Fetch users by username
	List<User> findByusername(@Param("username") String username);
	  
	User findByUsername(String username);
	
}
