import org.junit.jupiter.api.Test;

public class TestScripts extends BaseTestClass {

    @Test
    public void Test1() {
        FirstPage page = new FirstPage(driver, wait);
        page.NavigateTo();
        page.Hover();

    }
}
