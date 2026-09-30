public class recursion{
    static int numRange(int start, int end){
        if(end>start){
            return end + numRange(start, end-1);
        }else{
            return end;
        }
    }
    public static void main(String[] args){
        int sumOfRange = numRange(5, 20);
        System.out.println("" + sumOfRange);
    }
}