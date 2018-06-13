import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadingProperties {
    public static void main(String[] args) throws IOException {
        String path = "src/test.properties";

        try {
            Properties prop = new Properties();
            FileInputStream fs = new FileInputStream(path);

            prop.load(fs);
            System.out.println(prop.getProperty("name"));
            System.out.println(prop.getProperty("course"));
        } catch (FileNotFoundException e) {
            System.out.println("Bestand niet gevonden, controleer locatie of pad");

    }

}
}
