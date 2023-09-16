import java.util.Scanner;

public class ContaTerminal {
    private int numero;
    private String Agencia;
    private String NomeCliente;
    private String SobrenomeCliente;
    private double saldo;

    

    public ContaTerminal() {
    }


    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getAgencia() {
        return this.Agencia;
    }

    public void setAgencia(String Agencia) {
        this.Agencia = Agencia;
    }

    public String getNomeCliente() {
        return this.NomeCliente;
    }

    public void setNomeCliente(String NomeCliente) {
        this.NomeCliente = NomeCliente;
    }
      public String getSobrenomeCliente() {
        return this.SobrenomeCliente;
    }

    public void setSobrenomeCliente(String SobrenomeCliente) {
        this.SobrenomeCliente = SobrenomeCliente;
    }


    public double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

 
    
    public static void main(String[] args)  {
        ContaTerminal conta1 = new ContaTerminal();
        Scanner sc = new Scanner(System.in);
         System.out.println("Por favor, digite o número da Conta ! ");
         conta1.setNumero(sc.nextInt());
          System.out.println("Por favor, digite o número da Agência ! ");
          conta1.setAgencia(sc.next());
           System.out.println("Por favor, digite o nome do Cliente! ");
           conta1.setNomeCliente(sc.next());
           conta1.setSobrenomeCliente(sc.next());
           System.out.println("Por favor, digite o seu saldo ");
           conta1.setSaldo(sc.nextDouble());

           System.out.println("Olá  " + conta1.getNomeCliente() +" "+conta1.getSobrenomeCliente() + " obrigado por criar uma conta em nosso banco, sua agência é "+ conta1.getAgencia() +" conta "+conta1.getNumero() + " e seu saldo de R$"+conta1.getSaldo() +"   ja está disponível para saque" );
            sc.close();


    }
}
