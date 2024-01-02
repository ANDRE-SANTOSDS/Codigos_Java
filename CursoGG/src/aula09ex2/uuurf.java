package aula09ex2;

import java.util.Random;

public class uuurf {
	public static void main(String[] args) {
	    Random random = new Random();

        // Nomes dos times
        String time1 = "Time A";
        String time2 = "Time B";
        String time3 = "Time C";

        // Pontuações iniciais dos times
        int pontuacaoTime1 = 0;
        int pontuacaoTime2 = 0;
        int pontuacaoTime3 = 0;

        // Simulação de 3 rodadas de enfrentamento
        for (int rodada = 1; rodada <= 3; rodada++) {
            System.out.println("Rodada " + rodada);

            // Geração de pontuações aleatórias para cada time
            int pontuacaoRodadaTime1 = random.nextInt(5); // Exemplo: gera número aleatório entre 0 e 4
            int pontuacaoRodadaTime2 = random.nextInt(5);
            int pontuacaoRodadaTime3 = random.nextInt(5);

            // Atualização das pontuações totais dos times
            pontuacaoTime1 += pontuacaoRodadaTime1;
            pontuacaoTime2 += pontuacaoRodadaTime2;
            pontuacaoTime3 += pontuacaoRodadaTime3;

            // Exibição dos resultados da rodada
            System.out.println(time1 + ": " + pontuacaoRodadaTime1 + " ponto(s)");
            System.out.println(time2 + ": " + pontuacaoRodadaTime2 + " ponto(s)");
            System.out.println(time3 + ": " + pontuacaoRodadaTime3 + " ponto(s)");
            System.out.println();
        }

        // Exibição das pontuações finais
        System.out.println("Pontuações Finais:");
        System.out.println(time1 + ": " + pontuacaoTime1 + " ponto(s)");
        System.out.println(time2 + ": " + pontuacaoTime2 + " ponto(s)");
        System.out.println(time3 + ": " + pontuacaoTime3 + " ponto(s)");

        // Determinação do vencedor
        if (pontuacaoTime1 > pontuacaoTime2 && pontuacaoTime1 > pontuacaoTime3) {
            System.out.println(time1 + " venceu!");
        } else if (pontuacaoTime2 > pontuacaoTime1 && pontuacaoTime2 > pontuacaoTime3) {
            System.out.println(time2 + " venceu!");
        } else if (pontuacaoTime3 > pontuacaoTime1 && pontuacaoTime3 > pontuacaoTime2) {
            System.out.println(time3 + " venceu!");
        } else {
            System.out.println("Empate!");
        }
    
	}
}
