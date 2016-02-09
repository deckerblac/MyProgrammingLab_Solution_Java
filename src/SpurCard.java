import java.util.ArrayList;

public class SpurCard {
	
	public static ArrayList<Cards> cards;
    
	static{
		  cards = new ArrayList<>();
		  cards.add(new Cards("Kings", 4));
		  cards.add(new Cards("Ace", 5));
		  cards.add(new Cards("Queen", 8));
	}
	
	
	
}
