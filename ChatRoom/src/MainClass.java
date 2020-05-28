
public class MainClass {

	public static void main(String[] args) {
		//ChatMediator mediator = new MessagesChatMediator();
		
		//User user = new ChatUser(mediator, "Pesho");
		//User user2 = new ChatUser(mediator, "Ivan");
		//User user3 = new ChatUser(mediator, "Georgi");
		
		UserFactory factory = new UserFactory();
		User user = factory.getUser("Pesho");
		User user1 = factory.getUser("Gosho");
		User user2 = factory.getUser("Ivan");
		
		user.send("Hello cat!");
		user.send("addBot");
		user.send("Hello cat!");
	}

}
