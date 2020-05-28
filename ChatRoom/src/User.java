public abstract class User {
	
	protected  ChatMediator mediator;
	protected String name;
	public User(ChatMediator mediator, String nickname) {
		this.mediator = mediator;
		this.name = nickname;
	}
	
	public abstract void send(String message);
	public abstract void recieve(String message);
}
