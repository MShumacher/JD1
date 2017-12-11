package com.intexsoft.classwork.lection7.innerclass;

public class Page {
	private LoginFormData formData;

	// обязательно внутренний класс делать приват
	private class LoginFormData {
		private String login;
		private String password;

		public String getLogin() {
			return login;
		}

		public void setLogin(String login) {
			this.login = login;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

	}
}