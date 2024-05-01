package utils;

import dao.OracleDataSource;

import java.sql.SQLException;

import beans.Stagiaire;
import dao.DataSource;
import dao.InscriptionDao;
import dao.InscriptionDaoImplOrcl;
import dao.StageDao;
import dao.StageDaoImplOrcl;
import dao.StagiaireDao;
import dao.StagiaireDaoImplOrcl;
import dao.UserDaoImplOrcl;

public class Test {

	public static void main(String[] args) {
		DataSource db=new OracleDataSource();
		UserDaoImplOrcl userMan =new UserDaoImplOrcl(db);
		//System.out.println(userMan.selectUser("mehdi", "mehdi"));
		StageDao stageMan =new StageDaoImplOrcl( db);
		StageDaoImplOrcl stageMan2 =new StageDaoImplOrcl( db);
	//System.out.println(stageMan.selectById(2));
	//System.out.println(stageMan.selectAllByDate());
	//System.out.println(stageMan.selectAllByType());
		StagiaireDao stagiaireMan =new StagiaireDaoImplOrcl(db);
		Stagiaire stagiaire = new Stagiaire("07","mehdi","kasmi","M","04/04/03","bac");
		//stagiaireMan.insert(stagiaire);
		System.out.println(stagiaireMan.selectAll());
		InscriptionDao inscriptionMan = new InscriptionDaoImplOrcl(db);
		System.out.println(inscriptionMan.selectInscriptionByCode("1"));
	}

}
