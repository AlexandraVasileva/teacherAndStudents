public class Human{

	String name;
	String state;
	String connection;
	
	void dataPrint(){

		String data = String.format("Hello! My name is %s. I am a %s of %s.", name, state, connection);
		System.out.println(data);

	}

	Human (String myName, String myState){
		name = myName;
		state = myState;
	}

}
