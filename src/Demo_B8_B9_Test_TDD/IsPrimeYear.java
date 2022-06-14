package Demo_B8_B9_Test_TDD;

public class IsPrimeYear {
    static boolean checkYear(int year)
    {
        return (((year % 4 == 0) && (year % 100 != 0)) ||
                (year % 400 == 0));
    }

    // Driver method
    public static void main(String[] args)
    {
        int year = 2000;
        System.out.println(checkYear(2000)? "Leap Year" :
                "Not a Leap Year" );
    }
}
