package hw_exceptions;

public class Main {
    static String VALIDATE_LOGIN_PASS = "ACDEFLGHIJKLMNOPQRSTUVWXYZ0123456789_";

    public static void main(String[] args) {
        System.out.print("1 Вариант где все ок - ");
        checkAuthorization("ACDEFal1", "3123", "3123");
        System.out.print("2 Вариант где не верный символ в логине - ");
        checkAuthorization("ACDEFal1!", "3123", "3123");
        System.out.print("3 Вариант где не верный символ в пароле - ");
        checkAuthorization("ACDEFal1", "31231!", "3123!");
        System.out.print("4 Вариант где длина логина не верная - ");
        checkAuthorization("ACDEFal1342342423423AaAaJHDSKsdkfsdfsdsdf3244563", "3123", "3123");
        System.out.print("5 Вариант где длина пароля не верная - ");
        checkAuthorization("ACDEFal1", "3123231231231231231231231231231235567678687665", "3123231231231231231231231231231235567678687665");
        System.out.print("6 Вариант где пароли не совпадают - ");
        checkAuthorization("ACDEFal1", "3123", "31231");
    }

    public static void checkAuthorization (String login, String password, String confirmPassword) {
        try {
            checkLogin(login);
            checkPassword(password, confirmPassword);
        } catch (WrongLoginException e) {
            System.out.println("Не верно введён логин: " + e.getMessage());
        } catch (WrongPasswordException e) {
            System.out.println("Не верно введён пароль: " + e.getMessage());
        }
    }

    public static void checkLogin (String login) throws WrongLoginException {
        for (char c : login.toCharArray()) {
            if (isValidate_Log_Pass(c)) {
                throw new WrongLoginException("Login может содержит в себе только латинские буквы, цифры и знак подчеркивания");
            }
        }
        if (isValidateLengthLogOrPass(login)) {
            throw new WrongLoginException("Login должен быть равен или меньше 20 символов.");
        }
    }

    public static void checkPassword (String password, String confirmPassword) throws WrongPasswordException {
        for (char c : password.toCharArray()) {
            if (isValidate_Log_Pass(c)) {
                throw new WrongPasswordException("Password может содержит в себе только латинские буквы, цифры и знак подчеркивания");
            }
        }
        if (isValidateLengthLogOrPass(password)) {
            throw new WrongPasswordException("Password должен быть равен или меньше 20 символов.");
        }

        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("Пароли не совпадают !!!");
        }
    }

    public static boolean isValidate_Log_Pass (char c) {
        return  (!VALIDATE_LOGIN_PASS.contains(String.valueOf(c).toUpperCase()));
    }

    public static boolean isValidateLengthLogOrPass (String logOrPass) {
        return logOrPass.length() > 20;
    }
}
