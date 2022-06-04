package lastQuestion;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadFiles {

	public static void main(String[] args) throws IOException {
		
		//	Part A		
		System.out.println("provide a file path:");
		Scanner userinput = new Scanner(System.in);
		String providedpath = userinput.next();
		doesFileExist(providedpath);
		
		System.out.println("===========================");
		
		// Part b
		readEachWord();
		

	}
	

	public static void doesFileExist(String path) {
		
		try{
			File f = new File(path);
			Scanner ui = new Scanner(f);
			System.out.println("Exists!!!!!!!");
		}
		catch(FileNotFoundException fnfe) {
			System.out.println("File not found, please input a existing file path " + fnfe.getMessage());
		}
		
	}
	
	public static void readEachWord() throws IOException {
		
		String path = "data\\dictionary.csv";
		File f = new File(path);
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		String line = "";
		while((line = br.readLine()) !=null) {
			System.out.println(line);
		}
	}
	
}
