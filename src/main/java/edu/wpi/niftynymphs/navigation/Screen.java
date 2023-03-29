package edu.wpi.niftynymphs.navigation;

public enum Screen {
  ROOT("views/Root.fxml"),
  HOME("views/Home.fxml"),
  HELP("views/Help.fxml"),

  HELP_HOME("views/help/HelpHome.fxml"),
  SERVICE_REQUEST("views/ServiceRequest.fxml"),

  SIGNAGE("views/Signage.fxml");

  private final String filename;

  Screen(String filename) {
    this.filename = filename;
  }

  public String getFilename() {
    return filename;
  }
}
