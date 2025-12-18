package _00_CodeTest;

/*

문제 설명
카카오에 입사한 신입 개발자 네오는 "카카오계정개발팀"에 배치되어,
카카오 서비스에 가입하는 유저들의 아이디를 생성하는 업무를 담당하게 되었습니다.
"네오"에게 주어진 첫 업무는 새로 가입하는 유저들이 카카오 아이디 규칙에 맞지 않는 아이디를 입력했을 때,
입력된 아이디와 유사하면서 규칙에 맞는 아이디를 추천해주는 프로그램을 개발하는 것입니다.

다음은 카카오 아이디의 규칙입니다.

아이디의 길이는 3자 이상 15자 이하여야 합니다.
아이디는 알파벳 소문자, 숫자, 빼기(-), 밑줄(_), 마침표(.) 문자만 사용할 수 있습니다.
단, 마침표(.)는 처음과 끝에 사용할 수 없으며 또한 연속으로 사용할 수 없습니다.

"네오"는 다음과 같이 7단계의 순차적인 처리 과정을 통해 신규 유저가 입력한 아이디가 카카오 아이디 규칙에 맞는 지 검사하고
규칙에 맞지 않은 경우 규칙에 맞는 새로운 아이디를 추천해 주려고 합니다.

신규 유저가 입력한 아이디가 new_id 라고 한다면,

1단계 new_id의 모든 대문자를 대응되는 소문자로 치환합니다.
2단계 new_id에서 알파벳 소문자, 숫자, 빼기(-), 밑줄(_), 마침표(.)를 제외한 모든 문자를 제거합니다.
3단계 new_id에서 마침표(.)가 2번 이상 연속된 부분을 하나의 마침표(.)로 치환합니다.
4단계 new_id에서 마침표(.)가 처음이나 끝에 위치한다면 제거합니다.
5단계 new_id가 빈 문자열이라면, new_id에 "a"를 대입합니다.
6단계 new_id의 길이가 16자 이상이면, new_id의 첫 15개의 문자를 제외한 나머지 문자들을 모두 제거합니다.
     만약 제거 후 마침표(.)가 new_id의 끝에 위치한다면 끝에 위치한 마침표(.) 문자를 제거합니다.
7단계 new_id의 길이가 2자 이하라면, new_id의 마지막 문자를 new_id의 길이가 3이 될 때까지 반복해서 끝에 붙입니다.
예를 들어, new_id 값이 "...!@BaT#*..y.abcdefghijklm" 라면, 위 7단계를 거치고 나면 new_id는 아래와 같이 변경됩니다.

1단계 대문자 'B'와 'T'가 소문자 'b'와 't'로 바뀌었습니다.
"...!@BaT#*..y.abcdefghijklm" → "...!@bat#*..y.abcdefghijklm"

2단계 '!', '@', '#', '*' 문자가 제거되었습니다.
"...!@bat#*..y.abcdefghijklm" → "...bat..y.abcdefghijklm"

3단계 '...'와 '..' 가 '.'로 바뀌었습니다.
"...bat..y.abcdefghijklm" → ".bat.y.abcdefghijklm"

4단계 아이디의 처음에 위치한 '.'가 제거되었습니다.
".bat.y.abcdefghijklm" → "bat.y.abcdefghijklm"

5단계 아이디가 빈 문자열이 아니므로 변화가 없습니다.
"bat.y.abcdefghijklm" → "bat.y.abcdefghijklm"

6단계 아이디의 길이가 16자 이상이므로, 처음 15자를 제외한 나머지 문자들이 제거되었습니다.
"bat.y.abcdefghijklm" → "bat.y.abcdefghi"

7단계 아이디의 길이가 2자 이하가 아니므로 변화가 없습니다.
"bat.y.abcdefghi" → "bat.y.abcdefghi"

따라서 신규 유저가 입력한 new_id가 "...!@BaT#*..y.abcdefghijklm"일 때,
네오의 프로그램이 추천하는 새로운 아이디는 "bat.y.abcdefghi" 입니다.

[문제]
신규 유저가 입력한 아이디를 나타내는 new_id가 매개변수로 주어질 때,
"네오"가 설계한 7단계의 처리 과정을 거친 후의 추천 아이디를 return 하도록 solution 함수를 완성해 주세요.

[제한사항]
new_id는 길이 1 이상 1,000 이하인 문자열입니다.
new_id는 알파벳 대문자, 알파벳 소문자, 숫자, 특수문자로 구성되어 있습니다.
new_id에 나타날 수 있는 특수문자는 -_.~!@#$%^&*()=+[{]}:?,<>/ 로 한정됩니다.

[입출력 예]
no	new_id	                        result
예1	"...!@BaT#*..y.abcdefghijklm"	"bat.y.abcdefghi"
예2	"z-+.^."	                    "z--"
예3	"=.="	                        "aaa"
예4	"123_.def"	                    "123_.def"
예5	"abcdefghijklmn.p"	            "abcdefghijklmn"

*/


