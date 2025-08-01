import java.util.Calendar;

public class printDate {
    public static void main(String[] args) {

        Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH);
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        System.out.print(year+"-");
        if(month<10) {
            System.out.print("0"+(month+1));
        } else {
            System.out.print((month+1));
        }
        System.out.print("-");
        if(day<10) {
            System.out.print("0"+day);
        } else {
            System.out.print(day);
        }
    }
}
