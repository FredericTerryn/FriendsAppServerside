package fi.haagahelia.friends.domain;

import java.util.Date;
import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface EventRepository extends CrudRepository<Event, Long> {

	//Fetch by date
	List<Event> findByDate(@Param("date") Date date);
	
	List<Event> findByEventName(@Param("eventName") String eventName);
	
	List<Event> findById(@Param("id") long id);
	
}
