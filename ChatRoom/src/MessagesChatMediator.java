import java.util.ArrayList;
import java.util.List;

public class MessagesChatMediator implements ChatMediator{

	private List<User> users;
	
	public MessagesChatMediator() {
		this.users = new ArrayList<User>();
	}
	
	@Override
	public void sendMessage(String message, User user) {
		
		for(User u : this.users) {
			if(u != user) {
			u.recieve(message);
			}
		}
	}

	@Override
	public void addUser(User user) {
		this.users.add(user);
	}

	@Override
	public void removeUser(User user) {
			this.users.remove(user);
	}
}
