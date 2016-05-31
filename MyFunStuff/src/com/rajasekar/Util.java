package com.rajasekar;

import java.io.IOException;
import java.net.InetAddress;
import java.util.HashMap;
import java.util.StringTokenizer;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Util {
	
	public static ConcurrentHashMap<String, String> map = new ConcurrentHashMap<>();

	public static void main(String[] args) throws IOException, InterruptedException {
		//System.out.println(InetAddress.getLocalHost().getHostName());
		//cmd /C start telent
		//java.lang.Runtime.getRuntime().exec("cmd /c start telent");
		Runtime.getRuntime().exec("cmd /c start  telnet 172.18.212.196 23");
	}

}
