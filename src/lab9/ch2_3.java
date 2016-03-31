package lab9;

import java.io.File;
import java.util.ArrayList;

public class ch2_3
{
	private static ArrayList<String> arr = new ArrayList<String>();
	public static void main(String[] args)
	{
		//ArrayList<String> arr = new ArrayList<String>();
		File rootDirectory = new File(".");
		getFile(rootDirectory);
		int i = 0;
		for (i = 0; i < arr.size() - 1; i++)
		{
			System.out.println(arr.get(i));
		}
	}
	
	
	public static ArrayList<String> getFile(File file)
	{
		// create an empty array list...
	    ArrayList<String> arr = new ArrayList<String>();
	    
	    // pass it into the recursive method
	    findFilesRec(file, arr);
	    
	    // and return the filled-up ArrayList
	    return arr;
	}
	
	private static void findFilesRec(File f, ArrayList<String> list)
	{
		//System.out.println(0);
		
		int size = 0;
	    if (!f.isDirectory())
	    {
	      // Base case: f is a file, so just print its name
	      //System.out.println(f.length());
	      if (f.getName().contains(".java"))
	      {
	    	  arr.add(f.getName());
	    	  //System.out.println(f.getName());
	      }
	    }
	    else
	    {
	      // Recursive case: f is a directory, so go through the 
	      // files and directories it contains, and recursively call
	      // this method on each one
	      //System.out.println("+ " + f.getName());
	      File[] files = f.listFiles();
	      for (int i = 0; i < files.length; ++i)
	      {
	        
	    	  findFilesRec(files[i], list);
			
	      }
	    }
	    
	}
}
