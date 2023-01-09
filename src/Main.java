 public class Main {
     public static void main(String[] args) {
         sumarTresNumeros(1, 2, 3);
         Coche miCoche = new Coche();
         miCoche.numerodepuertas();
         miCoche.numerodepuertas();
         miCoche.numerodepuertas();
         System.out.println("El numero de puertas es: " + miCoche.puertas);
     }

     public static void sumarTresNumeros(int a, int b, int c) {
         int suma = a + b + c;
         System.out.println("Las suma en total es de: " + suma);
     }


     static class Coche {
         public int puertas = 0;

         public void numerodepuertas() {

             this.puertas++;
         }
     }
 }
