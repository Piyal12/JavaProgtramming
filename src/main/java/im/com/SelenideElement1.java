package im.com;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WrapsDriver;
import org.openqa.selenium.WrapsElement;
import org.openqa.selenium.interactions.Locatable;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public interface SelenideElement1 extends WebElement, WrapsDriver, WrapsElement, Locatable, TakesScreenshot {
@Nonnull
@CanIgnoreReturnValue
SelenideElement1 setValue(@Nullable CharSequence var1);
}
