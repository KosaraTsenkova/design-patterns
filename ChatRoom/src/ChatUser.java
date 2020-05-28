
public class ChatUser extends User {
	User bot;

	public ChatUser(ChatMediator mediator, String nickname) {
		super(mediator, nickname);
		mediator.addUser(this);
	}

	@Override
	public void send(String message) {

		System.out.println(this.name + " send message: " + message);
		mediator.sendMessage(message,this);  
		
		if(message.equals("addBot")) {
			if(bot != null) {
				System.out.println("There is already bot in the chat.");
			}else {
				bot = new Bot(mediator,"bot");
				System.out.println("Bot is added to the chat.");
			}
		}

		if(bot!=null&&message.contains("cat")) {
			mediator.removeUser(this);
			System.out.println(this.name + " user is removed. Cat is forbidden word!");
		}
	}

	@Override
	public void recieve(String message) {
			
		System.out.println(this.name + " recieved message: " + message);
	}

}
