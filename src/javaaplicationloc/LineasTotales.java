package javaaplicationloc;

//Se importa Java.io a la clase para aprovechar funcionalidades
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

/**
 * LineasTotales
 */
public class LineasTotales {
     //Atributo archivo de tipo String
    public String archivo;

    //Se pasan como "paramtros" los datos minimos para que la clase exista
    public LineasTotales(String archivo) {
        this.archivo = archivo;
    }

    //Se crea el Metodo que cuenta las lineas Totales en el archivo
    public int contarLineasTotales(String archivo){
        
            int contadorNumeroLineas = 0;

            //Se manejan los errores con Try-Catch
            try {
                FileReader leerArchivo = new FileReader(archivo);
                LineNumberReader numeroLineas = new LineNumberReader(leerArchivo);

                    while (numeroLineas.readLine() != null) {
                        contadorNumeroLineas++;
                    }
                    System.out.println("Numero TOTAL de lineas contadas: " + contadorNumeroLineas);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            //Retornamos un Entero
            return contadorNumeroLineas;
    }
}