public class pdi {

    public static void pdi_func(int n){
        if(n==0)return;
        System.out.println(n);
        pdi_func(n-1);
        System.out.println(n);
    }

    public static void main(String[] args) {
        pdi_func(5);
    }
}