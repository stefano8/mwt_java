package it.univaq.disim.mwt.montaintrack.domain;

import java.util.Date;

public class Review {

	private Long id;
	private Date data;
	private String title;
	private String body;
	private Approved approved;
	// relazione con User e Itinerary (1,N)
	private User user;
	private Itinerary itinerary;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public Approved getApproved() {
		return approved;
	}

	public void setApproved(Approved approved) {
		this.approved = approved;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Itinerary getItinerary() {
		return itinerary;
	}

	public void setItinerary(Itinerary itinerary) {
		this.itinerary = itinerary;
	}

}
