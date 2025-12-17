package AfianzarConocimientos;

public class Terminal {
    
    private String numeroTerminal;
    private int tiempoConversacion = 0;
    
    public Terminal(String numeroTerminal){
        this.numeroTerminal = numeroTerminal;
    }
    
    public void llama(Terminal llamada , int tiempo){
        this.tiempoConversacion += tiempo;
        llamada.añadirTiempo(tiempo);
        
    }
    
    public void añadirTiempo(int tiempo){
        this.tiempoConversacion += tiempo;
    }
    
    @Override
    public String toString(){
        return numeroTerminal + " - " + tiempoConversacion + " de conversación";
    }
    
}
