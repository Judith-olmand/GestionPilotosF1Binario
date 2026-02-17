import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Set;

public class GuardarDatos {
    public static void guardarPilotos(Set<Piloto> pilotos){
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(CargarPilotosF1Binario.archivoDat))) {
            oos.writeObject(pilotos);
            System.out.println("\uD83D\uDCBE Archivo " + "\033[4m" + CargarPilotosF1Binario.archivoDat + "\033[0m" + " creado correctamente.");
        } catch (IOException e) {
            System.out.println("Error al guardar el objeto: " + e.getMessage());
        }
    }
}