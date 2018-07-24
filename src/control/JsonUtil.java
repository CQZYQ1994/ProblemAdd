package control;

import java.util.Vector;

public class JsonUtil {

	private Vector<String> keys;
	private Vector<String> values;

	public JsonUtil() {
		keys = new Vector<String>();
		values = new Vector<String>();

	}
	
/*	String toSQLString(String str) {
		char[] buff=new char[2*str.length()+1];
		int i,j;
		i=j=0;
		for(i=0; i<str.length(); i++  ) {
			if(str.charAt(i)=='\n') {
				buff[j++]='\\';
				buff[j++]='\n';
			}else if(str.charAt(i)=='\r') {
				buff[j++]='\\';
				buff[j++]='\r';
				
			}else {
				buff[j++]=str.charAt(i);
			}
			i++;
		
		}
		buff[j]='\0';
		return String(buff);
	}
*/
	public void put(String key, String v) {
		keys.add(key);
		values.add(v);
	}

	public String toString() {
		if (keys.isEmpty()) {
			return "{}";
		}
		String str = "[{";

		for (int i = 0; i < keys.size(); i++) {

			if (i > 0) {
				str += ",";
			}

			str += "\"" + keys.get(i) + "\"" + ":" + "\"" + values.get(i) + "\"";

		}
		str += "}]";

		return str;
	}

}
