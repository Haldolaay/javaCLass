
public static void flipHorizontalAxis(int[][] matrix) {
     int[] temp  ; int count = 0;
     
     for(int i = 0,k = matrix.length-1 ; i < k ; i++ , k--){
       temp = matrix[i];
       matrix[i] = matrix[k];
       matrix[k] = temp;
     }
}
