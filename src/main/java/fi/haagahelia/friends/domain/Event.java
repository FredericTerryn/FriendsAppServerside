package fi.haagahelia.friends.domain;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
@Entity
public class Event {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String eventName;
	private double startingHour;
	private Date date;
	private String location; 
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn (name= "proposer")
	private User proposer; 
	//eventType public, private, whatever
	//categorie: party, ... 
	
	public Event() {
		super();
	}



	public Event(String eventName, double startingHour, String date, String location) {
		super();
		this.eventName = eventName;
		this.startingHour = startingHour;
		SimpleDateFormat parser=new SimpleDateFormat("yyyy-MM-dd");
		
		try {
			this.date = parser.parse(date);
		} catch (ParseException e) {
			
			e.printStackTrace();
		}
		//this.proposer = proposer;
		this.location = location;
	}



	public double getStartingHour() {
		return startingHour;
	}



	public void setStartingHour(double startingHour) {
		this.startingHour = startingHour;
	}

	

	public String getLocation() {
		return location;
	}



	public void setLocation(String location) {
		this.location = location;
	}



	public User getProposer() {
		return proposer;
	}



	public void setProposer(User proposer) {
		this.proposer = proposer;
	}



	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getEventName() {
		return eventName;
	}

	public void setEventName(String eventName) {
		this.eventName = eventName;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Event [eventName=" + eventName + ", date=" + date + "]";
	}
	
	
	
}
