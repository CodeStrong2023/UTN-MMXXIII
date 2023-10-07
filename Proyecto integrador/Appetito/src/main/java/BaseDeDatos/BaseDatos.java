package BaseDeDatos;

import java.util.ArrayList;
import java.util.List;

public class BaseDatos {
    Local AlmacenDonJose = new Local(1, "AlmacenDonJose", "Urquiza 920", 20.30, 4, "Despensa, Bebidas");
    Local kioscoSanMiguel = new Local(2,"Kiosco San Miguel","Belgrano 776",15,5,"Kiosko, Despensa, Bebidas");
    Local rostiseriaCucu = new Local(3,"Rostiseria Cuco","Italia 76",10,3,"Restaurante");
    Local pizzaAhora = new Local(4,"Pizza ahora!","San Martin 96",15,4,"Restaurante");
    Local lomitos100 = new Local(5,"Lomitos 100%","Belgrano 24",15,5,"Restaurante");
    Local empanadasLocales = new Local(6,"Empanadas Locales","Belgrano 333",25,4,"Restaurante");
    Local restauranteRodriguez = new Local(7,"Restaurante Rodriguez","Libertad 241",15,3,"Restaurante, Bebidas");
    Local heladeriaVaticano = new Local(8,"Heladeria Vaticano","Europa 231",5,2,"Heladerias, Cafeterias");
    Local cafeteriaNeumman = new Local(9,"Cafeteria Neumman","España 2354",5,5,"Cafeteria, Heladeria, Panaderia");
    Local comidasNaN = new Local(10,"Comidas NaN"," Cordoba 576",35,5,"Restaurantes,Bebidas,Despensas");


    //se crea instancia de productos
    ListaProductos productos = new ListaProductos();

    // esta metodo permite asignar  todos los productos a los respectivos locales
    public void setProductosALocales() {
                // Almancen Don Jose
        AlmacenDonJose.agregarProducto(productos.aceite);
        AlmacenDonJose.agregarProducto(productos.harina000);
        AlmacenDonJose.agregarProducto(productos.azucar);
        AlmacenDonJose.agregarProducto(productos.mayoneza);
        AlmacenDonJose.agregarProducto(productos.salsaDeTomate);
        AlmacenDonJose.agregarProducto(productos.sprite);
                // kiosko San Miguel
        kioscoSanMiguel.agregarProducto(productos.chocolate);
        kioscoSanMiguel.agregarProducto(productos.cocaCola);
        kioscoSanMiguel.agregarProducto(productos.sprite);
        kioscoSanMiguel.agregarProducto(productos.alfajor);
        kioscoSanMiguel.agregarProducto(productos.bubalu);
        kioscoSanMiguel.agregarProducto(productos.crush);
                // Rosticeria Cucu
        rostiseriaCucu.agregarProducto(productos.empanadaH);
        rostiseriaCucu.agregarProducto(productos.empanadasJQ);
        rostiseriaCucu.agregarProducto(productos.pizzaMuzzarella);
        rostiseriaCucu.agregarProducto(productos.hamburguesa);
        rostiseriaCucu.agregarProducto(productos.milanezas);
        rostiseriaCucu.agregarProducto(productos.ravioles);
                // Pizza ahora!!
        pizzaAhora.agregarProducto(productos.pizzaMuzzarella);
        pizzaAhora.agregarProducto(productos.pizzaNapolitana);
        pizzaAhora.agregarProducto(productos.pizzaAnana);
        pizzaAhora.agregarProducto(productos.pizzaHongos);
        pizzaAhora.agregarProducto(productos.pizzaProvensal);
        pizzaAhora.agregarProducto(productos.sprite);
                //lomitos 100%
        lomitos100.agregarProducto(productos.lomitoSimple);
        lomitos100.agregarProducto(productos.hamburguesa);
        lomitos100.agregarProducto(productos.lomitoCompleto);
        lomitos100.agregarProducto(productos.lomitoDoble);
        lomitos100.agregarProducto(productos.lomitoconCebolla);
        lomitos100.agregarProducto(productos.cocaCola);
                // Empanaads locales
        empanadasLocales.agregarProducto(productos.empanadasJQ);
        empanadasLocales.agregarProducto(productos.empanadaH);
        empanadasLocales.agregarProducto(productos.empanadaCarne);
        empanadasLocales.agregarProducto(productos.empanadaNapolotana);
        empanadasLocales.agregarProducto(productos.empanadasRoquefort);
        empanadasLocales.agregarProducto(productos.sprite);
              // Restaurante Rodriguez
        restauranteRodriguez.agregarProducto(productos.empanadasJQ);
        restauranteRodriguez.agregarProducto(productos.ravioles);
        restauranteRodriguez.agregarProducto(productos.tallarines);
        restauranteRodriguez.agregarProducto(productos.milanezas);
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

    // este metodo permite que la base de datos retorne un local en espesifico
    public Local getLocales(int i) {
        Local local= AlmacenDonJose;
        switch (i){
            case 1:
                local = AlmacenDonJose;
                break;
            case 2:
                local = kioscoSanMiguel;
                break;
            case 3:
                local =rostiseriaCucu;
                break;
            case 4:
                local = pizzaAhora;
                break;
            case 5:
                local = lomitos100;
                break;
            case  6:
                local = empanadasLocales;
                break;
            case 7:
                local = restauranteRodriguez;
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
// este es el contructor de la clase
    public BaseDatos() {
    }

    public List getListaLocales(){
        List locales = new ArrayList();
        locales.add(AlmacenDonJose.getNombre());
        locales.add(kioscoSanMiguel.getNombre());
        locales.add(restauranteRodriguez.getNombre());
        locales.add(rostiseriaCucu.getNombre());
        locales.add(cafeteriaNeumman.getNombre());
        locales.add(heladeriaVaticano.getNombre());
        locales.add(comidasNaN.getNombre());
        locales.add(lomitos100.getNombre());
        locales.add(empanadasLocales.getNombre());
        locales.add(pizzaAhora.getNombre());
        return locales;
    }

}
