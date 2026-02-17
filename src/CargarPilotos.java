import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.HashSet;
import java.util.Set;

public class CargarPilotos {
    public static Set<Piloto> cargarPilotos(){
        Set<Piloto> pilotos = new HashSet<>();
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(CargarPilotosF1Binario.archivoDat))) {
            pilotos = (HashSet<Piloto>) ois.readObject();
            System.out.println("Pilotos creados");
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error al leer el objeto: " + e.getMessage());
        }
        return pilotos;
    }
}
