package fi.haagahelia.friends.domain;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;



@Entity
public class Movie {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String title;
	private String director;
	private int year;
	private int score;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name= "user")
	private User user;
	
	public long getId() {
		return id;
	}
	
	public Movie(String title, String director, int year, int score, User user) {
		super();
		this.title = title;
		this.director = director;
		this.year = year;
		this.score = score;
		this.user = user;
		
	}
	public Movie() {
		super();
	}
	
	
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public void setId(long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	@Override
	public String toString() {
		return "Movie [id=" + id + ", title=" + title + ", director=" + director + ", year=" + year + ", score=" + score
				 + "]";
	}
	
	
}
