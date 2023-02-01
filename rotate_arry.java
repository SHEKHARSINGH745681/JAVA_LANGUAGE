class Solution {
    public void rotate(int[] nums, int k) {
        int []arr={1,2,3,4,5,6,7}
        int k=3;
        Rotate(arr,k);
        for(int i=0;i<arr.length;i++){
            System.out.print
        }
    }
    public static void Rotate(int[]arr,intk){
        k=k%arr.length;
        int temp=arr[arr.lenght-1];
        for(int i =arr,length-2;i>=;i--){
            arr[i+1]=arr[i];
        }
        arr[]=temp;
    }
}