package servidor;
 
import java.io.*;
import java.net.*;
 
public class Server {
    private static int PUERTO = 2017;
  
    public static void main(String args[]) {
    	 BufferedReader entrada;
    	 Socket socket;
    	 ServerSocket serverSocket;
    	 Sala salaDeChat = new Sala("salaPrincipal");
    	    
        try {
            serverSocket = new ServerSocket(PUERTO);
            
            while(true){
 
            System.out.println("Esperando una conexi�n...");
 
            socket = serverSocket.accept(); 
 
            System.out.println("Un cliente se ha conectado...");
            
            entrada = new BufferedReader(new InputStreamReader( 
                    socket.getInputStream())); 
            
            String nick = entrada.readLine(); 
            
            EscuchaCliente hiloCliente = new EscuchaCliente( socket );
            
            salaDeChat.agregarCliente(nick, socket);
 
            hiloCliente.start();
            
            }
            
        } catch (IOException e) {
            System.out.println("Error de entrada/salida."  + e.getMessage());
        }
 
    }
}
