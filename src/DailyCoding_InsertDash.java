//문자열을 입력받아 연속된 한자리 홀수 숫자 사이에 '-'를 추가한 문자열을 리턴해야 합니다.
// 주의사항 : 0은 짝수로 간주합니다.

// 입출력 예시
//  String output = insertDash("454793");
//  System.out.println(output); 4547-9-3

public class DailyCoding_InsertDash {
    public static void main(String[] args) {
        // TODO:

        String str = "454793";
        int count = 0;
        String result = "";

        if(str.length()==0){
            System.out.println("null");
        }

        // 반복문 0부터 length-1까지 돌린다.
        for (int i = 0 ; i < str.length(); i++){
            // i가 짝수면
            if (str.charAt(i)%2==0){
                //count 0으로 만든다
                // i를 result에 저장한다.
                count = 0;
                result = result + str.charAt(i);
                System.out.println(result);
            // i가 홀수
            } else if (str.charAt(i)%2==1) {
                // count +1
                count++;
                // 만약 count >= 2 면
                if (count >= 2) {
                    // i에 '-'추가하여 result 저장
                    result = result + '-' + str.charAt(i);
                    System.out.println(result);
                // 그렇지 않으면
                } else {
                    // i를 result에 저장한다.
                    result = result + str.charAt(i);
                    System.out.println(result);
                }

            }
        }
        System.out.println(result);
    }
}