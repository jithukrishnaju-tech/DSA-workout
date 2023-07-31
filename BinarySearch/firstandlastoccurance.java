import java.util.Arrays;
//first and last occurance of a number
public class Occurance {
    public static void main(String[] args) {
        int[] arr={5,7,7,8,8,10};
        int target=8;
        int[] ans=new int[2];
        ans[0]=search(arr,target,true);
        ans[1]=search(arr,target,false);
        System.out.println(Arrays.toString(ans));
    }

    static int search(int[] arr, int target,boolean first) {
        int start=0;
        int end=arr.length-1;
        int ans=-1;
        while (start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]>target){
                end=mid-1;
            }
            else if(arr[mid]<target){
                start=mid+1;
            }
            else{
                ans=mid;
                if(first){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }

            }
        }
        return ans;
    }
}
