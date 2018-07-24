package control;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Makedir {
	/*
	 * public boolean makedir(String str) { String strDirectory="E:\\SaveCase\\";
	 * String filePath=strDirectory+str; File file=new File(filePath);
	 * if(file.exists()) return false; file.mkdirs(); return true; }
	 */
	public boolean makedir(String str, String incontent, String outcontent,int id) throws IOException {
		String strDirectory = "E:\\SaveCase\\";
		String filePath = strDirectory + str;
		File file = new File(filePath);
		if (file.exists()) {
			return false;
		} else {
			file.mkdirs();
			String newfilepathin = filePath + "\\"+id+".in";
			String newfilepathout = filePath + "\\" + id +".out";
			File filein = new File(newfilepathin);
			File fileout = new File(newfilepathout);
			filein.createNewFile();
			fileout.createNewFile();
			FileWriter fwin = new FileWriter(newfilepathin, true);
			fwin.write(incontent);
			fwin.close();
			FileWriter fwout = new FileWriter(newfilepathout, true);
			fwout.write(outcontent);
			fwout.close();
			return true;
		}
	}
	
	 /* public static void main(String[] args) throws IOException { 
		  Makedir mk=new Makedir(); 
		  mk.makedir("12223","sfsafsfsaf","sfwfwfasfsdf",100); }*/
	 
}
