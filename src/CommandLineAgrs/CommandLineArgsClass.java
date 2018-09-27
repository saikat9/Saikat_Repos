package CommandLineAgrs;

public class CommandLineArgsClass {
	public static void main(String Args[]) {
        
        	switch (Args.length) {
        	case 0:
        		System.out.println("No Command line argument passed");
        		break;
        	default:
        		for (String ArgMem:Args) {
        		System.out.println("Hello"+" "+ArgMem);
        	}
			
			
		}
	}

}
