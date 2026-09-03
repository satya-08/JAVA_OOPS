package FileHandling;

import java.io.IOException;
import java.io.FileReader;

public class FileReaderExample {
	public static void main(String[] args) {
		try(FileReader fr=new FileReader("FileHandling.notes.txt")){
			System.out.println("Enter some letters");
			int letters=fr.read();
			while(fr.ready()) {
				System.out.println((char)letters);
				letters=fr.read();
			}
			//isr.close();
			System.out.println();
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
	}

}
