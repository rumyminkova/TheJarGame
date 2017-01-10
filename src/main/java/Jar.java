import java.util.Random;
public class Jar{
	private String item;
	private int maxNumberOfItems;
	
	
	public Jar(String item, int maxNumberOfItems){
		this.item=item;
		this.maxNumberOfItems=maxNumberOfItems;
		
	}
	
	public int getMaxNumberOfItems(){
		return maxNumberOfItems;
	}
	
	public int fillJar(){
		
		Random random =new Random();
		return random.nextInt(getMaxNumberOfItems())+1;
			
}


}