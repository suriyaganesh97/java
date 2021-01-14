package methods;

public class Basic {

	public static void main(String[] args) {
		String p1name="John";
		String p2name="Wayne";
		int p1position=1;
		int p2position=2;
		int p1score=1334;
		int p2score=500;
		diplayHighScorePosition(p1name,p1position);
		diplayHighScorePosition(p2name,p2position);
		int scoreValue=calculateHighScorePosition(p1score);
		System.out.println(scoreValue);
		scoreValue=calculateHighScorePosition(p2score);
		System.out.println(scoreValue);
	}
	
	static void diplayHighScorePosition(String name,int position)
	{
		System.out.println(name+" managed to get into a position of "+position+" on the high score table.");
	}
	static int calculateHighScorePosition(int score)
	{
		if(score>=1000){
			return 1;
		}
		else if(score>=500 && score<1000){  //you can simply write as >=500 as if it comes to the flow then definitely less than 1000 only
			return 2;
		}
		if(score>=100 && score<500){ //you can simply write as >=500 as if it comes to the flow then definitely less than 1000 only
			return 3;
		}
		return 4;
	}

}
