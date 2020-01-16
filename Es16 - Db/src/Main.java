

import java.sql.SQLException;

import serviceImpl.EsameServiceImpl;
import serviceImpl.StudenteServiceImpl;

public class Main {

	public static void main(String[] args) throws SQLException {
		StudenteServiceImpl ssi = new StudenteServiceImpl();
//		ssi.getAllStudente();
//		ssi.postStudente();
//		ssi.deleteStudente();
//		ssi.putStudente();
		
		EsameServiceImpl esi = new EsameServiceImpl();
		esi.postEsame();
		
	}
	
}
