public class toh {
    public  static void tower_of_honai(int n,int n1,int n2,int n3,int[]count){
        if(n==0)return;
       count[0]++;
       tower_of_honai(n-1, n1, n2, n3, count);
       tower_of_honai(n-1, n1, n3, n2, count);



    }
    

    public static void main(String[] args) {
         int[]count={0};
         tower_of_honai(2,11,12,13,count);
         System.out.println(count[0]);
    }
}
