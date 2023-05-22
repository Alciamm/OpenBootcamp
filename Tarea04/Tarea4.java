public class Tarea4{
    public static void main(String[] args){

        Persona persona = new Persona();
        Cliente cliente = new Cliente();
        Trabajador trabajador = new Trabajador();
        
        persona.setEdad("35");
        persona.setNombre("Maria");
        persona.setTelefono("622 633 644");

        cliente.setEdad("40");
        cliente.setNombre("Alvaro");
        cliente.setTelefono("633 644 655");
        cliente.setCredito(20000);

        trabajador.setEdad("37"); 
        trabajador.setNombre("Alicia"); 
        trabajador.setTelefono("644 655 666"); 
        trabajador.setSalario(1200);
        
          
        
        System.out.println("Persona:");
        System.out.println("- Nombre:"+persona.getNombre());
        System.out.println("- Edad:"+persona.getEdad());
        System.out.println("- Telefono:"+persona.getTelefono());
        System.out.println("\n");          
        
        System.out.println("Cliente:");
        System.out.println("- Nombre:"+cliente.getNombre());
        System.out.println("- Edad:"+cliente.getEdad());
        System.out.println("- Telefono:"+cliente.getTelefono());
        System.out.println("- Credito: "+cliente.getCredito());
        System.out.println("\n");          
        
        System.out.println("Trabajador:");
        System.out.println("- Nombre:"+trabajador.getNombre());
        System.out.println("- Edad:"+trabajador.getEdad());
        System.out.println("- Telefono:"+trabajador.getTelefono());
        System.out.println("- Salario: "+trabajador.getSalario());
        System.out.println("\n");

    }

}

class Persona{
    String edad;
    String nombre;
    String telefono;

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

class Cliente extends Persona {
    private int credito;

    public void setCredito(int credito){
        this.credito = credito;
    }

    public int getCredito(){
        return this.credito;
    }

    
}

class Trabajador extends Persona {
    private int salario;

    public void setSalario(int salario){
        this.salario = salario;
    }

    public int getSalario(){
        return this.salario;
    }
}
