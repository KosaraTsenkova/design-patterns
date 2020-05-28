
public class UserFactory extends AbstractFactory{
	
	ChatMediator mediator = new MessagesChatMediator();
	
	@Override
	User getUser(String name) {
		if(name.equals("bot")) {
			Bot bot = new Bot(mediator,"bot");
			return null;
		}
		else {
			User user = new ChatUser(mediator, name);
			return user;
		}
	}
}
