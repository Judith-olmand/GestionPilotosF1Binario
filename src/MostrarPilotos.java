import java.util.Set;

public class MostrarPilotos {
    public static void mostrarPilotos(Set<Piloto> pilotos){
        if (pilotos.isEmpty()){
            System.out.println("El listado está vacío.");
        } else {
            for (Piloto piloto : pilotos) {
                System.out.println("꧁꧂ ꧁꧂ ꧁꧂ ꧁꧂ ꧁꧂ ");
                System.out.println();
                System.out.println(GestionPilotosF1Binario.verde + "꧁ Nombre: " + GestionPilotosF1Binario.reset + piloto.getNombre());
                System.out.println(GestionPilotosF1Binario.verde + "꧁   Escudería: " + GestionPilotosF1Binario.reset + piloto.getEscuderia());
                System.out.println(GestionPilotosF1Binario.verde + "꧁       Puntos: " + GestionPilotosF1Binario.reset + piloto.getPuntos());
            }
        }
    }
}
