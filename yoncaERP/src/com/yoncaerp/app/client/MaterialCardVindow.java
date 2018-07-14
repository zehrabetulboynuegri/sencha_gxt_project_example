package com.yoncaerp.app.client;

import java.util.Set;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.Widget;
import com.sencha.gxt.core.client.util.Margins;
import com.sencha.gxt.widget.core.client.ContentPanel;
import com.sencha.gxt.widget.core.client.PlainTabPanel;
import com.sencha.gxt.widget.core.client.TabPanel;
import com.sencha.gxt.widget.core.client.Window;
import com.sencha.gxt.widget.core.client.button.TextButton;
import com.sencha.gxt.widget.core.client.container.BoxLayoutContainer.BoxLayoutData;
import com.sencha.gxt.widget.core.client.container.BoxLayoutContainer.BoxLayoutPack;
import com.sencha.gxt.widget.core.client.container.CardLayoutContainer;
import com.sencha.gxt.widget.core.client.container.CssFloatLayoutContainer;
import com.sencha.gxt.widget.core.client.container.CssFloatLayoutContainer.CssFloatData;
import com.sencha.gxt.widget.core.client.container.HBoxLayoutContainer;
import com.sencha.gxt.widget.core.client.container.HBoxLayoutContainer.HBoxLayoutAlign;
import com.sencha.gxt.widget.core.client.container.HorizontalLayoutContainer;
import com.sencha.gxt.widget.core.client.container.HorizontalLayoutContainer.HorizontalLayoutData;
import com.sencha.gxt.widget.core.client.container.VerticalLayoutContainer;
import com.sencha.gxt.widget.core.client.container.VerticalLayoutContainer.VerticalLayoutData;
import com.sencha.gxt.widget.core.client.event.SelectEvent.SelectHandler;
import com.sencha.gxt.widget.core.client.form.CheckBox;
import com.sencha.gxt.widget.core.client.form.FieldLabel;
import com.sencha.gxt.widget.core.client.form.FieldSet;
import com.sencha.gxt.widget.core.client.form.StringComboBox;
import com.sencha.gxt.widget.core.client.form.TextField;
import com.sencha.gxt.widget.core.client.toolbar.LabelToolItem;
import com.sencha.gxt.widget.core.client.event.SelectEvent;
import com.sencha.gxt.widget.core.client.event.SelectEvent.SelectHandler;
import com.sencha.gxt.widget.core.client.info.Info;

public class MaterialCardVindow implements IsWidget {
	Util u = new Util();

	private ContentPanel panel;

