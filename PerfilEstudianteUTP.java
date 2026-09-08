* Ficha de Matrícula Estudiantil UTP.
 * @author Bryan Mark / 81032527
 * @version 1.0
public class PerfilEstudianteUTP {

    public static void main(String[] args) {

        // ==============================================================
        // NIVEL 1: IDENTIFICADORES Y TIPOS DE DATOS PRIMITIVOS
        // ==============================================================
        
        // TODO 2.1: Nombre de variable corregido a camelCase (sin iniciar con número)
        String primerNombre = "Carlos Pérez";

        // TODO 2.2: Nombre de variable corregido a camelCase (sin guion medio)
        int creditosMatriculados = 18;

        // TODO 2.3: Tipo de dato cambiado a double para permitir decimales
        double costoCredito = 15.50;

        // TODO 2.4: Tipo de dato cambiado a boolean primitivo (sin comillas)
        boolean estaPazYSalvo = true;

        // TODO 2.5: Variable tipo char declarada para la inicial
        char inicialSegundoNombre = 'M';


        // ==============================================================
        // NIVEL 2: CONSTANTES (final) E INMUTABILIDAD
        // ==============================================================
        
        // TODO 3.1: Constante declarada con 'final' y formato UPPER_SNAKE_CASE
        final double CARNET_ESTUDIANTIL = 5.00;

        // TODO 3.2: Se eliminó la reasignación 'carnet_estudiantil = 10.00;'


        // ==============================================================
        // NIVEL 3: CÁLCULO ARITMÉTICO Y SALIDA FORMATO COMPROBANTE
        // ==============================================================
        
        // TODO 4: Variables y constantes actualizadas en el cálculo
        double subtotalMatricula = creditosMatriculados * costoCredito;
        double totalPagar = subtotalMatricula + CARNET_ESTUDIANTIL;

        System.out.println("==========================================");
        System.out.println("    FICHA DE MATRÍCULA ESTUDIANTIL UTP");
        System.out.println("==========================================");
        System.out.println("Estudiante : " + primerNombre + " " + inicialSegundoNombre + ".");
        System.out.println("Paz y Salvo: " + estaPazYSalvo);
        System.out.println("Subtotal   : $" + subtotalMatricula);
        System.out.println("Total      : $" + totalPagar);
        System.out.println("==========================================");
    }
}
