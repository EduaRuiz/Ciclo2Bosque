public class Main {

    public static void main(String[] args) {
        View vista = new View();
        Model modelo = new Model();
        Controller controlador = new Controller();
        controlador.run(vista, modelo);
    }
}