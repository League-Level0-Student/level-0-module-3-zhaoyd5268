
void setup() {
 
  // set the size of your sketch
  size (475, 475);
}
void draw() {
  
  //Starting with the largest ellipse, use a for loop to draw a bullseye with ellipses.
 int a = 400;
 int b = 400;
  for (int i=0; i<9; i++) {

   if (i % 2 == 0) {
 fill(#FA0D0D);
     ellipse(230,230,a,b);
} else {
fill(#0A0A0A);
     ellipse(230,230,a,b);
}
 a-=50;
 b-=50;
  }
  //Use an if statement and modulo to alternate the color of your rings. 
}
