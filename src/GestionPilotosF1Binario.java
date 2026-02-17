import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Set;

public class GestionPilotosF1Binario {
    public static final String fondoLila = "\u001B[45m";
    public static final String cursiva = "\u001B[3m";
    public static final String reset = "\u001B[0m";
    public static final String fondoRojo = "\u001B[41m";
    public static final String verde = "\u001B[32m";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Piloto> pilotos = new HashSet<>();
        int opcion = -1;
        boolean opCorrecta;
        MostrarTitulo.mostrarTitulo();
/*
        System.out.println(" __/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\_______/\\\\\\\\\\_________/\\\\\\\\\\\\\\\\\\______/\\\\\\____________/\\\\\\__/\\\\\\________/\\\\\\__/\\\\\\_________________/\\\\\\\\\\\\\\\\\\___________________/\\\\\\_        ");
        System.out.println(" _\\/\\\\\\///////////______/\\\\\\///\\\\\\_____/\\\\\\///////\\\\\\___\\/\\\\\\\\\\\\________/\\\\\\\\\\\\_\\/\\\\\\_______\\/\\\\\\_\\/\\\\\\_______________/\\\\\\\\\\\\\\\\\\\\\\_____________/\\\\\\\\\\\\\\\\_        ");
        System.out.println("  _\\/\\\\\\_______________/\\\\\\/__\\///\\\\\\__\\/\\\\\\_____\\/\\\\\\___\\/\\\\\\//\\\\\\____/\\\\\\//\\\\\\_\\/\\\\\\_______\\/\\\\\\_\\/\\\\\\______________/\\/////////\\\\\\___________\\/////\\\\\\\\_        ");
        System.out.println("   _\\/\\\\\\\\\\\\\\\\\\\\\\______/\\\\\\______\\//\\\\\\_\\/\\\\\\\\\\\\\\\\\\\\\\/____\\/\\\\\\\\///\\\\\\/\\\\\\/_\\/\\\\\\_\\/\\\\\\_______\\/\\\\\\_\\/\\\\\\_____________\\/\\\\\\_______\\/\\\\\\______________\\/\\\\\\_     ");
        System.out.println("    _\\/\\\\\\///////______\\/\\\\\\_______\\/\\\\\\_\\/\\\\\\//////\\\\\\____\\/\\\\\\__\\///\\\\\\/___\\/\\\\\\_\\/\\\\\\_______\\/\\\\\\_\\/\\\\\\_____________\\/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\______________\\/\\\\\\_    ");
        System.out.println("     _\\/\\\\\\_____________\\//\\\\\\______/\\\\\\__\\/\\\\\\____\\//\\\\\\___\\/\\\\\\____\\///_____\\/\\\\\\_\\/\\\\\\_______\\/\\\\\\_\\/\\\\\\_____________\\/\\\\\\/////////\\\\\\______________\\/\\\\\\_   ");
        System.out.println("      _\\/\\\\\\______________\\///\\\\\\__/\\\\\\____\\/\\\\\\_____\\//\\\\\\__\\/\\\\\\_____________\\/\\\\\\_\\//\\\\\\______/\\\\\\__\\/\\\\\\_____________\\/\\\\\\_______\\/\\\\\\______________\\/\\\\\\_  ");
        System.out.println("       _\\/\\\\\\________________\\///\\\\\\\\\\/_____\\/\\\\\\______\\//\\\\\\_\\/\\\\\\_____________\\/\\\\\\__\\///\\\\\\\\\\\\\\\\\\/___\\/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\_\\/\\\\\\_______\\/\\\\\\______________\\/\\\\\\_ ");
        System.out.println("        _\\///___________________\\/////_______\\///________\\///__\\///______________\\///_____\\/////////_____\\///////////////__\\///________\\///________________\\///_ ");
*/
        do {
            do {
                opCorrecta = false;
                try {
                    System.out.println();
                    System.out.println("Selecciona una opción:");
                    System.out.println("1. Cargar pilotos");
                    System.out.println("2. Mostrar pilotos");
                    System.out.println("3. Añadir nuevo piloto");
                    System.out.println("4. Buscar piloto");
                    System.out.println("5. Guardar datos");
                    System.out.println("6. Ver coche F1.");
                    System.out.println("0. Salir");
                    opcion = sc.nextInt();
                    sc.nextLine();
                    opCorrecta = true;
                } catch (InputMismatchException e) {
                    System.out.println("⛔ " + fondoRojo + "Error. Elija una opción válida." + reset);
                    sc.nextLine();
                }
            }while (!opCorrecta);

            switch (opcion) {
                case 1:
                    System.out.println();
                    System.out.println(cursiva + fondoLila + "CARGANDO PILOTOS..." + reset);
                    pilotos = CargarPilotos.cargarPilotos();
                    break;
                case 2:
                    System.out.println();
                    System.out.println(cursiva + fondoLila + "LISTADO DE PILOTOS" + reset);
                    MostrarPilotos.mostrarPilotos(pilotos);
                    break;
                case 3:
                    System.out.println();
                    System.out.println(cursiva + fondoLila + "AÑADIR PILOTO" + reset);
                    AniadirNuevoPiloto.aniadirPilotos(pilotos,sc);
                    break;
                case 4:
                    System.out.println();
                    System.out.println(cursiva + fondoLila + "BUSCAR PILOTO" + reset);
                    BuscarPiloto.buscarPiloto(pilotos,sc);
                    break;
                case 5:
                    System.out.println();
                    System.out.println(cursiva + fondoLila + "GUARDANDO DATOS..." + reset);
                    GuardarDatos.guardarPilotos(pilotos);
                    break;
                case 6:
                    MostrarCoche.mostrarCoche();
                    break;
                default:
                    System.out.println("⛔ " + fondoRojo + "OPCIÓN NO VÁLIDA" + reset);
                    break;
                case 0:
                    System.out.println(cursiva + fondoLila + "HASTA PRONTO!!!" + reset);
                    break;
            }
        }while (opcion != 0);

    }
}