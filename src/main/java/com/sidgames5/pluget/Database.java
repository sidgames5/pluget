package com.sidgames5.pluget;

import com.google.gson.JsonObject;
import com.netherbyte.svlib.Version;

import java.nio.file.Path;

public class Database {
    private static Path dataPath;
    private static Path dbPath;

    public static Path getDataPath() {
        if (dataPath == null) {
            if (System.getProperty("os.name").contains("windows")) { dataPath = Path.of(System.getProperty("user.home")).resolve("AppData/Pluget/"); }
            else if (System.getProperty("os.name").contains("mac")) { dataPath = Path.of(System.getProperty("user.home")).resolve("Application Support/Pluget/"); }
            else if (System.getProperty("os.name").contains("linux")) { dataPath = Path.of(System.getProperty("user.home")).resolve(".pluget/"); }
        }
        return dataPath;
    }

    public static Path getDbPath() {
        return getDataPath().resolve("db.json");
    }

    public static JsonObject getDatabase() {
        return null;
    }

    public static JsonObject getInstance(String name) {
        return null;
    }

    public static void registerInstance(String name, Loaders.Loader loader, Version version, Path path) {

    }
}
