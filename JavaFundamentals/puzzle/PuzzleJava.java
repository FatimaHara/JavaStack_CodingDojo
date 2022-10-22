import java.util.Random;
public class PuzzleJava{
Random randMachine = new Random();
Integer[] getTenRolls(){
Integer[] myArray = new Integer[10];
for(int i=0;i<10;i++){
    myArray[i]=randMachine.nextInt(1,20)+20;
    // System.out.println (myArray[i]);
}
return myArray;
}
String getRandomLetter(){
String [] myLeteers={"A", "B", "C", "D", "E", "F"," G", "H", "I", "J", "K", "L", "M", "N","O", "P", "Q", "R", "S"," T", "U", "V", "W", "X", "Y", "Z"};
String a= myLeteers[randMachine.nextInt(0,25)];
return a;
}
 String generatePassword(){
    String passRandom="" ;
    for(int x =0;x<8;x++){
        passRandom +=getRandomLetter();
    }
    return passRandom ;
 }
 String [] getNewPasswordSet(int length){
    String[] setPass =new String [length];
    for(int y=0;y<length;y++){
        setPass[y]=generatePassword();
        System.out.println(setPass[y]);
    }
    return setPass ;
 }



}