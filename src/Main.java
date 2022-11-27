import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        metodos m1 = new metodos();
        metodos m2 = new metodos();
        metodos m3 = new metodos();
        metodos m4 = new metodos();
        metodos m5 = new metodos();
        int op = -1, op2 =0;
        do {
            mostrarMenu();
            System.out.print("Ingrese la opcion a realizar: ");
            op = sc.nextInt();
            switch (op) {
                case 1:
                    m1.rellenar_datos();
                    llenar();
                    break;
                case 2:
                    m2.rellenar_datos();
                    llenar();
                    break;
                case 3:
                    m3.rellenar_datos();
                    llenar();
                    break;
                case 4:
                    m4.rellenar_datos();
                    llenar();
                    break;
                case 5:
                    m5.rellenar_datos();
                    llenar();
                    break;
                case 6:
                    do {
                        mostrarCarros();
                        System.out.print("Ingrese el numero del carro a mostrar: ");
                        op2 = sc.nextInt();
                        switch (op2) {
                            case 1:
                                m1.mostrarDatos();
                                break;
                            case 2:
                                m2.mostrarDatos();
                                break;
                            case 3:
                                m3.mostrarDatos();
                                break;
                            case 4:
                                m4.mostrarDatos();
                                break;
                            case 5:
                                m5.mostrarDatos();
                                break;
                        }
                    } while(op2!=0);
                    break;
            }
        } while(op!=0);

    }

    static void mostrarMenu() {
        System.out.println("MENU DE CARROS");
        System.out.println("1. Ingresar datos del vehiculo 1");
        System.out.println("2. Ingresar datos del vehiculo 2");
        System.out.println("3. Ingresar datos del vehiculo 3");
        System.out.println("4. Ingresar datos del vehiculo 4");
        System.out.println("5. Ingresar datos del vehiculo 5");
        System.out.println("6. Datos de los vehiculos");
        System.out.println("0. Salir");
    }

    static void mostrarCarros() {
        System.out.println("MOSTRAR CARROS");
        System.out.println("1. Mostrar datos del vehiculo 1");
        System.out.println("2. Mostrar datos del vehiculo 2");
        System.out.println("3. Mostrar datos del vehiculo 3");
        System.out.println("4. Mostrar datos del vehiculo 4");
        System.out.println("5. Mostrar datos del vehiculo 5");
        System.out.println("0. Regresar");
    }
    static void llenar() {
        System.out.println("DATOS AGREGADOS CORRECTAMENTE");
    }
}