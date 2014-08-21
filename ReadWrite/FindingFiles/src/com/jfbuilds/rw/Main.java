package com.jfbuilds.rw;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws IOException {

		Path fileDir = Paths.get("FindingFiles/files");

        FileFinder finder = new FileFinder("file3.txt");
        Files.walkFileTree(fileDir, finder);

        ArrayList<Path> foundFiles = finder.foundPaths;

        if (foundFiles.size() > 0) {
            foundFiles.forEach( p -> {
                try {
                    System.out.println(p.toRealPath(LinkOption.NOFOLLOW_LINKS));
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });
        } else {
            System.out.println("No files were found!");
        }
	}
	
}
