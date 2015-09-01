
public class Channel implements channelIterator{
	private String[] channel;
	private int position = 0;
	public Channel(String[] c){
		channel = c;
	}
	public boolean hasNext() {
		if(position + 1 <= channel.length){
			return true;
		}
		return false;
	}
	public void next() {
		position++;		
	}

	@Override
	public String currentChannel() {
		return channel[position];
	}

}
