package TestCases;

// Run as Java Application
public class PrintNumbers {
	
	     public static void main(String []args){
	        func();
	     }
	     
	     public static void func(){
	         for(int i=1; i<=100 ; i++){
	        	 //to get multiples of both 3 & 5
	             if(i%3==0 && i%5==0){
	                System.out.println("Resolver");
	                continue;
	             }
	             else{
	            	 //For getting multiples of 3
	             if(i%3==0){
	                 System.out.println("MThree");
	                 continue;
	                 //To get the multiples of 5
	             }else if(i%5==0){
	                 System.out.println("MFive ");
	                 continue;
	             }
	             }
	             System.out.println(i);
	         }
	     }
}
