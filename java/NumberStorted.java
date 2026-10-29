import java.util.Arrays;
public class NumberStorted{
    public static int[][] numberSwap(int[][]numbers){
    int stores = 0;
    for(int index = 0; index < numbers.length; index++){
        for(int count = 0; count < numbers[index].length;  count++){
            for(int counter = count; counter < numbers[index].length; counter++){
        
        
        if (numbers[count][counter] >= numbers[count][count]){
            stores = numbers[count][counter];
            numbers[count][counter] = numbers[count][count];
            numbers[count][count] = stores;  
   }
   }
   }
   }
   return numbers;
   }
   
public static void main(String[]args){
    int[][]numbers = {{1,2,3},{4,5,6},{7,8,9}};
  System.out.println(Arrays.deepToString(numberSwap(numbers)));
    
    
   
   
   
   }  
                   
       
       
          
    }
    
    
    
    
    
    
    

