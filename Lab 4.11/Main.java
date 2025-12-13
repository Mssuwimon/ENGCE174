import java.util.Scanner;

class Configuration {

    private final String theme;
    private final int fontSize;
    private final boolean darkMode;

    public Configuration(String theme, int fontSize, boolean darkMode) {
        this.theme = theme;
        this.darkMode = darkMode;

        if (fontSize < 10) {
            this.fontSize = 10;
        } else if (fontSize > 20) {
            this.fontSize = 20;
        } else {
            this.fontSize = fontSize;
        }
    }

    public Configuration(Configuration base, Configuration user) {
        this.theme = user.theme;
        this.darkMode = user.darkMode;
        this.fontSize = base.fontSize;
    }

    public void displaySettings() {
        System.out.println(
            "Theme: " + theme +
            ", Size: " + fontSize +
            ", Dark: " + darkMode
        );
    }
}

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String baseTheme = sc.nextLine();
        int baseSize = Integer.parseInt(sc.nextLine());
        boolean baseDark = Boolean.parseBoolean(sc.nextLine());

        Configuration baseConfig =
            new Configuration(baseTheme, baseSize, baseDark);

        String userTheme = sc.nextLine();
        int userSize = Integer.parseInt(sc.nextLine());
        boolean userDark = Boolean.parseBoolean(sc.nextLine());

        Configuration userConfig =
            new Configuration(userTheme, userSize, userDark);

        Configuration finalConfig =
            new Configuration(baseConfig, userConfig);

        finalConfig.displaySettings();
        sc.close();
    }
}
