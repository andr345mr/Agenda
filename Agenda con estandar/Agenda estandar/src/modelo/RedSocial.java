/*
 * Autor: Victor Hugo Hernandez Hoyos
 * Fecha de creación: 15/2/2016
 * Fecha de modificacion: 26/2/2016
 * Descripcion: Define los componentes basicos de un registro de redes sociales
 *    para despues ser usada como una lista
 */

package modelo;

public class RedSocial {
	private int id;
	private String tipo;
	private String nombreUsuario;
	private String url;
	
	public String getTipo () {
            return tipo;
	}
	public void setTipo (String tipo) {
            this.tipo = tipo;
	}
	public String getNombreUsuario () {
            return nombreUsuario;
	}
	public void setNombreUsuario (String nombreUsuario) {
            this.nombreUsuario = nombreUsuario;
	}
	public String getUrl () {
            return url;
	}
	public void setUrl (String url) {
            this.url = url;
	}
	public RedSocial (String tipo, String nombreUsuario, String url) {
            super();
            this.tipo = tipo;
            this.nombreUsuario = nombreUsuario;
            this.url = url;
	}
	public RedSocial (int id,String tipo, String nombreUsuario, String url) {
		super();
		this.id = id;
		this.tipo = tipo;
		this.nombreUsuario = nombreUsuario;
		this.url = url;
	}
        
        @Override
        public String toString (){
            String m;
            m = tipo + " | " + nombreUsuario + " | " + url;
            return m;
        }
}
