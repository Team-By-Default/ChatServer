package servidor;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class EscuchaCliente extends Thread{

	BufferedReader entrada;
    DataOutputStream salida;
    Socket clientesocket;
    
    public EscuchaCliente(Socket cs) {
    	this.clientesocket=cs;
    }
    
    
	
}
