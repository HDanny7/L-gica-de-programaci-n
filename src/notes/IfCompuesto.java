package notes;

public class IfCompuesto {

    static void main(String[] args) {

        // If compuesto: es el mismo If pero con la palabra else, esto le agrega una logica adicional, de no cumplirse la condicion inicial hacer tal cosa.

        // Definimos variables
        float note = 2.9f;

        // Estructura de control
        if (note >= 3.0 ){
            System.out.println("Ha aprobado el examen en: " + note);
        }else{
                System.out.println("No has ganado el examen, tu nota es de: " + note);
        }


    }
}
