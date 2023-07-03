package src.main.com.tienda;

import java.io.FileWriter;
import java.io.IOException;

public class VenderJuego {
    
    Catalogo catalogo;
    public VenderJuego(Catalogo new_catalogo){
        this.catalogo = new_catalogo;
    }

    public void venderJuego(String titulo, String genero, String plataforma, int cantidad, double precio){
        catalogo.addJuego(titulo, genero, plataforma, cantidad, cantidad, precio);
        registrarVenta(titulo, genero, plataforma, cantidad, precio);
    }

    void registrarVenta(String titulo, String genero, String plataforma, int cantidad, double precio){
        try {
            FileWriter myWriter = new FileWriter("C:\\Users\\Gerson\\Projects\\tarea3\\catalogo\\compras.csv", true);
            myWriter.write("venta," + cantidad + "," + titulo  + "," + precio+ "\n");
            myWriter.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public void showMenu() {

        System.out.println("---- Vender Juego ----");

        System.out.println("Ingrese el titulo del juego ");
        String titulo = Main.scanner.nextLine();

        System.out.println("Ingrese el genero del juego ");
        String genero = Main.scanner.nextLine();

        System.out.println("Ingrese la plataforma del juego ");
        String plataforma = Main.scanner.nextLine();

        System.out.println("Ingrese la cantidad del juego ");
        int cantidad = Main.scanner.nextInt();

        System.out.println("Ingrese el precio del juego ");
        double precio = Main.scanner.nextDouble();

        venderJuego(titulo, genero, plataforma, cantidad, precio);

        System.out.println("Juego puesto a la venta exitosamente.");
        

    }
}
