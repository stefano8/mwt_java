package it.univaq.disim.mwt.montaintrack.business.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import it.univaq.disim.mwt.montaintrack.business.BusinessException;
import it.univaq.disim.mwt.montaintrack.business.ItineraryService;
import it.univaq.disim.mwt.montaintrack.domain.Difficolty;
import it.univaq.disim.mwt.montaintrack.domain.Itinerary;

public class JDBCItineraryService implements ItineraryService{

	@Override
	public void createItinerary(Itinerary itinerary) throws BusinessException {
		
		Connection con = null;
		PreparedStatement ps = null;
		Statement st = null;
		int rs = 0;
		
		
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mwt_java", "mwt", "mwt");
			
			 String sql = "insert into itineraries (name, difficolty, difference, duration, address, latitude, longitude, recommended_season, description)  "
			 		+ "values (? , ?, ? , ?, ? , ?, ? , ?, ? , ?)";
			 
			 ps = con.prepareStatement(sql);
			 ps.setString(1, itinerary.getName());
			 //ps.setDouble(2, itinerary.getDifficolty());
			 ps.setDouble(3, itinerary.getDifference());
			 ps.setDouble(4,itinerary.getDuration());
			 ps.setString(5, itinerary.getAddress());
			 ps.setDouble(6, itinerary.getLatitude());
			 ps.setDouble(7, itinerary.getLongitude());
			 //ps.setRecommendedSeason(8, itinerary.getRecommendedSeason());
			 ps.setString(9, itinerary.getDescription());
			 
			 
			 rs = ps.executeUpdate();
			 
					
		} catch (SQLException e) {
			e.printStackTrace();
			throw new BusinessException(e);
		
		} finally {
			
			if (st != null) {
				try {
					st.close();
				}catch (SQLException e) {
					// TODO: handle exception
				}
			}
			if (con != null) {
				try {
					con.close();
				}catch (SQLException e) {
					// TODO: handle exception
				}
			}
		}
	

 }
	
}
