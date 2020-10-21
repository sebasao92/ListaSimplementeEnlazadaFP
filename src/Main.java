public class Main {

    public static void main(String[] args) {

        ListaSimple listaSimple = new ListaSimple();
        listaSimple.ponerNodoAlInicio("Sebastian");
        listaSimple.ponerNodoAlInicio("Juan");
        listaSimple.ponerNodoAlFinal("Liset");
        listaSimple.agregarElemento(2, "Duvan");

        listaSimple.imprimirLista();
    }
}
