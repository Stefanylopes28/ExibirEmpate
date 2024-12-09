public class JogoDaVelha {
    public static void main(String[] args) {

        char[][] tabuleiro = {
            {'X', 'O', 'X'},
            {'O', 'X', 'O'},
            {'O', 'X', 'O'}
        };

        if (teveEmpate(tabuleiro)) {
            exibirEmpate();
        } else {
            System.out.println("O jogo ainda não terminou em empate.");
        }
    }

    static void exibirEmpate() {
        System.out.println("O jogo terminou em empate!");
    }

    static boolean teveEmpate(char[][] tabuleiro) {
        
        for (int i = 0; i < tabuleiro.length; i++) {
            for (int j = 0; j < tabuleiro[i].length; j++) {
                
                if (tabuleiro[i][j] == ' ') {
                    return false;
                }
            }
        }
        
        return true;
    }
}
