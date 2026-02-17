import java.io.*;

import java.util.HashSet;
import java.util.Set;

public class CargarPilotosF1Binario {
    public static final String archivoTxt = "pilotos_f1.txt";
    public static final String archivoDat = "pilotos_f1.dat";

    public static void main(String[] args) {
        Set<Piloto> pilotos = new HashSet<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(archivoTxt))){
            String linea;

            while ((linea = reader.readLine()) != null) {
                String[] dato = linea.split(";");

                if(dato.length == 3) {
                    String nombre = dato[0];
                    String escuderia = dato[1];
                    int puntos = Integer.parseInt(dato[2]);

                    pilotos.add(new Piloto(nombre, escuderia, puntos));
                }
            }

            try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(archivoDat))) {
                oos.writeObject(pilotos);
                System.out.println("\uD83D\uDCBE Archivo " + "\033[4m" + archivoTxt + "\033[0m" + " creado correctamente.");
            } catch (IOException e) {
                System.out.println("Error al guardar el objeto: " + e.getMessage());
            }

            System.out.println("\uD83D\uDCC3 Archivo " + "\033[4m" + archivoDat + "\033[0m" + " leído correctamente ✔✔✔");
        } catch (IOException e) {
            System.out.println("✘✘✘ Ocurrió un error al leer el archivo: " + e.getMessage());
        }

    }
}
