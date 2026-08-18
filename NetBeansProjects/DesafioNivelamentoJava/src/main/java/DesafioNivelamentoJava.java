/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

/**
 *
 * @author 894771
 */
public class DesafioNivelamentoJava {
    
    public static int[][] criarJogos() {
        int[][] jogos = {
            {4, 1},
            {1, 0},
            {0, 4},
            {3, 1},
            {2, 3},
            {1, 2},
            {2, 0},
            {0, 2},
            {1, 2},
            {4, 3},
            {0, 1},
            {3, 2},
            {3, 4},
            {1, 4},
            {1, 0}
        };
        
        return jogos;
    }
    
    public static char[] criarEquipes() {
        char[] equipes = {
            'A', 'B', 'C', 'D',
            'E', 'F', 'G', 'H',
            'I', 'J', 'K', 'L',
            'M', 'N', 'O', 'P'
        };
        
        return equipes;
    }

    public static char vencedor(
            char equipe1,
            char equipe2,
            int gols1,
            int gols2
    ) {
        
        if (gols1 > gols2) {
            return equipe1;
        } else {
            return equipe2;
        }
    }
    
    public static char processarCampeonato(
            int[][] jogos,
            char[] equipes
    ) {
        
        char[] vencedores = new char[15];
        
        // Oitavas de final: jogos 1 a 8
        for (int i = 0; i < 8; i++) {
            
            vencedores[i] = vencedor(
                    equipes[i * 2],
                    equipes[i *2 + 1],
                    jogos[i][0],
                    jogos[i][1]
            );
        }
        
        // Quartas, semifinais e final: jogos 9 a 15
        int anterior = 0;
        
        for (int i = 8; i < 15; i++) {
            
            vencedores[i] = vencedor(
                    vencedores[anterior],
                    vencedores[anterior + 1],
                    jogos[i][0],
                    jogos[i][1]
            );
            
            anterior += 2;
        }
        
        return vencedores[14];
    }
    
    public static void main(String[] args) {
        
        int[][] jogos = criarJogos();
        char[] equipes = criarEquipes();
        
        char campeao = processarCampeonato(jogos, equipes);
        
        System.out.println("Campeao: " + campeao);
    }
}
