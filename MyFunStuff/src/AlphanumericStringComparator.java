import java.util.Comparator;


public class AlphanumericStringComparator<Object> implements Comparator<Object>{

    
	public int compare(Object obj1, Object obj2) {
		int n1 = 0;
		int n2 = 0;
		int n1x = 0;
		int n2x = 0;
		String s1 = obj1.toString();
		String s2 = obj2.toString();

		StringBuffer sbuf1 = new StringBuffer();
		StringBuffer sbuf2 = new StringBuffer();
		Double d1 = null;
		Double d2 = null;
        try {
            d1 = Double.parseDouble(s1);
            d2 = Double.parseDouble(s2);
        } catch (Exception e) {
           System.out.println(e.getMessage());
        }
        if ((d1 != null) && (d2 != null)) {
            return Double.compare(d1, d2);
        }
		
		for(int i=0; (i<s1.length()) || (i<s2.length()); i++) {
		    char c;
		    if(i < s1.length()) {
		        c = s1.charAt(i);
		        if(isNumeric(c)) {
		            n1 = 10*n1 + Integer.parseInt("" + c);
		        }
		        else {
		            n1x = n1;
		            n1 = 0;
		            sbuf1.append(c);
		        }
		    }
			
			if(i < s2.length()) {
			    c = s2.charAt(i);
			    if(isNumeric(c)) {
			        n2 = 10*n2 + Integer.parseInt("" + c);
			    }
			    else {
			        n2x = n2;
			        n2 = 0;
			        sbuf2.append(c);
			    }
			}
	        if(!sbuf1.toString().equals(sbuf2.toString()))
	            return sbuf1.toString().compareTo(sbuf2.toString());
	        else if(n1x != n2x)
	            return (n1x - n2x);
		}

        if(sbuf1.toString().equals(sbuf2.toString())) {
            return (n1 - n2);
        }
        else
            return sbuf1.toString().compareTo(sbuf2.toString());
	}
	
	private static boolean isNumeric(char c) {
		if((c >= '0') && (c <= '9'))
			return true;
		return false;
	}

}
