package exercise;

public class GetDownCommand implements Command{

	private Training training; 
	
	public GetDownCommand(Training training) {
		this.training = training;
	}
	
	@Override
	public void execute() {
		this.training.layDown();
	}

}
