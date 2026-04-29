package model;

import java.util.Stack;

public class Controlador {

    private Stack<Comando> comandos;

    public Controlador(){
        comandos = new Stack<>();
    }

    public Comando adicionar(Comando comando){
        return comandos.push(comando);
    }

    public Comando desfazer(){
        return comandos.pop();
    }

}
