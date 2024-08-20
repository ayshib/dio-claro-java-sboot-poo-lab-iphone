public class App {
    public static void main(String[] args) throws Exception {
        
        IPhone iPhone = new IPhone();

        System.out.println("IPhone ReprodutorMusical");
        iPhone.tocar();
        iPhone.pausar();
        iPhone.selecionarMusica("Bob Dylan - Knockin' on Heaven's Door");

        System.out.println("");
        System.out.println("IPhone AparelhoTelefonico");
        iPhone.ligar("0112233445566");
        iPhone.atender();
        iPhone.iniciarCorreioVoz();

        System.out.println("");
        System.out.println("IPhone NavegadorInternet");
        iPhone.exibirPagina("https://www.youtube.com/watch?v=cCV84dTevX0");
        iPhone.adicionarNovaAba();
        iPhone.atualizarPagina();
        
    }
}

class IPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    @Override
    public void exibirPagina(String url) {
        System.out.println("exibirPagina " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("adicionarNovaAba");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("atualizarPagina");
    }

    @Override
    public void ligar(String numero) {
        System.out.println("ligar " + numero);
    }

    @Override
    public void atender() {
        System.out.println("atender");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("iniciarCorreioVoz");
    }

    @Override
    public void tocar() {
        System.out.println("tocar");
    }

    @Override
    public void pausar() {
        System.out.println("pausar");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("selecionarMusica " + musica);
    }
}

interface ReprodutorMusical {

    void tocar();
    void pausar();
    void selecionarMusica(String musica);
}

interface AparelhoTelefonico {
    void ligar(String numero);
    void atender();
    void iniciarCorreioVoz();
}

interface NavegadorInternet {

    void exibirPagina(String url);
    void adicionarNovaAba();
    void atualizarPagina();
}
