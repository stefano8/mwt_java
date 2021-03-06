package it.univaq.disim.mwt.montaintrack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import it.univaq.disim.mwt.montaintrack.business.BusinessException;
import it.univaq.disim.mwt.montaintrack.business.ItineraryService;
import it.univaq.disim.mwt.montaintrack.business.impl.JDBCItineraryService;
import it.univaq.disim.mwt.montaintrack.domain.Difficolty;
import it.univaq.disim.mwt.montaintrack.domain.Itinerary;
import it.univaq.disim.mwt.montaintrack.domain.RecommendedSeason;

public class Montaintrack {
	
	//per poter leggere linea per linea, usiamo questa classe (input stream leggeva byte per byte)
	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

	//per connessione aal database
	private static ItineraryService itineraryService = new JDBCItineraryService("jdbc:mysql://localhost:3306/mwt_java", "mwt", "mwt");

	
	public static void main(String[] args) throws IOException, BusinessException, ClassNotFoundException {
		
		Class.forName("com.mysql.jdbc.Driver");
		
		while(true) {
			
			System.out.println("1. Inserimento Itinerario;");
			System.out.println("2. Fine;");
			
			String line = reader.readLine();
			
			switch(line) {
				case "1":
					creaItinerario();
					break;
				case "2":
					return;
					
				default:
					;
			
			}
		}

	}

	private static void creaItinerario()  throws IOException, BusinessException {

		//chiedo tutti gli attributi
		System.out.println("Nome:");
		String name = reader.readLine();
		
		//System.out.print("Difficoltà:");
		//Difficolty difficolty = Difficolty.difficile;     
	
		System.out.println("Dislivello:");
		Double difference = (double) reader.read();
		
		System.out.println("Durata:");
		Double duration = (double) reader.read();
		
		System.out.println("Indirizzo:");
		String address = reader.readLine();
		
		System.out.println("Latitudine:");
		Double latitude = (double) reader.read();
		
		System.out.println("Longitudine:");
		Double longitude = (double) reader.read();
		
		//System.out.print("Stagione Consigliata:");
		//RecommendedSeason recommendedSeason = RecommendedSeason.autunno;
		
		System.out.println("Descrizione:");
		String description = reader.readLine();
		
		
		Itinerary itinerary = new Itinerary();
		
		itinerary.setName(name);
		//itinerary.setDifficolty(difficolty);
		itinerary.setDifference(difference);
		itinerary.setDuration(duration);
		itinerary.setAddress(address);
		itinerary.setLatitude(latitude);
		itinerary.setLongitude(longitude);
		//itinerary.setRecommendedSeason(recommendedSeason);
		itinerary.setDescription(description);
		
		itineraryService.createItinerary(itinerary);
	}

}
