package src.main.com.tienda;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Reporte {
    
    Catalogo catalogo;

    public Reporte(Catalogo catalogo){
        this.catalogo = catalogo;
    }

    public void generarReporte(){
        System.out.println("---- Reporte compras y ventas ----");
        String csvFile = "C:\\Users\\Gerson\\Projects\\tarea3\\catalogo\\compras.csv"; // Ruta del archivo CSV
        String line;
        double total_ganancia = 0.0;
        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            while ((line = br.readLine()) != null) {
                String[] columns = line.split(",");

                if (columns.length == 4) {
                    String accion = columns[0].trim().replace("\"", "");
                    int cantidad = Integer.parseInt(columns[1].trim());
                    String titulo = columns[2].trim().replace("\"", "");
                    double price = Double.parseDouble( columns[3].trim() );
                    System.out.println( accion + ":" + titulo + " con una cantidad de " + cantidad + " a un precio de " + price);
                    if(accion.equals("compra")){
                        total_ganancia += price*cantidad;
                    }
                }

            }
            System.out.println("Total ganancia: " + total_ganancia);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
