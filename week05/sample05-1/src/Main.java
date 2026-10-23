//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
void main() {
      Scanner keyborad = new Scanner(System.in);
      int width; //
    int height;
    char type;
    int area;

    System.out.print("사각형의 사로 길이 입력(예 5) : ");
    width = keyborad.nextInt();
    System.out.print("사각형의 새로 길이 입력(예 5) : ");
    height = keyborad.nextInt();

    type + (width == height) ? '정' : '직';
    area = width * height;

    System.out.printf("**** %c사각형 넓이 *****");
    System.out.printf("|t가로 길이 : %,d Cm|n", width);
    System.out.printf("|t세로 길이 : %,d Cm|n", height);
    System.out.printf("|t넓    이 : %,d |u33a0|n", area);



}
