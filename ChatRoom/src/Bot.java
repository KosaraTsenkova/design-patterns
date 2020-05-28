
public class Bot extends User{

	public Bot(ChatMediator mediator, String nickname) {
		super(mediator, nickname);
	}

	@Override
	public void send(String message) {
		//Bot can't send message
	}

	@Override
	public void recieve(String message) {
		//Bot can't recieve message
	}

}
