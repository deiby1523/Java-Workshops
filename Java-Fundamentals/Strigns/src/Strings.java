public class Strings {
    public static void main(String[] args) {

        // String is not a primitive type
            String name = "Deiby"; // name is an object or instance of the String class

        //  Often used methods
        //  name.length() Returns the length of a string
        //  name.charAt(0) Returns the position of a character in a string in this case it should return 'D'.
        //  name.substring(0,5) Returns a substring, where X is the starting index and Y is the number of characters to extract.
        //  name.equals("Deiby") Two strings are compared, if they are the same it returns true and if they are different it returns false. Case-sensitive.
        //  name.equals("DEIBY") The same that previous method but is not Case-Sensitive.


        System.out.println("My name is " + name);

        System.out.println("My name has " + name.length() + " letters");

        System.out.println("The first letter of the name " + name + " is " + name.charAt(0));

        System.out.println("And the last letter of my name is " + name.charAt(name.length()-1));


        String phrase = "Today is a nice day to learn Java";
        String phraseSummary = phrase.substring(0,19);

        System.out.println(phraseSummary);


        String student1, student2;

        student1 = "David";
        student2 = "david";

        System.out.println("equals method = " + student1.equals(student2));
        System.out.println("equalsIgnoreCase method = " + student1.equalsIgnoreCase(student2));
    }
}
