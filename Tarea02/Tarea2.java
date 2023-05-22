public class Tarea2{
    public static void main(String[] args){
        int numeroIf = 0;
        if(numeroIf > 0){
            System.out.println("El numero es positivo");
        }else if(numeroIf < 0){
            System.out.println("El numero es negativo");
        }else{
            System.out.println("El numero es igual a 0");
        }

        int numeroWhile = 0;
        while(numeroWhile < 3){
            System.out.println(numeroWhile);
            numeroWhile++;
        }
        
        do{
            System.out.println(numeroWhile);
            numeroWhile++;
        }while(numeroWhile < 3);

        for(int numberFor = 0; numberFor <= 3; numberFor++){
            System.out.println(numberFor);
        }

        String estacion = "VERANO";
            switch(estacion){
                case "PRIMAVERA":
                    System.out.println("Es primavera");
                    break;
                case "VERANO":
                    System.out.println("Es verano");
                    break;
                case "OTOÑO":
                    System.out.println("Es otoño");
                    break;
                case "INVIERNO":
                    System.out.println("Es invierno");
                    break;
                default:
                    System.out.println("No es una estacion");
            }
    }

}
