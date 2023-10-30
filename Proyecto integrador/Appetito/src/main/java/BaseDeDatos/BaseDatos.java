package BaseDeDatos;

import java.util.ArrayList;
import java.util.List;

public class BaseDatos {

    Local almacenDonJose = new Local(1, "Almacen Don Jose", "Urquiza 920", 20.30, 4);
    Local kioscoSanMiguel = new Local(2,"Kiosco San Miguel","Belgrano 776",15,5);
    Local rotiseriaCucu = new Local(3,"Rotiseria Cucu","Italia 76",10,3);
    Local pizzaAhora = new Local(4,"Pizza ahora!","San Martin 96",15,4);
    Local lomitos100 = new Local(5,"Lomitos 100%","Belgrano 24",15,5);
    Local empanadasLocales = new Local(6,"Empanadas Locales","Belgrano 333",25,4);
    Local restauranteRodriguez = new Local(7,"Restaurante Rodriguez","Libertad 241",15,3);
    Local heladeriaVaticano = new Local(8,"Heladeria Vaticano","Europa 231",5,2);
    Local cafeteriaNeumman = new Local(9,"Cafeteria Neumman","España 2354",5,5);
    Local comidasNaN = new Local(10,"Comidas NaN"," Cordoba 576",35,5);






    //se crea instancia de productos
    ListaProductos productos = new ListaProductos();

    // este metodo permite asignar  todos los productos a los respectivos locales
    public void setProductosALocales() {
                // almancen Don Jose
        almacenDonJose.agregarProducto(productos.aceite);
        almacenDonJose.agregarProducto(productos.harina000);
        almacenDonJose.agregarProducto(productos.azucar);
        almacenDonJose.agregarProducto(productos.mayonesa);
        almacenDonJose.agregarProducto(productos.salsaDeTomate);
        almacenDonJose.agregarProducto(productos.sprite);
                // kiosko San Miguel
        kioscoSanMiguel.agregarProducto(productos.chocolate);
        kioscoSanMiguel.agregarProducto(productos.cocaCola);
        kioscoSanMiguel.agregarProducto(productos.sprite);
        kioscoSanMiguel.agregarProducto(productos.alfajor);
        kioscoSanMiguel.agregarProducto(productos.chicle);
        kioscoSanMiguel.agregarProducto(productos.crush);
                // Rosticeria Cucu
        rotiseriaCucu.agregarProducto(productos.empanadaH);
        rotiseriaCucu.agregarProducto(productos.empanadaJQ);
        rotiseriaCucu.agregarProducto(productos.pizzaMuzzarella);
        rotiseriaCucu.agregarProducto(productos.hamburguesa);
        rotiseriaCucu.agregarProducto(productos.milanesa);
        rotiseriaCucu.agregarProducto(productos.ravioles);
                // Pizza ahora!!
        pizzaAhora.agregarProducto(productos.pizzaMuzzarella);
        pizzaAhora.agregarProducto(productos.pizzaNapolitana);
        pizzaAhora.agregarProducto(productos.pizzaAnana);
        pizzaAhora.agregarProducto(productos.pizzaHongos);
        pizzaAhora.agregarProducto(productos.pizzaProvenzal);
        pizzaAhora.agregarProducto(productos.sprite);
                //lomitos 100%
        lomitos100.agregarProducto(productos.lomitoSimple);
        lomitos100.agregarProducto(productos.hamburguesa);
        lomitos100.agregarProducto(productos.lomitoCompleto);
        lomitos100.agregarProducto(productos.lomitoDoble);
        lomitos100.agregarProducto(productos.lomitoConCebolla);
        lomitos100.agregarProducto(productos.cocaCola);
                // Empanaads locales
        empanadasLocales.agregarProducto(productos.empanadaJQ);
        empanadasLocales.agregarProducto(productos.empanadaH);
        empanadasLocales.agregarProducto(productos.empanadaCarne);
        empanadasLocales.agregarProducto(productos.empanadaNapolitana);
        empanadasLocales.agregarProducto(productos.empanadaRoquefort);
        empanadasLocales.agregarProducto(productos.sprite);
              // Restaurante Rodriguez
        restauranteRodriguez.agregarProducto(productos.empanadaJQ);
        restauranteRodriguez.agregarProducto(productos.ravioles);
        restauranteRodriguez.agregarProducto(productos.tallarines);
        restauranteRodriguez.agregarProducto(productos.milanesa);
        restauranteRodriguez.agregarProducto(productos.hamburguesa);
        restauranteRodriguez.agregarProducto(productos.pizzaMuzzarella);
            //Heladeria Vaticano
        heladeriaVaticano.agregarProducto(productos.kiloArtesanal);
        heladeriaVaticano.agregarProducto(productos.medioKiloArtesanal);
        heladeriaVaticano.agregarProducto(productos.cuartoKiloArtesanal);
        heladeriaVaticano.agregarProducto(productos.cafe);
        heladeriaVaticano.agregarProducto(productos.cafeExpresoColombiano);
        heladeriaVaticano.agregarProducto(productos.medialuna);
            // cafeteria Neuman
        cafeteriaNeumman.agregarProducto(productos.medialuna);
        cafeteriaNeumman.agregarProducto(productos.cafeExpresoColombiano);
        cafeteriaNeumman.agregarProducto(productos.cafeMedialuna);
        cafeteriaNeumman.agregarProducto(productos.cafe);
        cafeteriaNeumman.agregarProducto(productos.cuartoKiloArtesanal);
        cafeteriaNeumman.agregarProducto(productos.facturasRellenas);
            // Comidas Nan
        comidasNaN.agregarProducto(productos.vino);
        comidasNaN.agregarProducto(productos.sprite);
        comidasNaN.agregarProducto(productos.yerba);
        comidasNaN.agregarProducto(productos.aceite);
        comidasNaN.agregarProducto(productos.pizzaMuzzarella);
        comidasNaN.agregarProducto(productos.pizzaNapolitana);
    }

