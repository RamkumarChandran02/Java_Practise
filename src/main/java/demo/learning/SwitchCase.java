package demo.learning;

public class SwitchCase {
    public static void main(String[] args) {
        findtheDay("TH");

    }

    public static void findtheDay(String day)
    {

        String result = switch (day){
            case "M","W","F" -> "MWF";
            case "T","TH","S" -> "TTS";

            default -> {
                if(day.isEmpty())
                    yield "Please insert a valid day";
                else
                    yield "Looks like a Sunday";
            }
        };
    }


}
