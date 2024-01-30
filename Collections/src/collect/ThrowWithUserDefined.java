package collect;

public class ThrowWithUserDefined {

	
		public static void main(String[] args) {
			try {
				throw new UserDefineException("this is a user defined exception");
			}catch(UserDefinedException ud) {
				System.out.println("exception occured");
				
			}
			System.out.println(ud.getmessage());

		}

	}


