class Main {

   void count(String s){
        String paranthases = "";
        String  brackets = "";
        String otherBrackets = "";
        char[] arr = s.toCharArray();

        for(int i = 0 ; i < arr.length; i++){
          if (arr[i] == '(' || arr[i] == ')'){
            paranthases += arr[i];
          }
          else if((arr[i] == '[') || (arr[i] == ']')){brackets +=arr[i];}
          else if (arr[i] == '{' || arr[i] == '}'){otherBrackets += arr[i];}
     



        }
      
        
        System.out.println(checkParanthases(paranthases,paranthases.length()));
     
          System.out.println(checkBrackets(brackets,brackets.length()));
          System.out.println(checkOtherBrackets(otherBrackets,otherBrackets.length()));
  }
  boolean checkParanthases(String s, int length){
    int left =0,right = 0;
      for ( int i = 0; i < length ;i++){
            if(s.charAt(i) == '(') {right++;}
            if(s.charAt(i) == ')') {left++;}
        } 
        return (left == right)? true: false;
      }
     
  
  boolean checkBrackets(String s, int length){
        int left =0,right = 0;
      for ( int i = 0; i < length ;i++){
            if(s.charAt(i) == '[') {right++;}
            if(s.charAt(i) == ']') {left++;}
        } 
        return (left == right)? true: false;
        } 
        
   boolean checkOtherBrackets(String s, int length){
      int left =0,right = 0;
      for ( int i = 0; i < length ;i++){
            if(s.charAt(i) == '{') {right++;}
            if(s.charAt(i) == '}') {left++;}
        } 
        return (left == right)? true: false;
  }
  public static void main(String[] args) {
      // String paranthases = "";
      //   String  brackets = "";
      //   String otherBrackets = "";
      //   char[] arr = s.toCharArray();
      //   for(int i = 0 ; i < arr.length(); i++){
      //     System.out.println(arr[i])
      //   }
      Main hamzah = new Main();
      hamzah.count("(([])");

  }
}
