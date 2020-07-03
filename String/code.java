import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args)
	 {
	 //code
	 Scanner in = new Scanner(System.in);
	 int n=  in.nextInt();
String[] str= new String[n];

	 for(int i =0 ; i< n; i++){
	     str[i] = in.next();
	     int l=0;
	     int r= str[i].length()-1;
	    permutation(str[i], l, r);
	   //permutation("ABSG", 0, 3);
	     System.out.println();
	 }
	 }
	 
	public static void permutation(String str, int l, int r){
	    if(l== r){
	        System.out.print(str + " ");
	    }
	    
	    else{
	        
	        for(int i=l; i<= r; i++ ){
	      str= swap(str, l , i  );
	        permutation(str, l+1 ,r );
	       str=  swap(str, l, i);
	        }
	        //System.out.print("hello");
	    }
	    
	    
	   // System.out.print("hello");
	}
	
	public static String swap(String str, int i ,int j){
	   //System.out.print("hello");
	    char temp ;
	    char[] ch= str.toCharArray();
	    temp= ch[i];
	    ch[i]= ch[j];
	    ch[j]= temp;
	   // System.out.print("hello");
	    return String.valueOf(ch);
	    
	}
	 
	 
}