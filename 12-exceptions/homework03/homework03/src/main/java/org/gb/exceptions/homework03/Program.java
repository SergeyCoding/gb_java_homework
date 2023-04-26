package org.gb.exceptions.homework03;

/**
 * Создать статический метод который принимает на вход три параметра: login,
 * password и confirmPassword. Login должен содержать только латинские буквы,
 * цифры и знак подчеркивания. Длина login должна быть меньше 20 символов. Если
 * login не соответствует этим требованиям, необходимо выбросить
 * WrongLoginException.
 * 
 * Password должен содержать только латинские буквы, цифры и знак подчеркивания.
 * Длина password должна быть меньше 20 символов. Также password и
 * confirmPassword должны быть равны. Если password не соответствует этим
 * требованиям, необходимо выбросить WrongPasswordException.
 * 
 * WrongPasswordException и WrongLoginException - пользовательские классы
 * исключения с двумя конструкторами – один по умолчанию, второй принимает
 * сообщение исключения и передает его в конструктор класса Exception.
 * 
 * Обработка исключений проводится внутри метода. Используем multi-catch block.
 * Метод возвращает true, если значения верны или false в другом случае.
 */
public class Program {

	public static void main(String[] args) {

		System.out.println("Исключения в программировании и их обработка");
		System.out.printf("Урок 3. Продвинутая работа с исключениями в Java\n\n");

		var tpwd = new TestPwd("aa_b2zs", "aa_b2", "aa_b2");
		System.out.println(tpwd.toString() + " " + isPasswordCorrect(tpwd.login, tpwd.pwd, tpwd.confirmPwd));

		tpwd = new TestPwd("aa_b2ф", "aa_b2", "aa_b2");
		System.out.println(tpwd.toString() + " " + isPasswordCorrect(tpwd.login, tpwd.pwd, tpwd.confirmPwd));

		tpwd = new TestPwd("aa_b2", "aa_b29", "aa_b2");
		System.out.println(tpwd.toString() + " " + isPasswordCorrect(tpwd.login, tpwd.pwd, tpwd.confirmPwd));

		tpwd = new TestPwd("aa_b2aa_b2aa_b2aa_b2aa_b2aa_b2aa_b2aa_b2aa_b2aa_b2aa_b2aa_b2aa_b2", "aa_b2", "aa_b2");
		System.out.println(tpwd.toString() + " " + isPasswordCorrect(tpwd.login, tpwd.pwd, tpwd.confirmPwd));

	}

	private static boolean isPasswordCorrect(String login, String password, String confirmPassword) {

		boolean result = true;

		try {
			if (!validateStr(login)) {
				throw new WrongLoginException();
			}

			if (!password.equals(confirmPassword)) {
				throw new WrongPasswordException();
			}

			if (!validateStr(password)) {
				throw new WrongPasswordException();
			}

		} catch (WrongLoginException e) {
			result = false;
		} catch (WrongPasswordException e) {
			result = false;
		}

		return result;
	}

	private static boolean validateStr(String login) {
		if (login.length() >= 20) {
			return false;
		}

		for (var c : login.toCharArray()) {
			if (isLatinLetter(c) || c == '_' || Character.isDigit(c)) {
				continue;
			}

			return false;
		}

		return true;
	}

	public static boolean isLatinLetter(char c) {
		return (c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z');
	}
}
