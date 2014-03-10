package com.randomtech.highpriority;
import android.util.Log;

public class Util {
	public static String logTag = "HighPriority";
	public static boolean debugging = true;

	public static void Log(String s){
		if(debugging){
			Log.i(logTag, s);
		}

	}
}