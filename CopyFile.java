import java.io.*; 
import java.util.*; 
  
public class CopyFile { 
    
    public static void copyContent(File i, File j) 
        throws Exception 
    { 
        FileInputStream in = new FileInputStream(i); 
        FileOutputStream out = new FileOutputStream(j); 
  
        try { 
  
            int n; 
  
            // read() function to read the 
            // byte of data 
            while ((n = in.read()) != -1) { 
                // write() function to write 
                // the byte of data 
                out.write(n); 
            } 
        } 
        finally { 
            if (in != null) { 
  
                // close() function to close the 
                // stream 
                in.close(); 
            } 
            // close() function to close 
            // the stream 
            if (out != null) { 
                out.close(); 
            } 
        } 
        System.out.println("File Copied"); 
    } 
  
    public static void main(String[] args) throws Exception 
    { 
        Scanner sc = new Scanner(System.in); 
  
        // get the source file name 
        System.out.println("Enter the source filename from where you have to read/copy :"); 
        String i = sc.nextLine(); 
  
        // source file 
        File old = new File(i); 
  
        // get the destination file name 
        System.out.println("Enter the destination filename where you have to write/paste :"); 
        String j = sc.nextLine(); 
  
        // destination file 
        File new1 = new File(j); 
  
        // method called to copy the 
        // contents from x to y 
        copyContent(old, new1); 
    } 
}