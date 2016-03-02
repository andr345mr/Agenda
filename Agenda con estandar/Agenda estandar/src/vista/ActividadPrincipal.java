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
        System.out.println("3. Modificar registro de la agenda");
        System.out.println("4. Desplegar registros");
        System.out.println("5. Buscar un registro de la agenda");
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
        limpiarPantalla();
        String nombre;
        System.out.println("Escribe el nombre del contacto que deseas borrar");
        entradaPorTeclado.nextLine();
        nombre = entradaPorTeclado.nextLine();
        entradaPorTeclado.nextLine(); //limpiamos buffer

        boolean eliminado = agenda.eliminarRegistroPorNombre(nombre);
        if (!eliminado) {
            System.out.println("El elemento no se elimino :(");
        } else {
            System.out.println("El elemento se elimino :)");
        }
        esperarUsuario();
    }
    
    private static void desplegarRegistros(){
        limpiarPantalla();
        System.out.println("Registros de la agenda: ");
        ArrayList<Registro> registros = agenda.getListaRegistros();
        for(Registro e: registros){
            System.out.println("|---------------------------------------|");
            System.out.println("Nombre:");
            System.out.println(e.getNombre());
            System.out.println("Apellido:");
            System.out.println(e.getApellido());
            System.out.println("Empresa:");
            System.out.println(e.getEmpresa());
            System.out.println("Sitio web");
            System.out.println(e.getSitioWeb());
            ArrayList<Numero> numerosDeContacto = e.getListaNumeros();
            for(Numero i: numerosDeContacto){
                System.out.print(i.getEtiqueta() + " - ");
                System.out.print(i.getNumero() + " - ");
            }
            ArrayList<RedSocial> redesSocialesDeContacto = e.getListaRedesSociales();
            for(RedSocial r: redesSocialesDeContacto){
                System.out.println(r.getTipo());
                System.out.println("Nombre de usuario:");
                System.out.println(r.getNombreUsuario());
                System.out.println("URL:");
                System.out.println(r.getUrl());
            }
        }
        System.out.println("Fin :)");
        esperarUsuario();
    }
    
    private static void modificarRegistro(){
        limpiarPantalla();
        entradaPorTeclado.nextLine();
        System.out.println("Escribe el nombre del usuaio que quieras modificar");
        String nombreABuscar = entradaPorTeclado.nextLine();
        
        Registro registroEncontrado = agenda.buscarRegistroPorNombre(nombreABuscar);
        if (registroEncontrado == null){
            System.out.println("No se encontro ningun registro con ese nombre");
        } else {
            System.out.println("Resgistra los nuevos datos del contacto");
            System.out.println("---------------------------------------------");
            
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
            Registro nuevoRegistro = new Registro(agenda.numeroRegistros(),nombre,apellido,empresa,sitioWeb, numerosRegistro, redesSocialesRegistro);
            boolean modificado = agenda.modificarRegistro(registroEncontrado, nuevoRegistro);
            if(modificado){
                System.out.println("Se modifico con exito el registro :)");
            } else {
                System.out.println("Ocurrio un eeror durante la modificacion :(");
            }
        }
        
        esperarUsuario();
    }
    
    private static void buscarRegistro(){
        limpiarPantalla();
        entradaPorTeclado.nextLine();//limpiamos el bufer de lectura
        System.out.println("Escribe el nombre que deseas buscar");
        String nombre = entradaPorTeclado.nextLine();
        ArrayList<Registro> registrosEncontrados = (ArrayList<Registro>) agenda.buscarRegistrosPorNombre(nombre);
        if (registrosEncontrados == null){
            System.out.println("Ningun registro coincide con su busqueda");
        } else {
            System.out.println("Registros encontrados: ");
            System.out.println("-----------------------------------");
            for(Registro e: registrosEncontrados){
                System.out.println("|---------------------------------------|");
                System.out.println("Nombre:");
                System.out.println(e.getNombre());
                System.out.println("Apellido:");
                System.out.println(e.getApellido());
                System.out.println("Empresa:");
                System.out.println(e.getEmpresa());
                System.out.println("Sitio web");
                System.out.println(e.getSitioWeb());
                ArrayList<Numero> numerosDeContacto = e.getListaNumeros();
                for(Numero i: numerosDeContacto){
                    System.out.print(i.getEtiqueta() + " - ");
                    System.out.print(i.getNumero() + " - ");
                }
                ArrayList<RedSocial> redesSocialesDeContacto = e.getListaRedesSociales();
                for(RedSocial r: redesSocialesDeContacto){
                    System.out.println(r.getTipo());
                    System.out.println("Nombre de usuario:");
                    System.out.println(r.getNombreUsuario());
                    System.out.println("URL:");
                    System.out.println(r.getUrl());
                }
            }
        }
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
                case 2:
                    eliminarRegistro();
                    break;
                case 3:
                    modificarRegistro();
                    break;
                case 4:
                    desplegarRegistros();
                    break;
                case 5:
                    buscarRegistro();
                    break;
                case 0:
                    salir();
            }
        }
    }
}
