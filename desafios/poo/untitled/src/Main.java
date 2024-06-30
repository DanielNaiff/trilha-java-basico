public class Main {

    public static void main(String[] args) {
        // Criando uma instância de iPhone
        iPhone meuIPhone = new iPhone();

        // Demonstrando algumas funcionalidades
        meuIPhone.ligar("123456789");
        meuIPhone.atender();
        meuIPhone.selecionarMusica("Musica X");
        meuIPhone.tocar();
        meuIPhone.exibirPagina("https://www.exemplo.com");
        meuIPhone.adicionarNovaAba();
        meuIPhone.atualizarPagina();
        meuIPhone.pausar();
        meuIPhone.iniciarCorreioVoz();
    }
}