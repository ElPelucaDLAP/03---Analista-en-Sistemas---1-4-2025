public class Clientes {
    String nombre;
    String Correo;
    String numTelefono;

    public Clientes(String nombre, String correo, String numTelefono) {
        this.nombre = nombre;
        this.Correo = correo;
        this.numTelefono = numTelefono;
    }
    public Clientes() {

    }
    public String getNombre() {
        return nombre;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String correo) {
        Correo = correo;
    }

    public String getNumTelefono() {
        return numTelefono;
    }

    public void setNumTelefono(String numTelefono) {
        this.numTelefono = numTelefono;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public  String toString() {
        return ("Nombre: " +this.nombre)+"\n"+
                "Correo: " +this.Correo+"\n"+
                "Numero de Telefono: "+this.numTelefono+"\n";
    }
}
