package 가운데글자가져오기;

class StringExercise{
    String getMiddle(String word){
        return word.substring((word.length()-1) / 2, word.length()/2 + 1);
    }
    // 아래는 테스트로 출력해 보기 위한 코드입니다.
    public static void  main(String[] args){
        StringExercise se = new StringExercise();
        System.out.println(se.getMiddle("power"));
    }
}