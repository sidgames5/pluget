package com.sidgames5.pluget;

class Version {
	public var major:Int = 0;
	public var minor:Int = 0;
	public var patch:Int = 0;

	public function new(major:Int, minor:Int, patch:Int) {
		this.major = major;
		this.minor = minor;
		this.patch = patch;
	}

	public function toString():String {
		return major + "." + minor + "." + patch;
	}
}
