import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AddressSplitter {

    private String streetName;
    private String streetNummer;


    public String getStreetName(String input) {

        if (input.contains(",")) {
            String[] output = input.split(",");
            Pattern pattern = Pattern.compile("^(\\d.*)");
            Matcher matcher = pattern.matcher(output[1]);
            streetName = (matcher.matches()) ? (output[0]).trim() : (output[1]).trim();

            return streetName;
        } else if (input.split(" ").length == 2 && !input.contains(",")) {
            String[] output = input.split(" ");
            Pattern pattern = Pattern.compile("^(\\d.*)");
            Matcher matcher = pattern.matcher(output[1]);
            streetName = (matcher.matches()) ? (output[0]).trim() : (output[1]).trim();

            return streetName;
        } else if (input.split(" ").length > 2 && !input.contains(",")) {
            String[] output = input.split(" ");
            int count = 0;
            int iterLast = 0;//first digit presence in the address

            for (int i = 0; i < output.length; i++) {
                if (output[i].matches("^[0-9]+$")) {
                    count = count + 1;
                    iterLast = i;
                }
            }
            if (count > 0) {
                if (iterLast == output.length - 1) {
                    String[] output1 = input.split(output[iterLast]);
                    streetName = output1[0].trim();
                }
                if (iterLast == 0) {
                    String[] output1 = input.split(output[iterLast]);
                    streetName = output1[1].trim();
                }
                if (iterLast > 0 && iterLast < output.length - 1) {
                    String[] output1 = input.split(output[iterLast]);
                    streetName = output1[0].trim();
                }
            }
        }
        return streetName;
    }


    public String getStreetNumber(String input) {

        if (input.contains(",")) {
            String[] output = input.split(",");
            Pattern pattern = Pattern.compile("^(\\d.*)");
            Matcher matcher = pattern.matcher(output[1]);
            streetNummer = (matcher.matches()) ? (output[1]).trim() : (output[0]).trim();

            return streetNummer;
        } else if (input.split(" ").length == 2 && !input.contains(",")) {
            String[] output = input.split(" ");
            Pattern pattern = Pattern.compile("^(\\d.*)");
            Matcher matcher = pattern.matcher(output[1]);
            streetNummer = (matcher.matches()) ? (output[1]).trim() : (output[0]).trim();

            return streetNummer;
        } else if (input.split(" ").length > 2 && !input.contains(",")) {
            String[] output = input.split(" ");
            int count = 0;
            int iterLast = 0;
            for (int i = 0; i < output.length; i++) {
                if (output[i].matches("^[0-9]+$")) {
                    count = count + 1;
                    iterLast = i;
                }
            }
            if (count > 0) {
                if (iterLast == output.length - 1) {
                    streetNummer = output[iterLast].trim();
                }
                if (iterLast == 0) {
                    streetNummer = output[iterLast].trim();
                }
                if (iterLast > 0 && iterLast < output.length - 1) {
                    String[] output1 = input.split(output[iterLast]);
                    streetNummer = (output[iterLast] + output1[1]).trim();
                }
            }


        }
        return streetNummer;
    }

}
