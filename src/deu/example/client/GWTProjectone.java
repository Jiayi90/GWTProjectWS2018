package deu.example.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class GWTProjectone implements EntryPoint {

	public void onModuleLoad() {
		VerticalPanel vPanel = new VerticalPanel();
		vPanel.setBorderWidth(1);
		
		Image img = new Image("images/ZOIlogo_Small.jpg");
		vPanel.add(img);
		
		Label myLbl= new Label("All Your Base Are Belong To Us!");
		vPanel.add(myLbl);
		
		HorizontalPanel hPanel = new HorizontalPanel();
		hPanel.setBorderWidth(1);
		
		TextBox txt1 = new TextBox();
		hPanel.add(txt1);
				
		
		Button btn1 = new Button("Touch me Please!");
		btn1.addClickHandler(new ClickHandler(){

			@Override
			public void onClick(ClickEvent event) {
				// TODO Auto-generated method stub
				
			}
			
		});
		hPanel.add(btn1);
		vPanel.add(hPanel);
		
		RootPanel.get().add(vPanel);
		

	}
}
