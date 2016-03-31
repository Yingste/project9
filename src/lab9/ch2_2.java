package lab9;

import java.io.File;

public class ch2_2
{
  public static void main(String[] args)
  {
    // Choose the directory you want to list.
    // If running in Eclipse, "." will just be the current project directory.
    // Use ".." to list the whole workspace directory, or enter a path to
    // some other directory.
    File rootDirectory = new File(".");

    System.out.println("\n Size:" + listAllFiles(rootDirectory));
  }
  
  /**
   * Print the names of all items in the hierarchy located under 
   * a given directory. If the given File object is not a directory, 
   * just prints the file's name.
   */
  public static long listAllFiles(File f)
  {
	  int size = 0;
    if (!f.isDirectory())
    {
      // Base case: f is a file, so just print its name
      System.out.println(f.length());
      size += f.length();
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
        
        size += listAllFiles(files[i]);
		
      }
    }
    return size;
  }
}
