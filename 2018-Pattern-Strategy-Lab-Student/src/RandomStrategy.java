import java.util.Random;

public class RandomStrategy implements PlayingStrategy {
	Random generator = new Random();
	
	@Override
	public HandType nextHand() {
		// TODO Auto-generated method stub
		return HandType.valueOf(generator.nextInt(3));
	}

	@Override
	public void setLastUserHand(HandType hand) {
		// TODO Auto-generated method stub
		
	}
}
