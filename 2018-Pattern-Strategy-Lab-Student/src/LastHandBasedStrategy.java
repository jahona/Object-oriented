	import java.util.Random;

public class LastHandBasedStrategy implements PlayingStrategy {
	Random generator = new Random();
	HandType lastUserHand = null;
	
	@Override
	public HandType nextHand() {
		// TODO Auto-generated method stub
		if(lastUserHand == null) {
			return HandType.valueOf(generator.nextInt(3));
		}
		
		int prob = generator.nextInt(10);
		
		if(prob < 2) {
			return lastUserHand;
		} else {
			int n = lastUserHand.ordinal();
			
			return HandType.valueOf(n);
		}
	}
	
	public void setLastUserHand(HandType hand) {
		lastUserHand = hand;
	}
}

