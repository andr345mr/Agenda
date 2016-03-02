/*
 * Autor: Missael Hernandez Rosado
 * Fecha de creación: 15/2/2016
 * Fecha de modificacion: 26/2/2016
 * Descripcion: Esta clase abstrae todos los componentes de un registro, esta
 *    compuesto por una lista de numeros y una lista de redes sociales
 */

package modelo;
import java.util.ArrayList;
public class Registro {
	private int id;
	private String nombre;
	private String apellido;
	private String empresa;
	private String sitioWeb;
	
	private ArrayList<Numero> numeros;
	private ArrayList<RedSocial> redesSociales;
	//metodos
	public int getId () {
            return id;
	}
	public void setIid (int id) {
            this.id = id;
	}
	public String getNombre () {
            return nombre;
	}
	public void setNombre (String nombre) {
            this.nombre = nombre;
	}
	public String getApellido () {
            return apellido;
	}
	public void setApellido (String apellido) {
            this.apellido = apellido;
	}
	public String getEmpresa () {
            return empresa;
	}
	public void setEmpresa (String empresa) {
            this.empresa = empresa;
	}
	public String getSitioWeb () {
            return sitioWeb;
	}
	public void setSitioWeb (String sitioWeb) {
            this.sitioWeb = sitioWeb;
	}
	public ArrayList<Numero> getListaNumeros(){
            return numeros;
        }
        public ArrayList<RedSocial> getListaRedesSociales(){
            return redesSociales;
        }
        
        public void setListaNumeros (ArrayList<Numero> numeros){
            this.numeros = numeros;
        }
        public void setListaRedesSociales (ArrayList<RedSocial> redesSociales){
            this.redesSociales = redesSociales;
        }
        
	public void agregarNumero (String etiqueta, String numero) {
            int id = numeros.size();
            numeros.add(new Numero(id,etiqueta,numero));
	}
        /*
        * Agrega una red social nueva a la lista de redes sociales pasando como ID el tamaño de la lista
        */
	public void agregarRedSocial (String tipo, String usuario, String URL) {
            int id = redesSociales.size();	
            redesSociales.add(new RedSocial(id,tipo,usuario,URL));
	}
        
	
	public Registro (int id, String nombre, String apellido, String empresa, String sitioWeb, ArrayList<Numero> numeros,
			ArrayList<RedSocial> redesSociales) {
            super();
            this.id = id;
            this.nombre = nombre;
            this.apellido = apellido;
            this.empresa = empresa;
            this.sitioWeb = sitioWeb;
            this.numeros = numeros;
            this.redesSociales = redesSociales;
	}
	public Registro () {
            super();
	}
	
	
}
