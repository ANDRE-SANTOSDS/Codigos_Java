package trabalho;

import java.time.LocalDate;
import java.util.ArrayList;

public class Campeonato {
	private int id;
	private static int count = 0;
	private int ano;
	private String nome;
	private ArrayList<Time> times = new ArrayList<>();
	private ArrayList<Partida> partidas = new ArrayList<>();
	
	public Campeonato () {
		id = ++count;
	}

	public Campeonato(int ano, String nome) {
		id = ++count;
		this.ano = ano;
		this.nome = nome;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public ArrayList<Partida> listarPartidasOcorridas() {
        LocalDate currentDate = LocalDate.now();
        ArrayList<Partida> partidasOcorridas = new ArrayList<>();
        
        for (Partida partida : partidas) {
            if (partida.getData().isBefore(currentDate)) {
                partidasOcorridas.add(partida);
            }
        }
        
        return partidasOcorridas;
    }

    public ArrayList<Partida> listarPartidasNaoOcorridas() {
        LocalDate currentDate = LocalDate.now();
        ArrayList<Partida> partidasNaoOcorridas = new ArrayList<>();
        
        for (Partida partida : partidas) {
            if (partida.getData().isAfter(currentDate)) {
                partidasNaoOcorridas.add(partida);
            }
        }
        
        return partidasNaoOcorridas;
    }
    public ArrayList<Time> listarTabelaDoCampeonatoSemOrdem() {
    	ArrayList<Time> tabela = new ArrayList<>();
        for (int i = 0; i < Math.min(times.size(), times.size()); i++) {
            tabela.add(times.get(i));
        }

        return tabela;
    }

    public ArrayList<Time> listarTabelaDoCampeonato() {
        for (Partida partida : listarPartidasOcorridas()) {
            Time mandante = partida.getMandante();
            Time visitante = partida.getVisitante();
            int pontosMandante = partida.getPontuacaoMandante();
            int pontosVisitante = partida.getPontuacaoVisitante();
            mandante.saldoVitorias(pontosMandante, pontosVisitante);
            visitante.saldoVitorias(pontosVisitante, pontosMandante);
            
            int saldoGols = pontosMandante - pontosVisitante;
            mandante.setSaldoGols(mandante.getSaldoGols() + saldoGols);
            visitante.setSaldoGols(visitante.getSaldoGols() - saldoGols);
        }

        // ordena a lista de times por pontuação decrescente, somando as pontuações de mandante e visitante
        times.sort((t1, t2) -> {
            if (t2.getSaldoVitorias() == t1.getSaldoVitorias())
                return Integer.compare(t2.getSaldoGols(), t1.getSaldoGols());
            return Integer.compare(t2.getSaldoVitorias(), t1.getSaldoVitorias());
        });
        // devolve os primeiros colocados até o número de posições desejado
        ArrayList<Time> tabela = new ArrayList<>();
        for (int i = 0; i < Math.min(times.size(), times.size()); i++) {
            tabela.add(times.get(i));
        }

        return tabela;
    }


	public ArrayList<Time> getTimes() {
		return times;
	}
	
	public void addTimes(Time t) {
		times.add(t);
	}
	
	public void removeTimes(Time t) {
		times.remove(t);
	}
	

	public ArrayList<Partida> getPartidas() {
		return partidas;
	}
	public void addPartida(Partida p) {
		partidas.add(p);
	}
	
	public void removePartida(Partida p) {
		partidas.remove(p);
	}
	

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Campeonato [id=" + id + "]\n" +
				"ano = " + ano + 
				"\nnome = " + nome + 
				"\ntimes = " + times + 
				"\npartidas = " + partidas + "\n";
	}
}
