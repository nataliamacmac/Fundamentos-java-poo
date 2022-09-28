import java.util.concurrent.locks.Condition;

public class App {
    public static void main(String[] args) throws Exception {

        //Comando WHILE - laço pré-testado
        System.out.println("Comando WHILE");
        int qtsVezes = 1;

        while (qtsVezes <= 10) {
            System.out.println("Estou fazendo a " + qtsVezes + "º vez");
            qtsVezes++; //qtsVezes + 1

            
        }
        
        System.out.println("Sai do laco e executei " + (qtsVezes-1) + " vezes");

        System.out.println("-----------------------------------------------");
         // Do WHILE - LAÇO PÓS TESTADO
         System.out.println("Comando DO WHILE");
         qtsVezes = 1;
         do {
            System.out.println("Estou fazendo a " + qtsVezes + "º vez");
            qtsVezes++; //qtsVezes +  qtsVezes1
         } while (qtsVezes <= 10);
         System.out.println("Sai do laco e executei " + (qtsVezes-1) + " vezes");

         System.out.println("-----------------------------------------------");
         //For
         System.out.println("Comando For");
         qtsVezes = 0;
         for (int qtsVezes1 = 1; qtsVezes1 <= 10; qtsVezes1++) {
            System.out.println("Estou fazendo a " + qtsVezes1 + "º vez");
            qtsVezes = qtsVezes1;
         }
         System.out.println("Sai do laco e executei " + (qtsVezes) + " vezes");
         
         System.out.println("---------------------------------------------------");
         //Usando o Break
         for (int qtsVezes1 = 1; qtsVezes1 <= 10; qtsVezes1++) {
            System.out.println("Estou fazendo a " + qtsVezes1 + "º vez");
            if (qtsVezes1 == 5) {
            System.out.println("Parei na" + (qtsVezes1) + " º vez");
            break;
            }
         }
         

    }
       

}
