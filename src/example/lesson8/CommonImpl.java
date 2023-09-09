package example.lesson8;

import javax.security.auth.login.LoginException;

public class CommonImpl implements CommonI{
    @Override
    public void method1() throws OwnException {
        try {
            throw new LoginException("Errorr");
        } catch (LoginException e) {
            throw new OwnException("23213");
        }
    }

    public static void main(String[] args) throws OwnException {
        CommonImpl common = new CommonImpl();
        common.method1();
    }
}
