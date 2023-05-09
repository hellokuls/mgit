package com.kuls.utils;

import lombok.extern.slf4j.Slf4j;

import java.io.File;

@Slf4j
public class FileUtils {

    public static void mkdir(String dirname){
        boolean mkdir = new File(dirname).mkdir();
//        if (mkdir){
//            log.info("");
//        }
    }
}
