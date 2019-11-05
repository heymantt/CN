//tcpheader

import java.util.*;

class tcp{
	public static void main(String[] args)
	{
		System.out.println("Enter the TCP header in Hex");
		
		Scanner sc= new Scanner(System.in);
		String hex=sc.next();
		System.out.println("source port:"+Integer.parseInt(hex.substring(0,4),16));
		System.out.println("Destination port:"+Integer.parseInt(hex.substring(4,8),16));
		System.out.println("Sequence Number:"+Integer.parseInt(hex.substring(8,16),16));
		System.out.println("Acknowlegement Number:"+Integer.parseInt(hex.substring(16,24),16));
		System.out.println("Header Length:"+Integer.parseInt(hex.substring(24,25),16)*4+"Bytes");
		int fb=Integer.parseInt(hex.substring(25,28));
		System.out.println("URH ACK PSH RST SYN FIN");
		
		for(int i=5;i>=0;i--)
		{
			System.out.println(" "+((fb>>i)&1)+" ");
		}
		System.out.println("Window Size:"+Integer.parseInt(hex.substring(28,32),16)+"Bytes");
		System.out.println("Checksum:"+Integer.parseInt(hex.substring(32,36),16));
		System.out.println("Urgent Pointer:"+Integer.parseInt(hex.substring(36,40),16));
	}
}