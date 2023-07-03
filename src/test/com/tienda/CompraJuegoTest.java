package src.test.com.tienda;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import src.main.com.tienda.Catalogo;
import src.main.com.tienda.ComprarJuego;
import src.main.com.tienda.Juego;
import src.main.com.tienda.User;
import src.main.com.tienda.User.Type;

public class CompraJuegoTest {
 
    @Test
    // Comprobar si el ultimo juego a la venta es el juego puesto a la venta
    public void comprarJuego(){
        Catalogo catalogo = new Catalogo(new User(Type.USER));
        ComprarJuego comprarJuego = new ComprarJuego(catalogo);
        int cantidad_a_comprar = 1;
        int cantidad = 4;
        catalogo.addJuego("testtest", "testtest", "\"testtest\"", cantidad,cantidad, 10);
        Juego juego = catalogo.getJuegoByID(catalogo.size() - 1);
        int resultado_esperado = cantidad - cantidad_a_comprar;

        comprarJuego.comprarJuego(catalogo.size() - 1, cantidad_a_comprar);
        assertEquals( resultado_esperado, juego.getCantidadDisponible() );
    }

    @Test
    public void comprarTest(){
        Catalogo catalogo = new Catalogo(new User(Type.USER));
        ComprarJuego comprarJuego = new ComprarJuego(catalogo);
        Boolean exito = false;
        if(comprarJuego.comprarJuego(0, 0) <= 0 ){
            exito = true;
        }
        assertEquals( exito, true );
    }

}
