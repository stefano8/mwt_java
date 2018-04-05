package it.univaq.disim.mwt.montaintrack.domain;

public class Wishlist {

	private Long id;
	// relazione con User e Itinerary (1,N)
    private User user;
	private Itinerary itinerary;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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
