package Interview.java;

class ArmstrongProgram{
    public static void main(String[] args) {
        int n = 153, ref, origanal, result = 0;
        origanal = n;

        while(n>0){
            ref = n%10;
            result = (ref*ref*ref)+result;
            n = n/10;
        }
        
        if(origanal == result)
            System.out.print("Number is Armstrong. "+origanal);
        else
            System.out.print("Number is Not Armstrong. "+origanal);
    }
}