package com.kuls.data;

import com.kuls.utils.FileUtils;

public class MgitData {

    final static String GIT_DIR = ".mgit";

    public static void init(){
        FileUtils.mkdir(GIT_DIR);
    }

}
