import java.util.Scanner;

class Exer7{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Input a month number: ");
        int month_num = sc.nextInt();
        System.out.print("Input a year: ");
        int year = sc.nextInt();

        // Determine if it's a leap year
        boolean leap_year = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

        // Month names and days in month
        String[] months = {
            "January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December"
        };
        int[] daysInMonth = {
            31, (leap_year ? 29 : 28), 31, 30, 31, 30,
            31, 31, 30, 31, 30, 31
        };

        // Validate month input
        if (month_num < 1 || month_num > 12) {
            System.out.println("Invalid month number! Please enter between 1 and 12.");
        } else {
            System.out.println(months[month_num - 1] + " " + year + " has " + daysInMonth[month_num - 1] + " days");
        }

        sc.close();



        // ------------------------------------ My code --------------------
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Input a month number: ");
        // int month_num = sc.nextInt();
        // System.out.print("Input a year: ");
        // int year = sc.nextInt();

        // boolean leap_year;
        // int days;
        // String month;

        // if(year % 4 == 0){
        //     if(year % 100 == 0){
        //         if(year % 400 == 0){
        //             leap_year = true;
        //         }else{
        //             leap_year = false;
        //         }
        //     }else{
        //         leap_year = true;
        //     }
        // }else{
        //     leap_year = false;
        // }

        // switch (month_num) {
        //     case 1:
        //         days = 31;
        //         month = "January";
        //         break;
        //     case 2:
        //         if(leap_year){
        //             days = 29;
        //         }else{
        //             days = 28;
        //         }
        //         month = "February";
        //         break;
        //     case 3:
        //         days = 31;
        //         month = "March";
        //         break;
        //     case 4:
        //         days = 30;
        //         month = "April";
        //         break;
        //     case 5:
        //         days = 31;
        //         month = "May";
        //         break;
        //     case 6:
        //         days = 30;
        //         month = "June";
        //         break;
        //     case 7:
        //         days = 31;
        //         month = "July";
        //         break;
        //     case 8:
        //         days = 31;
        //         month = "August";
        //         break;
        //     case 9:
        //         days = 30;
        //         month = "September";
        //         break;
        //     case 10:
        //         days = 31;
        //         month = "October";
        //         break;
        //     case 11:
        //         days = 30;
        //         month = "November";
        //         break;
        //     case 12:
        //         days = 31;
        //         month = "December";
        //         break;
        //     default:
        //         System.out.println("Invalid month number! Please enter between 1 and 12.");
        //         return;
        // }

        // System.out.println(month + " " + year + " has " + days + " days");
        // sc.close();

    }
}










/*  
Write a Java program to find the number of days in a month.

Test Data
Input a month number: 2
Input a year: 2016
Expected Output :
February 2016 has 29 days
*/