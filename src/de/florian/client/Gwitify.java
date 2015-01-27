package de.florian.client;

import com.google.gwt.core.client.*;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootPanel;
import de.florian.client.HelloPolymer;

public class Gwitify implements EntryPoint {

  public void onModuleLoad() {

    HelloPolymer helloPolymer = new HelloPolymer();

    RootPanel.get().add(helloPolymer);

  }
}
