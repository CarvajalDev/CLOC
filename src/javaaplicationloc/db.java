package javaaplicationloc;

//Importamos librerias que nos brindan funcionalidades
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/*
* Clase Base de Datos
*/
public class db {

	//Se carga el Driver de Postgres-JDBC
	//Se conecta a la base de datos existente
	//Se autentica el usario en la base de datos
	String DB = "jdbc:postgresql://localhost:5432/psp";
	String user = "postgres";
	String password = "";

	//Se generan Getters & Setters
	public String getDB() {
		return DB;
	}

	public void setDB(String dB) {
		DB = dB;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	//Metodo para realizar la coneccion
	public Connection conectar() {
		//Atributo de tipo Connection
		Connection conectar = null;
		
		//Manejamos los errores
		try {
			conectar = DriverManager.getConnection(DB, user, password);
		} catch (Exception e) {
			e.printStackTrace();
		}
		//Retornamos  la coneccion con el DriverMananger
		return conectar;
	}

}
