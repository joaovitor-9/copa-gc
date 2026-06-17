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

    public List<Selecao> getSelecoes() {
        return selecoes;
    }
}