
public class concreteTV implements TV {
	private channelIterator iterator;
	private String[] channels= {"FOX", "ESPN", "ABC", "CBS","TBS","NBC"};
	public concreteTV(){
		iterator = new Channel(channels);
	}
	public channelIterator getIterator() {
		return iterator;
	}

}
