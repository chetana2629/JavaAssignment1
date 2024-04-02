package assignmetOne;

public class Program4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			 int temp;
			 int array[]= {7,5,3,6,8,9,4,2,1,10};
			
			 for (int i = 0; i< array.length; i++) 
			 {
				 for (int j = 1; j < array.length; j++) 
				 {
					 if(array[j]>array[i]) 
					 {
	                    temp=array[i];
	                    array[i]=array[j];
	                    array[j]=temp;
					 }
					 
				 }
			 }
			 System.out.println("Second Minimun in the Array number :"+array[2]);
			 System.out.println(" Second Maximun in the Array number :"+array[array.length-1]);
		}
	}


