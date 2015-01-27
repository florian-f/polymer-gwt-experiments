package de.florian.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;


public class HelloPolymer extends Composite
{
  interface MyUiBinder extends UiBinder<Widget, HelloPolymer> {}

  private static MyUiBinder uiBinder = GWT.create(MyUiBinder.class);

  public HelloPolymer() {
    initWidget(uiBinder.createAndBindUi(this));
  }
}
