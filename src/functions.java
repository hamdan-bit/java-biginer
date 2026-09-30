public class functions {
     static void printNames(String fname, String sName, int age ){
         System.out.println(fname  +  sName + " is " + age  + " years old");
     }
        static boolean Adult = false;
     static boolean checkAge(int age ){
         
         if(age>=18){
            Adult = true;
            System.out.println("You are eligible");
         }
         return Adult;
     }


    public static void main(String[] args){
        checkAge(19);
        if(Adult){
            System.out.println("YOu are an adult");
        }
        
        for(int i = 0; i < 5; i++){
            printNames("dan", "rugarama",20);
        }
    };
}