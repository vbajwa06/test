package montreal.vp;

public class Main {
    public static void main(String[] args)
    {
        int yearOfBirth = 1993;
        int currentyear = 2021;
        int span = currentyear - yearOfBirth;
        int months = span * 12;
        int days = months* 365;
        System.out.println( "age =" + span);
    }
}
