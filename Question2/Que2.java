package com.nissan.lib;

public class Que2 {
	/*b. Create an array having 10 elements. 
	 * Try to print the element in the 11th position.
	 *  Catch the appropriate exception.
	 */
	public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        try {
            String[] arrString=new String[10];
            for(int i=0;i<10;i++) {
                arrString[i]=input.nextLine();
            }
            System.out.println(arrString[11]);
            
        }
        catch(ArrayIndexOutOfBoundsException e) {
            
            System.out.println("Index not exists");
        }



   }
	

}
