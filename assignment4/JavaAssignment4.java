package javaassignments.assignment4;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class JavaAssignment4 {
    public static void main(String[] args) throws ParseException {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter input size: ");
        int size=sc.nextInt();
        while(size-- > 0) {
            SimpleDateFormat simpleDateFormat=new SimpleDateFormat("dd-MM-yyyy");
            System.out.println("Enter registration date: ");
            Date registrationDate=simpleDateFormat.parse(sc.next());
            System.out.println("Enter kyc date: ");
            Date kycDate=simpleDateFormat.parse(sc.next());
            displayValidRange(registrationDate,kycDate);
        }
    }

    public static void displayValidRange(Date registrationDate,Date kycDate) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");
        if(registrationDate.after(kycDate)) {
            System.out.println("No range");
            return;
        }

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(kycDate);
        int kycYear = calendar.getWeekYear();
        calendar.setTime(registrationDate);
        calendar.set(Calendar.YEAR,kycYear);
        calendar.add(Calendar.DATE,-30);
        String startDate = simpleDateFormat.format(calendar.getTime());
        calendar.add(Calendar.DATE,60);
        String endDate;
        if(calendar.getTime().after(kycDate)){
            endDate = simpleDateFormat.format(kycDate);
        } else {
            endDate = simpleDateFormat.format(calendar.getTime());
        }
        System.out.println("Valid dates to fill kyc "+ startDate+" "+endDate);
    }
}