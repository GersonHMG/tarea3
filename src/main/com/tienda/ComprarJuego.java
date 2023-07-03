package src.main.com.tienda;

import java.io.FileWriter;
import java.io.IOException;

public class ComprarJuego {

    Catalogo catalogo;
    public ComprarJuego(Catalogo new_catalogo){
        catalogo = new_catalogo;
    }

    public float comprarJuego(int idJuego, int cantidad){
        Juego juegoSeleccionado = catalogo.getJuegoByID(idJuego);
        juegoSeleccionado.setCantidadDisponible(juegoSeleccionado.getCantidadDisponible() - cantidad);
        // Calcular el monto total de la compra
        float montoTotal = (float) juegoSeleccionado.getPrecio() * cantidad;
        registrarCompra( juegoSeleccionado.getTitulo(),  juegoSeleccionado.getGenero(), cantidad,  juegoSeleccionado.getPrecio() );
        return montoTotal;
    }

    void registrarCompra(String titulo, String genero, int cantidad, double precio){
        try {
            FileWriter myWriter = new FileWriter("C:\\Users\\Gerson\\Projects\\tarea3\\catalogo\\compras.csv", true);
            myWriter.write("compra," + cantidad + "," + titulo  + "," + precio + "\n");
            myWriter.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }


    public void showMenuComprarJuego() {
        System.out.println("---- Comprar Juego ----");

        System.out.print("Ingrese la id del juego que desea comprar: ");
        int idJuego = Main.scanner.nextInt();

        if (idJuego < 0 || idJuego >= catalogo.size()) {
            System.out.println("¡Opción inválida! Por favor, ingrese un número válido.");
        } else {
            Juego juegoSeleccionado = catalogo.getJuegoByID(idJuego);
            if (juegoSeleccionado.getCantidadDisponible() <= 0) {
                System.out.println("¡El juego seleccionado está agotado!");
            } else {
                System.out.print("Ingrese la cantidad de juegos que desea comprar: ");
                int cantidad = Main.scanner.nextInt();

                if (cantidad <= 0 || cantidad > juegoSeleccionado.getCantidadDisponible()) {
                    System.out.println("¡Cantidad inválida! Por favor, ingrese una cantidad válida.");
                } else {
                    // Actualizar la cantidad disponible del juego
                    float monto = comprarJuego(idJuego, cantidad);

                    System.out.println("¡Compra exitosa!");
                    System.out.println("Juego: " + juegoSeleccionado.getTitulo());
                    System.out.println("Cantidad: " + cantidad);
                    System.out.println("Monto Total: $" + monto);
                }
            }
        }

    }
}
