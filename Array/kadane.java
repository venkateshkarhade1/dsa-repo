package Array;
public class kadane {
    
    public static int max_subarray(int[] nums){

        int currsum=0;
        int maxsum=Integer.MIN_VALUE;

        if(nums.length==1){
            return nums[0];
        }

        for(int i=0;i<nums.length;i++){
            currsum += nums[i];

            if(currsum>maxsum){
                maxsum=currsum;
            }

            if(currsum<0){
                currsum=0;
            }

    }
        return maxsum;
}

    public static void main(String args[]){
        
        int[] nums={-2,1,-3,4,-1,2,1,-5,4};

        int result=max_subarray(nums);

        System.out.println("maximum subarray is : " + result);
    }
}
