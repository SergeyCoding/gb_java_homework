package org.gb.exceptions.homework03;

public class TestPwd {
    String login;

    String pwd;

    String confirmPwd;

    public TestPwd(String login, String pwd, String confirmPwd) {
        this.login = login;
        this.pwd = pwd;
        this.confirmPwd = confirmPwd;
    }

    @Override
    public String toString() {
        return "[login=" + login + ", pwd=" + pwd + ", confirmPwd=" + confirmPwd + "]";
    }

}
