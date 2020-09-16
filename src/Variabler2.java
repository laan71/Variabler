public class Variabler2 {

    /*
    //byte	1 byte	Stores whole numbers from -128 to 127
    //short	2 bytes	Stores whole numbers from -32,768 to 32,767
    //int	4 bytes	Stores whole numbers from -2,147,483,648 to 2,147,483,647
    //long	8 bytes	Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
    //float	4 bytes	Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
    //double	8 bytes	Stores fractional numbers. Sufficient for storing 15 decimal digits
    //boolean	1 bit	Stores true or false values
    //char	2 bytes	Stores a single character/letter or ASCII values
    */


    public static void main(String[] args) {

        byte x = -34;
        byte y = 25;

        System.out.println(x+y);

        short a = -4576;
        short b = -2096;

        System.out.println(a+b);

        int c = 25;
        int d = 123;

        System.out.println(c*d);

        long e = 3456649350007l;
        long f = -66600069450021l;

        System.out.println(e+f*c);

        float g = 12.8f;
        float h = 79.5f;

        System.out.println(g-f);

        double i = 45.5;
        double j = 10.7;

        System.out.println(i+j*2);

        boolean isJavaFun = true;
        boolean isAirTasty = false;
        System.out.println(isJavaFun);     // Outputs true
        System.out.println(isAirTasty);   // Outputs false

        char ch = 'k';
        char ch1 = 45;

        System.out.println(ch1 + " " + ch);
    }
}
