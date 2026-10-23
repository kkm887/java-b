//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
void main() {
    Scanner keyboard = new Scanner(System.in);
    int man1, man2;
    int result;

    System.out.print("첫번째 선수 입력(가위 = 1, 바위 = 2, 보 = 3)");
    man1 = keyboard.nextInt();
    System.out.print("첫번째 선수 입력(가위 = 1, 바위 = 2, 보 = 3)");
    man2 = keyboard.nextInt();
    System.out.print("첫번째 선수 입력(가위 = 1, 바위 = 2, 보 = 3)");
    man1 = keyboard.nextInt();

    switch (man1 - man2) {

        case 0 :
            result = String.format("man1(%s)과 man2(%s)는 비겼습니다.", man1result, man2result);
            break;
        case -1 :
        case 2 :
            break;
        case 1 :
        case -2 :
            break;

    }

}
