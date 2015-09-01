import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class ChangeListener implements ActionListener{
	Node i;
	Show3 sh;
	public ChangeListener(Node j, Show3 s) {
		i=j;
		sh=s;
	}
	public void actionPerformed(ActionEvent e) {
		sh.setPlace(i);
	}
}