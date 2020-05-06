package exercise;

public class OnlineViewer implements Observer{
	
	private String name;
	private Observable trainig;
	
	public OnlineViewer(String name) {
		this.name = name;
	}
	
	@Override
	public void update() {
		if(trainig == null) {
			System.out.println("There is no traing to watch!");
			return;
		}
		String newExercise = this.trainig.getUpdate();
		System.out.println(name+" is: " + newExercise);
	}

	@Override
	public void setTrainer(Observable training) {
		this.trainig = training;
	}

}
