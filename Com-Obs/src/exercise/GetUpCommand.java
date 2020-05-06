package exercise;

public class GetUpCommand implements Command{
	
	private Training training;

	public GetUpCommand(Training training) {
		this.training = training;
	}
	
	@Override
	public void execute() {
		this.training.standUp();
	}
	
}
