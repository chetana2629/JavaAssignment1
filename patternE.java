package assignmetOne;

public class patternE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row=6;
		int star=1;
		int space=5;
		for(int r=1;r<=row;r++)
		{
			//for star
			for(int i=1;i<=space;i++)
			{
				System.out.print(" ");
		 }
		//for star
			for(int j=1;j<=star;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
			space--;
			star++;
		}
	}

	}


