package fi.haagahelia.friends.domain;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="debts")
public class Debt {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false, updatable= false)
    private Long id;
  	@Column(nullable = false)
  	private int amount;
  	private String borrower; 
  	private String lender;
  	private String reason; 
  	
	public Debt() {
		super();
	}
	public Debt(int amount, String borrower, String lender, String reason) {
		super();
		this.amount = amount;
		this.borrower = borrower;
		this.lender = lender;
		this.reason = reason;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public String getBorrower() {
		return borrower;
	}
	public void setBorrower(String borrower) {
		this.borrower = borrower;
	}
	public String getLender() {
		return lender;
	}
	public void setLender(String lender) {
		this.lender = lender;
	} 
	
  	
  	
}
