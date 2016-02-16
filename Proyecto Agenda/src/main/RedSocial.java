package main;

public class RedSocial {
	private int ID;
	private String tipo;
	private String nombreUsuario;
	private String URL;
	
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getNombreUsuario() {
		return nombreUsuario;
	}
	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}
	public String getURL() {
		return URL;
	}
	public void setURL(String uRL) {
		URL = uRL;
	}
	public RedSocial(String tipo, String nombreUsuario, String uRL) {
		super();
		this.tipo = tipo;
		this.nombreUsuario = nombreUsuario;
		URL = uRL;
	}
	public RedSocial(int ID,String tipo, String nombreUsuario, String uRL) {
		super();
		this.ID = ID;
		this.tipo = tipo;
		this.nombreUsuario = nombreUsuario;
		URL = uRL;
	}
}
