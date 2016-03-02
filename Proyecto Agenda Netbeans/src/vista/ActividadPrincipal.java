package vista;

import modelo.Agenda;
import modelo.Numero;
import modelo.RedSocial;
import modelo.Registro;
import java.util.ArrayList;
import java.util.Scanner;


public class ActividadPrincipal {
    private static Agenda agenda = new Agenda();
    
    private static Scanner entradaPorTeclado = new Scanner(System.in);
    
    private static void limpiarPantalla(){
        for(int i = 0; i < 100; i++){
            System.out.println(" ");
        }
    }
    
    private static void esperarUsuario(){
        System.out.println("Escribe cualquier cosa para continuar...");
        entradaPorTeclado.nextLine();
        String temp = entradaPorTeclado.nextLine();
    }
    
    private static int escribirMenu(){
        limpiarPantalla();
        System.out.println("--------BIENVENIDO------------");
        System.out.println("Escoge tu opcion:");
        System.out.println("1. Agregar registro a la agenda");
        System.out.println("2. Eliminar registro de la agenda");
        System.out.println("3. Desplegar registros");
        System.out.println("0. Salir");
        System.out.print("Opcion: ");
        return entradaPorTeclado.nextInt();
    }
    
    private static void agregarRegistro(){
        entradaPorTeclado.nextLine();
        String nombre, apellido, empresa, sitioWeb;
        ArrayList<RedSocial> redesSocialesRegistro = new ArrayList<RedSocial>();
        ArrayList<Numero> numerosRegistro = new ArrayList<Numero>();
        
        int red; // numero de redes sociales que el registro tendra
        int numero; // numero de veces que se registrara un nuevo numero
        
        
        System.out.println("Nombre");
        nombre = entradaPorTeclado.nextLine();
        System.out.println("Apellido");
        apellido = entradaPorTeclado.nextLine();
        System.out.println("Empresa");
        empresa = entradaPorTeclado.nextLine();
        System.out.println("Sitio web");
        sitioWeb = entradaPorTeclado.nextLine();
        
        System.out.println("Cuantas redes sociales quieres registrar?");
        red = entradaPorTeclado.nextInt();
        for(int i = 0; i < red; i++){
            String tipo;
            String nombreUsuario;
            String URL;
            
            entradaPorTeclado.nextLine(); // limpiamos el buffer de lectura cada iteracion
            System.out.println("Escribe el tipo de red social que deseas registrar (Facebook por ejemplo)");
            tipo = entradaPorTeclado.nextLine();
            System.out.println("Escribe el nombre de usuario");
            nombreUsuario = entradaPorTeclado.nextLine();
            System.out.println("Escribe la URL asociada al perfil");
            URL = entradaPorTeclado.nextLine();
            
            RedSocial r = new RedSocial(tipo, nombreUsuario, URL);
            
            redesSocialesRegistro.add(r);
        }
        
        System.out.println("Cuantos numeros quieres registrar?");
        numero = entradaPorTeclado.nextInt();
        for(int i = 0; i < numero; i++){
            String etiqueta;
            String num;
            entradaPorTeclado.nextLine(); // limpiamos el buffer de lectura
            System.out.println("Escribe la etiqueta de numero a registrar");
            etiqueta = entradaPorTeclado.nextLine();
            System.out.println("Escribe el numero a registrar");
            num = entradaPorTeclado.nextLine();
            Numero n = new Numero(etiqueta, num);
            numerosRegistro.add(n);
        }
        agenda.agregarRegistro(new Registro(agenda.numeroRegistros(),nombre,apellido,empresa,sitioWeb, numerosRegistro, redesSocialesRegistro));
    }
    
    private static void eliminarRegistro(){
        
    }
    
    private static void desplegarRegistros(){
        limpiarPantalla();
        System.out.println("Registros de la agenda: ");
        agenda.desplegarRegistros();
        System.out.println("Fin :)");
        esperarUsuario();
    }
    
    private static void salir(){
        limpiarPantalla();
        System.out.println("Hecho por:");
        System.out.println("Andres Roberto Meza Rivera");
        System.out.println("Victor Hugo Hernandez Hoyos");
        System.out.println("Missael Hernandez Rosado");
        System.out.println("Adios :)");
        
    }
    
    public static void main(String[] args){
        int opt = -1;
        while(opt != 0){
            opt = escribirMenu();
            switch(opt){
                case 1:
                    agregarRegistro();
                    break;
                case 3:
                    desplegarRegistros();
                    break;
                case 0:
                    salir();
            }
        }
    }
}
