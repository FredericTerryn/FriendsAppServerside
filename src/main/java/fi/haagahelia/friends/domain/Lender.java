package fi.haagahelia.friends.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="lenders")
public class Lender {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(nullable = false)
	private String name;
	
	
	public Lender() {
		super();
	}


	public Lender(String name) {
		super();
		this.name = name;
	} 
	
}
