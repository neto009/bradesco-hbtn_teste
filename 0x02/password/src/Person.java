public class Person {

    public boolean checkUser(final String user) {
        if (user == null) return false;
        return user.matches("^[A-Za-z0-9]{8,}$");
    }

    public boolean checkPassword(final String password) {
        if (password == null || password.length() < 8) return false;
        boolean hasUpper   = password.chars().anyMatch(Character::isUpperCase);
        boolean hasNumber  = password.chars().anyMatch(Character::isDigit);
        boolean hasSpecial = password.chars().anyMatch(ch -> !Character.isLetterOrDigit(ch));
        return hasUpper && hasNumber && hasSpecial;
    }
}