import java.util.Arrays;
class Sort{
	
	public static void insertionSort(int a1[]){
		int n=a1.length;
		for(int i=n-1;i>0;i--)
		{
			int temp=a1[i];
			
			int j=i-1;
			while(i>-1 && temp<a1[j]){
				a1[j+1]=a1[j];
				j--;	
				System.out.println(Arrays.toString(a1));
			}
			
			
			//System.out.println(Arrays.toString(a1));
			a1[j+1]=temp;
		}
	
		System.out.println(Arrays.toString(a1));
		
	}
	
	
	public static void main(String [] args){
		
		int a1[]={1,2,4,5,3};
		int a2[]={2,4,6,8,3};
		System.out.println("for sample");
		insertionSort(a1);
		System.out.println();
		System.out.println("for first test case");
		insertionSort(a2);
		
	}
}