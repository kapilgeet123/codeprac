
public class binary_search {

	public static void main(String[] args) {
		int[] arr= new int[] {1,2,3,4,5,6,7,8,9,10};
		
		int low=0;
		int mid=0;
		int high=arr.length-1;
		
		int x=6;
		for(int i=0;i<arr.length;i++)		{
			mid=(low+high)/2;
			if(x==arr[mid]) {
				System.out.println("Number is Present at Index: "+mid);
				break;
			}
			else if(x<arr[mid]) {
				high=mid-1;
			}else {
				low=mid+1;
			}
		}
	}

}
