package it.univaq.disim.mwt.montaintrack.business;

import it.univaq.disim.mwt.montaintrack.domain.Itinerary;

public interface ItineraryService {

	void createItinerary(Itinerary itinerary) throws BusinessException;
	
}
