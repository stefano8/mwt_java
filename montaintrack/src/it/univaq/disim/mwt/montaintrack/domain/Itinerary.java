package it.univaq.disim.mwt.montaintrack.domain;

public class Itinerary {

	private Long id;
	private String name;
	private Difficolty difficolty;
	private Double difference;
	private Double duration;
	private String address;
	private Double latitude;
	private Double longitude;
	private RecommendedSeason recommendedSeason;
	// relazione con Image (1,1)
	private Image image;
	//relazione con Category (N,N)
	private Category[] categoriesItineraries;

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

	public Category[] getCategoriesItineraries() {
		return categoriesItineraries;
	}

	public void setCategoriesItineraries(Category[] categoriesItineraries) {
		this.categoriesItineraries = categoriesItineraries;
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

}
