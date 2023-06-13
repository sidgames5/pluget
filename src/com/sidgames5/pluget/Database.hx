package com.sidgames5.pluget;

import com.sidgames5.pluget.struct.Instance;

class Database {
	private static var path:String;

	public static function getPath():String {
		if (path == null) {
			switch (Sys.systemName()) {
				case "Windows":
					path = "C:\\ProgramData\\Dagger\\db.json";
				case "Mac":
					path = "~/Library/Application Support/Dagger/db.json";
				case "Linux":
					path = "~/.dagger/db.json";
			}
		}
		return path;
	}

	public static function registerInstance(Name:String, Loader:String, Version:Version, Path:String) {
		var instance:Instance = {
			name: Name,
			loader: Loader,
			mc_version: Version.toString(),
			path: Path,
		};
	}
}
