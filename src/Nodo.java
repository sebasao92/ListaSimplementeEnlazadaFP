public class Nodo {

    private String elemento;
    private Nodo nodoSiguiente;

    @Override
    public String toString() {
        return "Elemento: " + elemento + " y apunta a " + (nodoSiguiente == null ? "nada" : nodoSiguiente.getElemento());
    }

    public Nodo(String elemento){
        this.elemento = elemento;
        this.nodoSiguiente = null;
    }

    public String getElemento() {
        return elemento;
    }

    public void setElemento(String elemento) {
        this.elemento = elemento;
    }

    public Nodo getNodoSiguiente() {
        return nodoSiguiente;
    }

    public void setNodoSiguiente(Nodo nodo) {
        this.nodoSiguiente = nodo;
    }

    public boolean equals(Nodo nodo){
        return this.elemento.equals(nodo.getElemento()) &&
               this.nodoSiguiente == nodo.getNodoSiguiente();
    }
}
