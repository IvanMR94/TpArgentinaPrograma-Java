
public class equipo {
        public String equipo;
        public Integer goles;

    public equipo(String equipo, int goles) {
      this.equipo = equipo;
      this.goles = goles;
    }

    @Override
    public String toString(){
        return " | Equipos enlistado : " + this.equipo + " , " + " goles: "+this.goles+ " |";
    }

    public String getEquipo(){
        return this.equipo;
    }

    public Integer getGoles(){
        return this.goles;
    }

}