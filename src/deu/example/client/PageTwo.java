package deu.example.client;

import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Label;

public class PageTwo extends Composite {
	private HorizontalPanel hPanel = new HorizontalPanel();
	public PageTwo(){
		
		initWidget(this.hPanel);
		FlexTable tbl = new FlexTable();
		tbl.setBorderWidth(1);
		Label lbl1 = new Label("Name");
		Label lbl2 = new Label("ID");
		Label lbl3 = new Label("Buchtitle");
		Label lbl4 = new Label("Datum");
		
		tbl.setWidget(0, 0, lbl1);
		tbl.setWidget(0, 1, lbl2);
		tbl.setWidget(1, 0, lbl3);
		tbl.setWidget(1, 1, lbl4);
		
		hPanel.add(tbl);
	}

	
		
}
