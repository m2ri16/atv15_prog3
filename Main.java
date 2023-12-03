public class Main {
    public static void main(String[] args) {
        
        ModoVenda modoVenda = new VendaLojaFisica(); 
        NotificacaoVenda notificacaoVenda = new NotificacaoEmail();

        RegistroVenda registroVenda = new RegistroVenda(modoVenda, notificacaoVenda);

        registroVenda.registrarVenda("ProdutoA", "ClienteB", 2);
    }
}
