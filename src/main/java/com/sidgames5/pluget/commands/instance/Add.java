package com.sidgames5.pluget.commands.instance;


import com.netherbyte.svlib.Version;
import com.sidgames5.pluget.Database;
import com.sidgames5.pluget.Loaders;

import java.nio.file.Path;
import java.util.Objects;

public class Add {

    public static void execute(String[] args) {
        String name = args[2];
        Loaders.Loader loader = Loaders.get(args[3]);
        Version version = Version.parse(args[4]);
        Path path;
        if (Objects.equals(args[4], ".minecraft")) path = Path.of(System.getProperty("user.home")).resolve("AppData/.minecraft/");
        else path = Path.of(args[4]);

        Database.registerInstance(name, loader, version, path);
    }
}
