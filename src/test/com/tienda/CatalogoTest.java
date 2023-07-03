package src.test.com.tienda;
import org.junit.jupiter.api.Test;

import src.main.com.tienda.Catalogo;
import src.main.com.tienda.User;
import src.main.com.tienda.User.Type;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class CatalogoTest {

    int countCSVLines(String ruta){
        String csvFile = ruta; // Ruta del archivo CSV
        int lineCount = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            while (br.readLine() != null) {
                lineCount++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return lineCount;
    }
    
    
    @Test
    // Comprobar si la cantidad de juegos es igual a la cantidad de entradas en el .csv
    public void testTamanoCatalogo() {
        Catalogo catalogo = new Catalogo( new User(Type.USER) );
        assertEquals( catalogo.size() , countCSVLines("C:\\Users\\Gerson\\Projects\\tarea3\\catalogo\\catalogo.csv") );
    }




}
