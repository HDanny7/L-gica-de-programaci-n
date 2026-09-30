package notes;

public class While {
    static void main(String[] args) {

        // Bucle While, usado hasta que se cumpla una condicion.

        System.out.printf("Escena he venido a negociar: ");

        String negociar = "no";


        while (negociar.equals("no")){
            System.out.println("Socio he venido a negociar");
            negociar = ValidadorTipos.ValidarString();

        }

    }
}
