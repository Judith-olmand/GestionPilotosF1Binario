import java.io.*;

public class MostrarCoche {
    public static void mostrarCoche(){
        try (BufferedReader reader = new BufferedReader(new FileReader("Coche.txt"))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (IOException e) {
            System.out.println("Ocurrió un error al leer el archivo: " + e.getMessage());
        }
    }
}
