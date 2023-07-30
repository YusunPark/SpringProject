import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class JUnitTest {
    @DisplayName("1+2 = 3이다.") // 테스트 이름
    @Test // 테스트 메서드
    public void jnitTest() {
        int a = 1;
        int b = 2;
        int sum = 3;

        Assertions.assertEquals(a+b, sum); // 값이 같은지 확인
    }



}
