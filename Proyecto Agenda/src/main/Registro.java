package main;
import java.util.*;
public class Registro {
	private int ID;
	private String nombre;
	private String apellido;
	private String empresa;
	private String sitioWeb;
	
	private ArrayList<Numero> numeros;
	private ArrayList<RedSocial> redesSociales;
	//metodos
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getEmpresa() {
		return empresa;
	}
	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}
	public String getSitioWeb() {
		return sitioWeb;
	}
	public void setSitioWeb(String sitioWeb) {
		this.sitioWeb = sitioWeb;
	}
	//metodos por implementar
	private void desplegarNumeros(){
		for(Numero e:numeros){
			
		}
	}
	private void desplegarRedesSociales(){
		
	}
	public void desplegarRegistro(int ID){
		
	}
	public void agregarNumero(){
		
	}
	public void agregarRedSocial(){
		
	}
	public void actualizarRegistro(){
		
	}
	
	public Registro(int iD, String nombre, String apellido, String empresa, String sitioWeb, ArrayList<Numero> numeros,
			ArrayList<RedSocial> redesSociales) {
		super();
		ID = iD;
		this.nombre = nombre;
		this.apellido = apellido;
		this.empresa = empresa;
		this.sitioWeb = sitioWeb;
		this.numeros = numeros;
		this.redesSociales = redesSociales;
	}
	public Registro() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
