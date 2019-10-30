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
			System.out.println(buff.length);
			
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
			
		//	String str = "if want't you can to do every happy for all";
			
			if(!f1.exists())
				f1.createNewFile();
			
			System.out.println(f1.getAbsolutePath());
			
			//byte[] contentByte = str.getBytes();
			while((fis.read(buff))>=0){
			fos.write(buff);}
			fos.flush();
			fos.close();
			
			
			
			
	}
	}


