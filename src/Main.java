public class Main {
    public static void main(String[] args) {

        equipo arr[] = { new equipo("Belgrano", 3), new equipo("talleres", 1) };

        pronostico.crearPronostico(arr);

        for(int i=0; i<arr.length; i++){
           System.out.println(arr[i]);
        };

        resultado resultado = new resultado();
        resultado.determinarGanador(arr);

    }

}
