package DesafioControleDeFluxo;
import  java.util.Scanner;

public class contador {     
        public static void main(String[]args)  {
            Scanner scanner = new Scanner(System.in);
            int paramentroUm;
            int paramentroDois;
            
            System.out.print("Digite o primeiro numero: ");
            paramentroUm = scanner.nextInt();

            System.out.print("Digite o segundo numero: ");
            paramentroDois = scanner.nextInt();

            if(paramentroUm > paramentroDois) {
                System.out.println("ParametrosInvalidosException");
            } else {
            int contar = paramentroDois - paramentroUm;;
            System.out.println("A diferença entre esses dois numeros é: " + contar);
            }
        
            scanner.close();
        }  
    
}
