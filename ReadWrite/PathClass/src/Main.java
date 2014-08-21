import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.LinkOption;
import java.nio.file.Path;

import java.nio.file.Paths;

public class Main {

	public static void main(String[] args) {

        Path path = Paths.get("PathClass/temp/loremipsum.txt");
        System.out.println(path);
        System.out.println(path.getFileName());
        System.out.println(path.getNameCount());
        System.out.println(path.getName(path.getNameCount()-2));

        try {
            Path realPath = path.toRealPath(LinkOption.NOFOLLOW_LINKS);
            Path absPath = path.toAbsolutePath();
            System.out.println(realPath);
            System.out.println(absPath);
        } catch (FileNotFoundException e) {
            System.out.println("File Does not exist");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("An IO exception occurred");
            e.printStackTrace();
        }

    }

}
