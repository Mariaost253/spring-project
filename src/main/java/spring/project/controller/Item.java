package spring.project.controller;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Item {

	//@GeneratedValue(strategy=GenerationType.AUTO)
	private int no;
	private String item;
	private String name;
	private int amount;
	private String invCode;
	
	public Item() {}
	
	public Item(String item, int no, String name, int amount, String invCode) {
		super();
		this.no = no;
		this.item = item;
		this.name = name;
		this.amount = amount;
		this.invCode = invCode;
	}

	
	public String getItem() {
		return item;
	}
	public void setItem(String item) {
		this.item = item;
	}
	@Id
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public String getInvCode() {
		return invCode;
	}
	public void setInvCode(String invCode) {
		this.invCode = invCode;
	}
	
	
	
}
