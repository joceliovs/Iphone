import java.util.Scanner;

public class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    public void tocar() {
        // implementação
        System.out.println("Música em reprodução");
    }

    public void pausar() {
        // implementação
        System.out.println("Música em Pausa");
    }

    public void selecionarMusica() {
        // implementação
        System.out.println("Selecione uma Música");
    }

    public void ligar() {
        // implementação
        System.out.println("Chamada em Andamento...");
    }

    public void atender() {
        // implementação
        System.out.println("Chamada atendida");
    }

    public class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

        public void iniciarCorreioVoz() {
            try (Scanner scanner = new Scanner(System.in)) {
                System.out.println("Iniciando correio de voz...");
                System.out.println("Por favor, insira sua senha de correio de voz:");
                String senha = scanner.nextLine();
                System.out.println("Bem-vindo ao seu correio de voz. Você tem 2 novas mensagens e 1 mensagem arquivada.");
                // Lógica adicional, se necessário
            }

        public void exibirPagina() {
            System.out.println("Exibindo a página: " + url);
        }

        public void adicionarNovaAba(String url) {
            System.out.println("Adicionando uma nova aba com a página: " + url);

        }

        public void atualizarPagina() {
            System.out.println("Página atualizada.");
        }
}
