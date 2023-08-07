package codingTest;

import com.nasmedia.nasstd1.Nasstd1Application;
import org.hamcrest.MatcherAssert;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.hamcrest.Matchers.is;

/*
template start
 */
@SpringBootTest(classes = Nasstd1Application.class)
public class baseTest { //클래스 명은 본인 클래스 이름에 맞게 변경

    @Test
    public void baseTest(){
        int a = 1;
        int b = 1;

        MatcherAssert.assertThat("a와 b는 같다", a==b, is(true));
    }
}
/*
template end
 */
