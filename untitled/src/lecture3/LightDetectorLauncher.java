package lecture3;

public class LightDetectorLauncher {
    public static void main(String[] args) {
        LightColorDetector lightColorDetector = new LightColorDetector();
        int waveLenght = 579;
        lightColorDetector.detect(waveLenght);
//        System.out.println(result);
//      System.out.println(lightColorDetector.detect(waveLenght));
    }

}
