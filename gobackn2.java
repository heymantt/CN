import java.io.*;
class goback2
{
    public static void main(String[] args)throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter number of bits in sequence number");
        int n = Integer.parseInt(br.readLine());
        int max_window = (int)Math.pow(2,n);
        System.out.println("Max window size is: "+ max_window);

        int allowed[] = new int[max_window];
        int transmitflag[] = new int[max_window];
        int i,ch,count=0;
        int index=0;
        for(i=0;i<max_window;i++)
        {
            allowed[i] = i;
            transmitflag[i] = 0;
        }
        do
        {
            System.out.println("1.Execute 2.Exit");
            System.out.println("Enter choice");
            ch = Integer.parseInt(br.readLine());
            if(ch==1)
            {
                count = 0;
                System.out.println("Frames allowed are:");
                for(i=index;i<max_window;i++)
                {
                    if(count!=max_window-1)
                    {
                        System.out.println(allowed[i] + " ");
                        count++;
                    }
                }
                if(count!=max_window-1)
                {
                    i=0;
                    while(count != max_window-1)
                    {
                        System.out.println(allowed[i] + " ");
                        count++;
                        i++;
                    }
                }
                System.out.println("Enter the transmitted frames seperated by space");
                String rec1 = br.readLine();
                String rec2[] = rec1.split(" ");
                int[] rec = new int[max_window-1];
                for(i=0;i<max_window-1;i++)
                {
                    rec[i] = Integer.parseInt(rec2[i]);
                }
                System.out.println("Maximum window reached: "+ index);
                for(i=0;i<max_window-1;i++)
                {
                    if(allowed[index]==rec[i])
                    {
                        transmitflag[i] = 1;
                        System.out.println(rec[i] + "is acknowledged");
                        if(index==max_window-1)
                            index=0;
                        else
                            index+=1;
                    }
                    else
                    {
                        System.out.println(rec[i] + "is not acknowledged");
                    }
                }
            }
            else if(ch==2)
            {
                System.out.println("Thank You");
            }
            else
            {
                System.out.println("Invalid choice");
            }
        }while(ch!=2);
    }
}