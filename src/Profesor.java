public class Profesor extends Persona {
    String str;
    int edad;

    public Profesor(String numeroDeTelefono, String numeroDeTelefono1) {
        super(numeroDeTelefono);
    }
    @Override
    public String toString(){
        return String.format("Soy un profesor, con nombre : %s, con edad : %d y con telefono : %s",str,edad,numeroDeTelefono);
    }
}