package Array;
public class next_permutation {
    
    public static void main(String args[]){
        int[] nums={1,2,3};
        nextPermutation(nums);
        
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]);
        }
    }

    public static void nextPermutation(int[] nums) {
        
        if(nums.length<=1 || nums==null){
            return ;
        }

        int i=nums.length-2;

        while(i>=0 && nums[i]>=nums[i+1]){
            i--;
        }

        int j=0;

        if(i>=0){
            j=nums.length-1;

            while(nums[j]<=nums[i]){
                j--;
            }
            swap(nums,i,j);
        }
        i=i+1;
        j=nums.length-1;

        while(i<j){
            swap(nums,i++,j--);
        }
    }

    public static void swap(int[] nums,int i,int j){

        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}
