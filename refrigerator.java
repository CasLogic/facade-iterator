
public class refrigerator implements operationFacade {

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("The kitchen refrigerator is On");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("The kitchen refrigerator is Off");
	}

	@Override
	public void dim(int x) {
		// TODO Auto-generated method stub
		if (x<=100 && x>=0)
			System.out.println("The kitchen refrigerator is On at "+ x + " percent power");
			else
				System.out.println("The not a proper microwave power");
	}

}
