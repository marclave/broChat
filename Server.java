package broChat;

import static broChat.Port.port;
import java.io.*;
import java.net.*;

public class Server
{
	public static void main(String[] args) throws IOException
	{
		
		try
		{
			ServerSocket server = new ServerSocket(port); // Set the port number
			System.out.println("Starting chat application..."); // TODO: gui output
			
			while(true)
			{
				Socket socket = server.accept(); // Accept the socket trying to connect
				System.out.println("Starting chat with " + socket.getLocalAddress()); // TODO see if more information is available
				// TODO Now create instance of client class and a new thread then start the chat
			}
		}
		catch (Exception e)
		{
			System.out.println("An error occured, here is the stack trace:");
			e.printStackTrace();
		}
	}
}
