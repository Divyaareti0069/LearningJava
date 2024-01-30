package collect;

import java.io.IOException;

public class ThrowsKeyword {
void m()throws IOException {
	throw new IOException("input exception ocuured");
}
	public static void main(String[] args) throws IOException {
		
		ThrowsKeyword t=new ThrowsKeyword();
		try {
			t.m();
		}catch(Exception e) {
			System.out.println("exception handled");
		}
		System.out.println("code outside of the class");
		

	}

}
