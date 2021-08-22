
Given 2 int arrays, a and b, return a new array length 2 containing, as much as will fit, the elements from a followed by the elements from b. The arrays may be any length, including 0, but there will be 2 or more elements available between the 2 arrays.


make2([4, 5], [1, 2, 3]) → [4, 5]
make2([4], [1, 2, 3]) → [4, 1]
make2([], [1, 2]) → [1, 2]

public int[] make2(int[] a, int[] b) {
  int[] c = new int[2];
  int index = 0;
  for (int i = 0; i < a.length; i++) {
    if (index < 2) {
      c[index] = a[i];
      index++;
    }
  }
  
  for (int i = 0; i < b.length; i++) {
    if (index < 2) {
      c[index] = b[i];
      index++;
    }
  }
  
  return c;
}