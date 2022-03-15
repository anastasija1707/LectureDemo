package lecture3;

public class LightColorDetector {


    public void detect(int wavelenght) {
        String result = "";

        if ((wavelenght >= 380) && (wavelenght <= 499)) {
            System.out.println("Violet");
        }
        else if ((wavelenght >= 450) && (wavelenght <= 494)) {
            System.out.println("Blue");
        } else if ((wavelenght >= 495) && (wavelenght <= 569)) {
            System.out.println("Green");
        } else if ((wavelenght >= 570) && (wavelenght <= 589)) {
            System.out.println("Yellow");
        } else if ((wavelenght >= 590) && (wavelenght <= 619)) {
            System.out.println("Orange");
        } else if ((wavelenght >= 620) && (wavelenght <= 750)) {
            System.out.println("Yellow");
        } else {
            System.out.println("Invisible light");
    }

}
    }
