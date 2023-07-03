package src.test.com.tienda;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import src.main.com.tienda.Main;
import src.main.com.tienda.MainMenu;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.assertEquals;


// Testear navegacion en el menu principal

public class MainTest {
    private ByteArrayOutputStream testOut;

    @BeforeEach
    public void setUpOutput() {
        testOut = new ByteArrayOutputStream();
        System.setOut(new PrintStream(testOut));
    }

    private void provideInput(String data) {
        System.setIn( new ByteArrayInputStream(data.getBytes()) );
    }

    private String getOutput() {
        return testOut.toString();
    }

    @Test
    public void userInterfaceTest(){
        provideInput("1\n4\n");
        MainMenu main = new MainMenu();
        String resultadoEsperado = "Ingresar como: \r\n" + //
                "1. Usuario \r\n" + //
                "2. Administrador \r\n" + //
                "Ingrese su opci\u00F3n: ---- Men\u00FA Principal ----\r\n" + //
                "1. Ver cat\u00E1logo de juegos\r\n" + //
                "2. Comprar juego\r\n" + //
                "4. Salir\r\n" + //
                "Ingrese su opci\u00F3n: \u00A1Gracias por utilizar el simulador de gesti\u00F3n de la tienda de videojuegos!";
        
        assertEquals(resultadoEsperado.replaceAll("\\s+",""), getOutput().replaceAll("\\s+","") );
    }
    /* 
    @Test
    public void adminInterfaceTest(){
        provideInput("2\n4\n");
        MainMenu main = new MainMenu();
        String resultadoEsperado = "Ingresar como: \r\n" + //
                "1. Usuario \r\n" + //
                "2. Administrador \r\n" + //
                "Ingrese su opci\u00F3n: ---- Men\u00FA Principal ----\r\n" + //
                "1. Ver cat\u00E1logo de juegos\r\n" + //
                "2. Comprar juego\r\n" + //
                "3. Vender juego\r\n" + //
                "4. Salir\r\n" + //
                "Ingrese su opci\u00F3n: \u00A1Gracias por utilizar el simulador de gesti\u00F3n de la tienda de videojuegos!";
        
        assertEquals(resultadoEsperado.replaceAll("\\s+",""), getOutput().replaceAll("\\s+","") );
    }
    */
}
