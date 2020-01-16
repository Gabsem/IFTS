package serviceImpl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import dbConn.DbConnection;
import domain.Studente;
import service.StudenteService;

public class StudenteServiceImpl implements StudenteService {

	@Override
	public void postStudente() {
		System.out.println("Request to post one studente");
		// 1. connessione al db
		DbConnection db = new DbConnection();
		Statement st = db.connetti();
		// 1.5 creare lo studente da inserire nel db
		Studente nuovo = new Studente(0, "luca", "verdi", "10");
		try {
			// 2. eseguire la query
			// TODO: da modificare
			String query = "insert into studente(nome, cognome, matricola) "+
							"values('{1}','{2}','{3}')";
			query = query.replace("{1}", nuovo.getNome());
			query = query.replace("{2}", nuovo.getCognome());
			query = query.replace("{3}", nuovo.getMatricola());
			System.out.println("Controllo query:\n" + query);
			int res = st.executeUpdate(query);
			// 3. visualizzare i risultati
			System.out.println("modificate " + res + " righe");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void getAllStudente() {
		System.out.println("Request to get all studenti");
		// 1. connessione al db
		DbConnection db = new DbConnection();
		Statement st = db.connetti();
		
		try {
			// 2. eseguire la query
			ResultSet rs = st.executeQuery("select * from studente");
			
			// 3. visualizzare i risultati
			System.out.println("id - cognome - matricola - nome");
			while(rs.next()) {
				System.out.println(rs.getInt("id")+ " " + 
									rs.getString("cognome") + " " +
									rs.getString("matricola") + " " +
									rs.getString("nome") + 
									" ");
			} // end while
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	} // end getAllStudente()

	@Override
	public Studente getStudenteById(int idDaCercare) {
		System.out.println("Request to get the studente with id = " + idDaCercare);
		Statement st = new DbConnection().connetti();
		try {
			ResultSet rs = st.executeQuery("select * from studente where id =" + idDaCercare);
			if(rs.next()) {
				Studente found = new Studente(  rs.getInt("id"), 
												rs.getString("nome"),
												rs.getString("cognome"),
												rs.getString("matricola"));
				return found;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public void getStudenteByMatricola() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getStudenteByNome() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getStudenteByNomeAndCognome() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void putStudente() {
		System.out.println("request to update one studente");
		DbConnection db = new DbConnection();
		Statement st = db.connetti();
		
		String query = "update studente set cognome='', nome = '' where cognome = ''";
		
		try {
			int res = st.executeUpdate(query);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void deleteStudente() {
		int idDaCancellare = 2;
		System.out.println("Request to delete one studente");
		// 1. connessione al db
		DbConnection db = new DbConnection();
		Statement st = db.connetti();
		
		// 1.5 creare lo studente da inserire nel db
		try {
			// 2. eseguire la query
			// TODO: da modificare
			Studente s = this.getStudenteById(idDaCancellare);
			if(s == null) {
				System.out.println("L'id selezionato non esiste");
				return;
			}
			String query = "delete from studente where id="+idDaCancellare;
			System.out.println("Controllo query:\n" + query);
			int res = st.executeUpdate(query);
			// 3. visualizzare i risultati
			System.out.println("modificate " + res + " righe");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	

}
