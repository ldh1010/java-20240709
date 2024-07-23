package test.클래스;

public class Computer {

    String makers;
    int year;
    int ram;
    String graphicCard;

    public void addRam(int ram) {
        this.ram += ram;

        if(this.ram > 32) {
            this.ram -= ram;
            System.out.println("램은 32g를 초과할 수 없습니다.");
        }else {
            System.out.println("램 추가완료");
            System.out.println("현재 램 : " + this.ram + "g");
        }
    }

}
