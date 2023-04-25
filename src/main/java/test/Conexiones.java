package test;

public class Conexiones {

	public Conexiones() {
		this.setBDMysql();
		this.setBDSQL();
	}

	public String BDSQL;
	public String BDMysql;

	public String getBDMysql() {
		return BDMysql;
	}

	private void setBDMysql() {
		BDMysql = "Server=myServerMYSQLTest;Database=myDataBase;User Id=myUsername;Password=myPassword;";
	}

	public String getBDSQL() {
		return BDSQL;
	}

	private void setBDSQL() {
		BDSQL = "Server=myServerAddressTest;Database=myDataBase;User Id=myUsername;Password=myPassword;";
	}
		
	
}
