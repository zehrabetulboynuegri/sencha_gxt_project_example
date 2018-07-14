package com.yoncaerp.app.client;

import com.google.gwt.user.client.ui.Widget;
import com.sencha.gxt.core.client.util.Margins;
import com.sencha.gxt.core.client.util.Padding;
import com.sencha.gxt.widget.core.client.container.HBoxLayoutContainer;
import com.sencha.gxt.widget.core.client.container.HorizontalLayoutContainer;
import com.sencha.gxt.widget.core.client.container.VerticalLayoutContainer;
import com.sencha.gxt.widget.core.client.button.TextButton;
import com.sencha.gxt.widget.core.client.container.BoxLayoutContainer.BoxLayoutData;
import com.sencha.gxt.widget.core.client.container.HBoxLayoutContainer.HBoxLayoutAlign;
import com.sencha.gxt.widget.core.client.container.HorizontalLayoutContainer.HorizontalLayoutData;
import com.sencha.gxt.widget.core.client.container.VerticalLayoutContainer.VerticalLayoutData;
import com.sencha.gxt.widget.core.client.form.CheckBox;
import com.sencha.gxt.widget.core.client.form.FieldLabel;
import com.sencha.gxt.widget.core.client.form.FieldSet;
import com.sencha.gxt.widget.core.client.form.StringComboBox;
import com.sencha.gxt.widget.core.client.form.TextField;
import com.sencha.gxt.widget.core.client.toolbar.LabelToolItem;

public class Util {
	protected Widget createMyOwnFieldLabel(Widget widget, String label, int marginLeft) {
		LabelToolItem labelToolItem = new LabelToolItem(label + ":");

		BoxLayoutData flex = new BoxLayoutData();
		flex.setFlex(1);
		flex.setMargins(new Margins(0, 0, 5, marginLeft));
		HBoxLayoutContainer row = new HBoxLayoutContainer(HBoxLayoutAlign.MIDDLE);
		row.setEnableOverflow(true);
		row.add(labelToolItem);
		row.add(widget, flex);

		return row;
	}

	protected HorizontalLayoutContainer createMyOwnButtonText(String label, double textWidth) {
		LabelToolItem labelToolItem = new LabelToolItem(label + ":");
		TextField text = createText();
		TextButton browse = new TextButton("...");

		browse.getElement().setAttribute("border-radius", "0px");
		HorizontalLayoutContainer browseText = createHlc();
		yaninaEkle(browseText, .5, -1, 3, 10, 0, 0, labelToolItem);
		yaninaEkle(browseText, textWidth, -1, text);
		yaninaEkle(browseText, .1, -1, browse);

		return browseText;
	}

	protected void altinaEkle(VerticalLayoutContainer vlc, double width, double height, int top, int right, int bottom,
			int left, HorizontalLayoutContainer EklenecekHlc) {

		vlc.add(EklenecekHlc, new VerticalLayoutData(width, height, new Margins(top, right, bottom, left)));
	}

	protected void altinaEkle(VerticalLayoutContainer vlc, double width, double height, int margin,
			HorizontalLayoutContainer EklenecekHlc) {

		vlc.add(EklenecekHlc, new VerticalLayoutData(width, height, new Margins(margin)));
	}

	protected void altinaEkle(VerticalLayoutContainer vlc, double width, double height, Widget wg) {

		vlc.add(wg, new VerticalLayoutData(width, height));
	}

	protected void altinaEkle(VerticalLayoutContainer vlc, double width, double height, int top, int right, int bottom,
			int left, Widget wg) {

		vlc.add(wg, new VerticalLayoutData(width, height, new Margins(top, right, bottom, left)));
	}

	protected void yaninaEkle(HorizontalLayoutContainer hlc, double width, double height, int top, int right,
			int bottom, int left, VerticalLayoutContainer EklenecekVlc) {

		hlc.add(EklenecekVlc, new HorizontalLayoutData(width, height, new Margins(top, right, bottom, left)));
	}

	protected void yaninaEkle(HorizontalLayoutContainer hlc, double width, double height, Widget eklenecekWg) {

		hlc.add(eklenecekWg, new HorizontalLayoutData(width, height));
	}

	protected void yaninaEkle(HorizontalLayoutContainer hlc, double width, double height, int top, int right,
			int bottom, int left, Widget eklenecekWg) {

		hlc.add(eklenecekWg, new HorizontalLayoutData(width, height, new Margins(top, right, bottom, left)));
	}

	protected void yaninaEkle(HorizontalLayoutContainer hlc, double width, double height, int margin,
			VerticalLayoutContainer EklenecekVlc) {

		hlc.add(EklenecekVlc, new HorizontalLayoutData(width, height, new Margins(margin)));
	}

	protected VerticalLayoutContainer createVlc() {
		VerticalLayoutContainer vlc = new VerticalLayoutContainer();
		vlc.getElement().getStyle().setProperty("border", "1px solid " + "#a9a9a9");
		return vlc;

	}

	protected HorizontalLayoutContainer createHlc() {
		HorizontalLayoutContainer hlc = new HorizontalLayoutContainer();
		// hlc.getElement().getStyle().setProperty("border", "1px solid " + "#a9a9a9");
		return hlc;
	}

	protected TextField createText() {
		TextField textField = new TextField();

		return textField;
	}

	protected StringComboBox createCombo() {

		return new StringComboBox();
	}

	protected FieldSet createFieldSet(String name) {
		FieldSet f = new FieldSet();
		f.setHeadingText(name);
		f.setBorders(true);
		return f;

	}

	protected CheckBox createCheckBox(String boxLabel) {
		CheckBox checkBox = new CheckBox();

		checkBox.setBoxLabel(boxLabel);
		return checkBox;
	}

	protected HorizontalLayoutContainer createCustomField(String label) {

		HorizontalLayoutContainer h1 = new HorizontalLayoutContainer();
		LabelToolItem labelToolItem = new LabelToolItem(label + ":");
		TextField t1 = new TextField();
		TextField t2 = new TextField();

		t1.setText("0");
		t2.setText("0");
		LabelToolItem labelToolItem2 = new LabelToolItem("  /");
		yaninaEkle(h1, .5, 1, labelToolItem);
		yaninaEkle(h1, .2, 1, t1);
		yaninaEkle(h1, .1, 1, labelToolItem2);
		yaninaEkle(h1, .2, 1, t2);
		return h1;

	}
}