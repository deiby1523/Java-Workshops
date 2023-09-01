package test;

import enumeration.Continents;
import enumeration.Days;

public class TestEnum {
    public static void main(String[] args) {
//        System.out.println("Day one of the week: " + Days.MONDAY);
        indicateDayWeek(Days.MONDAY);

        System.out.println("America has " + Continents.AMERICA.getNumberCountries() +" countries");
    }

    private static void indicateDayWeek(Days day) {


        switch (day) {
            case MONDAY -> System.out.println("Today is monday!");
            case TUESDAY -> System.out.println("Today is Tuesday!");
            case WEDNESDAY -> System.out.println("Today is Wednesday!");
            case THURSDAY -> System.out.println("Today is Thursday!");
            case FRIDAY -> System.out.println("Today is Friday!");
            case SATURDAY -> System.out.println("Today is Saturday!");
            case SUNDAY -> System.out.println("Today is Sunday!");
            default -> System.out.println("incorrect data");
        }



    }
}
