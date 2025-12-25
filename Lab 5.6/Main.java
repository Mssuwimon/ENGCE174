import java.util.Scanner;

class Media {
    protected String title;
    public Media(String title) {
        this.title = title;
    }
    public void process() {
        System.out.println("Starting generic media processing.");
    }
}

class Video extends Media {
    protected int duration;
    public Video(String title, int duration) {
        super(title);
        this.duration = duration;
    }
    @Override
    public void process() {
        System.out.println("Processing video: " + title + " for " + duration + " minutes.");
    }
}

class Audio extends Media {
    protected String quality;
    public Audio(String title, String quality) {
        super(title);
        this.quality = quality;
    }
    @Override
    public void process() {
        System.out.println("Processing audio: " + title + " with " + quality + " quality.");
    }
}

class Processor {
    public static void runProcessor(Media m) {
        m.process();
    }
}

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // ===== Input =====
        int duration = Integer.parseInt(sc.nextLine());
        String audioTitle = sc.nextLine();
        String quality = sc.nextLine();

        // ===== Objects =====
        Media video = new Video("Tutorial", duration);
        Media audio = new Audio(audioTitle, quality);

        // ===== Polymorphism =====
        Processor.runProcessor(video);
        Processor.runProcessor(audio);

        sc.close();
    }
}
