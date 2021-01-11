package filetester;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ReadWrite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File inpFile=new File("C:\\Users\\MH SHANTO\\OneDrive\\Desktop\\test_inp.txt");
		File outFile=new File("C:\\Users\\MH SHANTO\\OneDrive\\Desktop\\test_out.txt");
		
		try {
			
			FileReader filereader=new FileReader(inpFile);
			try {
				FileWriter fileWriter=new FileWriter(outFile);
				System.out.println("write somthing :");
				Scanner fileScanner=new Scanner(System.in);
				
				
				while (fileScanner.hasNext()) {
					String fileData=fileScanner.nextLine();
//					System.out.println("write somthing :");
					fileWriter.write(fileData);
				}
				
				fileWriter.close();
				filereader.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
			System.out.println("File not found---");
		}
	}

}
