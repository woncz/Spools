/*
 * Copyright [2017]
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.netpet.spools.book.insidethejavavirtualmachine.chapter18;

/**
 * Created by woncz on 2017/8/17.
 */
public class Surprise {

    public static void main(String[] args) {
        boolean flag = true;
        System.out.println(Surprise.surpriseTheProgrammer(flag));

        flag = false;
        System.out.println(Surprise.surpriseTheProgrammer(flag));

        System.out.println(test());
    }

    static boolean surpriseTheProgrammer(boolean bVal) {
        int a;
        while (bVal) {
            try {
                a = 1;
                return true;
            } finally {
                break;
                //continue; 细细想与break的区别
            }
        }
        return false;
    }

    public static int test() {
        int i = 0;
        try {
            i = 2;
            return i;
        } finally {
            i = 12;
            System.out.println("finally trumps return.");
            return i;
        }
    }
}
