public class View {

    public void printMenu() {
        System.out.println("PAGO DE SERVICIOS PÚBLICOS");
        System.out.println("Seleccione el servicio público:");
        System.out.println("1. Energia");
        System.out.println("2. Acueducto");
        System.out.println("3. Gas Natural");
        System.out.println("4. Salir");
        System.out.println("Opción:");
    }

    public void printMensaje(String mensaje) {
        System.out.println(mensaje);
    }

    public void printTotal(Model servicio) {
        System.out.println("El consumo fue: " + servicio.getConsumo());
        System.out.println("Valor unidad: " + servicio.getCosto());
        System.out.println("Estrato del inmueble: " + servicio.getEstrato());
        System.out.println("Costo total: " + servicio.getTotal());
        System.out.println("Descuento o sobrecosto: " + (-1 * servicio.getDescuento()));
        System.out.println("Impuesto por infraestructura: " + servicio.getImpuesto());
        System.out.println("TOTAL A PAGAR: " + servicio.getTotalPagar() + "\n");
    }
}