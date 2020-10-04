package practico_7;
public class Cliente{
    private String nombre;
    private String apellido;
    private String ciudad;
    private String direccion;
    private long dni;

    public Cliente(String nombre, String apellido, String ciudad, String direccion, int dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.ciudad = ciudad;
        this.direccion = direccion;
        this.dni = dni;
    }

    
    public long getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "NOMBRE: " + nombre + "| APELLIDO: " + apellido + "| CIUDAD: " + ciudad + "| DIRECCION: " + direccion + "| DNI: " + dni;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Cliente other = (Cliente) obj;
        if (this.dni != other.dni) {
            return false;
        }
        return true;
    }

    
    
    
}