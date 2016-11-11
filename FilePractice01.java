import java.io.*;
import java.io.PrintWriter;
import java.util.Scanner;

public class FilePractice01 {
	public static void alternateLines(String inFileName1, String inFileName2, String inFileName3,String outFileName){
		Scanner inFile1=null;
		Scanner inFile2=null;
		PrintWriter outFile=null;
		try{
			inFile1=new Scanner (new File(inFileName1));
			inFile2=new Scanner( new File(inFileName2));
			
			outFile=new PrintWriter(outFileName);
		}
		catch (FileNotFoundException e){
			System.out.println("Erroe: "+e);
		
		}
		while(inFile1.hasNextLine()||inFile2.hasNextLine()){
			if (inFile1.hasNextLine()&&inFile2.hasNextLine()){
				outFile.println(inFile1.nextLine());
				outFile.println(inFile2.nextLine());
			}
			else if (inFile1.hasNextLine()){
				outFile.println(inFile1.nextLine());
			}
			else{
				outFile.print(inFile2.nextLine());
			}
		}
		
	}

}
