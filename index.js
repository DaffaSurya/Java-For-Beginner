function main(x , y) {
   let start = x
   let end = y

   if(end > start) {
     return end + main( start , end-1)
   } else {
    return 0;
   }
}

console.log(main(5 , 10))