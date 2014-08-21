import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class Main {

	public static void main(String[] args) throws IOException {
		
		Path source = Paths.get("ManageFiles/files/loremipsum.txt");
		System.out.println(source.getFileName());

        Path target = Paths.get("ManageFiles/files/newfile.txt");
        Files.copy(source,target, StandardCopyOption.REPLACE_EXISTING);

//        Path toDelete = Paths.get("ManageFiles/files/todelete.txt");
//        Files.delete(toDelete);

        Path newdir = Paths.get("ManageFiles/files/newdir");
        Files.createDirectory(newdir);

        Files.move(source, newdir.resolve(source.getFileName()),
                StandardCopyOption.REPLACE_EXISTING);
    }

}
