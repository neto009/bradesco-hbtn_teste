public class Pessoa {
    public static boolean emailValid(String email) {
        if (email == null | email.length() > 50 | !email.contains("@")) {
            return false;
        }
        return true;
    }
}