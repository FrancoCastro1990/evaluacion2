package datos;

public class Datos {

    String nombre;
    String apellido;
    String rut;
    Double nota1;
    Double nota2;
    Double nota3;

    public Datos() {
    }

    public Datos(String nombre, String apellido, String rut, Double nota1, Double nota2, Double nota3) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.rut = rut;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
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

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getAprovado() {
        if (this.Getpromedio() >= 3.95) {
            return "Felicitaciones,estas APROBADO";
        } else {
            return "Disculpa, has REPROBADO";
        }
    }

    public Double Getpromedio() {
        return (this.nota1 + this.nota2 + this.nota3) / 3;
    }

    public Double getNota1() {
        return nota1;
    }

    public void setNota1(Double nota1) {
        this.nota1 = nota1;
    }

    public Double getNota2() {
        return nota2;
    }

    public void setNota2(Double nota2) {
        this.nota2 = nota2;
    }

    public Double getNota3() {
        return nota3;
    }

    public void setNota3(Double nota3) {
        this.nota3 = nota3;
    }
}
