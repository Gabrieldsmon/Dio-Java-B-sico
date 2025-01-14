public class BancoTerminal {

    public static void main(String[] args) {

        double saldo = 25.0;
        double valorsolicitado = 18.0;

        if (saldo >= valorsolicitado) {
            saldo -= valorsolicitado;
            System.out.print("Saque realizado com sucesso. Saldo atual: " + saldo);

        } else {
            System.out.print("Saldo insuficiente");
        }

        // Segunda execução
        saldo = 15;
        valorsolicitado = 22;

        if (saldo >= valorsolicitado) {
            saldo -= valorsolicitado;
            System.out.print("Saque realizado com sucesso. Saldo atual: " + saldo);
        }else {
            System.out.print("Saldo insuficiente");
        }
    }
}
