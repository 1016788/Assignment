package in.yash.string;

public class SplitFunction {
	public static void main(String args[])
    {
        String str = "prathamesh.patil@gmail.com";
        String[] string = str.split("@", 2);
  
        for (String a : string)
            System.out.println(a);
    }

}
