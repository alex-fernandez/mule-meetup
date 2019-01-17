package utils;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Network {

	public static String getHostName() {
		InetAddress ip;
		String hostname;
		try {
			ip = InetAddress.getLocalHost();
			hostname = ip.getHostName();
		} catch (UnknownHostException e) {

			return "Unknown Hostname";
		}
		return hostname;
	}
}
