package tek.sdet.framework.config;

import org.openqa.selenium.WebDriver;

public interface Browser {
	public abstract WebDriver OpenBrowser(String url);
}
