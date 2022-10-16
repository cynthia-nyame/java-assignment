// This class contains my practice on java methods
public class TryingMethods{
   public static void main(String[] args) {
        TryingMethods n = new TryingMethods();
        System.out.println(n.dayOfTheWeek(6));
        n.mestAdmission(50);
   }
   public String dayOfTheWeek(int weekDay) {
    switch (weekDay) {
        case 1:
            return "Monday";
        case 2:
            return "Tuesday";
        case 3:
            return "Wednesday";
        case 4:
            return "Thursday";
        case 5:
            return "Friday";
        case 6:
            return "Saturday";
        case 7:
            return "Sunday";
        default:
            return "Not Available";
    }
   }

   public void mestAdmission(int score) {
    if (score < 40){
        System.out.println("Failed");
    }
    else if (score <60){
        System.out.println("EIT");
    }
    else {
        System.out.println("Incubator");
    }
   }
}




    

