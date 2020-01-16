package serviceImpl;

import java.sql.SQLException;
import java.sql.Statement;

import dbConn.DbConnection;
import domain.Esame;
import service.EsameService;

public class EsameServiceImpl implements EsameService {

	@Override
	public void postEsame() {
		System.out.println("Request to post one esame");
		// 1. connessione al db
		DbConnection db = new DbConnection();
		Statement st = db.connetti();
		// 1.5 creare lo studente da inserire nel db
		Esame nuovo = new Esame(10, 12, "geo", "geografia");
		try {
			// 2. eseguire la query
			// TODO: da modificare
			String query = "insert into esame(cfu, codice, nome) values(12,'geo','geografia ')";
			
			int res = st.executeUpdate(query);
			// 3. visualizzare i risultati
			System.out.println("modificate " + res + " righe");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void getAllEsame() {
		// TODO Auto-generated method stub
		
	}
	
	
	}

	

	