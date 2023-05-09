package com.kuls.parse;

import com.kuls.Mgit;
import lombok.extern.slf4j.Slf4j;
import picocli.CommandLine;

@Slf4j
public class CommandLineParse implements Parse{
    @Override
    public void execute(String[] args) {
        log.info(String.join(",",args));
        new CommandLine(new Mgit()).execute(args);
    }
}
