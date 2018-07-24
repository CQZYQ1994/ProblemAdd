package control;

import java.util.Random;

public class RandomUtil {
	public static final int len = 32;

	static String generate() {
		String str = "";
		for (int i = 0; i < len; i++) {
			Random rand = new Random();
			int r = rand.nextInt(36) ;
			
			if (r < 10) {
				str +=r+"";// Integer.toString(r);
			} else {
				str +=  Character.toString((char)('a'+r-10 ));
			}

		}
		return str;
	}
	
	  public static void main(String[] args){ 
		 
	  for(int i=0; i< 100;i++) {
		  String str= RandomUtil.generate();
		  System.out.println("================");
	  System.out.println(str.length());
	  System.out.println(str); }
	  }
	 

}
