
public class Stove implements operationFacade {

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("The kitchen stove is On");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("The kitchen stove is Off");
	}

	@Override
	public void dim(int x) {
		// TODO Auto-generated method stub
		if (x<=500 && x>=0)
			System.out.println("The kitchen stove is On at "+ x + " degrees");
			else
				System.out.println("The not a proper stove temperature");
	}

}
