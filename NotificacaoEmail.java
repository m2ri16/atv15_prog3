import java.util.Date;

public class NotificacaoEmail implements NotificacaoVenda {
    @Override
    public void enviarConfirmacao(String produto, String cliente, int quantidade) {
        System.out.println("Enviando confirmação por e-mail para " + cliente + ":");
        System.out.println("Produto: " + produto + ", Quantidade: " + quantidade);
        System.out.println("Data: " + new Date());
    }

    @Override
    public void enviarRecibo() {
        System.out.println("Enviando recibo por e-mail:");
        System.out.println("Recibo gerado em " + new Date());
    }
}