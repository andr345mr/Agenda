package modelo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Agenda {
    private ArrayList<Registro> registros = new ArrayList<Registro>();
    
    public Registro getRegistro (int id) {
        return registros.get(id);
    }
    public ArrayList<Registro> getListaRegistros(){
        return registros;
    }
    public boolean agregarRegistro (Registro registro) {
	registros.add(registro);
	return false;
    }
    public boolean eliminarRegistroPorNombre (String nombre) {
        Registro primerCoincidenciaEnLista = buscarRegistroPorNombre(nombre);
        if(primerCoincidenciaEnLista == null){
            return false;
        } else{
            registros.remove(primerCoincidenciaEnLista);
            return true;
        }
    }
    public boolean modificarRegistro (Registro registroOriginal, Registro registroAlterado) {
        for (int i = 0; i < registros.size(); i++) {
            if(registros.get(i).equals(registroOriginal)){
                registros.get(i).setNombre(registroAlterado.getNombre());
                registros.get(i).setApellido(registroAlterado.getApellido());
                registros.get(i).setEmpresa(registroAlterado.getEmpresa());
                registros.get(i).setSitioWeb(registroAlterado.getSitioWeb());
                registros.get(i).setListaNumeros(registroAlterado.getListaNumeros());
                registros.get(i).setListaRedesSociales(registroAlterado.getListaRedesSociales());
                return true;
            }
        }
        return false;
    }
   
    public int numeroRegistros () {
        return registros.size();
    }
    
    public Agenda () {
        super();
    }
    
    /*
    Regresa una lista de las coincidencias que encuentre
    */
    public List<Registro> buscarRegistrosPorNombre (String nombre) {
        List<Registro> registrosEncontrados = null;
        registrosEncontrados = this.registros
                .stream()
                .filter(registro->registro.getNombre().equals(nombre))
                .collect(Collectors.toList());
        
        return registrosEncontrados;
    }
    
    /*
    Regresa el primer elemento que coincida con el nombre
    */
    public Registro buscarRegistroPorNombre (String nombre) {
        Registro registroEncontrados = null;
        registroEncontrados = this.registros
                .stream()
                .filter(registro->registro.getNombre().equals(nombre))
                .collect(Collectors.toList()).get(0);
        
        return registroEncontrados;
    }
    
}
