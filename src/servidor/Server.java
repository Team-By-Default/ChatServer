package servidor;
 
import java.io.*;
import java.net.*;
 
public class Server {
    private static int PUERTO = 2017;
 
    public static void main(String args[]) {
         
        BufferedReader entrada;
        DataOutputStream salida;
        Socket socket;
        ServerSocket serverSocket;
         
        try {
            serverSocket = new ServerSocket(PUERTO);
 
            System.out.println("Esperando una conexi�n...");
 
            socket = serverSocket.accept(); //En bucle y derivar a threads
 
            System.out.println("Un cliente se ha conectado...");
 
            // Para los canales de entrada y salida de datos
 
            entrada = new BufferedReader(new InputStreamReader(
                    socket.getInputStream()));
 
            salida = new DataOutputStream(socket.getOutputStream());
 
            System.out.println("Confirmando conexion al cliente....");
 
            salida.writeUTF("Conexi�n exitosa...");
 
            // Para recibir el mensaje
 
            String mensajeRecibido = entrada.readLine();
 
            System.out.println(mensajeRecibido);
 
            salida.writeUTF("Se recibio tu mensaje."); //Hace falta?
 
            salida.writeUTF("Gracias por conectarte."); //Hace falta?
 
            System.out.println("Cerrando conexi�n..."); //Cuando ponga Desconectar
 
            // Cerrando la conex�n
            serverSocket.close();
 
        } catch (IOException e) {
            System.out.println("Error de entrada/salida."  + e.getMessage());
        }
 
    }
}
