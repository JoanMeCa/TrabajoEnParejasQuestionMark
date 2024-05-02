
package trabajoenparejasgradle;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class App {

    public static void main(String[] args) {
         
    }

    HashMap<String, Double> comida = new HashMap<String, Double>();
    HashMap<Integer, HashMap<String, Double>> pedidos = new HashMap<Integer, HashMap<String, Double>>();

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
        for (String nombre : comida.keySet()) {
            System.out.println(nombre);
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

    public HashMap<Integer, HashMap<String, Double>> getPedidos() {
        return pedidos;
    }

    public void agregarPlatoAlPedido(int idPedido, String plato) {

        HashMap<String, Double> pedidoActual = pedidos.get(idPedido);
        if (pedidoActual == null) {
            pedidoActual = new HashMap<>();
        }
        pedidoActual.put(plato, comida.get(plato));
        pedidos.put(idPedido, pedidoActual);
    }

    public double calcularTotalPedido(int idPedido) { 
        double total = 0;
        HashMap<String, Double> pedidoActual = pedidos.get(idPedido);

        for (Double precio : pedidoActual.values()) {
            total += precio;
        }
        return total;
    }

    public void mostrarPedido(int idPedido) {
        HashMap<String, Double> pedidoActual = pedidos.get(idPedido);
        for (String plato : pedidoActual.keySet()) {
            System.out.println(plato);
            System.out.println(pedidoActual.get(plato));
        }
    }


}