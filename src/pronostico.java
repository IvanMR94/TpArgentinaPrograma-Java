import java.util.Scanner;

public class pronostico {
    public static void crearPronostico(equipo[] arr) {
        Scanner scanner = new Scanner(System.in);
        int puntos = 0;

        int index1 = (int) (Math.random() * arr.length);
        int index2 = (int) (Math.random() * arr.length);

        while (index2 == index1) {
            index2 = (int) (Math.random() * arr.length);
        }

        String equipo1 = arr[index1].getEquipo();
        String equipo2 = arr[index2].getEquipo();

        String[] opciones = {" | 1. " + equipo1, " | 2. " + equipo2, " | 3. Empate"};
        for (String opcion : opciones) {
            System.out.println(opcion);
        }

        System.out.print(" | Ingrese el número de la opción ganadora: ");
        int opcion = scanner.nextInt();

        String resultado;
        if (opcion == 1) {
            resultado = equipo1;
            if (index1 < index2) { // Belgrano (index1) ganó
                puntos++;
            }
        } else if (opcion == 2) {
            resultado = equipo2;
            if (index2 < index1) { // Talleres (index2) ganó
                puntos++;
            }
        } else {
            resultado = "Empate";
            if (index1 == index2) { // Empate
                puntos++;
            }
        }
        System.out.println(" ");
        System.out.println("| El ganador es: " + resultado + " | ");
        System.out.println(" ");
        System.out.println(" | Tu puntaje es: " + puntos + " | ");
        System.out.println(" ");
    }
}

