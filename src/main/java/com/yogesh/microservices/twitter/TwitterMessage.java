package com.yogesh.microservices.twitter;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class TwitterMessage {
	
	@Id
	private int id;	

	@Column
	private String message;
	
	public TwitterMessage() {
		// TODO Auto-generated constructor stub
	}
	
	public TwitterMessage(int id, String message) {
		super();
		this.id = id;
		this.message = message;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "TwitterMessage [id=" + id + ", message=" + message + "]";
	}

}
