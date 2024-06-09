import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) throws Exception {

    int numero= 1021;
    int NumeroInserido;
    String Agencia= "067-8";
    String nomeCliente = "Mario andrade";
    double saldo = 237.48;
    
    Scanner scanner = new Scanner (System.in);
    

    System.out.println("Por favor, digite o numero da Agencia!");
    NumeroInserido = scanner.nextInt();

    if (NumeroInserido == numero) {
    System.out.printf("Olá %s,obrigada por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo é %.2f já esta disponivel para saque.", nomeCliente , Agencia, numero,saldo );
        
    }
    else{
        System.out.println("Me desculpe mas esta conta não foi encontrada");
       
    }
    scanner.close();
    }
}
