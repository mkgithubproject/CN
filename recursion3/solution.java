public class solution {

	// Return a string array that contains all the possible strings
    public static String getKeypad(int n){
        
        if(n==2){
            return "abc";
        }
        if(n==3){
            return "def";
        }
         if(n==4){
            return "ghi";
        }
         if(n==5){
            return "jkl";
        }
         if(n==6){
            return "mno";
        }
         if(n==7){
            return "pqrs";
        }
         if(n==8){
            return "tuv";
        }
         if(n==9){
            return "wxyz";
        }
        return "";
    }
	public static String[] keypad(int n){
		if(n==0){
            String output[]=new String[1];
            output[0]="";
            return output;
        }
        String smalloutput[]=keypad(n/10);
        int smalldigit=n%10;
        String getKeypad=getKeypad(smalldigit);
        String output[]=new String[smalloutput.length * getKeypad.length()];
        int k=0;
        for(int i=0;i<smalloutput.length;i++){
            for(int j=0;j<getKeypad.length();j++){
                output[k]=smalloutput[i]+getKeypad.charAt(j); 
                k++;
            }
           
        }
        return output;

	}
	
}
