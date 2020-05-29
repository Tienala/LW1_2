/*
 * Main
 *
 * Version 1
 *
 * Nataliia Zviertseva, KhPI
 * Task 2
 */
package com.company;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

        public class Main {

            public static void main(String[] args) throws IOException {
                String text = new String(Files.readAllBytes(Paths.get("D:\\Harry.txt")));
                String cleanedText = text
                        .replaceAll("\\.", "")
                        .replaceAll(",", "")
                        .replaceAll("\\?", "")
                        .replaceAll("\"", "")
                        .replaceAll(";", "")
                        .replaceAll("!", "");
                        //.toLowerCase();
                String[] words = cleanedText.split("\\n");
                int sum = 0;
                for (int i = 0; i < words.length; i++) {
                    if (words[i].contains("Harry"))
                    {
                        sum = sum+1;
                    }
                }
                System.out.println("Harry is in " + sum + " lines");
            }
        }
