package com.down.downloader.util;

import java.nio.file.Path;

public class FileFunctions {
    //make file directory
    public static String makeDirectory(String path) {
        String newPath = "/home/downloader/websites"+path;
        Path directory = Path.of(newPath);
        if(!directory.toFile().exists()) {
            directory.toFile().mkdir();
        }
        return directory.toString();
    }
}
