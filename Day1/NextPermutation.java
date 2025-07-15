import java.util.*;
public class NextPermutation {
    public static void reverse(int arr[],int left,int right){
        while(left<=right){
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
    }
    public static void solution(int arr[]){
        int index=-1;
        int n=arr.length;
        for(int i=n-2;i>=0;i--){
            if(arr[i]<arr[i+1]){
                index=i;
                break;
            }
        }
        if(index==-1) reverse(arr,0, n-1);
        else{
            for(int i=n-1;i>=index;i--){
                if(arr[i]>arr[index]){
                    int temp=arr[i];
                    arr[i]=arr[index];
                    arr[index]=temp;
                    break;
                }
            }
            reverse(arr, index+1, n-1);
        }
    }
    public static void main(String[] args) {
        int arr[]={1,2,3};
        System.out.println(Arrays.toString(arr));
        solution(arr);
        System.out.println(Arrays.toString(arr));
    }
}
