PImage catPic;

int x=326;
int y=273;
int acceleration=5;
void setup(){
  size (800,800);
  catPic = loadImage("cat.jpg");

                catPic.resize(width, height);

background(catPic);



}
void draw () {
   if(mousePressed){

println("Mouse’s x-position: " + mouseX + "\n" + "Mouse’s y-position: " + mouseY + "\n");}
fill(255,0,0);
 noStroke();
ellipse(x,y,53,70);
ellipse(x+(464-326),y+(305-273),53,70);




}
void keyPressed() {
   y+=2*acceleration;

x+=2*acceleration;
if(x>width){
  background(catPic);
x=326;
y=273;
acceleration=1;
                 


}

}