public class q_11 {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please enter a character as a command line argument.");
            return;
        }

        char ch = args[0].charAt(0);

        if (Character.isDigit(ch)) {
            System.out.println("Value of digit: " + ch);
            System.out.println("Code point of digit: " + (int) ch);
        } else if (Character.isLetter(ch)) {
            if (Character.isLowerCase(ch)) {
                char upperCaseCh = Character.toUpperCase(ch);
                System.out.println("Converted to upper case: " + upperCaseCh);
            } else {
                System.out.println("Entered character is a letter but not in lowercase.");
            }
        } else {
            System.out.println("Entered character is neither a letter nor a digit.");
        }
    }
}
