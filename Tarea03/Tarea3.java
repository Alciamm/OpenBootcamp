public class Tarea3{
    public static void main(String[] args){

        Persona persona = new Persona();

        persona.setEdad("35");

        String edad = persona.getEdad();
        System.out.println(edad);

        persona.setNombre("Maria");

        String nombre = persona.getNombre();
        System.out.println(nombre);

        persona.setTelefono("622633644");

        String telefono = persona.getTelefono();
        System.out.println(telefono);
    }

}

class Persona{
    private String edad;
    private String nombre;
    private String telefono;

    public void setEdad(String edad){
        this.edad = edad;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setTelefono(String telefono){
        this.telefono = telefono;
    }

    public String getEdad(){
        return this.edad;
    }

    public String getNombre(){
        return this.nombre;
    }

    public String getTelefono(){
        return this.telefono;
    }

}
