package assignment7;

import java.io.*;
import java.io.RandomAccessFile;

public class Parse {
	
	public static void parse(File file) {
		   RandomAccessFile input = null;
		   String line = null;
		   try {
		       input = new RandomAccessFile(file, "r");
		       while ((line = input.readLine()) != null) {
		           System.out.println(line);
		       }
		       return;
		   } catch (FileNotFoundException e) {
			   e.printStackTrace();
		   } catch (IOException e) {
			   e.printStackTrace();
		   }finally {
		       if (input != null) {
		           try {
		    	   input.close();
		           } catch (IOException e) {
		        	   e.printStackTrace();
		           }
		       }
		   }
		}
}
