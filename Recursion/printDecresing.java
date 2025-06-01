class printDecresing{

    public static void print_decresing(int n){
        if(n==0)return;
        System.out.println(n);
        print_decresing(n-1);
    }

    public static void main(String[] args) {
        print_decresing(5);
    }
}