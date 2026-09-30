public class nested {

    public static void main(String[] args) {
    int attendance=70;
    boolean feespaid=true;
    if (attendance>=75) {
        if (feespaid) {
            System.out.println("Allowed exams");
            
        }else{
            System.out.println("fees not paid");
        }
        
    }else{
        System.out.println("attendance below required");
    }
    }
}