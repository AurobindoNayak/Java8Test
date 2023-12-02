package com.ants.sumittest;

public class Test {

        public static void solve(String curr, String rem) {
            if (rem.length() == 0) { //Base condition for recursion
                System.out.print(curr + " ");
                return;
            }
            for (int i = 0; i < rem.length(); i++) {
                //Rest of the string excluding the current index character
                System.out.println(rem.substring(0, i));
                String ros = rem.substring(0, i) + rem.substring(i + 1);
                System.out.println(ros);
                //substring(f,s) function returns the string from index f to s-1 inclusive
                solve(curr + rem.charAt(i), ros);
                //recursive call by appending current index character in the curr string
                //and passing remaining of the string for further new arrangements
            }
        }

        public static void main(String[] args) {
            solve("", "abc");
        }
    }


