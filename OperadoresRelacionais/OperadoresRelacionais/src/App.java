public class App {
    public static void main(String[] args)  {

        //Operadores Relacionais: < > <= => != ==

        int num1, num2;
        num1 = 10;
        num2 = 10;
        if (num1 == num2) {

         System.out.println("Numero 1 e mun2 sao iguais");
       
        }
        //diferentes
        num1 = 10;
        num2 = 30;
        if (num1 != num2) {

          System.out.println("Numero 1 e mun2 sao diferentes");

          //Operadores lógicos
          //&& = e ou AND 
          // || = OU, OR
          num1 = 10;
          num2 = 5;
          int num3 =20, num4 = 5;
          if ((num1 > num3) && (num2 == num4)) {
            System.out.println("Primeira opção satisfeita");
          } else {
            System.out.println("Insatisfeita");
          }
          
          num2 = 10;
          if ((num1 > num3) || (num2 == num4)) {
            System.out.println("Primeira opção satisfeita");
          } else {
            System.out.println("Insatisfeita");
          }
        }
    }
}
