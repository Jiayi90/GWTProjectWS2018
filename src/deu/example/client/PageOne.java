package deu.example.client;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;



public class PageOne extends Composite {
	private VerticalPanel vPanel = new VerticalPanel();
	private TextBox txt1;
	private Label myLbl;

	public PageOne(){
		initWidget(this.vPanel);
		vPanel.setBorderWidth(1);
		
		Image img = new Image("images/ZOIlogo_Small.jpg");
		vPanel.add(img);
		
		this.myLbl= new Label("All Your Base Are Belong To Us!");
		vPanel.add(this.myLbl);
		
		HorizontalPanel hPanel = new HorizontalPanel();
		hPanel.setBorderWidth(1);
		
		this.txt1 = new TextBox();
		hPanel.add(this.txt1);
				
		
		Button btn1 = new Button("Touch me Please!");
/*		btn1.addClickHandler(new ClickHandler(){

			@Override
			public void onClick(ClickEvent event) {
				// TODO Auto-generated method stub
				
			}
			
		});
*/
		btn1.addClickHandler(new ButtonClickHandler());
		hPanel.add(btn1);
		vPanel.add(hPanel);
		
		
		PageTwo two = new PageTwo();
		vPanel.add(two);
	}
	private class ButtonClickHandler implements ClickHandler{

			@Override
			public void onClick(ClickEvent event) {
				String theText = txt1.getText();
				myLbl.setText(theText);	
			
			}
			
		

}
	}
