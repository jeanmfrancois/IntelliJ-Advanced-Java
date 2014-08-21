import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Iterator;

public class Main {

	public static void main(String[] args) throws IOException {

		Path source = Paths.get("ReadingAndWriting/files/loremipsum.txt");
        System.out.println(source.getFileName());

        Path target = Paths.get("ReadingAndWriting/files/newfile.txt");
        System.out.println(target.getFileName());

        Charset charset = Charset.forName("US-ASCII");
        ArrayList<String> lines = new ArrayList<>();

        try(
                BufferedReader br = Files.newBufferedReader(source,charset);
        ) {
            String line = null;
            while ((line = br.readLine()) != null) {
                lines.add(line);
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        try(
                BufferedWriter bw = Files.newBufferedWriter(target, charset);
        ) {
           /*  Lambda in forEach
                lines.forEach(str -> {
                try {
                    bw.write(str + " JF..");
                } catch (IOException e) {
                    System.out.println(e.getMessage());
                }
            });*/

            Iterator<String> iterator = lines.iterator();

            while(iterator.hasNext()) {
                String s = iterator.next();
                s = s.toUpperCase();
                bw.append(s,0, s.length());
                bw.newLine();
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
