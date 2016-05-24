package muck.study.arithmetic.utils;


import java.util.Arrays;


public class Utis {

  public static long get_cur_sys_time() {
    return System.currentTimeMillis();
  }

  public static void printArray( int[] datas ) {
    System.out.println(Arrays.toString(datas));
  }
}
