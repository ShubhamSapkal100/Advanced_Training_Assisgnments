package ProblemStatement6_1;

import java.util.ArrayList;
import java.util.List;

public class Students {

	public static void main(String args[]){  
	     ArrayList<String> alist=new ArrayList<String>();  
	      alist.add("Steve");
	      alist.add("Tim");
	      alist.add("Lucy");
	      
	      if (alist.contains("Steve"))
	            System.out.println("Steve exists in the ArrayList");
	      else
	            System.out.println("Steve does not exist in the ArrayList");
	      
	      if (alist.contains("Tom"))
	            System.out.println("Tom exists in the ArrayList");
	      else
	            System.out.println("Tom does not exist in the ArrayList");
	}
	
}
