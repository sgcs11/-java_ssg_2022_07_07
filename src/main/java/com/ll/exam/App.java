package com.ll.exam;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class App {
    public void run() {
        System.out.println("== 명언 SSG ==");

        Scanner sc = new Scanner(System.in);

        int wiseSayingLastId = 0; // 명언 글 번호
        
        outer:
        while ( true ) {
            System.out.printf("명령) ");
            String cmd = sc.nextLine().trim();

            switch ( cmd ) {
                case "등록":
                    System.out.printf("명언: ");
                    String content = sc.nextLine().trim();
                    System.out.printf("작가: ");
                    String author = sc.nextLine().trim();

                    int id = ++wiseSayingLastId; // 명언 글 번호 증가

                    WiseSaying wiesSaying = new WiseSaying(id, content, author);
                    System.out.println(wiesSaying);
                    System.out.printf("%d번 명언이 등록되었습니다.\n", id);
                    break;
                case "종료":
                    break outer;
            }
        }
        sc.close();
    }
}
