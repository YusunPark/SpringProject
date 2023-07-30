import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class JunitCycleTest {
    @BeforeAll // 전체 테스트를 시작전 1회 실행하므로 메서드는 static선언
    static void beforeAll() {
        System.out.println("@BeforeAll");
    }

    @BeforeEach // 테스트 케이스 시작하기 전마다 실행
    public void beforeEach() {
        System.out.println("@BeforeEach");
    }

    @Test
    public void test1( ){
        System.out.println("test1");
    }

    @Test
    public void test2( ){
        System.out.println("test2");
    }

    @Test
    public void test3( ){
        System.out.println("test3");
    }

    @AfterAll // 전체 테스트 마치고 종료전 1회 실행 , 메서드는 static
    static void afterAll() {
        System.out.println("@AfterAll");
    }

    @AfterEach // 각 테스트케이스 끝날때마다 실행
    public void afterEach() {
        System.out.println("@AfterEach");
    }

}
