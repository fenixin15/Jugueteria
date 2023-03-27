public class ToyInventory {
    public static void main(String[] args) {
      // Crear algunos juguetes de ejemplo
      JuegoMesa monopoly = new JuegoMesa("Hasbro", "Monopoly", "Un juego de mesa clásico para todas las edades.", 8, 99, 10);
      JuegoNintendoNX marioKart = new JuegoNintendoNX("Nintendo", "Mario Kart 8 Deluxe", "Un juego de carreras para la consola Nintendo Switch.", 6, 99, 5);
  
      // Imprimir información sobre los juguetes
      System.out.println(monopoly.getNombre() + " - " + monopoly.getDescripcion() + " - Marca: " + monopoly.getMarca() + " - Edad recomendada: " + monopoly.getEdadMinima() + "-" + monopoly.getEdadMaxima() + " años - Cantidad en inventario: " + monopoly.getCantidad());
      System.out.println(marioKart.getNombre() + " - " + marioKart.getDescripcion() + " - Marca: " + marioKart.getMarca() + " - Edad recomendada: " + marioKart.getEdadMinima() + "-" + marioKart.getEdadMaxima() + " años - Cantidad en inventario: " + marioKart.getCantidad());
  
      // Actualizar la cantidad de juguetes en inventario
      monopoly.actualizarCantidad(5);
      marioKart.actualizarCantidad(-2);
  
      // Imprimir la información actualizada sobre los juguetes
      System.out.println(monopoly.getNombre() + " - " + monopoly.getDescripcion() + " - Marca: " + monopoly.getMarca() + " - Edad recomendada: " + monopoly.getEdadMinima() + "-" + monopoly.getEdadMaxima() + " años - Cantidad en inventario: " + monopoly.getCantidad());
      System.out.println(marioKart.getNombre() + " - " + marioKart.getDescripcion() + " - Marca: " + marioKart.getMarca() + " - Edad recomendada: " + marioKart.getEdadMinima() + "-" + marioKart.getEdadMaxima() + " años - Cantidad en inventario: " + marioKart.getCantidad());
    }
}