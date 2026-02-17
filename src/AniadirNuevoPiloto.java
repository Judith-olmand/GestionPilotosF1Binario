import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class AniadirNuevoPiloto {
    public static Set<Piloto> aniadirPilotos(Set<Piloto> pilotos, Scanner sc) {
        boolean valorValido = false;
        System.out.println("Escribe el nombre del piloto.");
        String nombrePiloto = sc.nextLine();
        Piloto pilotoBuscado = new Piloto(nombrePiloto, "", 0);

        if (pilotos.contains(pilotoBuscado)) {
            System.out.println("El nombre" + nombrePiloto +  "ya existe en la base de datos, no se puede duplicar.");
        } else {
            System.out.println("Escribe el nombre de la escuderia.");
            String nombreEscuderia = sc.nextLine();
            do {
                try {
                    System.out.println("Escribe los puntos.");
                    int puntos = sc.nextInt();
                    pilotos.add(new Piloto(nombrePiloto, nombreEscuderia,puntos));
                    System.out.println("Piloto añadido correctamente.");
                    valorValido = true;
                } catch (InputMismatchException e){
                    System.out.println("⛔ " + GestionPilotosF1Binario.fondoRojo + "Error. Valor introducido no válido." + GestionPilotosF1Binario.reset);
                    sc.nextLine();
                }
            }while (!valorValido);
        }
        return pilotos ;
    }
}
