module example.login.loginform.javafxloginform {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    opens example.login.loginform.javafxloginform to javafx.fxml;
    exports example.login.loginform.javafxloginform;
}