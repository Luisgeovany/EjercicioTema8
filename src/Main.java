public class Main {
    public static void main(String[] args) {

        Persona luis = new Persona();
        luis.setNombre("Luis Geovany");
        luis.setEdad(32);
        luis.setTelefono(318654);
        System.out.println(luis.getNombre());
        System.out.println(luis.getEdad());
        System.out.println(luis.getTelefono());


    }
}
class Persona {
    private String nombre;
    private int edad;
    private int telefono;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre(){
        return this.nombre;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public int getEdad(){
        return this.edad;

    }
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    public int getTelefono(){
        return this.telefono;
    }
}