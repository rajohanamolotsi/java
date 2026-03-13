import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class Main {
    public static void main (String[] args) {
        LocalDateTime myObj = LocalDateTime.now();
        System.out.println(myObj);

        DateTimeFormatter myTime = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String myFormattedTime = myObj.format(myTime);
        System.out.println(myFormattedTime);


    }

}