import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Logger;

public class Baglanti {
	
	private String kullan�c�_adi="root";
	private String parola="";
	private String db_ismi="demo";
	private String host="localhost";
	private int port =3306;
	
	
	private Connection con=null;
	
	
	public Baglanti() {
		String url="jdbc:mysql://"+host+":"+port+"/"+db_ismi;
		                        
	
	try {
Class.forName("com.mysql.jdbc.Driver");

	} catch (ClassNotFoundException ex) {
	
	System.out.println("Driver bulunamad�..");
	
	
	
	}
	
	try {
		
		con=DriverManager.getConnection(url,kullan�c�_adi,parola);
	System.out.println("Ba�lant� ba�ar�l�����.");
	
	} catch (SQLException e) {
		System.out.println("Ba�lant� ba�ar�s�zzzz.");
		
	}
	
	}
	
	public static void main(String[] args) {
		
		
		Baglanti baglanti =new Baglanti();
	}
}
