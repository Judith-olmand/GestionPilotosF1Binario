import java.util.Scanner;
import java.util.Set;

public class BuscarPiloto {
    public static void buscarPiloto(Set<Piloto> pilotos, Scanner sc) {
        boolean pilotoEncontrado = false;

        if (pilotos.isEmpty()) {
            System.out.println("El listado está vacío");
        } else {
            System.out.println("Escribe el piloto:");
            String nombrePiloto = sc.nextLine();
            for (Piloto piloto : pilotos) {
                if (piloto.getNombre().equalsIgnoreCase(nombrePiloto)) {
                    System.out.println("El piloto existe en la base de datos");
                    System.out.println(GestionPilotosF1Binario.verde + "Nombre: " + GestionPilotosF1Binario.reset + piloto.getNombre());
                    System.out.println(GestionPilotosF1Binario.verde + "   Escudería: " + GestionPilotosF1Binario.reset + piloto.getEscuderia());
                    System.out.println(GestionPilotosF1Binario.verde + "       Puntos: " + GestionPilotosF1Binario.reset + piloto.getPuntos());
                    pilotoEncontrado = true;
                    break;
                }
            }
            if (pilotoEncontrado == false) {
                System.out.println("Piloto no encontrado en la base de datos");
            }
        }


    }
}
