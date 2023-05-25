package Abcs;

public class Persona {
    private String nombre, sexo, nacionalidad, estadoCivil,
    telefono,correo;
    private int edad;
    public Persona(){
        this.nombre = "";
        this.sexo = "";
        this.nacionalidad = "";
        this.estadoCivil = "";
        this.telefono = "";
        this.correo = "";
        this.edad = 0;
    }

    public Persona(String nombre, String genero, String nacionalidad, String estadoCivil, String telefono, String correo, int edad) {
        this.nombre = nombre;
        this.sexo = genero;
        this.nacionalidad = nacionalidad;
        this.estadoCivil = estadoCivil;
        this.telefono = telefono;
        this.correo = correo;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
