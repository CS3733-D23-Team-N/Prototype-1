package edu.wpi.niftynymphs.navigation;

public enum Screen {
  ROOT("views/Root.fxml"),
  HOME("views/Home.fxml"),
  SERVICE_REQUEST("views/MealServiceRequest.fxml");

  private final String filename;

  Screen(String filename) {
    this.filename = filename;
  }

  public String getFilename() {
    return filename;
  }
}
