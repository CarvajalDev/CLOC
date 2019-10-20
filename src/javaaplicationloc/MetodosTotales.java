package javaaplicationloc;

//Se importa Java.io a la clase para aprovechar funcionalidades
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

//MetodosTotales
public class MetodosTotales {

    //Atributo archivo de tipo String
    public String archivo;

    //Se pasan como "paramtros" los datos minimos para que la clase exista
    public MetodosTotales(String archivo){
        this.archivo = archivo;
    }

    //Se crea el Metodo que cuenta la cantidad de Metodos en el archivo
    public int contarMetodosTotales(String archivo){ 
        int numeroMetodos = 0;

        //Se manejan los errores con Try-Catch
        try {
            BufferedReader archivoCargado = new BufferedReader(new FileReader(archivo));

            String leerLinea = archivoCargado.readLine();

            while(leerLinea != null) {
                if((leerLinea.contains("public") || leerLinea.contains("private") || leerLinea.contains("protected"))
                    && leerLinea.contains("(") && leerLinea.contains(")")){
                        numeroMetodos++;
                }
                leerLinea = archivoCargado.readLine();
            }
            System.out.println("Numero TOTAL de Metodos en el codigo es: " + numeroMetodos);
            archivoCargado.close();          
        } catch (IOException e) {
            e.printStackTrace();
        }
        //Retornamos un Entero
        return numeroMetodos;

    } 
}