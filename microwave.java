
public class microwave implements operationFacade {

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("The kitchen microwave is On");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("The kitchen microwave is Off");
	}

	@Override
	public void dim(int x) {
		if (x<=100 && x>=0)
		System.out.println("The kitchen microwave is On at "+ x + " percent power");
		else
			System.out.println("The not a proper microwave power");
	}

}
