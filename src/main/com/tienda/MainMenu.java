package src.main.com.tienda;

public class MainMenu {

    User user;

    void ShowMenu(){
        int opcion;
        // Inicializar tienda
        Catalogo catalogo = new Catalogo(user);
        ComprarJuego comprarJuego = new ComprarJuego(catalogo);
        VenderJuego venderJuego = new VenderJuego(catalogo);
        Reporte reporte = new Reporte(catalogo);

        // Menu principal
        do {
            System.out.println("---- Menú Principal ----");
            System.out.println("1. Ver catálogo de juegos");
            System.out.println("2. Comprar juego");
            if( this.user.user_type == User.Type.ADMIN){
                System.out.println("3. Vender juego");
            }
            if( this.user.user_type == User.Type.ADMIN){
                System.out.println("5. Generar reporte");
            }
            System.out.println("4. Salir");
            System.out.print("Ingrese su opción: ");
            opcion = Main.scanner.nextInt();

            switch (opcion) {
                case 1:
                    // Lógica para mostrar el catálogo de juegos
                    catalogo.mostrarCatalogo();
                    break;
                case 2:
                    // Lógica para comprar un juego
                    comprarJuego.showMenuComprarJuego();
                    break;
                case 3:
                    // Lógica para vender un juego
                    if( this.user.user_type == User.Type.ADMIN){
                        venderJuego.showMenu();
                    }else{
                        System.out.println("Opción inválida. Por favor, ingrese una opción válida.");
                    }
                    break;
                case 4:
                    System.out.println("¡Gracias por utilizar el simulador de gestión de la tienda de videojuegos!");
                    break;
                case 5:
                    if( this.user.user_type == User.Type.ADMIN){
                        reporte.generarReporte();
                    }else{
                        System.out.println("Opción inválida. Por favor, ingrese una opción válida.");
                    }
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, ingrese una opción válida.");
                    break;
            }
            System.out.println(); // Espacio en blanco para separar el menú principal de la siguiente iteración
        } while (opcion != 4);
    }






    public MainMenu() {
        int opcion;

        System.out.println("Ingresar como: ");
        System.out.println("1. Usuario ");
        System.out.println("2. Administrador ");
        System.out.print("Ingrese su opción: ");
        opcion = Main.scanner.nextInt();

        if (opcion == 1) {
            this.user = new User(User.Type.USER);
        } else if (opcion == 2) {
            this.user = new User(User.Type.ADMIN);
        }

        ShowMenu();
        
        return;
    }
}