	@Override
	public Widget asWidget() {
		// TODO Auto-generated method stub

		if (panel == null) {
			SelectHandler selectHandler = new SelectHandler() {
				@Override
				public void onSelect(SelectEvent event) {
					Info.display("Click", ((TextButton) event.getSource()).getText() + " clicked");
				}
			};
			panel = new ContentPanel();
			panel.setHeaderVisible(false);

			VerticalLayoutContainer vlc = u.createVlc(); // ust sol

			TextField kod = u.createText();
			TextField aciklama = u.createText();
			StringComboBox kartTuru = u.createCombo();
			StringComboBox Statusu = u.createCombo();
			kartTuru.setEmptyText("Ticari Mal");

			kartTuru.add("Ticari Mal");
			kartTuru.add("Hammadde");
			kartTuru.add("Yarı Mamül");
			kartTuru.add("Mamül");
			kartTuru.add("Tüketim Malı");
			Statusu.setEmptyText("Kullanımda");
			Statusu.add("Kullanımda");
			Statusu.add("Kullanım Dışı");
			TextField eIsKodu = u.createText();

			Widget customFieldLabel1 = u.createMyOwnFieldLabel(kod, "Kodu ", 37);
			Widget customFieldLabel2 = u.createMyOwnFieldLabel(aciklama, "Açıklaması ", 9);
			Widget customFieldLabel3 = u.createMyOwnFieldLabel(kartTuru, "Kart Türü", 20);
			Widget customFieldLabel4 = u.createMyOwnFieldLabel(Statusu, "Statüsü ", 10);

			HorizontalLayoutContainer customFieldLabel5 = u.createHlc();

			Widget customFieldLabel6 = u.createMyOwnFieldLabel(eIsKodu, "E-iş Kodu ", 15);

			u.yaninaEkle(customFieldLabel5, 1, -1, 0, 2, 0, 0, customFieldLabel3);
			u.yaninaEkle(customFieldLabel5, 1, -1, 0, 5, 0, 10, customFieldLabel4);

			u.altinaEkle(vlc, .5, -1, 10, 0, 0, 0, customFieldLabel1);
			u.altinaEkle(vlc, .6, -1, customFieldLabel2);
			u.altinaEkle(vlc, .5, .4, customFieldLabel5);
			u.altinaEkle(vlc, 1, .6, 0, 5, 0, 0, customFieldLabel6);

			VerticalLayoutContainer vlc2 = u.createVlc(); // ust sag

			HorizontalLayoutContainer ozelKod = u.createMyOwnButtonText("Özel Kod ", .6);
			HorizontalLayoutContainer yetkiKodu = u.createMyOwnButtonText("Yetki Kodu ", .6);
			HorizontalLayoutContainer grupKodu = u.createMyOwnButtonText("Grup Kodu ", .9);
			HorizontalLayoutContainer ikincilKodu = u.createMyOwnButtonText(" İkincil Kodu ", .9);
			u.altinaEkle(vlc2, .5, 0.25, 5, 0, 5, 0, ozelKod);
			u.altinaEkle(vlc2, .5, 0.25, 5, 0, 5, 0, yetkiKodu);
			u.altinaEkle(vlc2, .5, 0.25, 5, 0, 5, 0, grupKodu);
			u.altinaEkle(vlc2, .5, 0.25, 5, 0, 5, 0, ikincilKodu);

			HorizontalLayoutContainer hlc = u.createHlc();
			hlc.add(vlc, new HorizontalLayoutData(0.45, 1, new Margins(10)));
			hlc.add(vlc2, new HorizontalLayoutData(0.32, 1, new Margins(10)));
			hlc.add(new Image("/picasagray.png"), new HorizontalLayoutData(0.10, 1, new Margins(10))); // Sadece görsel
																										// amaçlı
																										// eklendi.
			hlc.add(new Image("/picasagray.png"), new HorizontalLayoutData(0.10, 1, new Margins(10))); // click özelliği
																										// yok.
			/* ******************************************************************* */
			VerticalLayoutContainer vlc3 = u.createVlc();

			vlc3.setBorders(false);
			HorizontalLayoutContainer ozelKod2 = u.createMyOwnButtonText("Özel Kod2 ", .6);
			HorizontalLayoutContainer ozelKod3 = u.createMyOwnButtonText("Özel Kod3 ", .6);
			HorizontalLayoutContainer ozelKod4 = u.createMyOwnButtonText("Özel Kod4 ", .6);
			HorizontalLayoutContainer ozelKod5 = u.createMyOwnButtonText("Özel Kod5 ", .6);

			HorizontalLayoutContainer grupKodu2 = u.createMyOwnButtonText("Grup Kod2 ", 1);
			HorizontalLayoutContainer grupKodu3 = u.createMyOwnButtonText("Grup Kod3 ", 1);
			HorizontalLayoutContainer grupKodu4 = u.createMyOwnButtonText("Grup Kod4 ", 1);
			HorizontalLayoutContainer grupKodu5 = u.createMyOwnButtonText("Grup Kod5 ", 1);

			HorizontalLayoutContainer markaKodu = u.createMyOwnButtonText("Marka Kodu ", 1);
			u.yaninaEkle(ozelKod2, 1, 0.25, 0, 0, 0, 20, grupKodu2);
			u.yaninaEkle(ozelKod3, 1, 0.25, 0, 0, 0, 20, grupKodu3);
			u.yaninaEkle(ozelKod4, 1, 0.25, 0, 0, 0, 20, grupKodu4);
			u.yaninaEkle(ozelKod5, 1, 0.25, 0, 0, 0, 20, grupKodu5);
			u.yaninaEkle(grupKodu2, 1, 0.25, 0, 0, 0, 25, markaKodu);

			u.altinaEkle(vlc3, .2, 0.25, 5, 0, 5, 0, ozelKod2);
			u.altinaEkle(vlc3, .2, 0.25, 5, 0, 5, 0, ozelKod3);
			u.altinaEkle(vlc3, .2, 0.25, 5, 0, 5, 0, ozelKod4);
			u.altinaEkle(vlc3, .2, 0.25, 5, 0, 5, 0, ozelKod5);

			HorizontalLayoutContainer hlcOrta = u.createHlc();

			hlcOrta.getElement().getStyle().setProperty("border", "1px solid " + "#a9a9a9");

			u.yaninaEkle(hlcOrta, .8, 1, vlc3);

			/* *************** */

			TabPanel tab = new TabPanel();

			HorizontalLayoutContainer tab1 = u.createHlc();

			FieldSet f1 = u.createFieldSet("KDV Oranı(%)");
			VerticalLayoutContainer vlcKdv = u.createVlc();
			vlcKdv.setBorders(false);
			TextField t1 = u.createText();
			TextField t2 = u.createText();
			TextField t3 = u.createText();
			Widget w1 = u.createMyOwnFieldLabel(t1, "Satın Alma", 5);
			Widget w2 = u.createMyOwnFieldLabel(t2, "Satış", 33);
			Widget w3 = u.createMyOwnFieldLabel(t3, "İade", 37);
			u.altinaEkle(vlcKdv, .9, 0.33, 5, 0, 5, 0, w1);
			u.altinaEkle(vlcKdv, .9, 0.33, w2);
			u.altinaEkle(vlcKdv, .9, 0.33, w3);
			f1.add(vlcKdv);

			FieldSet f2 = u.createFieldSet("Erişim Bilgileri");

			VerticalLayoutContainer vlcErisim = u.createVlc();
			CheckBox c1 = u.createCheckBox(" E-İş Ortamında Erişilebilir");
			CheckBox c2 = u.createCheckBox(" E-Mağazada Erişilebilir");
			CheckBox c3 = u.createCheckBox("Satış Noktalarında Erişilebilir");
			u.altinaEkle(vlcErisim, .9, 0.33, 5, 0, 5, 0, c1);
			u.altinaEkle(vlcErisim, .9, 0.33, c2);
			u.altinaEkle(vlcErisim, .9, 0.33, c3);

			f2.add(vlcErisim);

			FieldSet f3 = u.createFieldSet("Kullanım Yeri");

			VerticalLayoutContainer vlcKullanim = u.createVlc();

			CheckBox c4 = u.createCheckBox(" Malzeme Yönetimi");
			CheckBox c5 = u.createCheckBox(" Satınalma");
			CheckBox c6 = u.createCheckBox(" Satış ve Dağıtım");
			c4.setEnabled(true);
			u.altinaEkle(vlcKullanim, .9, 0.33, 5, 0, 5, 0, c4);
			u.altinaEkle(vlcKullanim, .9, 0.33, c5);
			u.altinaEkle(vlcKullanim, .9, 0.33, c6);

			f3.add(vlcKullanim);

			FieldSet f4 = u.createFieldSet("Tevkifat");

			VerticalLayoutContainer vlcTevkifat = u.createVlc();
			CheckBox c7 = u.createCheckBox(" Tevkifat Uygulansın");
			HorizontalLayoutContainer h1 = u.createCustomField("Satış Tevkifat Oranı");
			HorizontalLayoutContainer h2 = u.createCustomField("Satınalma Tevkifat Oranı");
			u.altinaEkle(vlcTevkifat, .9, 0.33, 5, 0, 5, 0, c7);
			u.altinaEkle(vlcTevkifat, .9, 0.33, h1);
			u.altinaEkle(vlcTevkifat, .9, 0.33, h2);

			f4.add(vlcTevkifat);
			u.yaninaEkle(tab1, 0.25, .8, 5, 5, 5, 5, f1);
			u.yaninaEkle(tab1, 0.25, .8, 5, 5, 5, 5, f2);
			u.yaninaEkle(tab1, 0.25, .8, 5, 5, 5, 5, f3);
			u.yaninaEkle(tab1, 0.25, .8, 5, 5, 5, 5, f4);
			tab.add(tab1, "Genel Bilgiler");
			tab.add(tab1, "Birimler");
			tab.add(tab1, "Malzeme Özellikleri");
			tab.add(tab1, "Fiyat Girişi");

			VerticalLayoutContainer container = u.createVlc();

			u.altinaEkle(container, 1, 0.25, 2, 0, 0, 0, hlc);
			u.altinaEkle(container, 1, 0.30, 2, 10, 10, 10, hlcOrta);
			u.altinaEkle(container, 1, 0.45, 2, 10, 10, 10, tab);
			panel.setButtonAlign(BoxLayoutPack.END); // Right

			panel.addButton(new TextButton("Kaydet", selectHandler));
			panel.addButton(new TextButton("Vazgeç", selectHandler));

			panel.setWidget(container);

		}

		return panel;
	}

}
