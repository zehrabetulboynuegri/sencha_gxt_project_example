package com.yoncaerp.app.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.RootPanel;

import com.sencha.gxt.widget.core.client.ContentPanel;

import com.sencha.gxt.widget.core.client.Window;

import com.sencha.gxt.widget.core.client.container.*;
import com.sencha.gxt.widget.core.client.container.BoxLayoutContainer.BoxLayoutPack;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class YoncaERP implements EntryPoint {
	/**
	 * The message displayed to the user when the server cannot be reached or
	 * returns an error.
	 */
	private static final String SERVER_ERROR = "An error occurred while "
			+ "attempting to contact the server. Please check your network " + "connection and try again.";

	/**
	 * Create a remote service proxy to talk to the server-side Greeting service.
	 */
	// private final GreetingServiceAsync greetingService =
	// GWT.create(GreetingService.class);

	/**
	 * This is the entry point method.
	 */

	@Override
	public void onModuleLoad() {

		MaterialCardVindow MCard = new MaterialCardVindow();

		Viewport vport = new Viewport();
		Window wind = new Window();
		wind.getElement().getStyle().setProperty("border", "1px solid " + "#008ed4");
		wind.setHeadingText("Malzeme Kartı");
		// wind.addStyleName("windBg");

		ContentPanel panel = new ContentPanel();

		panel = (ContentPanel) MCard.asWidget();

		wind.add(panel);

		vport.add(wind);
		wind.setShadow(false);
	
		wind.setModal(true);
		wind.setPixelSize(600, 400);
		wind.setMaximizable(true);
		RootPanel.get().add(vport);

	}

}
