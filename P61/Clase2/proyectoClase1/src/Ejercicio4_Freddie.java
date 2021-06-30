import java.util.Scanner;
public class Ejercicio4_Freddie {
    
    public static void main(String[] args) {

        //Si no tiene la palabra static
        // Ejercicio3_Jahir instancia = new Ejercicio3_Jahir();
        // instancia.potenciaDosYTres(numero1);

        //Si tiene la plabra static
        //Ejercicio3_Jahir.potenciaDosYTres(numero1);

        aviso();
        var numero = captura();
        System.out.println("El valor en grados Farenheit es :  "+pasaGrados(numero));
     }

     public static float pasaGrados(float gc) {
         var f=32+(9*gc/5);
        //System.out.println("El numero ingresado  "+gc + " "+f);
        return f;
     }

    public static float  captura () {
        float numero;
        Scanner sc = new Scanner(System.in);
         // var sc = new Scanner(System.in);
         System.out.println("Introduzca Grados Centigrados");
         numero = sc.nextFloat();
         return numero;
     }
    public static void aviso(){
        System.out.println("Este programa captura un valor en grados centigrados");
        System.out.println("       y los convierte a Grados Farenheit \n");
     }

    
}
