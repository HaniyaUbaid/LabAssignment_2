import java.io.*;
import java.net.*;

class Receiver {
    private ServerSocket serverSocket;              //socket for connection with server socket

    public Receiver(int receiverPort) {
        try {
            serverSocket = new ServerSocket(receiverPort);           //creation of socket
        } catch (IOException e) {                                   //exception handling
            System.err.println("Error starting server: " + e.getMessage());
        }
    }

    public Message receiveMessage() {                           //function to receive message
        if (serverSocket == null || serverSocket.isClosed()) {  //validation check
            System.err.println("Server socket is not initialized or already closed.");
            return null;
        }
        try (Socket receiverSocket = serverSocket.accept();   //Accept connection
             ObjectInputStream inputStream = new ObjectInputStream(receiverSocket.getInputStream())) {
            return (Message) inputStream.readObject();
        } catch (IOException e) {                           //exception check
            System.err.println("Error receiving message: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.err.println("Error in message deserialization: " + e.getMessage());
        }
        return null;
    }

    public void close() {                                 //function to close socket
        try {
            if (serverSocket != null && !serverSocket.isClosed()) { //validation check
                serverSocket.close();
            }
        } catch (IOException e) {
            System.err.println("Error closing receiver socket: " + e.getMessage());
        }
    }
}

