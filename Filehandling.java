package file;

import java.io.FileReader;

public class Filehandling {

	public static void main(String[] args) {
		try {
		FileReader fr=new FileReader("E:\\text files\\paths.txt");
		
		int x;
		while((x=fr.read())!=1)
			System.out.print((char)x);
		
		fr.close();
		}
		
		catch(Exception e)
		{
			System.out.print(e.getMessage());
		}
	}

}
