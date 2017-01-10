public class Game {
    
	public static void main(String[] args) {
			

			Prompter prompter=new Prompter();
		
			String items =prompter.promptForItems();
  		int maxAmount=prompter.promptForMaxAmount(items);
			
			Jar jar=new Jar(items,maxAmount);
  		int answer=jar.fillJar();
			
		
			prompter.playGame(items,maxAmount,answer);

	}
		
}

