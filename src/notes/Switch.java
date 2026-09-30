package notes;

public class Switch {
    static void main(String[] args) {
        // Clase Switch: Se usa cuando ya sabemos el valor de la respuesta, ejemplo, menus o cajeros.
        System.out.println("Seleccione: \n" +
                "1. Cuenta de ahorros\n" +
                "2. Credito\n" +
                "3. Inversión\n" +
                "4. Mis datos");

        System.out.println("Ingrese una opción: ");
        int opcion = ValidadorTipos.ValidarEnteros();

        switch (opcion){
            case 1:
                System.out.println("Su cuenta de ahorros esta abierta");
                break;
            case 2:
                System.out.printf("Su Credito esta abierto");
                break;
            case 3:
                System.out.println("Su Inversión esta abierta");
                break;
            case 4:
                System.out.println("Sus Datos estan abiertos");
                break;
            default:
                System.out.printf("El valor ingresado no es valido.");
                break;

        }

    }
}
