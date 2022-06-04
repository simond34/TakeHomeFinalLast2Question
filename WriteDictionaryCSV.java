package lastQuestion;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteDictionaryCSV {

	public static void main(String[] args) throws IOException {

		String path = "data\\dictionary.csv";
		File f = new File(path);
		FileWriter fw = new FileWriter(f);
		BufferedWriter bw = new BufferedWriter(fw);
		
		bw.write("Word: Apple");
		bw.newLine();
		bw.write("Meaning 1: A fruit");
		bw.newLine();
		bw.write("Meaning 2: A tech firm");
		bw.newLine();
		bw.write("Word: Table");
		bw.newLine();
		bw.write("Meaning 1: An object");
		bw.newLine();
		bw.write("Meaning 2: Contains rows and columns when used in contect of computers");
		bw.newLine();
		bw.write("Word: Orange");
		bw.newLine();
		bw.write("Meaning 1: A fruit");
		bw.close();

	}

}
