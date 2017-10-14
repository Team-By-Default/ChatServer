package servidor;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class EscuchaCliente extends Thread{

	BufferedReader entrada;
    DataOutputStream salida;
    Socket clientesocket;
    Sala sala;
    
    public EscuchaCliente(Socket cs,Sala sala) throws IOException {
    	this.clientesocket=cs;
    	this.entrada=new BufferedReader(new InputStreamReader(clientesocket.getInputStream()));
    	this.salida=new DataOutputStream(clientesocket.getOutputStream());
    	this.sala=sala;
    }
    
    public void run() {
		try {
			String mensaje=entrada.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
    }
	
}
