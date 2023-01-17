public class Main {
    public static void main(String[] args) {


    LandLine l1=new LandLine("123");
    LandLine l2=new LandLine("456");
    l1.recieveCall("546");
        System.out.println(l1.answerCall());
    }
}