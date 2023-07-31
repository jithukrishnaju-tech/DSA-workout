public class Infinitearray {
  public static void main(String[] args) {
      int[] arr={1,2,3,4,5,6,7,8};
      int target=1;
      int ans=search(arr,target);
      System.out.println(ans);
  }

  static int search(int[] arr, int target) {
      //We needs to find the range in which target lies.
      int start=0;
      int end=1;
      //lets take the condition where finding range when end is not enclosing the target.This will set range

      while(arr[end]<target){
          int temp=end;
          end=end+(end-start+1)*2; //Here end is doubling
          start=temp;
      }
      return binarysearch(arr,target,start,end);

  }

  static int binarysearch(int[] arr, int target, int start, int end) {
      while(start<=end){
          int mid=start+(end-start)/2;
          if(arr[mid]>target){
              end=mid-1;
          }
          else if(arr[mid]<target){
              start=mid+1;
          }
          else {
              return mid;
          }
      }
      return -1;
  }
}
