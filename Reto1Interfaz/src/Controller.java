import java.util.Scanner;

public class Controller {
    int consumo;
    byte estrato, opcion;

    public Controller() {
    }

    public void run(View vista, Model modelo) {

        Scanner input = new Scanner(System.in);

        while (true) {

            vista.printMenu();

            opcion = input.nextByte();
            if (opcion == 1 || opcion == 2 || opcion == 3) {
                switch (opcion) {
                    case 1:
                        vista.printMensaje("Pago de Servicio de Energia");
                        modelo.setCosto(6200);
                        break;
                    case 2:
                        vista.printMensaje("Pago de Servicio de Acueducto");
                        modelo.setCosto(9256);
                        break;
                    case 3:
                        vista.printMensaje("Pago de Servicio de Gas Natural");
                        modelo.setCosto(5234);
                        break;
                }
                vista.printMensaje("Estrato del inmueble:");
                estrato = input.nextByte();
                vista.printMensaje("Consumo del inmueble:");
                consumo = input.nextInt();
                modelo.setConsumo(consumo);
                modelo.setEstrato(estrato);
                modelo.setTotal();
                switch (estrato) {
                    case 1:
                    case 2:
                        modelo.setDescuento(0.5f);
                        break;
                    case 3:
                    case 4:
                        modelo.setDescuento(0.1f);
                        ;
                        break;
                    case 5:
                    case 6:
                        modelo.setDescuento(-0.25f);
                        break;
                    default:
                        modelo.setDescuento(-0.25f);
                        modelo.setConsumo(consumo);
                }
            } else if (opcion == 4) {
                vista.printMensaje("Hasta pronto");
                break;
            }
            modelo.setImpuesto();
            modelo.setTotalPagar();
            vista.printTotal(modelo);
        }
        input.close();
    }
}