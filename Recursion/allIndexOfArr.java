public class allIndexOfArr {

    public static int[] all_index_of_arr(int[]arr,int value,int index,int size){
        if(index==arr.length)return new int[size];
       if(arr[index]==value){
       int[]array=all_index_of_arr(arr, value, index+1, size+1);
       array[size]=index;
       return array;
       }else{
int[]array=all_index_of_arr(arr, value, index+1, size);
return array;
       }



    }

    public static void main(String[] args) {
        int[]arr={1,2,2,2,3,4,2};
        int ans[]=all_index_of_arr(arr,2,0,0);
        for(int i=0;i<ans.length;i++){
            System.out.println(ans[i]);
        }
    }
    
}
