public class MaximumSubArray {
    public static int solution(int arr[]){
        int sum=0;
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            max=Math.max(max, sum);
            if(sum<0) sum = 0;
        }
        return max;
    }
    public static void main(String[] args) {
        int arr[]={0,1,-1,1,2,3,-2};
        System.out.println(solution(arr));
    }
}
