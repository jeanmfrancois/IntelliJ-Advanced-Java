package com.jfbuilds.rw;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;

public  class FileFinder extends SimpleFileVisitor<Path> {

    private PathMatcher matcher;
    public ArrayList<Path> foundPaths = new ArrayList<>();

	public FileFinder(String pattern) {
        matcher = FileSystems.getDefault().getPathMatcher("glob:" + pattern); //("regex:" + pattern) if looking for regular expression pattern
	}
	
	@Override
	public FileVisitResult visitFile(Path file, BasicFileAttributes attrs)
			throws IOException {

        Path name = file.getFileName();
        System.out.println("Examining " + name);
        if (matcher.matches(name)) {
            foundPaths.add(file);
        }
        return FileVisitResult.CONTINUE;
	}
}
