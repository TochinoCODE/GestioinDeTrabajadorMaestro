//parcial
package examenParcial;

import java.util.Scanner;
import javax.swing.JOptionPane;


public class AplicaPersona {
    static ArregloPersona trabajador;
    static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) {
        
        menu();
    }
    static void menu() {
        int opcion;
        do {
            System.out.println("\n\tmenu");
            System.out.println("[1] Crear");
            System.out.println("[2] Insertar Datos");
            System.out.println("[3] Mostrar Datos");
            System.out.println("[4] Eliminar Dato");
            System.out.println("[5] Buscar Dato por codigo");
            System.out.print("Ingrese una opncion: ");
            opcion = entrada.nextInt();
            switch (opcion) {
                case 1:
                    crear();
                    break;
                case 2:
                    trabajador.llenarDatos();
                    break;
                case 3:
                    trabajador.mostrar();
                    break;
                case 4:
                    String eliminar;
                    System.out.print("Ingrese codigo que quiere eliminar : ");
                    entrada.nextLine();
                    eliminar = entrada.nextLine();
                    trabajador.eliminar(eliminar);
                    break;
                case 5:
                    String bus;
                    System.out.print("Ingrese el codigo a buscar: ");
                    entrada.nextLine();
                    bus = entrada.nextLine();
                    trabajador.buscar(bus);
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opncion no valida");
            }
        } while (opcion != 0);
    }

    static void crear() {
        int tam;
        System.out.print("Ingrese la cantidad de Trabajadores : ");
        tam = entrada.nextInt();
        trabajador = new ArregloPersona(tam);
    }
   
}
