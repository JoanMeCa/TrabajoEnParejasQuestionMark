public class tienda {
    
}

public class Tienda {
    private int identificador;
    private String nombre;
    private String ubicacion;
    private String tipoTienda;
    private int metros2;
    private boolean cerrada; 
    
    public Tienda(int identificador, String nombre, String ubicacion, String tipoTienda, int metros2, boolean cerrada) {
        this.identificador = identificador;
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.tipoTienda = tipoTienda;
        this.metros2 = metros2;
        this.cerrada = cerrada;
    }
    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }
    public int getIdentificador() {
        return identificador;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
    public String getUbicacion() {
        return ubicacion;
    }

    public void setTipoTienda(String tipoTienda) {
        this.tipoTienda = tipoTienda;
    }
    public String getTipoTienda() {
        return tipoTienda;
    }

    public void setMetros2(int metros2) {
        this.metros2 = metros2;
    }
    public int getMetros2() {
        return metros2;
    }

    public void setCerrada(boolean cerrada) {
        this.cerrada = cerrada;
    }
    public boolean getCerrada() {
        return cerrada;
    }
}