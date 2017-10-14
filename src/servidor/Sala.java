package servidor;

import java.net.Socket;
import java.util.HashMap;

public class Sala {
	private String nombre;
	private HashMap<String,Socket> clientes;
	
	public Sala(String nombre){
		this.nombre = nombre;
		clientes = new HashMap<String,Socket>();
	}
	
	public void agregarCliente(String nick, Socket socket){
		this.clientes.put(nick, socket);
	}
	
	public void sacarCliente(String nick){
		this.clientes.remove(nick);
	}
	
	public HashMap<String,Socket> getClientes(){
		return this.clientes;
	}
	
	public String getNombre(){
		return this.nombre;
	}
}
