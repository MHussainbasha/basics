import java.util.Random;
public class RandomNumber {

	public static void main(String[] args) {

	    /*   for(int i=0;i<10;i++)
					{
						System.out.println(randomNumber(5,10));
					}
			           
		}
					public static int randomNumber(int min ,int max)
					{
						RandomNumber rm=new RandomNumber();
						int random = rm.nextInt((max - min) + 1) + min;
						return random;
						
					}*/
	

	for(int i =0; i < 10; i++)
	{
		Random rn=new Random();
	    int answer = rn.nextInt(10) + 5;
	    System.out.println(answer);
	}
	}
}


