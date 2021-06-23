package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n= sc.nextInt();
	int k=sc.nextInt();
	int ar[]=new int[n];
	for(int i=0;i<n;i++)
	    ar[i]=sc.nextInt();

	//The main logic of the program is from here:
	int f = (int)Math.floor(n/k);
	int count=0;

	for(int i=0;i<n;i++)
    {
        int occur=1;
        for(int j=i+1;j<n;j++)
        {
            if(ar[i]==ar[j])
            {
                occur++;
                for(int m=j;m<n-1;m++)
                {
                    ar[m]=ar[m+1];
                }
                n--;
            }
        }
        if(occur==f)
            count++;
    }
	System.out.println(count);
    }
}
