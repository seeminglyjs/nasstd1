package codingTest.simplejs;

import com.nasmedia.nasstd1.Nasstd1Application;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.*;

/**
 * name : 교점에 별만들기
 * level : 2
 * link : https://school.programmers.co.kr/learn/courses/30/lessons/87377?language=java
 */
@SpringBootTest(classes = Nasstd1Application.class)
public class 교점에_별_만들기 {

    private static long minX = Long.MAX_VALUE;
    private static long minY = Long.MAX_VALUE;
    private static long maxX = Long.MIN_VALUE;
    private static long maxY = Long.MIN_VALUE;


    /**
     * Ax + By + C = 0으로 표현할 수 있는 n개의 직선이 주어질 때, 이 직선의 교점 중 정수 좌표에 별을 그리려 합니다.
     */
    @Test
    public void callSolution() {
        System.out.println("=====callSolution=====");
        int[][] line = {{2, -1, 4}, {-2, -1, 4}, {0, -1, 1}, {5, -8, -12}, {5, 8, 12}};
        String[] answer = solution(line);
        for (String s : answer) {
            System.out.println(s);
        }
    }


    public String[] solution(int[][] line) {
        String[] answer = {};

        List<Point> pointList = new ArrayList<>();
        for (int i = 0; i < line.length; i++) {
            for (int j = i + 1; j < line.length; j++) {
                Point point = getIntersection(
                        line[i][0], line[i][1], line[i][2],
                        line[j][0], line[j][1], line[j][2]);
                if (point != null) { //해당 두 지점이 교차할 경우에는
                    pointList.add(point);
                }
            }
        }

        int width = (int) (maxX - minX + 1);
        int height = (int) (maxY - minY + 1);

        char[][] starsArr = new char[height][width];
        for (char[] row : starsArr) {
            Arrays.fill(row, '.'); //점으로 채운 배열 생성
        }

        for (Point point : pointList) {
            starsArr[(int) maxY - (int) point.y][(int) point.x - (int) minX] = '*';
        }

        answer = new String[starsArr.length];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = new String(starsArr[i]);
        }

        return answer;
    }


    private Point getIntersection(long a1, long b1, long c1, long a2, long b2, long c2) {
        Point point = null;
        //두 직선의 교점을 구하는 공식
        double x = (double) (b1 * c2 - b2 * c1) / (a1 * b2 - a2 * b1);
        double y = (double) (a2 * c1 - a1 * c2) / (a1 * b2 - a2 * b1);

        if (x % 1 == 0 && y % 1 == 0) { //정수일 경우 리턴
            point = new Point(Math.round(x), Math.round(y));
            //넓이와 높이를 구하기위한 최대 최소 확인
            xAndyMinMaxSetting((long) x, (long) y);
        }
        return point;
    }

    private void xAndyMinMaxSetting(long x, long y) {
        if (x > maxX) maxX = x;
        if (x < minX) minX = x;
        if (y > maxY) maxY = y;
        if (y < minY) minY = y;
    }

    private record Point(long x, long y) {
            @Override
            public String toString() {
                return "Point{" +
                        "x=" + x +
                        ", y=" + y +
                        '}';
            }

    }
}
