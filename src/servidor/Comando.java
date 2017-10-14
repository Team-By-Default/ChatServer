package servidor;

public abstract class Comando {
	public static final String[] CLASSNAMES = {"/salas", "/salir"};
	
	public static final int SALAS = 0;
	public static final int SALIR = 1;
	
	protected String cadenaLeida;
	
	public void setCadena(String cadenaLeida) {
		this.cadenaLeida = cadenaLeida;
	}
	public abstract void ejecutar();
}
