package src.main.com.tienda;

public class Juego {
    // Clase Juego

    private String titulo;
    private String genero;
    private String plataforma;
    private int cantidadDisponible;
    private int cantidadInicial;
    private double precio;

    public Juego(String titulo, String genero, String plataforma, int cantidadDisponible,  int cantidadInicial,double precio) {
        this.titulo = titulo;
        this.genero = genero;
        this.plataforma = plataforma;
        this.cantidadDisponible = cantidadDisponible;
        this.cantidadInicial = cantidadInicial;
        this.precio = precio;
        
    }

    public String getTitulo() {
        return titulo;
    }

    public String getGenero() {
        return genero;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public int getCantidadDisponible() {
        return cantidadDisponible;
    }

    public int getCantidadInicial() {
        return cantidadInicial;
    }

    public double getPrecio() {
        return precio;
    }

    public void setCantidadDisponible(int cantidadDisponible) {
        this.cantidadDisponible = cantidadDisponible;
    }



}
