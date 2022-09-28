public class App {
    public static void main(String[] args) throws Exception {

        int num1, num2, num3;

        //SOMA
        num1 = 10;
        num2 = 20;
        num3 = num1 + num2;
        System.out.println("O resultado da soma é: "+ num3);

        // SUBTRAÇÃO
        num1 = 10;
        num2 = 20;
        num3 = num1 - num2;
        System.out.println("O resultado da subtração é: "+ num3);

        //MULTIPLICAÇÃO
        num1 = 10;
        num2 = 20;
        num3 = num1 * num2;
        System.out.println("O resultado da multiplicação é: "+ num3);

        //DIVISÃO
        num1 = 20;
        num2 = 2;
        num3 = num1 / num2;
        System.out.println("O resultado da divisão é: "+ num3);

        //Laços de repetição com 
        num1 = 0;
        while (num1 <= 10){
            num1++;
            System.out.println(num1);
    
        }

        //incremento (somando de 1 em 1 ++)
        num1 = 1;
        while (num1 <= 10){
            num1++;
            System.out.println(num1);
    
        }


    }
    
    
}

