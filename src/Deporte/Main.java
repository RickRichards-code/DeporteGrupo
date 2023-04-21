package Deporte;

public class Main {
    public static void main(String[] args) {
//        System.out.printf("Hello and welcome!");
        DAtletismoR A1 = new DAtletismoR("atletismo","bolivia");
        A1.mostrar();
        DFutbol F1 = new DFutbol("Futbol");
        F1.mostrar();
        F1.mostrarNacinalidadX("argentina");
        System.out.printf("---- g) Verificar si el nombre de algún integrante del Objeto DAtletismoR existe en el Objeto DFutbol");
//        if(A1.exite(F1))
//            System.out.printf("existe");
//        else
//            System.out.printf("no existe");
//        System.out.printf("---- h) Eliminar al i-esimo integrante del Objeto DFutbo-----");
        A1.eli(3);
        A1.mostrar();
    }
}