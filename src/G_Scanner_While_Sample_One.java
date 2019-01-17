import java.util.Scanner;

public class G_Scanner_While_Sample_One {
	public static void main(String[] args) {
		//Enter data to java program through Keyboard
        //via Scanner -Klasse
        //1) create an instance of Scanner
		/*
		Scanner scanner = new Scanner(System.in);
        float score;

        System.out.println("Enter the score:" );
        score = scanner.nextInt();

        if (score >= 70){

            System.out.println("Pass: You are Android Certified App Developer!! " );
        }
        else{
            System.out.println("Fail: You may repeat the exam after 24 Hours" );
        }
        */
        
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the score:" );
		
        float score = scanner.nextFloat();
        System.out.println("the score: " +score );
        System.out.println();
        
        while (score != 0 ) {
        	
        	score = scanner.nextFloat();
        	System.out.print("the score: " +score );
        	System.out.println();
        	
        }
        if (score == 0)
        	System.out.println("you have finished this program: " +score );
                


	}
}

