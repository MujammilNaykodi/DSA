public class printIncresing {
    public static void incresing(int n){
        if(n==0)return;
        incresing(n-1);
        System.out.println(n);

    }
    
    public static void main(String[] args) {
     incresing(5);   
    }
}
