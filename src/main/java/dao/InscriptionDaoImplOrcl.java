package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import beans.Inscription;
import beans.Stagiaire;

public class InscriptionDaoImplOrcl implements InscriptionDao {
	Connection cnx;
	
	public InscriptionDaoImplOrcl(DataSource ds) {
		
		this.cnx = ds.getConnection();
	}

	@Override
	public void insertInscription(Inscription inscription) {
		 try {
		        String query = "INSERT INTO INSCRPITION VALUES (?, ? , TO_DATE(?, 'YYYY/MM/DD'),?, ?)";
		        PreparedStatement preparedStatement = cnx.prepareStatement(query);
		        
		        // Set values for parameters
		        preparedStatement.setString(1, inscription.getCode_stage());
		        preparedStatement.setString(2, inscription.getNum_stagiaire());
		        preparedStatement.setString(3, inscription.getDate_inscription());
		        preparedStatement.setString(4, inscription.getStatus_insc());
		        preparedStatement.setString(5, inscription.getCode_position());
		        
		        // Execute the PreparedStatement
		        preparedStatement.executeUpdate();

		        // Commit the transaction
		        cnx.commit();
		        
		        // Close the PreparedStatement (optional, as it will be closed automatically when the method ends)
		        preparedStatement.close();
		    } catch (SQLException e) {
		        // Handle SQLException
		        e.printStackTrace();
		    }
		
	}

	@Override
	public List<Inscription> selectInscriptionByCode(String codeInscription) {
		String query = "SELECT * FROM INSCRIPTION WHERE CODE_STAGE="+codeInscription;
	    List<Inscription> inscriptions=new ArrayList<>();
	    try {
	        Statement st = cnx.createStatement();
	        ResultSet rs = st.executeQuery(query);
	        while (rs.next()) {
	            // Print the contents of the ResultSet for debugging
	           

	            Inscription inscription = new Inscription(
	                rs.getString(1),
	                rs.getString(2),
	                rs.getString(3),
	                rs.getString(4),
	                rs.getString(5)
	            );
	           inscriptions.add(inscription);
	           
	    }
	        st.close();
            rs.close();
           cnx.commit();
       } catch (SQLException e) {
	        System.out.println("Error executing query: " + query);
	        e.printStackTrace();
	    }
	    return inscriptions;
	
	}

}
