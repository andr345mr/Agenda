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
	private String URL;
	
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
	public String getURL () {
            return URL;
	}
	public void setURL (String uRL) {
            URL = uRL;
	}
	public RedSocial (String tipo, String nombreUsuario, String uRL) {
            super();
            this.tipo = tipo;
            this.nombreUsuario = nombreUsuario;
            URL = uRL;
	}
	public RedSocial (int id,String tipo, String nombreUsuario, String uRL) {
		super();
		this.id = id;
		this.tipo = tipo;
		this.nombreUsuario = nombreUsuario;
		URL = uRL;
	}
        
        @Override
        public String toString (){
            String m;
            m = tipo + " | " + nombreUsuario + " | " + URL;
            return m;
        }
}
