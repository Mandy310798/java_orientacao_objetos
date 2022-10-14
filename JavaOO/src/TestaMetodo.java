public class TestaMetodo {

    public static void main(String[] args) {
        Conta contaDoPaulo = new Conta();
        contaDoPaulo.deposita(100);

        // método deposita
        contaDoPaulo.deposita(50);
        System.out.println(contaDoPaulo.pegaSaldo());

        // método saca
        boolean conseguiuRetirar = contaDoPaulo.saca(20);
        System.out.println(contaDoPaulo.pegaSaldo());
        System.out.println(conseguiuRetirar);

        //método transfere
        Conta contaDaMarcela = new Conta();
        contaDaMarcela.deposita(1000);

        if(contaDaMarcela.transfere(300, contaDoPaulo)) {
            System.out.println("Transferido com sucesso");
        } else {
            System.out.println("faltou dinheiro");
        }

        System.out.println(contaDaMarcela.pegaSaldo());
        System.out.println(contaDoPaulo.pegaSaldo());
    }
}
