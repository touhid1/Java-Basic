public class StringBasic {
    public static void main(String[] args){
        String myName;
        myName =new String("Md Touhidul Islam");
        System.out.println(myName);
        prln(myName); //Output print using method
        prln("The number of  characters in your name Is : "+myName.length());
    }
    //This is Method
static void prln(Object anyObject){
    System.out.println(anyObject);
}
static void pr(Object anyObject){
    System.out.println(anyObject);
}
}
