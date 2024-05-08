package dao;

import java.util.List;

import beans.Inscription;

public interface InscriptionDao {
	public void insertInscription(Inscription inscription);
	public List<Inscription> selectInscriptionByCode(String codeInscription);
	public void updateInscription(Inscription inscription);
	
}
