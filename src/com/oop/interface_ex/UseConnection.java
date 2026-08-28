package com.oop.interface_ex;
interface Connection{
	void getCommand(String statement);
}
class Manager{
	private static class Statements implements Connection{

		@Override
		public void getCommand(String command) {
			System.out.println("Statement permits only static command");
			System.out.println(command);
		}
		
	}
	private static class PrepareStatements implements Connection{

		@Override
		public void getCommand(String command) {
			System.out.println("Prepared statements permits both static,dynamic commands");
			System.out.println(command);
		}
		
	}
	private static class CallStatements implements Connection{

		@Override
		public void getCommand(String command) {
			System.out.println("Callable statements permits static,dynamic and procedure command");
			System.out.println(command);
			
			
		}
		
	}
	static Connection getConnection(String statement) {
		if(statement.equals("statement")) {
			return new Statements();
		}
		else if(statement.equals("prepared")){
				return new PrepareStatements();
		}
		else if(statement.equals("callable")) {
			return new CallStatements();
		}
		return null;
	}
}


public class UseConnection {
	public static void main(String[] args) {
		Connection c=Manager.getConnection("statement");
		execute(c,"Get shiva with id:5");//static
		c=Manager.getConnection("prepared");
		execute(c,"get namw: ? with id: ? ");//placeholder
		c=Manager.getConnection("callable");
		execute(c,"Get procedure call(UserDetails)");//
		

	}
	private static void execute(Connection c ,String command) {
		c.getCommand(command);
	}
}
