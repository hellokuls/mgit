package com.kuls.command;

import com.kuls.data.MgitData;
import picocli.CommandLine;

@CommandLine.Command(name = "init")
public class Init implements Runnable{


    @Override
    public void run() {
        System.out.println("mgit init running");
        MgitData.init();
    }
}
