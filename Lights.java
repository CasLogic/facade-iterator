
public class Lights implements operationFacade {
	public void turnOn() {
		System.out.println("The kitchen lights are On");		
	}
	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("The kitchen lights are Off");
	}
	@Override
	public void dim(int x) {
		if (x<=100 && x>=0)
		System.out.println("The kitchen lights are On and at " + x+ " percentage");
		else
			System.out.println("The not a proper microwave power");
	}
}
