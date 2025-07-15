import java.util.*;
public class SortColors {
    public static void solution(int arr[]){
        int left=0,mid=0,right=arr.length-1;
        while (mid<=right) {
            if(arr[mid]==0){
                swap(arr, left, mid);
                mid++;
                left++;
            }
            else if(arr[mid]==1) mid++;
            else{
                swap(arr, mid, right);
                right--;
            }
        }
    }
    public static void swap(int arr[],int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void main(String[] args) {
        int arr[]={2,0,2,1,1,0};
        System.out.println(Arrays.toString(arr));
        solution(arr);
        System.out.println(Arrays.toString(arr));
    }
}
