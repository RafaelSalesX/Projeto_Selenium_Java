package steps;

import io.cucumber.java.es.Dado;
import io.cucumber.java.it.Quando;
import io.cucumber.java.pt.Entao;
import pages.HomePage;
import suport.DriverManager;

public class DescontoStep {

    HomePage homePage = new HomePage(DriverManager.getDriver());

    @Dado("^que estou no site da qazando")
    public void acessar_site_qazando() {
        homePage.acessarAplicacao();
    }

    @Quando("eu preencho meu email")
    public void eu_preencho_meu_email() {
        homePage.preencherEmail();
    }

    @Quando("clico em ganhar cupom")
    public void clico_em_ganhar_cupom() {
        homePage.scrollDown();
        homePage.clicarBotao();
    }

    @Entao("eu vejo o codigo de desconto")
    public void eu_vejo_o_codigo_de_desconto() {
        homePage.verificaCodigoDesconto();
    }
}