    // este metodo permite que la base de datos retorne un local en especifico
    public Local getLocales(int i) {
        Local local= almacenDonJose;
        switch (i){
            case 1:
                local = almacenDonJose;
                break;
            case 2:
                local = kioscoSanMiguel;
                break;
            case 3:
                local = rotiseriaCucu ;
                break;
            case 4:
                local = pizzaAhora  ;
                break;
            case 5:
                local = lomitos100 ;
                break;
            case  6:
                local = empanadasLocales ;
                break;
            case 7:
                local = restauranteRodriguez ;
                break;
            case 8:
                local = heladeriaVaticano;
                break;
            case 9:
                local = cafeteriaNeumman;
                break;
            case 10:
                local = comidasNaN;
                break;
        }
        return local;
    }


    public List getListaLocales(){
        List locales = new ArrayList();
        locales.add(almacenDonJose.getNombre());
        locales.add(kioscoSanMiguel.getNombre());
        locales.add(rotiseriaCucu.getNombre());
        locales.add(pizzaAhora.getNombre());
        locales.add(lomitos100.getNombre());
        locales.add(empanadasLocales.getNombre());
        locales.add(restauranteRodriguez.getNombre());
        locales.add(heladeriaVaticano.getNombre());
        locales.add(cafeteriaNeumman.getNombre());
        locales.add(comidasNaN.getNombre());
        return locales;
    }
//Construccion de lista de categorias
    ListaCategorias categorias = new ListaCategorias();
    public void setCategoriasALocales() {
        // almancen Don Jose
        List<String> categoriasAlmacenDonJose = new ArrayList<>(List.of("Despensas","Bebidas"));
        addCategoria(almacenDonJose,categoriasAlmacenDonJose);
        // kiosko San Miguel
        List<String> categoriasKioscoSanMiguel = new ArrayList<>(List.of("Kioscos","Despensas","Bebidas"));
        addCategoria(kioscoSanMiguel,categoriasKioscoSanMiguel);
        // Rotiseria Cucu
        List<String> categoriasRotiseriaCucu = new ArrayList<>(List.of("Restaurantes"));
        addCategoria(rotiseriaCucu,categoriasRotiseriaCucu);
        // Pizza ahora!!
        List<String> categoriasPizzaAhora = new ArrayList<>(List.of("Restaurantes"));
        addCategoria(pizzaAhora,categoriasPizzaAhora);
        //lomitos 100%
        List<String> categoriasLomitos100 = new ArrayList<>(List.of("Restaurantes"));
        addCategoria(lomitos100,categoriasLomitos100);
        // Empanadas locales
        List<String> categoriasEmpanadasLocales = new ArrayList<>(List.of("Restaurantes"));
        addCategoria(empanadasLocales,categoriasEmpanadasLocales);
        // Restaurante Rodriguez
        List<String> categoriasRestauranteRodriguez = new ArrayList<>(List.of("Restaurantes","Bebidas"));
        addCategoria(restauranteRodriguez,categoriasRestauranteRodriguez);
        //Heladeria Vaticano
        List<String> categoriasHeladeriaVaticano = new ArrayList<>(List.of("Heladerias","Cafeterias","Panaderias"));
        addCategoria(heladeriaVaticano,categoriasHeladeriaVaticano);
        // cafeteria Neuman
        List<String> categoriasCafeteriaNeumman = new ArrayList<>(List.of("Cafeterias","Heladerias","Panaderias"));
        addCategoria(cafeteriaNeumman,categoriasCafeteriaNeumman);
        // Comidas Nan
        List<String> categoriasComidasNaN = new ArrayList<>(List.of("Restaurantes", "Bebidas", "Despensas"));
        addCategoria(comidasNaN,categoriasComidasNaN);
    }
//Metodo para setear categorias a local desde lista base
   public void addCategoria(Local local, List<String> categorias){
        for (int i = 0; i < categorias.size(); i++) {
            local.agregarCategoria(categorias.get(i));
        }
    }
    //Metodo para ingresar nueva categoria a local desde admin
    public void addCategoria(Local local, String categorias){
       local.agregarCategoria(categorias);
    }

    // este es el contructor de la clase
    public BaseDatos() {
        this.setCategoriasALocales();
        this.setProductosALocales();
    }
}
