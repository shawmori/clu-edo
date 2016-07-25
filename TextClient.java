package ui;
import java.util.Scanner;

public class TextClient {

	public TextClient(){
		startup();
	}

	public void startup(){
		System.out.print("How many players? ");
		Scanner sc = new Scanner(System.in);
		System.out.println(sc.next());
	}

	//maybe we should use a listener to listen for wasd input when people move their characters
	
	
	
	
	public static void main(String[] args){
		new TextClient();
	}
}
