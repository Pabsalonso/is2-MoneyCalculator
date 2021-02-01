package is2conversordivisas;

import java.util.Scanner;

public class IS2ConversorDivisas {

    public static void main(String[] args) {
        mensajes(0);    
        Scanner reader = new Scanner(System.in);  // Creamos el escaner
        String firstInput = reader.nextLine();
        if(firstInput.equals("ayuda")) {
            mensajes(1);
            firstInput = reader.nextLine();
        }
        mensajes(2);
        String secondInput = reader.nextLine();
        tratamientoDivisa(firstInput,secondInput);

        
    }
    
    public static void mensajes(int tipo){      //metodo que imprime los textos de informacion
        switch(tipo){
            case 0: //tipo 0: Bienvenida
                System.out.println("Bienvenido al intercambiador de divisas.\n"
                + "Escriba el nombre de la divisa y a continuación la cantidad.\n"
                + "Escriba 'ayuda' para ver las divisas que aceptamos");
               break;         
            case 1: //tipo 1:ayuda
                System.out.println("Aceptamos varios tipos de divisas. Para ello de be utilizar"
                        + "su codigo cuando se le pregunte:\n"
                        + "rublo ruso-> rb\n"
                        + "libra esterlina-> lb\n"
                        + "dolar americano-> dl\n"
                        + "yen japones-> jpy\n"
                        + "yuan chino-> cny\n");
                break;
            case 2:
                System.out.println("A continuacion seleccione el tipo de divisa:");
        }
    }
    public static void tratamientoDivisa(String amount,String type){
        float numero = Integer.parseInt(amount);
        switch(type){
            case "rb":
                numero*= 0.010770;
                break;
                
            case "lb":
                numero*= 1.0953;
                break;
             
            case "dl":
                numero*= 0.85173;
                break;
                
            case "cny":
                numero*=  0.12498;
                break;
                
            case "jpy":
                numero*= 0.0080600;
                break;
                
            default:
                System.out.println("Lo sentimos, no aceptamos ese tipo de divisas");
                return;
        }
        System.out.println("Resultado:"+ numero+"€");
    }
    
}
