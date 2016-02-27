package modelo;

import java.util.*;
import java.util.stream.Collectors;
public class Agenda {
    private ArrayList<Registro> registros = new ArrayList<Registro>();
    /*private void ordenarRegistros(){
    Funcion que se implementara si se termina en tiempo la agenda
    }*/
    public Registro getRegistro(int ID){
        return registros.get(ID);
    }
    public boolean agregarRegistro(Registro registro){
	registros.add(registro);
	return false;
    }
    public boolean eliminarRegistroPorNombre(String nombre){
        
        return false;
    }
    public boolean modificarRegistro(Registro registro){	
	return false;
    }
    public void desplegarRegistros(){	
        for(Registro e: registros){
            System.out.println("---------------------------------");
            e.desplegarRegistro();
            System.out.println("---------------------------------");
        }
    }
    public int numeroRegistros(){
        return registros.size();
    }
    
    /*
    * Actualiza un registro a partir de un identificador
    */
    public void actualizarRegistro(Registro nuevoRegistro, int IDOrigen){
	
    }
    
    public Agenda(){
        super();
    }
	
    public List<Registro> buscarRegistroPorNombre(String nombre){
        List<Registro> registrosEncontrados = null;
        registrosEncontrados = this.registros
                .stream()
                .filter(registro->registro.getNombre().equals(nombre))
                .collect(Collectors.toList());
        
        return registrosEncontrados;
    }
}
