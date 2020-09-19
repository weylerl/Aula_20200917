package Memento;

import java.util.ArrayList;

public class TextoMemorizador {
    protected ArrayList<TextoMemento> estados;
 
    public TextoMemorizador() {
        estados = new ArrayList<TextoMemento>();
    }
 
    public void adicionarMemento(TextoMemento memento) {
        estados.add(memento);
    }
 
    public TextoMemento getUltimoEstadoSalvo() {
        if (estados.size() <= 0) {
            return new TextoMemento("");
        }
        TextoMemento estadoSalvo = estados.get(estados.size() - 1);
        estados.remove(estados.size() - 1);
        return estadoSalvo;
    }
}