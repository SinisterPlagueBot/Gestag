package business;

import java.util.List;

import beans.Stagiaire;
import dao.StagiaireDao;

public class StagiaireManager implements StagiaireBusiness{
	private StagiaireDao std;
	
	
	public StagiaireManager() {
	}

	public StagiaireManager(StagiaireDao std) {
		this.std = std;
	}

	public StagiaireDao getStd() {
		return std;
	}

	public void setStd(StagiaireDao std) {
		this.std = std;
	}

	public void addStagiaire(Stagiaire stagiaire) {
		std.insert(stagiaire);
	}

	public Stagiaire listStagiaire(String name) {
		return std.selectByName(name);
	}

	public List<Stagiaire> listAll() {
		return std.selectAll();
	}



}
