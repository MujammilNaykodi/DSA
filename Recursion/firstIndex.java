public class firstIndex {


    public static int first_occurence_index(int[]arr,int index,int value){
        if(index==arr.length)return -1;

        if(arr[index]==value)return index;

        return first_occurence_index(arr, index+1, value);
    }

     public static int last_occurence_index(int[]arr,int index,int value){
       if(index==arr.length)return -1;
       int last_index=last_occurence_index(arr, index+1, value);
       if(last_index==-1){
        if(arr[index]==value){
            return index;
        }else{
            return -1;
    }
       }else{
        return last_index;
       }

    }
    public static void main(String[] args) {
        int[]arr={1,2,3,4,4,5};
        int ans=first_occurence_index(arr, 0, 4);
        int ans1=last_occurence_index(arr, 0, 4);

        System.out.println(ans);
        System.out.println(ans1);
    }
    
}
