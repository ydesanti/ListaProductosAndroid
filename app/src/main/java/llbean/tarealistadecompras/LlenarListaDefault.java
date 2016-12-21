package llbean.tarealistadecompras;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ydesanti on 11/16/2016.
 */

public class LlenarListaDefault {

    public static List<Productos> productos;
    public static List<Productos> crearListaProductos() {
        productos = new ArrayList<>();

        productos.add(new Productos("Bolsa de Arroz", 2, 25));
        productos.add(new Productos("Bolsa de Frijoles", 3, 20));
        productos.add(new Productos("Lata de Maíz", 5, 35));
        productos.add(new Productos("Papas", 20, 2));
        productos.add(new Productos("Chile", 5, 1));
        productos.add(new Productos("Paq de Sal", 2, 25));
        productos.add(new Productos("Caja de Leche", 2, 30));
        productos.add(new Productos("Bolsa de Azucar", 2, 19));
        productos.add(new Productos("Paq de Espaguetti", 2, 11));
        productos.add(new Productos("Frasco de Jalea", 4, 6));
        productos.add(new Productos("Paq de Masa", 2, 12));

        return productos;
    }
}
