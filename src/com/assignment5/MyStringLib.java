package com.assignment5;



public class MyStringLib {
	
    public int findStrChar(String str,char c){
    	char temp[] = str.toCharArray();
    	for(int i=0;i<temp.length;i++)
    		if(temp[i] == c)
    			return i+1;
		return 0;
    }
    
    public int strCmpr(String str1,String str2){
    	if(str1.length() == 0 || str2.length() == 0 || str1 == null || str2 == null)
    		return 0;
    	else{
    		char c1[] = str1.toCharArray();
    		char c2[] = str2.toCharArray();
    		return c1.length-c2.length;
    	}
    }
    
   public String strCopy(String dest,String srce){
    	if(dest.length() == 0 || srce.length() == 0 || dest == null || srce == null)
    		return null;  
    	else{
    		char destchar[] = dest.toCharArray();
    		char sorcechar[] = srce.toCharArray();
    		String ms = new String();
    		for(int i=0;i<destchar.length;i++)
				ms += destchar[i];
    		for(int i=0;i<sorcechar.length;i++)
    				ms += sorcechar[i];
    		return ms;
    	}
    }
    
    public boolean isStringContainSubStrng(String mainString, String subString) {
        boolean found = false;
        if(mainString.length() == 0 || subString.length() == 0 || mainString == null || subString == null)
        	return found;
        char[] mainchararray = mainString.toCharArray();
        char[] subchararray = subString.toCharArray();
        int max = mainchararray.length - subchararray.length;
 
        
        checkrecusion: for (int i = 0; i <= max; i++) {
            int n =  subchararray.length;
 
            int j = i;
            int k = 0;
  
            while (n-- != 0) {
                if (mainchararray[j++] != subchararray[k++]) {
                    continue checkrecusion;
                }
            }
            found = true;
            break checkrecusion;
        }
        
        return found;
    }

 
    public int findLength(String str){
    	char arr[] = str.toCharArray();
    	return arr.length;
    }
   
    
    public static void main(String ar[]){
    	MyStringLib msl = new MyStringLib();
    	System.out.println(msl.findStrChar("rani",'a'));
    	System.out.println(msl.strCmpr("rama krishna", "raju"));
    	System.out.println(msl.strCopy("rama krishna", "raju"));
    	System.out.println("bhaskar     "+msl.isStringContainSubStrng("ra mana", "a mn"));
    	System.out.println(msl.findLength("ra ju"));
    }

}
