class randomClass {
    String name;
    String email;
    String phone;
}

public class ReinXIII{
    public static void main(String[] args){

        randomClass s1 = new randomClass();
        s1.name = "someone";
        s1.email = "someone@gmail.com";
        s1.phone = "9200000081";

        randomClass s2 = new randomClass();
        s2.name = "someone2";
        s2.email = "someone2@gmail.com";
        s2.phone = "9230000781";

        System.out.println(s1.name);
        System.out.println(s2.name);
    }
}