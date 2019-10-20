package javaaplicationloc;

//Se importa Java.io a la clase para aprovechar funcionalidades
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * LineasVaciasTotales
 */
public class LineasVaciasTotales {
    //Atributo archivo de tipo String
    public String archivo;

    //Se pasan como "paramtros" los datos minimos para que la clase exista
    public LineasVaciasTotales(String archivo){
        this.archivo = archivo;
    }

    //Se crea el Metodo que cuenta las lineas Vacias en el archivo
    public int contarLineasVacias(String archivo){
        int numeroLineasVacias = 0;

        //Se manejan los errores con Try-Catch
        try {

            BufferedReader archivoCargado = new BufferedReader(new FileReader(archivo));

            String leerLinea = archivoCargado.readLine();

            while(leerLinea != null){
                if(leerLinea.isEmpty()){
                    numeroLineasVacias++;
                }
                leerLinea = archivoCargado.readLine();
            }
            System.out.println("Numero TOTAL de Lineas Vacias es: " + numeroLineasVacias);
            archivoCargado.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        //Retornamos un Entero
        return numeroLineasVacias;
    }

    
}