<!doctype html>
<html> 
   <head>
      <title>Hello World</title>
   </head>  
   <body>
      <?php
      echo "<p>Hello, World!</p>";


      $ary = array(1,2,3,6,7,8);
      foreach($ary as $i){
          print "hello bot $i </br>";
      }
      
      $str1 = "hello";
      $str2 = "pankaj";

      $str3 = $str1 . " $str2";
      print $str3;
      
      ?>
   </body>
</html>