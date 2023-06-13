package com.sidgames5.pluget;

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
}
