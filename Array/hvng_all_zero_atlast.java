
class hvng_all_zero_atlast {
  void pushZerosToEnd(int[] arr) {
     int len = arr.length;
      int[] temp_arr = new int[len];
      int temp = 0;

      for (int i = 0; i < len; i++) {
          if (arr[i] != 0) {
              temp_arr[temp++] = arr[i];
          }
      }
      int index = 0;
      for (int i = 0; i < temp; i++) {
          arr[index++] = temp_arr[i];
      }
      while (index < len) {
          arr[index++] = 0;
      }
  
  }
  }