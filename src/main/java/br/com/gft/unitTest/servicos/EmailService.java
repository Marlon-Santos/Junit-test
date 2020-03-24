package br.com.gft.unitTest.servicos;

public class EmailService {
    public EmailService() {
    }

    public Boolean send(String msg, String email) {
        if (msg != null && email != null){
            return true;
        }
        return false;
    }
}
