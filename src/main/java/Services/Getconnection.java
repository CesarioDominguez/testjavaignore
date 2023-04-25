package Services;
import  test.Conexiones;


public class Getconnection {
	
	
	
	public String getMYSQLconnection(){		
		 Conexiones connect = new Conexiones();		 
		 return connect.getBDMysql();		
	}
	
	public String getSQLconnection(){		
		 Conexiones connect = new Conexiones();		 
		 return connect.getBDSQL();		
	}

}
