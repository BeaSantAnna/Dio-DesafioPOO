package iphone;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorWeb {

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo página " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Abrindo nova aba");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página");
    }

    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo ligação");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando um correio de voz");
    }

    @Override
    public void tocar() {
        System.out.println("Reproduzindo a música");
    }

    @Override
    public void pausar() {
        System.out.println("Música pausada");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Música selecionada: " + musica);
    }

    public static void main(String[] args) {
        Iphone iphone = new Iphone();
        iphone.selecionarMusica("Justin Timberlake - Mirrors");
        iphone.tocar();
        iphone.pausar();

        iphone.ligar("11997878765");
        iphone.atender();
        iphone.iniciarCorreioVoz();

        iphone.exibirPagina("https://github.com/glysns/trilha-java-basico/desafios/poo/README.md");
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
    }
}
