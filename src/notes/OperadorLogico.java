package notes;

public class OperadorLogico {

    public static void main(String[] args){

        // Operadores logicos &&, °°, !, etc

        // Asigno las credenciales de usuario y contraseña.
        int key = 3030;
        int keyUser = 3030;

        // Validacion de valores int.
        boolean validateKey= keyUser == key;

        String user = "Juan";
        String userUser = "Juan";

        // Validacion de usario, se usa equals para texto.
        boolean validateUser = userUser.equals(user);

        // Validacion de credenciales tanto de string como int.
        boolean validateCredentials = validateKey && validateUser;

        System.out.println("Inicia sesion: " + validateCredentials);
    }
}
