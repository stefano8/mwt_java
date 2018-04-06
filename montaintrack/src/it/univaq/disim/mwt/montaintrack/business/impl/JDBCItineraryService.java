package it.univaq.disim.mwt.montaintrack.business.impl;

import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;

import it.univaq.disim.mwt.montaintrack.business.BusinessException;
import it.univaq.disim.mwt.montaintrack.business.ItineraryService;
import it.univaq.disim.mwt.montaintrack.domain.Itinerary;

public class JDBCItineraryService implements ItineraryService{

	@Override
	public void createItinerary(Itinerary itinerary) {
		
		Connection con = null;
		PreparedStatement ps = null;
		Statement st = null;
		int rs = 0;
		
		//con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mwt_java","mwt","mwt");
			
	

 }
	
}
