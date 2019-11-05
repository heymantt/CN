//udp header

import java.util.*;

class udp{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the hex decimal Dump of UDP header");
		String hex=sc.next();
		System.out.println("Source Port:"+Integer.parseInt(hex.substring(0,4),16));
		System.out.println("Destination Port:"+Integer.parseInt(hex.substring(4,8),16));
		System.out.println("Length:"+Integer.parseInt(hex.substring(8,12),16));
		System.out.println("Checksum:"+Integer.parseInt(hex.substring(12,16),16));
		System.out.println();
	}
}