package util;

import service.Copa;
import model.Selecao;

public class CargaInicial {
    public static void popular(Copa copa) {
        Selecao bra = new Selecao("Brasil", 'A', "BRA");
        Selecao arg = new Selecao("Argentina", 'A', "ARG");
        Selecao fra = new Selecao("Franca", 'A', "FRA");
        Selecao ale = new Selecao("Espanha", 'A', "ESP");

        Selecao jap = new Selecao("Holanda", 'B', "HOL");
        Selecao sen = new Selecao("Inglaterra", 'B', "ING");
        Selecao can = new Selecao("Alemanha", 'B', "ALE");
        Selecao aus = new Selecao("Portugal", 'B', "POR");

        copa.adicionarSelecao(bra); copa.adicionarSelecao(arg);
        copa.adicionarSelecao(fra); copa.adicionarSelecao(ale);
        copa.adicionarSelecao(jap); copa.adicionarSelecao(sen);
        copa.adicionarSelecao(can); copa.adicionarSelecao(aus);
    }
}