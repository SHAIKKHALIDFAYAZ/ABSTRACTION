import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        DigitsOlyFileReader digitsOlyFileReader=new DigitsOlyFileReader("message.txt");
        System.out.println(digitsOlyFileReader.readFile());
        System.out.println(digitsOlyFileReader.getPath());
    }
}