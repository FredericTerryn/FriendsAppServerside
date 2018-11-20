package fi.haagahelia.friends.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Borrowers")
public class Borrower {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(nullable = false)
	private String name;
	
	
	public Borrower() {
		super();
	}


	public Borrower(String name) {
		super();
		this.name = name;
	} 
	
}
