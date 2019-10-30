package inputOutput;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class test {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File f = new File("fich.txt");
		int n=0;
		
			/*if(f.isFile()) System.out.println(f.getName());
			else if(f.isDirectory())
			for(File e:f.listFiles()) {
				System.out.printf("%d- %-15s \t",n+1,e.getName());
				n++;
				if(n%3==0) System.out.println();
		}*/
			FileInputStream fis = new FileInputStream(f);
			
			byte buff[]=new byte[1];
		
			
			try {
				while((fis.read(buff))>=0)
			System.out.print((char)buff[0]);
	
			} catch (IOException e) {
				// TODO: handle exception
				System.out.println("erreur");
			}
			System.out.println();
			System.out.println("Copie termine!");
			
			File f1 = new File("fichierXX.txt");
			FileOutputStream fos = new FileOutputStream(f1);
			
			//byte[] contentByte = str.getBytes();
			try {
				while((n=fis.read(buff))>=0){
				for(int i=0;i<n;i++) {
					System.out.println((char)buff[i]);
			 fos.write(buff[i]);}}

			fos.close();
			} catch (Exception e) {
				// TODO: handle exception
			}
			
			
			
			
			
	}
	}


