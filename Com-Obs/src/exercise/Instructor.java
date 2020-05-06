package exercise;

public class Instructor {
	
	private Command command;
	
	public Command getCommand() {
		return command;
	}
	
	public void setCommand(Command command) {
		this.command = command;
	}
	
	public void doExercise() {
		this.command.execute();
	}
}
