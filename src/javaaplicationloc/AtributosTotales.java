package javaaplicationloc;

//Se importa Java.io a la clase para aprovechar funcionalidades
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * AtributosTotales
 */
public class AtributosTotales {

    //Atributo archivo de tipo String
    public String archivo;

    //Se pasan como "paramtros" los datos minimos para que la clase exista
    public AtributosTotales(String archivo){
        this.archivo = archivo;
    }

    //Se crea el Metodo que cuenta los Atributos en el archivo
    public int contarAtributosTotales(String archivo){
        int numeroAtributos = 0;

        //Se manejan los errores con Try-Catch
        try {
            BufferedReader archivoCargado = new BufferedReader(new FileReader(archivo));

            String leerLinea = archivoCargado.readLine();

            while(leerLinea != null) {
                if ((leerLinea.trim().contains("public")||leerLinea.trim().contains("private")) && leerLinea.trim().contains(";")) {
                    numeroAtributos++;
                }
                leerLinea = archivoCargado.readLine();
            }
            System.out.println("Numero TOTAL de Atributos en el codigo es: " + numeroAtributos);
        } catch (IOException e) {
            e.printStackTrace();
        }
        //Retornamos un Entero
        return numeroAtributos;
    }
}