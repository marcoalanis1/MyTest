public int maxMirror(int[] nums) {

int foward = 0;
 int backward = 0;
 int greatest1 = 0;
 int count = 0;
 for (int x = 0; x <nums.length;x++){
  foward = x;
  for (int y = nums.length - 1; y > x  ;y--){
   foward = x;
   backward = y ;
    while (nums[foward] == nums[backward] && backward > foward){
      count++;
      if (backward - foward == 2){
       count = (count * 2) + 1;
      }
      if (backward - foward == 1){
       count *= 2;
      }
      foward++;
      backward--;
    }
   if (count > greatest1){
    greatest1 =  count;
   }
   count = 0;
 }
 }
 if (nums.length == 1){
  return 1;
  }
  else {
  
 return greatest1;
}
}

    
 
