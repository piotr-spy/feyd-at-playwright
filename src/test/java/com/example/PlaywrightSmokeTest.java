package com.example;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PlaywrightSmokeTest {
  @Test
  void playwrightCanOpenAPage() {
    try (Playwright playwright = Playwright.create()) {
      Browser browser = playwright.chromium().launch(
        new BrowserType.LaunchOptions().setHeadless(
          Boolean.parseBoolean(System.getProperty("headless", "true"))));
      Page page = browser.newPage();

      page.setContent("<title>Playwright is ready</title>");

      assertEquals("Playwright is ready", page.title());
      browser.close();
    }
  }
}