package com.company;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Main {

    /*
     * Дана строка,содержащая следующий текст (xml-документ):
     * <notes>
    <note id="1">
        <to>Вася</to>
        <from>Света</from>
        <heading>Напоминание</heading>
        <body>Позвони мне завтра!</body>
    </note>
    <note id="2">
        <to>Петя</to>
        <from>Маша</from>
        <heading>Важное напоминание</heading>
        <body/>
    </note>
</notes>.
     * Напишите анализатор, позволяющий последовательно возвращать содержимое узлов xml-документа и его тип
     * (открывающий тег, закрывающий тег, тег без тела). Пользоваться готовыми парсерами XML для решений данной задачи
     * нельзя.
     */

    public static void main(String[] args) {

        String xmlDocument = "<notes>\n" +
                "    <note id=\"1\">\n" +
                "        <to>Вася</to>\n" +
                "        <from>Света</from>\n" +
                "        <heading>Напоминание</heading>\n" +
                "        <body>Позвони мне завтра!</body>\n" +
                "    </note>\n" +
                "    <note id=\"2\">\n" +
                "        <to>Петя</to>\n" +
                "        <from>Маша</from>\n" +
                "        <heading>Важное напоминание</heading>\n" +
                "        <body/>\n" +
                "    </note>\n" +
                "</notes>";
        Pattern regex_open_teg = Pattern.compile("(<[^<>]+)>");
        Matcher matcher_open_teg = regex_open_teg.matcher(xmlDocument);
        while (matcher_open_teg.find()) {

            StringBuilder open_teg = new StringBuilder(matcher_open_teg.group(0));
            if (open_teg.charAt(1) == '/') {
                continue;
            }
            if (open_teg.charAt(open_teg.length() - 2) == '/') {
                String node = open_teg.toString().substring(1, open_teg.length() - 2);
                System.out.printf("Открывающий тег = %s, Закрывающий тег = отсутсвует\n", open_teg);
                System.out.printf("Содержимое узла %s = {\n Узел пуст\n}\n", node);
                continue;
            }
            StringBuilder close_teg = new StringBuilder(open_teg);
            close_teg.insert(1, '/');
            int index = close_teg.lastIndexOf(" ");
            if (index != -1) {
                close_teg = new StringBuilder(close_teg.substring(0, index));
                close_teg.insert(index, '>');
            }
            System.out.printf("Открывающий тег = %s, Закрывающий тег = %s\n", open_teg, close_teg);
            String node = open_teg.toString().substring(1, open_teg.length() - 1);
            int start_index_body = xmlDocument.indexOf(open_teg.toString());
            xmlDocument = xmlDocument.substring(start_index_body, xmlDocument.length());
            int end_index_body = xmlDocument.indexOf(close_teg.toString());
            String body_teg = xmlDocument.substring(open_teg.length(), end_index_body);
            System.out.printf("Содержимое узла %s = {\n%s\n}\n", node, body_teg);
        }
    }
}
