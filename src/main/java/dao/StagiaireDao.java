package dao;

import java.util.List;

import beans.Stagiaire;

public interface StagiaireDao {
	public void insert(Stagiaire stagiaire);
	public Stagiaire selectByName(String name);
	public List<Stagiaire> selectAll();
}
