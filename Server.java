package broChat;

import static broChat.Constants.PORT;
import static broChat.Constants.HOST;
import java.io.*;
import java.net.*;

public class Server
{
	public static void main(String[] args) throws IOException
	{
		try
		{
			Socket server = new Socket(HOST, PORT); // Set the port number
			System.out.println("Starting chat application...");
			
			Client client = new Client(server); // Start new client instance
			
			Thread thread = new Thread(client); // Initiate new thread
			thread.start(); // Start the new thread
		}
		catch (Exception e)
		{
			System.out.println("An error occured, here is the stack trace:");
			e.printStackTrace();
		}
	}
}
