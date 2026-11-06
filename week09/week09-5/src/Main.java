//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
void main() {
    Scanner keyboard = new Scanner(System.in);
    int start;
    int last;
    int odd = 0;
    int even =0;



    while (true) {
        System.out.print("어디부터 더할까요 ? ");
        start = keyboard nextInt();
        System.out.printf("어디부터 더할까요 (최솟값 : %d)? ", start + 5);
        last = keyboard nextInt();

    if (last >= start + 5)
        break;
    else {
        System.out.print("ERROR : 입력오류");
        System.in.read();
        }
    }

    for (int i = start; i <= last; i++) {
        if (1 % 2 == 0) {
            even += i;
        } else {
            odd += i;
        }
    }

    System.out.printf("%d ~ &d ");
    System.out.printf("어디부터 더할까요 (최솟값 : %d)? ", start + 5);
}


