package com.jfbuilds.rw;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {

	public static void main(String[] args) throws IOException {

		Path fileDir = Paths.get("files");
        System.out.println(fileDir);

    }
}
