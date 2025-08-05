public class max_array {
    
public static int max_ele_in_array(int[]arr,int index,int max){
    if(index==arr.length)return max;
    if(arr[index]>max){
        max=arr[index];
    }
return  max_ele_in_array(arr, index+1, max);
  

}
    public static void main(String[] args) {
        int[]arr={1,2,34,4,5};
        int ans=max_ele_in_array(arr,0,0);
        System.out.println(ans);
    }
}
