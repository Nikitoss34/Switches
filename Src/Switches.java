public class Switches {
    public static void main(String[] args) {
        String day = "Sunday";
        switch (day) {
            case "Sunday":
                System.out.println("Sunny Sunday");
                break;
            case "Monday":
                System.out.println("The hardest Monday");
                break;
            case "Tuesday":
                System.out.println("Tuesday");
                break;
            case "Wednesday":
                System.out.println("Wednesday");
                break;
            case "Thursday":
                System.out.println("Thursday");
                break;
            case "Friday":
                System.out.println("Friday");
                break;
            case "Saturday":
                System.out.println("saturday");
                break;
            default:
                System.out.println("null");
                break;
        }
    }
}
