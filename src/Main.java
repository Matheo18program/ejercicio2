package guiado1;

public class Main {
    public static void main(String[] args) {

        Dispositivo di1 = new Dispositivo();
        Dispositivo di2 = new Dispositivo();

        di1.nombre = "teclado";
        di1.tipo = "entrada";
        di1.activo = true;

        di2.nombre = "monitor";
        di2.tipo = "salida";
        di2.activo = false;

        di1.mostrarInformacion();
        System.out.println();
        di1.mostrarEstado();
        System.out.println("\n");

        di2.mostrarInformacion();
        System.out.println();
        di2.mostrarEstado();
        di1.activo = false;
        System.out.println("\n");
        di1.mostrarEstado();

        di1.activar();
        di2.activar();
    }
}