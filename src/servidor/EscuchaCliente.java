package servidor;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class EscuchaCliente extends Thread{

	ServerSocket serversocket;
	BufferedReader entrada;
    DataOutputStream salida;
    Socket clientesocket;
    
    public EscuchaCliente(ServerSocket ss,Socket cs) {
    	this.serversocket=ss;
    	this.clientesocket=cs;
    }
    
    
	
}
