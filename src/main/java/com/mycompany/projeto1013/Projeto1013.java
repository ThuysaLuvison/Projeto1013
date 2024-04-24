/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projeto1013;

import java.util.Scanner;

public class Projeto1013 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A, B, C, MAIOR;
        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();
        MAIOR = Math.max(A, Math.max(B, C));
        System.out.println(MAIOR + " eh o maior");
    }
}
