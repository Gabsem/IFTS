package service;

import domain.Studente;

public interface StudenteService {
	
	public void postStudente();
	
	public void getAllStudente();
	public Studente getStudenteById(int idDaCercare);
	public void getStudenteByMatricola();
	public void getStudenteByNome();
	public void getStudenteByNomeAndCognome();
	
	public void putStudente();
	
	public void deleteStudente();
}
