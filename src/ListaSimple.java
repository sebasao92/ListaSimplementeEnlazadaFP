public class ListaSimple {

    private Nodo primero;
    private Nodo ultimo;

    public ListaSimple(){
        this.primero = null;
        this.ultimo = null;
    }

    public boolean estaVacio() {
        return primero == null;
    }

    public void ponerNodoAlInicio(String elemento){

        Nodo nuevoNodo = new Nodo(elemento);
        if(estaVacio()){
            ultimo = nuevoNodo;
        } else {
            nuevoNodo.setNodoSiguiente(primero);
        }
        primero = nuevoNodo;
    }

    public void ponerNodoAlFinal(String elemento){

        Nodo nuevoNodo = new Nodo(elemento);
        if(estaVacio()){
            primero = nuevoNodo;
        } else {
            ultimo.setNodoSiguiente(nuevoNodo);
        }
        ultimo = nuevoNodo;
    }

    public void eliminarPrimerNodo(){

        if(estaVacio()){
            System.out.println("La lista está vacía");
        } else if(primero.equals(ultimo)){
            primero = null;
            ultimo = null;
            System.out.println("La lista quedó vacía");
        } else {
            primero = primero.getNodoSiguiente();
            System.out.println("Elemento eliminado");
        }
    }

    public void eliminarUltimoNodo(){

        if(estaVacio()){
            System.out.println("La lista está vacía");
        } else if(primero.equals(ultimo)){
            primero = null;
            ultimo = null;
            System.out.println("La lista quedó vacía");
        } else {
            Nodo temp = primero;
            while(!temp.getNodoSiguiente().equals(ultimo)){
                temp = temp.getNodoSiguiente();
            }
            temp.setNodoSiguiente(null);
            ultimo = temp;
        }
    }

    public Nodo getPrimero() {

       imprimirMensajeSiVacio();
       return primero;
    }

    public Nodo getUltimo() {

        imprimirMensajeSiVacio();
        return ultimo;
    }

    private void imprimirMensajeSiVacio(){

        if(estaVacio()){
            System.out.println("La lista está vacía");
        }
    }

    public void imprimirLista(){

        if(estaVacio()){
            System.out.println("Está vacía");
        } else if (primero.equals(ultimo)){
            System.out.print(primero);
        } else {
            Nodo temp = primero;
            int contador = 0;
            while(temp.getNodoSiguiente() != null){
                System.out.println("Nodo " + ++contador + ":"+ temp);
                temp = temp.getNodoSiguiente();
            }
            System.out.println("Nodo " + ++contador + ":"+ temp);
        }
    }

    public void agregarElemento(int posicion, String elemento){

        if(estaVacio()){
            System.out.println("Lista vacía");
        } else {
            Nodo nuevoNodo = new Nodo(elemento);
            Nodo anterior = primero;
            Nodo actual = primero;
            int contador = 1;
            while(contador != posicion && actual.getNodoSiguiente() != null) {
                anterior = actual;
                actual = actual.getNodoSiguiente();
                contador++;
            }

            if(contador < posicion){
                System.out.print("La posición no existe");
            } else {
                nuevoNodo.setNodoSiguiente(actual);
                anterior.setNodoSiguiente(nuevoNodo);
            }
        }
    }
}
