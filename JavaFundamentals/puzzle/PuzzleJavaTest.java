public class PuzzleJavaTest {
    public static void main(String[] args) {
       PuzzleJava PuzzleTest=new PuzzleJava();
    //    System.out.println(PuzzleTest.getTenRolls().length);
       System.out.println(PuzzleTest.getRandomLetter());
       System.out.println(PuzzleTest.generatePassword());
       String [] setPasswordNew=PuzzleTest.getNewPasswordSet(8);
       for(int x =0 ; x <setPasswordNew.length;x++){
                System.out.println(setPasswordNew[x]);
       }
    }
}
