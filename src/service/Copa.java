package service;

import model.Partida;
import model.Selecao;

import java.util.ArrayList;
import java.util.List;

public class Copa {
    private List<Selecao> selecoes = new ArrayList<>();
    private List<Partida> partidas = new ArrayList<>();
    private List<String> artilheiros = new ArrayList<>();

    public void adicionarSelecao(Selecao s) {
        selecoes.add(s);
    }

    public void registrarPartida(Selecao a, Selecao b, int golsA, int golsB) {
        partidas.add(new Partida(a, b, golsA, golsB));
    }

    public void listarGrupo(char grupo) {
        System.out.println("--- Grupo " + grupo + " ---");
        for (Selecao s : selecoes) {
            if (s.getGrupo() == grupo) {
                System.out.println(s);
            }
        }
    }

    public List<Selecao> getSelecoes() {
        return selecoes;
    }
}