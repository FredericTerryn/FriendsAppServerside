package fi.haagahelia.friends.web;

import java.io.Console;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import fi.haagahelia.friends.domain.Event;
import fi.haagahelia.friends.domain.EventRepository;
import fi.haagahelia.friends.domain.Movie;
import fi.haagahelia.friends.domain.MovieRepository;
import fi.haagahelia.friends.domain.User;
import fi.haagahelia.friends.domain.UserRepository;


@Controller
public class Friendscontroller {

	//attributes
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private MovieRepository movieRepository;
	@Autowired
	private EventRepository eventRepository;
	
	// begin show OPENINGSPAGE
	
	@RequestMapping(value = "/hello")
	public String indexPage(Model model) {
		//model.addAttribute("users", userRepository.findAll());
		return "hello";
	}

	@GetMapping("/")
	public String index() {
		return "hello";
	}
	
	// End show openingspage
	
	
	
	//REST Begin
	
	//rest to find Movies
	@RequestMapping(value="/MOVIES")
	public @ResponseBody Iterable<Movie> movieListRest(){
		return movieRepository.findAll();
	}
	
	//rest to find Users
	@RequestMapping(value="/USERS")
	public @ResponseBody List<User> userListRest(){
		return (List<User>) userRepository.findAll();
	}
	
	//rest to find Events
	@RequestMapping(value="/EVENTS")
	public @ResponseBody List<Event> eventListRest(){
		return (List<Event>) eventRepository.findAll();
	}
	
//REST end 
	
	@RequestMapping(value="/movies")
	public String MoviesPage(Model model){
		model.addAttribute("movies", movieRepository.findAll());
		return "MoviesList";
	}

	
	//general begin
	
	//general end
	
	//add movies begin
	
	//add movies end

}
