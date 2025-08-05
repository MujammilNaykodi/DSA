public class displayArray {
    

    public static void  displayarr(int[]arr,int index){
        if(index==arr.length)return;
        System.out.println(arr[index]);
        displayarr(arr, index+1);

    }

    public static void  displayarr_reverse(int[]arr,int index){
        if(index==arr.length)return;
        displayarr_reverse(arr, index+1);

        System.out.println(arr[index]);

    }

    public static void main(String[] args) {
         int[]arr={1,2,3,4,5};
        displayarr(arr,0);
        System.out.println("reverse");
        displayarr_reverse(arr,0);
    }
}
