import java.util.Arrays;

public class countSort {

    static void sort(int arr[]){
        if(arr==null || arr.length<1){
            return;
        }
        int max=0;

        for (int i : arr) {
            if(i>max){
                max=i;
            }
        }

        int nums[]=new int[max+1];

        for (int i : arr) {
            nums[i]++;
        }

        int idx=0;
        for (int i=0;i<=max;i++) {
            while (nums[i]>0) {
                arr[idx]=i;
                idx++;
                nums[i]--;
            }
        }
    }

    static int searchInsert(int[] nums, int target) {
        int ans=-1;

        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                return i;
            }
        }

        if(ans==-1){
            for(int i=0;i<nums.length;i++){
                if(nums[i]>target){
                    ans=i;
                }
            }
        }

        if(ans==-1){
            ans=nums.length;
        }
        return ans;
    }
    
    public static void main(String[] args) {
        int[] nums = {1,3,5,6};
        System.out.println(searchInsert(nums,5));
    }
}
