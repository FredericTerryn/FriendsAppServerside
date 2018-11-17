package fi.haagahelia.friends.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Event {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String eventName;
	private Date date;
	//eventType public, private, whatever
	//categorie: party, ... 
	
	public Event() {
		super();
	}

	public Event(String eventName, Date date) {
		super();
		this.eventName = eventName;
		this.date = date;
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
