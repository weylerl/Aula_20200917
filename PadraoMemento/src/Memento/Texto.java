package Memento;

public class Texto {
    protected String texto;
    TextoMemorizador memorizador;
 
    public Texto() {
    	memorizador = new TextoMemorizador();
        texto = new String();
    }
 
    public void escreverTexto(String novoTexto) {
    	memorizador.adicionarMemento(new TextoMemento(texto));
        texto += novoTexto;
    }
 
    public void desfazerEscrita() {
        texto = memorizador.getUltimoEstadoSalvo().getTextoSalvo();
    }
 
    public void mostrarTexto() {
        System.out.println(texto);
    }
}