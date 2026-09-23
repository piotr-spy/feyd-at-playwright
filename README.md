# feyd-at-playwright

A minimal Java, Maven, JUnit 5, and Playwright test template.

## Prerequisites

This project needs Java 21 or newer and Maven 3.9 or newer. The current machine
already has both available.

## First run

From this directory, run:

```sh
mvn test
```

Maven downloads the Java dependencies. On the first test run, Playwright also
downloads the Chromium browser binary it needs. That can take a little longer
than later runs.

The smoke test lives in `src/test/java/com/example/PlaywrightSmokeTest.java`.
It opens Chromium in headless mode and verifies that a page title can be read.

## Useful commands

Run the tests with a visible browser window:

```sh
mvn test -Dheadless=false
```

Install all Playwright browser engines explicitly:

```sh
mvn exec:java -Dexec.mainClass=com.microsoft.playwright.CLI -Dexec.args="install"
```

The first command is all that is needed for this template. Use the explicit
install command when you later add Firefox or WebKit coverage.
