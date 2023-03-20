public class resultado {
    public void procesarEquipos(equipo[] arr) {
        for (equipo e : arr) {
            if (e.getEquipo().equals("Belgrano")) {
                int goles = e.getGoles();
                // Procesa el puntaje de Belgrano.
            } else if (e.getEquipo().equals("talleres")) {
                int goles = e.getGoles();
                // Procesa el puntaje de Talleres.
            }
        }
    }

    public void determinarGanador(equipo[] arr) {
        int puntajeMaximo = 0;
        equipo ganador = null;

        for (equipo e : arr) {
            if (e.getGoles() > puntajeMaximo) {
                puntajeMaximo = e.getGoles();
                ganador = e;
            }
        }
        System.out.println(" ");
        System.out.println(" | El equipo ganador es: " + ganador.getEquipo() + " con " + ganador.getGoles() + " goles. |");
    }


}
