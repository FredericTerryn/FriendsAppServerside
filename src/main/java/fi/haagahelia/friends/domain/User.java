package fi.haagahelia.friends.domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="users")
public class User {
	  	@Id
	  	@GeneratedValue(strategy = GenerationType.IDENTITY)
	  	@Column(nullable = false, updatable= false)
	    private Long id;
	  	@Column(nullable = false, unique =true)
	  	private String username;
	  	@Column(nullable=false)
	  	private String password;
	  	@Column(nullable = false)
	  	private String role;
	    private String firstName;
	    private String lastName;
	    @OneToMany(cascade = CascadeType.ALL, mappedBy="user")
	    @JsonIgnore
	    private List<Movie> movies;
	    @OneToMany(cascade =  CascadeType.ALL, mappedBy="proposer")
	    @JsonIgnore
	    private List<Event> events;
	    
	    
	    public User() {}
	    
	    
	    public List<Movie> getMovies() {
			return movies;
		}

		public void setMovies(List<Movie> movies) {
			this.movies = movies;
		}

		public User(String username, String password, String role) {
			super();
			this.username = username;
			this.password = password;
			this.role = role;
		}



		public User(String username, String password, String role, String firstName, String lastName) {
			super();
			this.username = username;
			this.password = password;
			this.role = role;
			this.firstName = firstName;
			this.lastName = lastName;
		}

	    


		public Long getId() {
			return id;
		}


		public void setId(Long id) {
			this.id = id;
		}


		public String getUsername() {
			return username;
		}

		public void setUsername(String username) {
			this.username = username;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public String getRole() {
			return role;
		}

		public void setRole(String role) {
			this.role = role;
		}

		public String getFirstName() {
			return firstName;
		}

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		public String getLastName() {
			return lastName;
		}

		public void setLastName(String lastName) {
			this.lastName = lastName;
		}

		@Override
	    public String toString() {
	        return String.format(
	                "Customer[id=%s, firstName='%s', lastName='%s']",
	                id, firstName, lastName);
	    }

}
