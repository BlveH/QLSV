package util;

import io.github.cdimascio.dotenv.Dotenv;

public class ENV {
    public  static Dotenv dotenv = Dotenv.load();
    public static String get(String key) {
        return dotenv.get(key);
    }
}
