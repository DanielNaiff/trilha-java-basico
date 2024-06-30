// Classe iPhone.java
public class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    private int bateria;
    private int armazenamento;

    public iPhone() {
        this.bateria = 100; // inicializa com bateria cheia
        this.armazenamento = 64; // exemplo de capacidade de armazenamento em GB
    }

    @Override
    public void tocar() {
        System.out.println("Tocando...");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando..");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Musica selecionada: " + musica);
    }

    @Override
    public void ligar(String numero) {
        System.out.println("Numero selecionado: " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo telefone");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Inicializando correio de voz");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Mostrando a página: " + url);
    }

    @Override
    public void adicionarNovaAba() {
        // implementação para adicionar uma nova aba no navegador
    }

    @Override
    public void atualizarPagina() {
        // implementação para atualizar a página web
    }


}
