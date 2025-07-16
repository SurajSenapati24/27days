import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeOverLappingIntervals {
    public static int[][] soltuion(int arr[][]){
        Arrays.sort(arr,(a,b)->Integer.compare(a[0],b[0]));
        List<int[]> merge=new ArrayList<>();
        int prev[]=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            int inter[]=arr[i];
            if(prev[1]>=inter[0])
            prev[1]=Math.max(prev[1],inter[1]);
            else{
                merge.add(prev);
                prev=inter;
            }
        }
        merge.add(prev);
        return merge.toArray(new int[merge.size()][]);
    }
    public static void main(String[] args) {
        int arr[][]={{1,3},{2,6},{8,10},{15,18}};
        int ans[][]=soltuion(arr);
        System.out.print("[");
        for(int []i:ans){
            System.out.print(Arrays.toString(i)+" ");
        }
        System.out.print("]");
    }
}
