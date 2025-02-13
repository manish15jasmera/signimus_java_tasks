// Create an enum Day for days of the week, and write a program to determine if the day is a weekday or weekend.

public class DayTypeChecker {
  enum Day {
      SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
  }

  public static void main(String[] args) {
      checkDayType(Day.MONDAY);
      checkDayType(Day.SATURDAY);
      checkDayType(Day.SUNDAY);
  }

  public static void checkDayType(Day day) {
      switch (day) {
          case SATURDAY:
          case SUNDAY:
              System.out.println(day + " is a Weekend.");
              break;
          default:
              System.out.println(day + " is a Weekday.");
      }
  }
}
