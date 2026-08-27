package webui.stepDefinitions;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import webui.pages.LogInOutPage;
import webui.pages.ProductDetailPage;
import static org.junit.Assert.assertTrue;
public class CartStep {

    LogInOutPage logInOutPage = new LogInOutPage();
    ProductDetailPage productDetailPage = new ProductDetailPage();

    @When("the user click a product")
    public void theUserClickAProduct() {
        logInOutPage.clickProduct();
    }

    @Then("the product details appears")
    public void theProductDetailsAppears() {
        assertTrue(productDetailPage.productDescTitleAppears());
        assertTrue(productDetailPage.productParagraphAppears());
    }

    @And("the add to cart button appear")
    public void theAddToCartButtonAppear() {
        assertTrue(productDetailPage.addToCartButtonAppears());
    }

    @When("the user clicks add to cart")
    public void theUserClickAddToCart() {
        productDetailPage.clickAddToCartButton();
    }
}
