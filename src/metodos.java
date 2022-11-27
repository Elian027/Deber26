import java.util.Scanner;

public class metodos {
    vehiculos v = new vehiculos();
    Scanner sc = new Scanner(System.in);
    String marca, placa, color;
    public void rellenar_datos() {
        System.out.print("Ingrese el marca del auto: ");
        marca=sc.next();
        v.setMarca(marca);
        System.out.print("Ingrese la placa del auto: ");
        placa=sc.next();
        v.setPlaca(placa);
        System.out.print("Ingrese el color del auto: ");
        color=sc.next();
        v.setColor(color);
    }
    public void mostrarDatos() {
        System.out.println("Marca: "+v.getMarca());
        System.out.println("Placa: "+v.getPlaca());
        System.out.println("Color: "+v.getColor());
    }


}