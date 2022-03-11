/**
 * Clase game que tendria un metodo movement con los siguientes movimientos
 * @author Juanmaherrera
 * @version 1.0
 */
public class Game {
    Player p;


    /**
     * Metodo movement que nos indicara el movimiento
     * @param m
     */
    public void movement(String m){
        if (m.equalsIgnoreCase("Derecha")){
            p.setX(p.getX()+1);
        }
        if (m.equalsIgnoreCase("Izquierda")){
            p.setX(p.getX()-1);
        }
        if (m.equalsIgnoreCase("Arriba")){
            p.setY(p.getY()-1);
        }
        if (m.equalsIgnoreCase("Abajo")){
            p.setY(p.getY()+1);
        }
    }
}


