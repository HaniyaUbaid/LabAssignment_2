import java.io.*;
import java.net.*;

class Sender {
    private Socket senderSocket;               //socket for connection with server

    public Sender(String serverIP, int serverPort) {
        try {
            senderSocket = new Socket(serverIP, serverPort);      //socket create to connect with server
        } catch (IOException e) {                                 //exception handling
            System.err.println("Error connecting to server: " + e.getMessage());
        }
    }

    public void sendMessage(Message message) {                   //function to send message
        if (senderSocket == null || senderSocket.isClosed()) {   //validation check
            System.err.println("Socket is not connected or already closed.");
            return;
        }
        try (ObjectOutputStream outputStream = new ObjectOutputStream(senderSocket.getOutputStream())) {
            outputStream.writeObject(message);
            outputStream.flush();             //message send immediately
        } catch (IOException e) {
            System.err.println("Error sending message: " + e.getMessage()); //err print error message
        }
    }

    public void close() {              // function to close socket
        try {
            if (senderSocket != null && !senderSocket.isClosed()) {         //validation check
                senderSocket.close();
            }
        } catch (IOException e) {                                         //exception handling
            System.err.println("Error closing sender socket: " + e.getMessage());
        }
    }
}

