
public class homeControl {
	private operationFacade lights;
	private operationFacade microwave;
	private operationFacade stove;
	private operationFacade refrigerator;
	public homeControl(){
		lights = new Lights();
		microwave = new microwave();
		stove = new Stove();
		refrigerator = new refrigerator();
	}
	public void lightsOn(){
		lights.turnOn();
	}
	public void microwaveOn(){
		microwave.turnOn();
	}
	public void stoveOn(){
		stove.turnOn();
	}
	public void refrigeratorOn(){
		refrigerator.turnOn();
	}
	public void lightsOff(){
		lights.turnOff();
	}
	public void microwaveOff(){
		microwave.turnOff();
	}
	public void stoveOff(){
		stove.turnOff();
	}
	public void refrigeratorOff(){
		refrigerator.turnOff();
	}
	public void lightsDimmed(int x){
		lights.dim(x);
	}
	public void microwaveDimmed(int x){
		microwave.dim(x);
	}
	public void stoveDimmed(int x){
		stove.dim(x);
	}
	public void refrigeratorDimmed(int x){
		refrigerator.dim(x);
	}
}
