package com.wipro.setdemo;
/*import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
public class datetime {
		public static void main(String[] args) {
        
        LocalDate specificDate = LocalDate.of(2023, 11, 1);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String Date = specificDate.format(formatter);
       System.out.println("Formatted Date: " + Date);
    }

}*/
/*
import java.time.LocalDate;

public class datetime {

    public static int getAge(LocalDate birthDate) {
        LocalDate currentDate = LocalDate.now();

        int age = currentDate.getYear() - birthDate.getYear();

        if (currentDate.getMonthValue() < birthDate.getMonthValue() ||
            (currentDate.getMonthValue() == birthDate.getMonthValue() &&
             currentDate.getDayOfMonth() < birthDate.getDayOfMonth())) {
            age--;
        }
        return age;
    }

    public static void main(String[] args) {
        LocalDate birthDate = LocalDate.of(2001, 11, 15);
        int age = getAge(birthDate);
        System.out.println("Age of person born on " + birthDate + ": " + age + " years");
    }
}*/

/*
import java.time.LocalDate;

public class datetime {

    public static void getDateDiff(LocalDate dt1, LocalDate dt2) {
        LocalDate Date1;
        LocalDate endDate;

        if (dt1.isAfter(dt2)) 
        {
            Date1 = dt2;
            endDate = dt1;
        } else {
            Date1 = dt1;
            endDate = dt2;
        }

        int years = endDate.getYear() - Date1.getYear();
        int months = endDate.getMonthValue() - Date1.getMonthValue();
        int days = endDate.getDayOfMonth() - Date1.getDayOfMonth();

        if (days < 0) {
            months--;
            days += Date1.lengthOfMonth();
        }

        if (months < 0) {
            years--;
            months += 12;
        }

        System.out.println(years + " years, " + months + " months, and " + days + " days.");
    }

    public static void main(String[] args) {
        LocalDate date1 = LocalDate.of(2024, 12, 25);
        LocalDate date2 = LocalDate.of(2025, 1, 6);
        getDateDiff(date1, date2);

       
    }
}
*/
import java.time.LocalDate;

public class datetime {

    public static boolean isLeap(LocalDate date) {
        return date.isLeapYear();
    }

    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2024, 2, 1);
        System.out.println(date.getYear() + " a leap year? " + isLeap(date));
    }
}


