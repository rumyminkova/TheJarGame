import java.util.Scanner;

public class Prompter{
	
	
	public String promptForItems(){
		Scanner scanner=new Scanner(System.in);
		System.out.print("What type of item is in the jar?: ");
		return scanner.nextLine();
	}
	
	
	public int promptForMaxAmount(String items){
		int maxAmount=0;
		String inputData="";
		boolean isAcceptible=false;
	
		Scanner scanner=new Scanner(System.in);
		
		while (!isAcceptible) {
				
			  System.out.printf("What is the maximum number of %s in the jar:",items);	
			  inputData=scanner.nextLine();
				
				try {	
							maxAmount=Integer.parseInt(inputData);
					    isAcceptible=true;
					
					}catch (NumberFormatException nfe){
							System.out.println("Please enter a number");
					}
					if (isAcceptible &&	maxAmount<=0) {
					  System.out.println("Please enter a number greater than 0");
						isAcceptible=!isAcceptible;
					
					}
		
  	}
		return maxAmount;
		
	}
		
		
	
	public int promptForGuess(String items, int maxAmount){
		int inputAmount=0;
		String inputData="";
		boolean isAcceptible=false;
	
		Scanner scanner=new Scanner(System.in);
		
		while (!isAcceptible) {
				
			  System.out.printf("Enter a number between 1 and %d: ",maxAmount);
			  inputData=scanner.nextLine();
				
				try {	
							inputAmount=Integer.parseInt(inputData);
					    isAcceptible=true;
					
					}catch (NumberFormatException nfe){
							System.out.println("Please enter a number");
					}
					if (isAcceptible){
						if (inputAmount<=0) {
					  	System.out.println("Please enter a number greater than 0");
							isAcceptible=!isAcceptible;
						}
						if (inputAmount>maxAmount){
								System.out.printf("Your guess must be less or equal %d %n",maxAmount);
								isAcceptible=!isAcceptible;
						}
				
					}
		
  	}
		
		return inputAmount;
	}
	

	public void playGame(String item, int maxAmount,int answer){
	
		int guess=0;
		int numberOfGuesses=0;  
			
		do {
				
				 guess=promptForGuess(item,maxAmount);
	
			
				 if (guess>answer){
					System.out.println("Your guess is too high");
					
				 }
				 if (guess<answer){
				
					System.out.println("Your guess is too low");
				 }
				numberOfGuesses++;	
			}while (guess!=answer);
			
			 System.out.printf("Success!!! You got it in %d tries %n",numberOfGuesses);
			
	}
	
}

			


