public class Method {
    public static void main(String[] args){
        int firstFloatNumber =44;
        int secondFloatNumber =333;
        boolean success = myTest(firstFloatNumber,secondFloatNumber);
        System.out.println(success);

    }
    static public boolean myTest( int firstFloatNumber , int secondFloatNumber){
        boolean answer=firstFloatNumber>secondFloatNumber;
        return answer;
    }
}
