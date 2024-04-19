
package trabajoenparejasgradle;

import java.util.HashMap;
import java.util.Random;

public class App {

    public static void main(String[] args) {
        
    }

    HashMap<String, Double> comida = new HashMap<String, Double>();
    HashMap<Integer, String[]> pedidos = new HashMap<Integer, String[]>();

    public void agregarPlatoAlMenu(String nombre, Double precio) {
        comida.put(nombre, precio);
    }

    public HashMap<String, Double> getMenu() {
        return comida;
    }

    public void eliminarPlatoDelMenu(String string) {
        comida.remove(string);
    }

    public void listarMenu() {
        for (Double i : comida.values()) {
            System.out.println(i);
        }
    }

    public int crearPedido() {
        int min = 1;
        int max = 999999999;
        Random random = new Random();
        int llave = random.nextInt(max - min + 1) + min;
        pedidos.put(llave, null);
        return llave;
    }

    public HashMap<Integer, String[]> getPedidos() {
        return pedidos;
    }

}