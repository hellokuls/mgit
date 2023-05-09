package com.kuls;

import com.kuls.parse.CommandLineParse;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Main {
    public static void main(String[] args) {
        log.info("hello! Welcome to use mgit");
        CommandLineParse parse = new CommandLineParse();
        parse.execute(args);
    }
}