package javaaplicationloc;

//Se importa Java.io a la clase para aprovechar funcionalidades
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * ComentariosTotales
 */
public class ComentariosTotales {
    //Atributo archivo de tipo String
    public String archivo;

    //Se pasan como "paramtros" los datos minimos para que la clase exista
    public ComentariosTotales(String archivo){
        this.archivo = archivo;
    }

    //Se crea el Metodo que cuenta los Comentarios en el archivo
    public int contarComentariosTotales(String archivo){
        int numeroComentarios = 0;

        //Se manejan los errores con Try-Catch
        try {
            BufferedReader cargarArchivo = new BufferedReader(new FileReader(archivo));

            String leerLinea = cargarArchivo.readLine();

            while(leerLinea != null) {
                if(leerLinea.contains("/") || leerLinea.contains("*")){
                    numeroComentarios++;
                }
                leerLinea = cargarArchivo.readLine();
            }
            System.out.println("Numero TOTAL de comentarios es: " + numeroComentarios);
            
        } catch (IOException e) {
            e.printStackTrace();
        }
        //Retornamos un Entero
        return numeroComentarios;
    }

    
}