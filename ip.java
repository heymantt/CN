//ip header

import java.util.*;

class ip{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the hex Decimal Dump of Ip header");
		String hex=sc.next();
		
		System.out.println("Version:"+Integer.parseInt(hex.substring(0,1),16));
		int hlen=Integer.parseInt(hex.substring(1,2),16);
		hlen=hlen*4;
		
		System.out.println("Header:"+hlen);
		
		int fb=Integer.parseInt(hex.substring(2,4),16);
		System.out.println("service Type:");
		System.out.println("X X X D T R C X");
		for(int i=7;i>=0;i--)
		{
			System.out.println(" "+((fb>>i)&1)+" ");
		}
		System.out.println("Total Length:"+Integer.parseInt(hex.substring(4,8),16));
		System.out.println("ID:"+Integer.parseInt(hex.substring(8,12),16));
		
		int decimal=Integer.parseInt(hex.substring(12,16),16);
		String bin= Integer.toBinaryString(decimal);
		System.out.println("Flag Bits:X D M");
		System.out.println("Flag Bits:"+bin.substring(0,2));
		
		int offset=Integer.parseInt(bin.substring(2,15),2);
		
		System.out.println("Time to Live:"+Integer.parseInt(hex.substring(16,18),16));
		
		int protocol=Integer.parseInt(hex.substring(18,20),16);
		
		if(protocol==17)
		{
			System.out.println("Protocol: UDP");
		}
		else if(protocol==6)
		{
			System.out.println("Protocol TCP");
		}
		System.out.println("CheckSum:"+Integer.parseInt(hex.substring(20,24),16));
		
		System.out.println("Source IP:"+Integer.parseInt(hex.substring(24,26),16)+"."+Integer.parseInt(hex.substring(26,28),16)+"."+Integer.parseInt(hex.substring(28,30),16)+"."+Integer.parseInt(hex.substring(30,32),16));
		
		System.out.println("Destination IP:"+Integer.parseInt(hex.substring(32,34),16)+"."+Integer.parseInt(hex.substring(34,36),16)+"."+Integer.parseInt(hex.substring(36,38),16)+"."+Integer.parseInt(hex.substring(38,40),16));
	}
}
	