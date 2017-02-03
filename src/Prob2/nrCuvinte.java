package Prob2;

import java.util.StringTokenizer;

public class nrCuvinte {
	
	static int cate(String linie) {
		
		String delim = " ,.;:";
		StringTokenizer st = new StringTokenizer(linie, delim);
		int i=0;
		
		while (st.hasMoreTokens()) {
			String token = st.nextToken();
			++i;
		}
		
		return i;
	
	}

}
