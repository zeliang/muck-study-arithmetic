package muck.study.arithmetic.sort;


public class SortUtils {

  /***
   * // 交换位置
   * 
   * @param datas
   * @param a_i
   * @param b_i
   */
  private static void swap( int[] datas, int a_i, int b_i ) {
    int tmp = datas[a_i];
    datas[a_i] = datas[b_i];
    datas[b_i] = tmp;
  }

  /***
   * 冒泡排序
   */
  public static void bubblSort( int[] datas ) {
    if(datas.length == 0) {
      return;
    }
    else {
      int out;
      for( out = datas.length - 1; out > 0; out-- ) {
        for( int i = 0; i < out; i++ ) {
          if(datas[i] > datas[i + 1]) {
            swap(datas, i, i + 1);
          }
        }
      }
    }
  }

  /***
   * 选择排序
   * 
   * @param datas
   */
  public static void selectSort( int[] datas ) {
    if(datas.length == 0) {
      return;
    }
    else {
      int select;
      for( select = 0; select < datas.length - 1; select++ ) {
        int min = datas[select];
        int min_index = select;
        for( int i = select + 1; i < datas.length; i++ ) {
          if(min > datas[i]) {
            min = datas[i];
            min_index = i;
          }
        }
        swap(datas, select, min_index);
      }
    }
  }

  public static int[] insertSort( int[] arr ) {
    int i, j;
    int insertNote;// 要插入的数据
    int[] array = arr;
    // 从数组的第二个元素开始循环将数组中的元素插入
    for( i = 1; i < array.length; i++ ) {
      // 设置数组中的第2个元素为第一次循环要播讲的数据
      insertNote = array[i];
      j = i - 1;
      while(j >= 0 && insertNote < array[j]) {
        // 如果要播讲的元素小于第j个元素,就将第j个元素向后移动
        array[j + 1] = array[j];
        j--;
      }
      System.out.println("j--->" + ( j + 1 ));
      // 直到要插入的元素不小于第j个元素,将insertNote插入到数组中
      array[j + 1] = insertNote;
    }
    return array;

  }

}
