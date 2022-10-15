import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class FileReaderNio {
  public static void main(String[] args) throws IOException {

    final Reader reader = new FileReader("aaa.a");

    try (reader) {
      reader.read();
    }
    finally {
      System.out.println("DId not enter in finally");
      reader.read();
    }

    reader.read();
  }
}