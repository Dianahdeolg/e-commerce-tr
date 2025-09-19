public class SqueakyClean {

    public static String clean(String identifier) {
        StringBuilder result = new StringBuilder();
        boolean upperNext = false;

        for (char c : identifier.toCharArray()) {
            // 1) Va a quitar los espacios "_"
            if (c == ' ') {
                result.append('_');
                continue;
            }

            // 2) hace el metodo camelCase
            if (c == '-') {
                upperNext = true;
                continue;
            }

            // 3) Leetspeak
            switch (c) {
                case '4': c = 'a'; break;
                case '3': c = 'e'; break;
                case '0': c = 'o'; break;
                case '1': c = 'l'; break;
                case '7': c = 't'; break;
            }

            // 4) Solo letras
            if (!Character.isLetter(c)) {
                continue;
            }

            if (upperNext) {
                result.append(Character.toUpperCase(c));
                upperNext = false;
            } else {
                result.append(c);
            }
        }

        return result.toString();
    }
}
