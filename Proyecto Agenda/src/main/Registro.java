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
			System.out.println(e.toString());			
		}
	}
	private void desplegarRedesSociales(){
		for(RedSocial e:redesSociales){
			System.out.println(e.toString());			
		}
	}
	public void desplegarRegistro(int ID){
		System.out.print("Nombre: ");
		System.out.println(this.nombre);
		System.out.print("Apellido: ");
		System.out.println(this.apellido);
		System.out.print("Empresa: ");
		System.out.println(this.empresa);
		System.out.print("Sitio Web: ");
		System.out.println(this.sitioWeb);
		desplegarNumeros();
		desplegarRedesSociales();
	}
	public void agregarNumero(String etiqueta, String numero){
		int id = numeros.size();
		numeros.add(new Numero(id,etiqueta,numero));
	}
	public void agregarRedSocial(String tipo, String usuario, String URL){
		int id = redesSociales.size();	
		redesSociales.add(new RedSocial(id,tipo,usuario,URL));
	}
	public void actualizarRegistro(int ID, String nombre, String apellido, String empresa, String sitioWeb,
			ArrayList<Numero> numeros, ArrayList<RedSocial> redesSociales){
		
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
