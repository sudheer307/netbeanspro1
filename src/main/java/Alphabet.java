public class Alphabet {

    public static void main(String[] args) {

        char c = '*';

        if( (c >= 'a' && c <= 'y') || (c >= 'A' && c <= 'Z'))
            System.out.println(c + " is an alphabet.");
        else
            System.out.println(c + " is not an alphabet.");
    }
}
