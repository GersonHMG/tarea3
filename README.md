# Tarea3: Simulador de gestión de una tienda de videojuegos

Este proyecto es un simulador de gestión de una tienda de videojuegos en línea de comandos. Permite administrar diferentes aspectos del negocio, como el catálogo de juegos, compras, ventas y generación de reportes.

## Alcance

El simulador implementa las siguientes funcionalidades:

1. Manejo de dos usuarios: Administrador (vendedor) y cliente.
2. Catálogo de juegos: Los usuarios pueden ver el catálogo de juegos disponibles en la tienda, incluyendo información sobre título, género, plataforma, cantidad disponible y precio.
3. Compra y venta de juegos: Los clientes pueden comprar juegos especificando el título y la cantidad deseada. Los administradores pueden comprar y vender juegos especificando el título y la cantidad.
4. Generación de reportes: Los administradores pueden generar reportes detallados sobre las ventas y compras realizadas, así como los ingresos generados.

## Requerimientos

Para ejecutar el simulador, necesitarás:

- Java Development Kit (JDK) 8 o superior.
- JUnit (Viene incluido)
- Visual Studio Code
- Extension Java Visual Studio Code para ejecutar pruebas Junit Jupiter.

## Supuestos

Se asume lo siguiente:

- Los juegos son cargados desde un archivo "catalogo.csv", se representan como objetos en memoria.
- No se realiza ninguna persistencia de datos para los juegos.
- La interacción con el simulador se realiza a través de la línea de comandos.
- No se implementa un sistema de autenticación o control de acceso para los usuarios.
- Para cambiar de usuario se tiene que reiniciar la aplicacion.

## Instalación

1. Clonar el repositorio.
2. Abrir proyecto con Visual Studio Code.
3. CTRL + F5 para ejecutar.


