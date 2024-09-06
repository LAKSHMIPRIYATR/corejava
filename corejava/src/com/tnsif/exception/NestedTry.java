package com.tnsif.exception;

public class NestedTry {
	public static void check()
	{
		String str="tns";
		int arr[]=null;
		int y=6;
		try
		{
		 try {
			//System.out.println(arr[0]);
		System.out.println(str.charAt(y));
			}
		 catch(StringIndexOutOfBoundsException e)
		 {
			 System.out.println("exception caought "+e.getMessage());
			
		 }
		}
		 catch(StringIndexOutOfBoundsException e)
		 {
			 System.out.println("exception caought null pointer"+e.getMessage());
			
		}
	}

}
