package core_javaS8;

import java.io.FileInputStream;
import java.io.IOException;

public class count_v {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		int my_data;
		int count_a = 0;
		int count_e=0;
		int count_i=0;
		int count_o=0;
		int count_u=0;
		int total=0;
		
		FileInputStream b1 =new FileInputStream("D:\\textfile2.txt"); // object for source file
		
		while((my_data=b1.read())!=-1)	// read from file until end of data
		{
				
			total++;
			switch (my_data)
			{
				case 'a': {count_a++;break;}
				case 'e': {count_e++;break;}
				case 'i': {count_i++;break;}
				case 'o': {count_o++;break;}
				case 'u': {count_u++;break;}
			}
			//System.out.print((char)my_data);	// show on console
		
		}
		System.out.print("\n");
		System.out.println("Total Count:"+total);
		System.out.print("======================================\n");
		System.out.println(" CHAR A: "+count_a);
		System.out.println(" CHAR e: "+count_e);
		System.out.println(" CHAR i: "+count_i);
		System.out.println(" CHAR o: "+count_o);
		System.out.println(" CHAR u: "+count_u);
		System.out.print("======================================\n");
		
		b1.close();		// close open files
	}

}
