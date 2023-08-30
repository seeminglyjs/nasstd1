package codingTest.a_STUDY;


import com.nasmedia.nasstd1.Nasstd1Application;
import org.hamcrest.MatcherAssert;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.hamcrest.Matchers.is;
@SpringBootTest(classes = Nasstd1Application.class)
public class Chapter1_CodingTest {


//================================================
    @Test
    public void GoodOrBad(){
        System.out.println("Case1 함수 명만으로 어떤 동작을 하는지 정확히 파악하기 어려움"+fun1(3,3));
        MatcherAssert.assertThat("Case1 값이 6과 다르다", fun1(3,3), is(6));
        System.out.println("Case2 함수 명만으로 어떤 동작을 하는지 파악하기 쉬움"+age(3,3));
        MatcherAssert.assertThat("Case2 값이 6과 다르다", age(3,3), is(6));
    }


    public int fun1(int a , int b){
        return a + b;
    }

    public int age(int currentYear , int birthYear){
        return currentYear + birthYear;
    }
//================================================



}
