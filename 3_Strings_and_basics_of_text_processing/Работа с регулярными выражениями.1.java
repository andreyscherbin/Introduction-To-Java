package com.company;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    /*
     * Создать приложение, разбирающее текст (текст хранится в строке) и позволяющее выполнить с текстом
     * три различных операции: отсортировать абзацы по количеству предложений; в каждом предложении отсортировать
     * слова по длине; отсортировать лексемы в предложении по убыванию количества вхождений заданного символа,
     * а в случае равенства - по алфавиту.
     */

    public static String sortLexeme(String text, char symbol) {

        Pattern patternParagraph = Pattern.compile("\\n");
        Matcher matcherParagraph = patternParagraph.matcher(text);
        String[] stringsParagraphs = patternParagraph.split(text, 0);
        String[] stringsSentences;
        String[] stringsWords;
        text = "";
        for (String stringParagraph : stringsParagraphs) {
            patternParagraph = Pattern.compile("\\.");
            matcherParagraph = patternParagraph.matcher(stringParagraph);
            stringsSentences = patternParagraph.split(stringParagraph, 0);
            for (String ss : stringsSentences) {
                Pattern patternWords = Pattern.compile(" ");
                Matcher matcherWords = patternWords.matcher(ss);
                stringsWords = patternWords.split(ss, 0);
                boolean flagAlphabetSort = true;
                int maxSymbols = 0;
                for (int j = 0; j < stringsWords[0].length(); j++) {
                    if (stringsWords[0].charAt(j) == symbol) {
                        maxSymbols++;
                    }
                }
                for (int i = 1; i < stringsWords.length; i++) {
                    int counterSymbols = 0;
                    for (int j = 0; j < stringsWords[i].length(); j++) {
                        if (stringsWords[i].charAt(j) == symbol) {
                            counterSymbols++;
                        }
                    }
                    if (counterSymbols != maxSymbols) {
                        flagAlphabetSort = false;
                    }
                }
                for (int i = 0; i < stringsWords.length; i++) {
                    for (int j = 0; j < stringsWords.length - i - 1; j++) {
                        int counter_j = 0, counter_j_plus_one = 0;
                        for (int z = 0; z < stringsWords[j].length(); z++) {
                            if (stringsWords[j].charAt(z) == symbol) {
                                counter_j++;
                            }
                        }
                        for (int z = 0; z < stringsWords[j + 1].length(); z++) {
                            if (stringsWords[j + 1].charAt(z) == symbol) {
                                counter_j_plus_one++;
                            }
                        }
                        if (!flagAlphabetSort) {
                            if (counter_j < counter_j_plus_one) {
                                String var = stringsWords[j + 1];
                                stringsWords[j + 1] = stringsWords[j];
                                stringsWords[j] = var;
                            }
                        } else if (stringsWords[j].charAt(0) > stringsWords[j + 1].charAt(0)) {
                            String var = stringsWords[j + 1];
                            stringsWords[j + 1] = stringsWords[j];
                            stringsWords[j] = var;
                        }
                    }
                }
                for (int i = 0; i < stringsWords.length; i++) {
                    text += stringsWords[i];
                    if (i != stringsWords.length - 1) {
                        text += " ";
                    }
                }
                text += ".";
            }
            text += "\n";
        }
        return text;
    }

    public static String sortParagraphs(String text) {

        Pattern patternParagraph = Pattern.compile("\\n");
        Matcher matcherParagraph = patternParagraph.matcher(text);
        String[] stringsParagraphs = patternParagraph.split(text, -1);

        for (int i = 0; i < stringsParagraphs.length; i++) {
            for (int j = 0; j < stringsParagraphs.length - i - 1; j++) {
                int counterSentences1 = 0;
                Pattern patternSentences1 = Pattern.compile("\\.");
                Matcher matcherSentences1 = patternSentences1.matcher(stringsParagraphs[j]);
                while (matcherSentences1.find()) {
                    counterSentences1++;
                }
                int counterSentences2 = 0;
                Pattern patternSentences2 = Pattern.compile("\\.");
                Matcher matcherSentences2 = patternSentences2.matcher(stringsParagraphs[j + 1]);
                while (matcherSentences2.find()) {
                    counterSentences2++;
                }
                if (counterSentences1 > counterSentences2) {
                    String new_string = stringsParagraphs[j + 1];
                    stringsParagraphs[j + 1] = stringsParagraphs[j];
                    stringsParagraphs[j] = new_string;
                }
            }
        }
        text = "";
        for (String s : stringsParagraphs) {
            text += s;
            text += "\n";
        }
        return text;
    }

    public static String sortWords(String text) {

        Pattern patternParagraph = Pattern.compile("\\n");
        Matcher matcherParagraph = patternParagraph.matcher(text);
        String[] stringsParagraphs = patternParagraph.split(text, 0);
        String[] stringsSentences;
        String[] stringsWords;
        text = "";
        for (String stringParagraph : stringsParagraphs) {
            patternParagraph = Pattern.compile("\\.");
            matcherParagraph = patternParagraph.matcher(stringParagraph);
            stringsSentences = patternParagraph.split(stringParagraph, 0);
            for (String ss : stringsSentences) {
                Pattern patternWords = Pattern.compile(" ");
                Matcher matcherWords = patternWords.matcher(ss);
                stringsWords = patternWords.split(ss, 0);
                for (int i = 0; i < stringsWords.length; i++) {
                    for (int j = 0; j < stringsWords.length - i - 1; j++) {
                        if (stringsWords[j].length() > stringsWords[j + 1].length()) {
                            String var = stringsWords[j + 1];
                            stringsWords[j + 1] = stringsWords[j];
                            stringsWords[j] = var;
                        }
                    }
                }
                for (int i = 0; i < stringsWords.length; i++) {
                    text += stringsWords[i];
                    if (i != stringsWords.length - 1) {
                        text += " ";
                    }
                }
                text += ".";
            }
            text += "\n";
        }
        return text;
    }

    public static void main(String[] args) {

        String text = "ДБ АБ ВБ ГБ. Б ББ БББ Б БББББ.\n" +
                "1 4444 22 ааа 55555.4444 333 22 1 0 0 1 22.\n" +
                "55555 1 22 ааа 4444 55555 666666.\n";
        //сортировка абзацов по возрастанию
        text = sortParagraphs(text);
        System.out.println(text);
        //сортировка предложений по возрастанию
        text = sortWords(text);
        System.out.println(text);
        //сортировка лексем
        text = sortLexeme(text, 'Б');
        System.out.println(text);
    }
}
