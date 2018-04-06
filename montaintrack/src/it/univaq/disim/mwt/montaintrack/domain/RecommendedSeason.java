package it.univaq.disim.mwt.montaintrack.domain;

public enum RecommendedSeason {

	estate, primavera, autunno, inverno;
	
	private String recommended_season;

	public String getRecommended_season() {
		return recommended_season;
	}

	public void setRecommended_season(String recommended_season) {
		this.recommended_season = recommended_season;
	}
}
