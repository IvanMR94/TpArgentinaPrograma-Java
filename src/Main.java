public class Main {
    public static void main(String[] args) {

        //equipo equipo1 = new equipo("belgrano", 1);
        //equipo equipo2 = new equipo("talleres", 0);

        //System.out.println("| Equipos Elistados: " +  equipo1 + "  ||  " + equipo2 + " | ");

        equipo arr[] = { new equipo("Belgrano", 3), new equipo("talleres", 1) };

        pronostico.crearPronostico(arr);

        for(int i=0; i<arr.length; i++){
           System.out.println(arr[i]);
        };

        resultado resultado = new resultado();
        resultado.determinarGanador(arr);

    }

}