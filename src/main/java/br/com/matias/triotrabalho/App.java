package br.com.matias.triotrabalho;

import java.time.format.DateTimeParseException;
import java.util.Scanner;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class App {

    public static void main(String[] args) {
        try {
    Scanner sc = new Scanner(System.in);
    System.out.println("Digite a sua data de nascimento");
    String data = sc.next();
    LocalDate localdate = LocalDate.parse(data, DateTimeFormatter.ofPattern("yyyy/MM/dd"));

        } catch(DateTimeParseException e) {
            System.out.println("Formato errado");

        }
    }
}
