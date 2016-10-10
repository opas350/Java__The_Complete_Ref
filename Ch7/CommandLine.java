// Display all command-line arguments.
class CommandLine {
	public static void main(String args[]) {

		if(args.length == 0)
			System.out.println("Usage: java CommandLine arg1 arg2 ...");
		else
			for(int i=0; i<args.length; i++) 
				System.out.println("args[" + i + "]: " + args[i]);
	}
}
