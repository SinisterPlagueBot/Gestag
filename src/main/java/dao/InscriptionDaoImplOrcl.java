package dao;

import java.sql.Connection;
import java.util.List;

import beans.Inscription;

public class InscriptionDaoImplOrcl implements InscriptionDao {
	Connection cnx;
	
	public InscriptionDaoImplOrcl(DataSource ds) {
		
		this.cnx = ds.getConnection();
	}

	@Override
	public void insertInscription(Inscription inscription) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Inscription> selectInscriptionByCode(String codeInscription) {
		// TODO Auto-generated method stub
		return null;
	}

}
