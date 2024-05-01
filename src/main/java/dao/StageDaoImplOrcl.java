package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


import beans.Stage;

public class StageDaoImplOrcl implements StageDao {
	Connection cnx ;
	public StageDaoImplOrcl(DataSource ds) {
		
			cnx=ds.getConnection();
		
	}
	public List<Stage> selectAllByDate() {
	String query ="select * from STAGE order by DEBUT_STAGE desc ";
	List<Stage> stages =new ArrayList<>();
	
	try {
		Statement st = cnx.createStatement();
		ResultSet rs = st.executeQuery(query);
		
		while(rs.next()) {
			Stage stage = new Stage(
					rs.getString(1),
					rs.getString(2),
					rs.getString(3),
					rs.getString(4),
					rs.getInt(5),
					rs.getInt(6)
					);
			stages.add(stage);
		}
		   st.close();
           rs.close();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return stages;
	
	
	}

	@Override
	public List<Stage> selectAllByType() {
		String query ="select * from STAGE order by TYPE_STAGE desc ";
		List<Stage> stages =new ArrayList<>();
		
		try {
			Statement st = cnx.createStatement();
			ResultSet rs = st.executeQuery(query);
			
			while(rs.next()) {
				Stage stage = new Stage(
						rs.getString(1),
						rs.getString(2),
						rs.getString(3),
						rs.getString(4),
						rs.getInt(5),
						rs.getInt(6)
						);
				stages.add(stage);
			}
			   st.close();
	            rs.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return stages;
		
	}
	

	public Stage selectById(int code_stage) {
	    String query = "SELECT * FROM STAGE WHERE CODE_STAGE =" + code_stage;
	    Stage stage = null;
	    try {
	        Statement st = cnx.createStatement();
	        ResultSet rs = st.executeQuery(query);
	        if (rs.next()) {
	            // Print the contents of the ResultSet for debugging
	           

	            stage = new Stage(
	                rs.getString(1),
	                rs.getString(2),
	                rs.getString(3),
	                rs.getString(4),
	                rs.getInt(5),
	                rs.getInt(6)
	            );
	            st.close();
	            rs.close();
	            System.out.println("Stage object created: " + stage);
	        } else {
	            System.out.println("No rows found for CODE_STAGE: " + code_stage);
	        }
	    } catch (SQLException e) {
	        System.out.println("Error executing query: " + query);
	        e.printStackTrace();
	    }
	    return stage;
	}


}
