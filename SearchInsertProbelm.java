
public class SearchInsertProbelm {

	public static void main(String[] args) {
		
		int nums[]={1,3,5,6};
		System.out.println(searchInsert(nums, 2));

	}

	public static int searchInsert(int[] nums, int target) {
		
		int low=0;
		int high=nums.length-1;
		int mid=0;
		
		while(low<=high)
		{
			mid=(low+high)/2;
			if(nums[mid]==target)
			{
				return mid;
			}
			
			else if(nums[mid]<target)
			{
				low=mid+1;
			}
			else
			{
				high=mid-1;
			}
		}
		System.out.println(mid);
		if(nums[mid]>target)
		{
			mid--;
		}
		else
		{
			mid++;
		}
		return mid;
	}

}
