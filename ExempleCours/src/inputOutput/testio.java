package inputOutput;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class testio {

	public static void main(String[] args) throws IOException {
		File f= new File("fich.txt");
		File fo=new File("fichierXX.txt");
		FileInputStream fis=new FileInputStream(f);
		FileOutputStream fos=new FileOutputStream(fo);
		BufferedInputStream bis=new BufferedInputStream(fis);
		BufferedOutputStream bos=new BufferedOutputStream(fos);
		
		byte[] buf=new byte[8];
		long t=System.currentTimeMillis();
		while(fis.read(buf)>=0) {
			fos.write(buf);
		}
		System.out.println("Temps :"+(System.currentTimeMillis()-t)+"ms");
		t=System.currentTimeMillis();
		while(bis.read(buf)>=0) {
			bos.write(buf);
		}
		System.out.println("Temps :"+(System.currentTimeMillis()-t)+"ms");
		
	}

}
