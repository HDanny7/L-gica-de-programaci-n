package notes;

public class ExLogin {

    static void main(String[] args) {

        // Asigno las credenciales de usuario y contraseña.
        int key = 3030;
        int keyUser = 3030;

        // Validacion de valores int.
        //boolean validateKey= keyUser == key;

        String user = "Juan";
        String userUser = "Juan";

        // Validacion de usario, se usa equals para texto.
        //boolean validateUser = userUser.equals(user);


        if (keyUser == key && userUser.equals(user)) {
            System.out.println("Ha iniciado sesion correctamente");
        }else{
            System.out.println("Valide sus credenciales nuevamente.");
        }

    }
}
