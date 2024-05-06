package business;

import java.util.List;

import beans.Stagiaire;

public interface StagiaireBusiness {
	public void addStagiaire(Stagiaire stagiaire);
	public Stagiaire listStagiaire(String name);
	public List<Stagiaire> listAll();
}
