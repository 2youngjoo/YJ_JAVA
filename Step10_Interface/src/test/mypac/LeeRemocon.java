package test.mypac;

public class LeeRemocon implements Remocon{

	@Override
	public void up() {
		System.out.println("재미없는 채널 돌려라");
	}

	@Override
	public void down() {
		System.out.println("재밌는 채널 틀어라");
	}

}
