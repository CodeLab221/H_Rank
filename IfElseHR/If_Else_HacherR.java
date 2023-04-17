import java.util.Scanner;



public class Solution {
  public static void main (String[] args){
      Scanner sc = new Scanner(System.in);
      
      int N = sc.nextInt();
     
      // Arvud 0 kuni 5  
      if (N>=2 && N<=5 && N%2==0) { System.out.println("Not Weird");}
          else if (N>=0 && N<=5 && N%2!=0){System.out.println("Weird");}

          // Arvud 6 kuni 20 - Nii Paaris kui Paaritud on "Weird"
          else if (N>=6 && N<=20 && N%2==0) { System.out.println("Weird");}

          // Arvud 20 kuni 100
          else if (N>20 && N%2==0) {System.out.println("Not Weird");}
          else if (N>20 && N%2!=0) {System.out.println("Weird");}
    

  }


}
