package src.main.com.tienda;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Catalogo {
    
    private List<Juego> catalogo = new ArrayList<>();

    User user;


    public Catalogo(User new_user){
        this.user = new_user;
        // Cargar juegos
        String csvFile = "C:\\Users\\Gerson\\Projects\\tarea3\\catalogo\\catalogo.csv"; // Ruta del archivo CSV
        String line;
        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            while ((line = br.readLine()) != null) {
                String[] columns = line.split(",");

                if (columns.length == 6) {
                    String title = columns[0].trim().replace("\"", "");
                    String genre = columns[1].trim().replace("\"", "");
                    String platform = columns[2].trim().replace("\"", "");
                    int cantidad = Integer.parseInt( columns[3].trim() );
                    int cantidadInicial = Integer.parseInt( columns[4].trim() );
                    double price = Double.parseDouble( columns[5].trim() );

                    addJuego(title, genre, platform, cantidad, cantidadInicial, price);

                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Boolean addJuego(String title,String genre,String platform,int cantidad,int cantidadInicial,double price){
        Juego game = new Juego(title, genre, platform, cantidad, cantidadInicial, price);
        this.catalogo.add(game);
        return true;
    }

    public int size(){
        return this.catalogo.size();
    }

    public Juego getJuegoByID(int id){
        return this.catalogo.get(id);
    }

    public List<Juego> getJuegos(){
        return this.catalogo;
    }

    public void mostrarCatalogo() {
        System.out.println("---- Catálogo de Juegos ----");

        if (this.catalogo.isEmpty()) {
            System.out.println("El catálogo está vacío.");
        } else {
            int i = 0;
            for (Juego juego : catalogo) {

                    System.out.println("ID: " + i);
                    System.out.println("Título: " + juego.getTitulo());
                    System.out.println("Género: " + juego.getGenero());
                    System.out.println("Plataforma: " + juego.getPlataforma());
                    System.out.println("Cantidad disponible: " + juego.getCantidadDisponible());
                    System.out.println("Precio: $" + juego.getPrecio());
                    System.out.println("--------------------");
                
                i += 1;
            }
        }
    }

    public void mostrarInventario() {
        System.out.println("---- Inventario de Juegos ----");

        if (this.catalogo.isEmpty()) {
            System.out.println("El inventario está vacío.");
        } else {
            int i = 0;
            for (Juego juego : catalogo) {

                System.out.println("ID: " + i);
                System.out.println("Título: " + juego.getTitulo());
                System.out.println("Género: " + juego.getGenero());
                System.out.println("Plataforma: " + juego.getPlataforma());
                System.out.println("Cantidad disponible: " + juego.getCantidadDisponible());
                System.out.println("Precio: $" + juego.getPrecio());
                System.out.println("--------------------");
                
                i += 1;
            }
        }
    }


   
}
