package exception;

import java.io.IOException;

public class Checkedthrows {

	public static void m1() throws IOException{
		
		throw new IOException("IO");
		
		
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		m1();
	}
}
