// This class contains my practice on java methods
public class TryingMethods{
   public static void main(String[] args) {

        TryingMethods n = new TryingMethods();

        System.out.println(n.dayOfTheWeek(6));

        n.mestAdmission(50);
        
        System.out.println(sumBelowThousand());

        sumEvenNumbers();
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
    public static int sumBelowThousand(){
        int i=0;
        int sum=0;
        while (i<1000) {
            sum=i+sum;
            i= i + 1;
        }
        return sum;
    }

    public static void sumEvenNumbers() {
      int sum=0;
      for(int i=12; i<103; i++){
        if (i%2==0){
            sum=i+sum;
        }  
      } 
      System.out.println(sum);
    }
}




    

