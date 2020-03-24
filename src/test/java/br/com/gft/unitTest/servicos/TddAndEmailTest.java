package br.com.gft.unitTest.servicos;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class TddAndEmailTest {
    @Test
    public void emailService() {
        EmailService emailService = new EmailService();
        EmailService test = Mockito.mock(EmailService.class);
        Mockito.when(test.send("mensagem de test", "marlonergondossantos@gmail.com")).thenReturn(true);
        Assert.assertEquals(true, test.send("mensagem de test", "marlonergondossantos@gmail.com"));
    }
}
