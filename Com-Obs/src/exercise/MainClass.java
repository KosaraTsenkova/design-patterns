package exercise;

public class MainClass {
	public static void main(String[] args) {
		
		Observer obs1 = new OnlineViewer("Jim");
		Observer obs2 = new OnlineViewer("Jay");
		Observer obs3 = new OnlineViewer("Jack");
		Instructor instructor = new Instructor();
		Training training = new Training();  
		
		Command standUpCommand = new GetUpCommand(training);
		Command layDownCommand = new GetDownCommand(training);
		
		training.subscribe(obs1);
		training.subscribe(obs2);
		training.subscribe(obs3);
		
		instructor.setCommand(standUpCommand);
		instructor.doExercise(); 
		
		instructor.setCommand(layDownCommand);
		instructor.doExercise();
	}

}
