package src.test.com.tienda;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import src.main.com.tienda.Catalogo;
import src.main.com.tienda.MainMenu;
import src.main.com.tienda.User;
import src.main.com.tienda.VenderJuego;
import src.main.com.tienda.User.Type;

public class VenderJuegoTest {
 
    @Test
    // Comprobar si el ultimo juego a la venta es el juego puesto a la venta
    public void venderJuego(){
        Catalogo catalogo = new Catalogo(new User(Type.USER));
        VenderJuego venderJuego = new VenderJuego(catalogo);
        String nombre_juego = "juego_test";
        venderJuego.venderJuego(nombre_juego, "genero_test", "plataforma_test", 99, 99.9);
        assertEquals( nombre_juego, catalogo.getJuegoByID(catalogo.size() - 1).getTitulo() );
    }

}
