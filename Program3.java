package assignmetOne;

public class Program3 {
	
		public static void main(String[] args)
		{ 
			
		
			int array[]= {1,2,3,5,6,8,9,7,10};
			int array2[]=new int[10];
		    int j = 0;
		    
			 for (int i = array.length-1; i >=0; i--)
			 {
					 array2[j]=array[i];
					 j++;
			 }
		    
			 for (int i = 0; i < array2.length; i++) 
			 {
				System.out.print("\t"+array2[i]);
			}
		}

	}


