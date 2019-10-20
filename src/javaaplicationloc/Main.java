/**
 * 
 */
package javaaplicationloc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

//@author Hector Carvajal - Asignatura PSP

public class Main {

	/**
	 * @param args
	 * @throws SQLException 
	 */
	public static void main(String[] args) throws SQLException {
        
        //Archivo que será leido
        String archivo = "C://Users/h_car/OneDrive/Documentos/Platzi/CursoPOOUber/Java/Car.java";
        
        //Se crean las instancias de las clases
        LineasTotales conteo1 = new LineasTotales(archivo);

        AtributosTotales conteo2 = new AtributosTotales(archivo);

        MetodosTotales conteo3 = new MetodosTotales(archivo);

        LineasVaciasTotales conteo4 = new LineasVaciasTotales(archivo);

        ComentariosTotales conteo5 = new ComentariosTotales(archivo);

        LineasFuncionalesTotales conteo6 = new LineasFuncionalesTotales(22, 21);


        //Se maneja la coneccion a base de datos
        db baseDato = new db();
        Connection conn = baseDato.conectar();
        
        String sqlInsert = "insert into datos (metodos, atributos, comentarios, lineas_vacias, ";
        sqlInsert += "lineas_funcionales, lineas_totales) values(?,?,?,?,?,?)";
        
        PreparedStatement statement = conn.prepareStatement(sqlInsert);
        statement.setInt(1, conteo3.contarMetodosTotales(archivo));
        statement.setInt(2, conteo2.contarAtributosTotales(archivo));
        statement.setInt(3, conteo5.contarComentariosTotales(archivo));
        statement.setInt(4, conteo4.contarLineasVacias(archivo));
        statement.setInt(5, conteo6.contarLineasFuncionales(22, 21));
        statement.setInt(6, conteo1.contarLineasTotales(archivo));
        
        statement.executeUpdate();
        
	}

}
