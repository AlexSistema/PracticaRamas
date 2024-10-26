import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//variable de almacenamiento
        String Bueno = sc.nextLine();
//variable de deteccion de Texto o numero para indicaciones.
        if (Bueno != "bueno") {
            System.out.println("Hola Mundo");
        }
        //Variable de segunda funcion que da segundo resultado
        else{
            System.out.println(" no traes nada ");
        }
    }
}