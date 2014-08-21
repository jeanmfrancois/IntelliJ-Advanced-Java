package com.jfbuilds.rw;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {

	public static void main(String[] args) throws IOException {

		Path fileDir = Paths.get("FileTree/files");
        System.out.println(fileDir);

        MyFileVisitor visitor = new MyFileVisitor();
        Files.walkFileTree(fileDir, visitor);
    }
}
