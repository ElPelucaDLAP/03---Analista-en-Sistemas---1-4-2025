import java.beans.beancontext.BeanContextChild;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Implementa un sistema de registro de clientes para una tienda.
        // Crea una clase Cliente con atributos como nombre, correo electrónico y número de teléfono.
        // Permite al usuario agregar nuevos clientes y actualizar su información.
        Scanner sc = new Scanner(System.in);
        ArrayList<Clientes> datosClientes= new ArrayList<>();
        datosClientes.add(new Clientes("Jorge","APX@gmail.com","12345"));
        datosClientes.add(new Clientes("Manuel","apu@gmail.com","22321"));
        datosClientes.add(new Clientes("Sebastian","dou@gmail.com","87321"));
        datosClientes.add(new Clientes("Belgrano","sus@gmail.com","7212"));
        System.out.println("Clientes actuales: ");
        for (int i = 0 ; i < datosClientes.size() ; i++) {
            System.out.println("Cliente " + (i+1) );
            System.out.println(datosClientes.get(i).toString());
        }
        System.out.println("Cuantos clientes desea añadir: ");
        int cantidadDeClientes = sc.nextInt(); sc.nextLine();
        for (int i = 0; i < cantidadDeClientes ; i++) {
            System.out.println("Cliente " + i+1 );
            System.out.println("Nombre: ");
            String nombre = sc.nextLine();
            System.out.println("Correo: ");
            String correo = sc.nextLine();
            System.out.println("Telefono: ");
            String telefono = sc.nextLine();
            datosClientes.add(new Clientes(nombre, correo, telefono));
        }
        System.out.println("Actualiza clientes: ");
        for (int i = 0; i < datosClientes.size() ; i++) {
            System.out.println("Cliente " + i+1 );
            System.out.println(datosClientes.get(i).toString());
            System.out.println("Desea editar: 1.Si 2.No");
            int opcion = sc.nextInt(); sc.nextLine();
            if (opcion == 1) {
                System.out.println("Cliente " + i );
                System.out.println("Nombre: ");
                String nombre = sc.nextLine();
                System.out.println("Correo: ");
                String correo = sc.nextLine();
                System.out.println("Telefono: ");
                String telefono = sc.nextLine();
                datosClientes.get(i).setNombre(nombre);
                datosClientes.get(i).setCorreo(correo);
                datosClientes.get(i).setNumTelefono(telefono);

            }
        }
        for (int i = 0 ; i < datosClientes.size() ; i++) {
            System.out.println("Cliente " + i+1 );
            System.out.println(datosClientes.get(i).toString());
        }
    }
}
