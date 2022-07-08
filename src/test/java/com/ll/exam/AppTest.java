package com.ll.exam;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    public void 테스트_스캐너() {
        String input = """
                   등록
                   명언1
                   작가1
                """.stripIndent();//문자열 안의 모든 라인에 strip를 적용하여 앞 뒤 공백을 제거함.

        InputStream in = new ByteArrayInputStream(input.getBytes());
        Scanner sc = new Scanner(in);

        String cmd = sc.nextLine().trim();
        String content = sc.nextLine().trim();
        String author = sc.nextLine().trim();

        assertEquals("등록",cmd);
        assertEquals("명언1",content);
        assertEquals("작가1",author);
    }

}