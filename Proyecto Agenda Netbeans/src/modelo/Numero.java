/*
 * Autor: Andres Roberto Meza Rivera
 * Fecha de creación: 15/2/2016
 * Fecha de modificacion: 26/2/2016
 * Descripcion: Define los componentes basicos de un registro de redes sociales
 *    para despues ser usada como una lista
 */
package modelo;

public class Numero {
	private int ID;
	private String etiqueta;
	private String numero;
	
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getEtiqueta() {
		return etiqueta;
	}
	public void setEtiqueta(String etiqueta) {
		this.etiqueta = etiqueta;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public Numero(int iD, String etiqueta, String numero) {
		super();
		ID = iD;
		this.etiqueta = etiqueta;
		this.numero = numero;
	}
	public Numero(String etiqueta, String numero) {
		super();
		this.etiqueta = etiqueta;
		this.numero = numero;
	}
        
        @Override
        public String toString(){
            String m;
            m = etiqueta + " - " + numero;
            return m;
        }
	
}
