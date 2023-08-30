package codingTest.simplejs;

import com.nasmedia.nasstd1.Nasstd1Application;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * name : 교점에 별만들기
 * level : 2
 * link : https://school.programmers.co.kr/learn/courses/30/lessons/87377?language=java
 */
@SpringBootTest(classes = Nasstd1Application.class)
public class Make_a_star_at_the_intersection {


    /**
     * Ax + By + C = 0으로 표현할 수 있는 n개의 직선이 주어질 때, 이 직선의 교점 중 정수 좌표에 별을 그리려 합니다.
     */
    @Test
    public void callSolution(){
        System.out.println("=====callSolution=====");


    }


    public String[] solution(int[][] line) {
        String[] answer = {};

        for(int i = 0; i < line.length; i++){
            int [] arr = line[i];
            int x = arr[0];
            int y = -arr[1] - arr[2];
        }

        return answer;
    }
}
