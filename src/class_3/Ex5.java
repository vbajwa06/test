package class_3;

public class Ex5 {
    public static void main(String[] args) {
        float c = 15;
        float f = 68.5f;
        float conversion = 9f/5;
        float celToFar = ((conversion)*c + 32);
        float farToCel = ((f-32)/conversion);
        System.out.println("the temp in Celcius =" + c +" and on farh the temp would be "+ celToFar);
        System.out.println("the temp in far =" + f +" and in cel the temp would be "+ farToCel);
    }
}
