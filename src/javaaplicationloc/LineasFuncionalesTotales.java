package javaaplicationloc;

/**
 * LineasFuncionalesTotales
 */
public class LineasFuncionalesTotales {
    //Atributo archivo de tipo Entero para operaciones
    public int numeroMetodos;
    public int numeroAtributos;

    //Se pasan como "paramtros" los datos minimos para que la clase exista
    public LineasFuncionalesTotales(int numeroMetodos, int numeroAtributos){
        this.numeroMetodos = numeroMetodos;
        this.numeroAtributos = numeroAtributos;
    }

    //Se crea el Metodo que cuenta las lineas Funcionales en el archivo
    public int contarLineasFuncionales(int numeroMetodos, int numeroAtributos){
        int numeroCodigoFuncional = (numeroMetodos + numeroAtributos);
        System.out.println("Numero TOTAL de lineas Funcionales es: " + numeroCodigoFuncional);
        //Retornamos un Entero
        return numeroCodigoFuncional;
    }
}