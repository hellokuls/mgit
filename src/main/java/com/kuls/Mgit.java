package com.kuls;

import com.kuls.command.Init;
import picocli.CommandLine;

@CommandLine.Command(name = "mgit", subcommands = {
        Init.class
})
public class Mgit {
}
