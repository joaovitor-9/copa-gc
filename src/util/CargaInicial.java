package util;

import service.Copa;
import model.Selecao;

public class CargaInicial {
    public static void popular(Copa copa) {
        Selecao bra = new Selecao("Brasil", 'A', "BRA");
        Selecao arg = new Selecao("Argentina", 'A', "ARG");
        Selecao fra = new Selecao("Franca", 'A', "FRA");
        Selecao esp = new Selecao("Espanha", 'A', "ESP");

        Selecao hol = new Selecao("Holanda", 'B', "HOL");
        Selecao ing = new Selecao("Inglaterra", 'B', "ING");
        Selecao ale = new Selecao("Alemanha", 'B', "ALE");
        Selecao por = new Selecao("Portugal", 'B', "POR");

        copa.adicionarSelecao(bra); copa.adicionarSelecao(arg);
        copa.adicionarSelecao(fra); copa.adicionarSelecao(esp);
        copa.adicionarSelecao(hol); copa.adicionarSelecao(ale);
        copa.adicionarSelecao(ing); copa.adicionarSelecao(por);

        copa.registrarPartida(bra, arg, 2, 1);
        copa.registrarPartida(fra, esp, 1, 1);
        copa.registrarPartida(hol, ale, 2, 0);
        copa.registrarPartida(ing, por, 1, 0);

        copa.registrarArtilheiro("Yuri Alberto (BRA) - 20 gols");
        copa.registrarArtilheiro("Mbappe (FRA) - 8 gol");
        copa.registrarArtilheiro("Messi (ARG) - 9 gols");
        copa.registrarArtilheiro("Depay (HOL) - 19 gols");
    }
}