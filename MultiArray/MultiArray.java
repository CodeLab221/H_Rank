

public class MultiArray {
      
      public static void main(String[] args){
            /*
          int [][]a = new int[10][10];
          for(int i=0;i<10;i++){
            for(int j=0;j<10;j++){
                  System.out.print(a[i][j]);
            }
            System.out.println();
          */



         int[] numbers = new int[]{23,30,25,123,440,233};
         int sum=0;
         
         for( int i=0; i<numbers.length; i++){
            
            sum = sum+numbers[i];
         }

         double average = sum /numbers.length;

         System.out.println("Average value is: " + average);
          
          }

          
      }

