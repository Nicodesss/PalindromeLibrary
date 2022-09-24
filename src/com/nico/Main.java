package com.nico;
import java.util.Locale;
import java.util.Scanner;
import static java.lang.System.in;
public class Main {
    public static void main(String[] args) {
        GetterSetter gs = new GetterSetter();
        StringBuilder stringBuilder = new StringBuilder();
        Scanner read = new Scanner(in);
        System.out.print("Word: ");
        gs.setInput(read.next().toLowerCase(Locale.ROOT));

        if (!stringBuilder.append(gs.getInput()).toString().equals(stringBuilder.reverse().toString())) {
            System.out.println("not a palindrome");
        }else {
            System.out.println("palindrome");
        }
    }
}
class GetterSetter{
    private String input;
    public String getInput() {
        return input;
    }
    public void setInput(String input) {
        this.input = input;
    }
}