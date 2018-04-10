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

	private String url;
	private String username;
	private String password;
	
	//costruttore
	public JDBCItineraryService(String url, String username, String password) {
		super();
		this.url = url;
		this.username = username;
		this.password = password;
		
	}
	
	@Override
	public void createItinerary(Itinerary itinerary) throws BusinessException {
		
		Connection con = null;
		PreparedStatement ps = null;
		
		try {
			con = DriverManager.getConnection(url, username, password);
			
			 String sql = "insert into itineraries (id, name, difficolty, difference, duration, address, latitude, longitude, recommended_season, description)  "
			 		+ "values (1, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
			 
			 ps = con.prepareStatement(sql);
			 ps.setString(1, itinerary.getName());
			 ps.setString(2, "facile");
			 ps.setDouble(3, itinerary.getDifference());
			 ps.setDouble(4,itinerary.getDuration());
			 ps.setString(5, itinerary.getAddress());
			 ps.setDouble(6, itinerary.getLatitude());
			 ps.setDouble(7, itinerary.getLongitude());
			 ps.setString(8, "estate");
			 ps.setString(9, itinerary.getDescription());
			 
			 
			 ps.executeUpdate();
			 
					
		} catch (SQLException e) {
			e.printStackTrace();
			throw new BusinessException(e);
		
		} finally {
			
			if (ps != null) {
				try {
					ps.close();
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
