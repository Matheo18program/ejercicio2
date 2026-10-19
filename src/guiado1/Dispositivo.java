package guiado1;

public class Dispositivo {

    public String nombre;
    String tipo;
    public boolean activo;

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre); // Muestra los demás atributos
        System.out.println("Tipo: " + tipo);
        System.out.println("Activo: " + activo);
    }
    void mostrarEstado(){ // Mostrar Estado
        String estado = activo? "activo": "inactivo";
        System.out.println(nombre + " "+ estado);
    }
    void activar(){
        if (activo ==false)
            activo = true;
        System.out.println("El" + nombre+"esta activo");
    }
}
