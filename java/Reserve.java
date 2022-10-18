package Interview.java;

public class Reserve {
    public static void main(String[] args){
        int n = 6967, ref;

        while(n>0){
            ref = n%10;
            System.out.print(ref);
            n=n/10;
        }

    }
    
}
