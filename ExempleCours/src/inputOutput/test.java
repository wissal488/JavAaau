package inputOutput;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class test {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File f = new File("fich.txt");
		int n=0;
			if(f.isFile()) System.out.println(f.getName());
			else if(f.isDirectory())
			for(File e:f.listFiles()) {
				System.out.printf("%d- %-15s \t",n+1,e.getName());
				n++;
				if(n%3==0) System.out.println();
		}
			FileInputStream fis = new FileInputStream(f);
			byte buff[]=new byte[8];
			int read = fis.read(buff);
			System.out.print("[");
			try {
				for(int i=0;i<buff.length;i++)
			System.out.print((char)buff[i]);
	
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("erreur");
			}
			System.out.print("]");
			System.out.println();
			System.out.println("Copie termine!");
			
	}
	}


