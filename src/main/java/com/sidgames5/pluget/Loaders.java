package com.sidgames5.pluget;

import com.netherbyte.svlib.Version;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Loaders {
    public static List<Loader> LOADERS = new ArrayList<>();

    public static final Loader FORGE = new Loader("forge", "modded", "loader", true, false);
    public static final Loader FABRIC = new Loader("fabric", "modded", "loader", true, false);
    public static final Loader LITELOADER = new Loader("liteloader", "modded", "loader", true, false);
    public static final Loader RIFT = new Loader("rift", "modded", "loader", true, false);
    public static final Loader MOHIST = new Loader("mohist", "modded", "server", true, true);
    public static final Loader CATSERVER = new Loader("catserver", "modded", "server", true, true);
    public static final Loader WATERFALL = new Loader("waterfall", "proxies", "server", false, true);
    public static final Loader BUNGEECORD = new Loader("bungeecord", "proxies", "server", false, true);
    public static final Loader VELOCITY = new Loader("velocity", "proxies", "server", false, true);
    public static final Loader PAPER = new Loader("paper", "servers", "server", false, true);
    public static final Loader PURPUR = new Loader("purpur", "servers", "server", false, true);
    public static final Loader SPONGE = new Loader("sponge", "servers", "server", false, true);
    public static final Loader VANILLA = new Loader("vanilla", "vanilla", "loader", false, false);

    public static final Version[] STABLE_VERSIONS = {
            Version.parse("1.0"),
            Version.parse("1.1"),
            Version.parse("1.2.1"),
            Version.parse("1.2.2"),
            Version.parse("1.2.3"),
            Version.parse("1.2.4"),
            Version.parse("1.2.5"),
            Version.parse("1.3.1"),
            Version.parse("1.3.2"),
            Version.parse("1.4.2"),
            Version.parse("1.4.4"),
            Version.parse("1.4.5"),
            Version.parse("1.4.6"),
            Version.parse("1.4.7"),
            Version.parse("1.5.1"),
            Version.parse("1.5.2"),
            Version.parse("1.6.1"),
            Version.parse("1.6.2"),
            Version.parse("1.6.4"),
            Version.parse("1.7.2"),
            Version.parse("1.7.3"),
            Version.parse("1.7.4"),
            Version.parse("1.7.5"),
            Version.parse("1.7.6"),
            Version.parse("1.7.7"),
            Version.parse("1.7.8"),
            Version.parse("1.7.9"),
            Version.parse("1.7.10"),
            Version.parse("1.8"),
            Version.parse("1.8.1"),
            Version.parse("1.8.2"),
            Version.parse("1.8.3"),
            Version.parse("1.8.4"),
            Version.parse("1.8.5"),
            Version.parse("1.8.6"),
            Version.parse("1.8.7"),
            Version.parse("1.8.8"),
            Version.parse("1.8.9"),
            Version.parse("1.9"),
            Version.parse("1.9.1"),
            Version.parse("1.9.2"),
            Version.parse("1.9.3"),
            Version.parse("1.9.4"),
            Version.parse("1.10"),
            Version.parse("1.10.1"),
            Version.parse("1.10.2"),
            Version.parse("1.11"),
            Version.parse("1.11.1"),
            Version.parse("1.11.2"),
            Version.parse("1.12"),
            Version.parse("1.12.1"),
            Version.parse("1.12.2"),
            Version.parse("1.13"),
            Version.parse("1.13.1"),
            Version.parse("1.13.2"),
            Version.parse("1.14"),
            Version.parse("1.14.1"),
            Version.parse("1.14.2"),
            Version.parse("1.14.3"),
            Version.parse("1.14.4"),
            Version.parse("1.15"),
            Version.parse("1.15.1"),
            Version.parse("1.15.2"),
            Version.parse("1.16"),
            Version.parse("1.16.1"),
            Version.parse("1.16.2"),
            Version.parse("1.16.3"),
            Version.parse("1.16.4"),
            Version.parse("1.16.5"),
            Version.parse("1.17"),
            Version.parse("1.17.1"),
            Version.parse("1.18"),
            Version.parse("1.18.1"),
            Version.parse("1.18.2"),
            Version.parse("1.19"),
            Version.parse("1.19.1"),
            Version.parse("1.19.2"),
            Version.parse("1.19.3"),
            Version.parse("1.19.4"),
            Version.parse("1.20"),
            Version.parse("1.20.1"),
    };
    public static final Version[] SNAPSHOT_VERSIONS = {
            Version.parse("23w12a"),
            Version.parse("23w13a"),
            Version.parse("23w13a_or_b"),
            Version.parse("23w14a"),
            Version.parse("23w16a"),
            Version.parse("23w17a"),
            Version.parse("23w18a"),
            Version.parse("1.20-pre1"),
            Version.parse("1.20-pre2"),
            Version.parse("1.20-pre3"),
            Version.parse("1.20-pre4"),
            Version.parse("1.20-pre5"),
            Version.parse("1.20-pre6"),
            Version.parse("1.20-pre7"),
            Version.parse("1.20-rc1"),
            Version.parse("1.20.1-rc1"),
    };

    public static Loader get(String name) {
        for (Loader loader : LOADERS) {
            if (Objects.equals(loader.name, name)) return loader;
        }
        return null;
    }

    public static class Loader {
        public final String name;
        public final String category;
        public final String type;
        public final boolean supportsMods;
        public final boolean supportsPlugins;

        public Loader(String name, String category, String type, boolean supportsMods, boolean supportsPlugins) {
            this.name = name;
            this.category = category;
            this.type = type;
            this.supportsMods = supportsMods;
            this.supportsPlugins = supportsPlugins;
            LOADERS.add(this);
        }
    }
}
