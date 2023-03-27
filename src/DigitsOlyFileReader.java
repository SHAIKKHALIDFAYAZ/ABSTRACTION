public class DigitsOlyFileReader extends AbstractFileReader{

    public DigitsOlyFileReader(String filePath) {
        super(filePath);
    }

    @Override
    protected String parseLine(String line) {
        return line.replaceAll("[^0-9]","");
    }
}