import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.Comparator;

class Data {

}


public class CodeTest {
    public static void main(String[] args) {
        String new_id = "=.=";




        System.out.println();
//        System.out.println("|" + solution(dartResult) + "|");
        System.out.println(solution(new_id));
//        Arrays.stream(solution(data,ext,val_ext,sort_by)).forEach(System.out::println);
//        Arrays.stream(solution(data,ext,val_ext,sort_by)).forEach(x-> System.out.println(Arrays.toString(x)));
    }

    public static String solution(String new_id) {
        List<Character> ref = "abcdefghijklmnopqrstuvwxyz0123456789-_.".chars()
                .mapToObj(c -> (char)c)
                .collect(Collectors.toList());

        List<Character> newid = new_id.chars().map(Character::toLowerCase)
                .mapToObj(c -> (char)c)
                .collect(Collectors.toList());
        System.out.println("1 : " + newid);

        newid = newid.stream().filter(ref::contains).collect(Collectors.toList());
        System.out.println("2 : " + newid);

        for (int i = 1; i < newid.size(); i++) {
            if (newid.get(i) == '.' && newid.get(i) == newid.get(i-1)) {
                newid.remove(i--);
            }
        }
        System.out.println("3 : " + newid);

        if (newid.get(0).equals('.')) newid.remove(0);
        if (newid.get(newid.size()-1).equals('.')) newid.remove(newid.size()-1);
        System.out.println("4 : " + newid);

        if (newid.isEmpty()) newid.add('a');
        System.out.println("5 : " + newid);

        while(newid.size() > 15) {
            newid.remove(newid.size()-1);
        }
        if (newid.get(0).equals('.')) newid.remove(0);
        if (newid.get(newid.size()-1).equals('.')) newid.remove(newid.size()-1);
        if (newid.isEmpty()) newid.add('a');
        System.out.println("6 : " + newid);

        while(newid.size() < 3) {
            newid.add(newid.get(newid.size()-1));
        }
        System.out.println("7 : " + newid);

        StringBuilder sb = new StringBuilder();
        newid.forEach(sb::append);
        return sb.toString();
    }

//    public static void nCr(int[] arr, int start, int r, List<Integer> current, List<List<Integer>> result) {
//        if (r == 0) {
//            result.add(new ArrayList<>(current));
//            return;
//        }
//
//        for (int i = start; i <= arr.length - r; i++) {
//            current.add(arr[i]);
//            nCr(arr, i + 1, r - 1, current, result);
//            current.remove(current.size() - 1);
//        }
//    }

//    private static void printBinary(String label, int num) {
//        String binaryStr = Integer.toBinaryString(num);
//        if(num >= 0 && binaryStr.length() < 4) {
//            binaryStr = String.format("%4s", binaryStr).replace(' ', '0');
//        }
//        System.out.printf("%-15s : %10d (2진수: %s)%n", label, num, binaryStr);
//    }
}

//class Chance {
//    Integer score;
//    Integer bonus;
//    Integer option;
//
//    public Chance() {
//        this.score = 0;
//        this.bonus = 0;
//        this.option = 1;
//    }
//
//    public void print() {
//        System.out.println("--------------------");
//        System.out.println("score : " + score);
//        System.out.println("bonus : " + bonus);
//        System.out.println("option : " + option);
//        System.out.println("result : " + (int)(Math.pow(score,bonus)*option));
//        System.out.println("--------------------");
//    }
//}