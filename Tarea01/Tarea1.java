public class Tarea1 {
public static void main(String[] args) throws Exception {
       int suma = addNum(2,3,4);
        System.out.println(suma);

        Coche miCoche = new Coche();
        miCoche.añadirPuerta();
        System.out.println(miCoche.puertas);

    }

    public static int addNum(int a, int b, int c){
        int suma;
        suma = a + b + c;
        return suma;
    }
}

class Coche{
    public int puertas = 4;

    public void añadirPuerta(){
        this.puertas++;
    }
}
