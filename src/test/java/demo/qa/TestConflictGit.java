package demo.qa;

import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Selenide.*;

public class TestConflictGit {
    @Test
    void openChrome () {
        open("https://www.google.com");
    }
}
