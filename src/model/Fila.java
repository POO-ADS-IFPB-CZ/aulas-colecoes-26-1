package model;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

    private Queue<Ficha> fichas;

    public Fila(){
        fichas = new LinkedList<>();
    }

    public Ficha novaFicha(){
        Ficha ficha = new Ficha();
        fichas.offer(ficha);
        return ficha;
    }

    public Ficha verificarProximo(){
        //não remove
        return fichas.peek();
    }

    public Ficha chamarProximo(){
        //remove
        return fichas.poll();
    }

}
