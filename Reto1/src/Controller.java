import java.util.Scanner;

public class Controller {
    int consumo;
    byte estrato, opcion;

    public Controller() {
    }

    public void run(View vista, Model modelo) {

        Scanner input = new Scanner(System.in);

        vista.printMenu();

        while (true) {

            opcion = input.nextByte();
            if (opcion == 1 || opcion == 2 || opcion == 3) {
                switch (opcion) {
                    case 1:
                        vista.printMensaje("Pago de Servicio de Energia");
                        modelo.setCosto("Energia");
                        break;
                    case 2:
                        vista.printMensaje("Pago de Servicio de Acueducto");
                        modelo.setCosto("Acueducto");
                        break;
                    case 3:
                        vista.printMensaje("Pago de Servicio de Gas Natural");
                        modelo.setCosto("GasNatural");
                        break;
                }
                vista.printMensaje("Estrato del inmueble:");
                estrato = input.nextByte();
                vista.printMensaje("Consumo del inmueble:");
                consumo = input.nextInt();

                modelo.setEstrato(estrato);
                modelo.setDescuento(estrato);
                modelo.setConsumo(consumo);

            } else if (opcion == 4) {
                vista.printMensaje("Hasta pronto");
                break;
            }

            modelo.setTotal();
            modelo.setTotalDI();
            modelo.setTotalTotal();
            vista.printTotal(modelo);
            vista.printMenuTonto();
        }
        input.close();
    }
}