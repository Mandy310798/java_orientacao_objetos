public class TesteReferencia {

    public static void main(String[] args) {
        Conta primeiraConta = new Conta();
        primeiraConta.deposita(300);

        System.out.println( "saldo primeira conta: " + primeiraConta.getSaldo());

        // Duas referências para um mesmo objeto
        Conta segundaConta = primeiraConta;

        segundaConta.deposita(100);
        System.out.println("saldo da segunda conta: " + segundaConta.getSaldo());
        System.out.println("saldo da primeira conta: " + primeiraConta.getSaldo());
    }
}
