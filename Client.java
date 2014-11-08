package broChat;

import java.util.*;
import java.io.*;
import java.net.*;

public class Client implements Runnable
{
	private Socket socket; // Socket instance variable
	private String message;
	/* Constructor to get streams of chat */
	public Client(Socket s)
	{
		socket = s;
	}

	@Override
	public void run() 
	{
		try {
			Scanner chat = new Scanner(System.in); // Get command line input
			Scanner input = new Scanner(socket.getInputStream()); // Return the input stream of the socket
			PrintWriter output = new PrintWriter(socket.getOutputStream()); // Return the output stream of the socket
			
			while(true)
			{
				message = chat.nextLine(); // Read in new message of what the client stated
				output.println("Bro said: " + message); // Send to server
				
				output.flush(); // Flushes the stream
				
				if(input.hasNext())
				{
					System.out.println(input.nextLine());
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}
	
}
