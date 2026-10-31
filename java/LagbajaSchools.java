import java.util.*;
public class LagbajaSchools{

	public static int[][] studentGrade(){
	Scanner input = new Scanner(System.in);
 int score;
	System.out.println("Enter number of students: ");
	int student = input.nextInt();
	System.out.println("Enter number of subject: ");
	int subject = input.nextInt();
 int[][] scores = new int[student][subject];
	System.out.println("Saving >>>>>>>>>>>>>>>>");
	System.out.println("saved Succssfully");
 for(int index = 1; index <= student; index++){
    for(int count = 1; count <= subject; count++){
    do{

       System.out.println("Enter score for student " + index + " subject " + count);
       score = input.nextInt();
       scores[index -1][count -1] = score;
}while(score < 0 || score > 100);
   }

  }

	

System.out.println("==============================================================================================");
System.out.print("STUDENT		");
for(int count = 0; count < scores[0].length; count++){
int sub = count +1;
System.out.print("SUB" + sub + "	");
}
System.out.println("TOTAL		AVERAGE		POSITION");
System.out.print("==============================================================================================");
System.out.print("");

  
     return scores;




}

public static void main(String[]args){
 System.out.print(Arrays.deepToString(studentGrade()));
}

	} 
