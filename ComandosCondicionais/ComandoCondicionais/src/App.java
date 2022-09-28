public class App {
    public static void main(String[] args) {
        //IF

        int num1 = 10, num2 = 30;
        if(num1 < num2) {

        System.out.println("if normal - Numero 1 é menor que número 2");
        }

        if (num1 > num2){
        System.out.println("if com else - Numero 1 é maior que número 2");
        }  else {
        System.out.println("if com else - Numero 1 é menor que número 2");
        }

        //Condição composta - situação num1 < num2
        if (num1 > num2){
        System.out.println("Condicao composta 1 - Numero 1 é maior que número 2");
        }  else if (num1 < num2){
        System.out.println("Condicao composta 1 -Numero 1 é menor que número 2");
        } else {
        System.out.println("Condicao composta 1 -Numero 1 é igual ao número 2");
        }


        
        //Condição composta - situação num1 = num2
        num1 = 10;
        num2 = 10;
        if (num1 > num2){
        System.out.println("Condicao composta 2 -Numero 1 é maior que número 2");
        }  else if (num1 < num2){
        System.out.println("Condicao composta 2 -Numero 1 é menor que número 2");
        } else {
        System.out.println("Condicao composta 2 -Numero 1 é igual ao número 2");
        }

        //Comando condicional SWITCH
        char opcao ='1';
        switch (opcao) {
            case 1: {
            System.out.println("Chame programa de Inclusao");
            break;
            }

            case 2: {
            System.out.println("Chame programa de Alteracao");
            break;
            }

            case 3: {
            System.out.println("Chame programa de exclusao");
            break;
            }
                    
            case 4: {
            System.out.println("Chame programa de conclusao");
            break;
            }

            default: {
            System.out.println("Opcao Invalida: "  + opcao +" Redigite");
            }

        }

        
        
    }
}
