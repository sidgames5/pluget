package com.sidgames5.pluget.struct;

typedef Instance = {
	name:String,
	loader:String,
	mc_version:String,
	path:String,
	mods:Array<{
		name:String,
		version:String,
	}>
}
