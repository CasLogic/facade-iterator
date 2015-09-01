
public class FacadeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		homeControl me = new homeControl();
		me.lightsOn();
		me.microwaveOff();
		me.stoveDimmed(450);
		me.refrigeratorOn();
	}

}
