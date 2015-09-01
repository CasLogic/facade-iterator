
public class testRemote {
	public static void main(String[] args) {
		concreteTV name = new concreteTV();
		channelIterator tv = name.getIterator();
	    while (tv.hasNext() ){
	      System.out.println(tv.currentChannel() );
	      tv.next();
	    }

	}

}
