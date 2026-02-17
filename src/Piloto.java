import java.io.Serializable;
import java.util.Objects;

public class Piloto implements Serializable {
    private String nombre;
    private String escuderia;
    private int puntos;

    public Piloto(String nombre, String escuderia, int puntos) {
        this.nombre = nombre;
        this.escuderia = escuderia;
        this.puntos = puntos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEscuderia() {
        return escuderia;
    }

    public void setEscuderia(String escuderia) {
        this.escuderia = escuderia;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    @Override
    public String toString() {
        return "Piloto{" +
                "nombre='" + nombre + '\'' +
                ", escuderia='" + escuderia + '\'' +
                ", puntos=" + puntos +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Piloto piloto = (Piloto) o;
        //Son iguales si el nombre es igual o si todos los atributos son iguales
        return Objects.equals(nombre, piloto.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre);
    }
}
