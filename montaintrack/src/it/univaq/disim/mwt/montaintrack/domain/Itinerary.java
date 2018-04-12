package it.univaq.disim.mwt.montaintrack.domain;

import java.util.HashSet;
import java.util.Set;

public class Itinerary {

	private Long id;
	private String name;
	private Difficolty difficolty;
	private double difference;
	private double duration;
	private String address;
	private double latitude;
	private double longitude;
	private RecommendedSeason recommendedSeason;
	private String description;
	// relazione con Image (1,1)
	private Image image;
	//relazione con Category (N,N)
	private Set<Category> categories = new HashSet<>(); //private Category[] categories;
		

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Difficolty getDifficolty() {
		return difficolty;
	}

	public void setDifficolty(Difficolty difficolty) {
		this.difficolty = difficolty;
	}

	public Double getDifference() {
		return difference;
	}

	public void setDifference(Double difference) {
		this.difference = difference;
	}

	public Double getDuration() {
		return duration;
	}

	public void setDuration(Double duration) {
		this.duration = duration;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public RecommendedSeason getRecommendedSeason() {
		return recommendedSeason;
	}

	public void setRecommendedSeason(RecommendedSeason recommendedSeason) {
		this.recommendedSeason = recommendedSeason;
	}

	public Image getImage() {
		return image;
	}

	public void setImage(Image image) {
		this.image = image;
	}

	

	public Double getLatitude() {
		return latitude;
	}

	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}

	public Double getLongitude() {
		return longitude;
	}

	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Set<Category> getCategories() {
		return categories;
	}

	public void setCategories(Set<Category> categories) {
		this.categories = categories;
	}

}
