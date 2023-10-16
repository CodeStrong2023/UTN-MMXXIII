package BaseDeDatos;

import java.util.ArrayList;
import java.util.List;

public class ListaCategorias {
    public List<String> listaC;

   public void iniciarCategorias(){
        listaC.add("Despensas");
        listaC.add("Bebidas");
        listaC.add("Restaurantes");
        listaC.add("Heladerias");
        listaC.add("Cafeterias");
        listaC.add("Panaderias");
        listaC.add("Kioscos");
    }
    public void mostrarCategorias(){

        for (int i = 0; i < listaC.size(); i++) {
            System.out.println(i+1 + " - " + listaC.get(i));
        }
    }

    public ListaCategorias() {
        this.listaC = new ArrayList<>();
        iniciarCategorias();
    }
}
