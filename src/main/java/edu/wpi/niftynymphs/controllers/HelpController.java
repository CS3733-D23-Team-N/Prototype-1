package edu.wpi.niftynymphs.controllers;

import edu.wpi.niftynymphs.App;
import edu.wpi.niftynymphs.navigation.Screen;
import java.io.IOException;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.BorderPane;

public class HelpController {

  @FXML BorderPane pageContainer;

  public void navigate(final Screen screen) {
    final String filename = screen.getFilename();

    try {
      final var resource = App.class.getResource(filename);
      final FXMLLoader loader = new FXMLLoader(resource);
      pageContainer.setCenter(loader.load());
    } catch (IOException | NullPointerException e) {
      e.printStackTrace();
    }
  }

  public void initialize() {
    navigate(Screen.HELP_HOME);
  }
}
