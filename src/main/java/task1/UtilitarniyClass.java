package task1;
import java.time.DayOfWeek;
import java.time.LocalDate;

public class UtilitarniyClass {

    public static String getNextMonday(String date){
        String []dmy = date.split("\\.");
        try {
            for(int i = 0; i < 7; i++) {
                LocalDate ld = LocalDate.of(Integer.parseInt(dmy[2]),
                        Integer.parseInt(dmy[1]),
                        Integer.parseInt(dmy[0]) + i);
                if (DayOfWeek.from(ld).name().equals("MONDAY")) {
                    return (Integer.parseInt(dmy[0]) + i) +"."+dmy[1]+"."+dmy[2];
                }
            }
            throw new Exception("must be MONDAY in the week");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "";
    }
}
