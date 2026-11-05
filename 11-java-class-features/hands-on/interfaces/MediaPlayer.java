interface Metadata{
    public abstract void displayMetaData();
}

interface Playable extends Metadata{
    // every playable media must display metadata
    public abstract void startPlaying();
    public abstract void stopPlaying();
}

interface Chartable{
    public abstract void displayChartInfo();
}

class Music implements Playable, Chartable{
    String artist;
    int streamCount;
    int hot100chartPosition;

    public Music(String artist,int streamCount,int hot100chartPosition){
        this.artist = artist;
        this.streamCount = streamCount;
        this.hot100chartPosition = hot100chartPosition;
    }

    @Override
    public void displayMetaData(){
        System.out.println("Artist: " + artist);
    }

    @Override
    public void startPlaying(){
        System.out.println("MUSIC START");
    }

    @Override
    public void stopPlaying(){
        System.out.println("MUSIC STOP");
    }

    @Override
    public void displayChartInfo(){
        displayMetaData();
        System.out.println("Streams                 : " + streamCount);
        System.out.println("HOT 100 Chart Position  : " + hot100chartPosition);
    }
}

class Video implements Playable{
    String director;

    public Video(String director){
        this.director = director;
    }

    @Override
    public void displayMetaData(){
        System.out.println("Director: " + director);
    }

    @Override
    public void startPlaying(){
        System.out.println("VIDEO START");
    }

    @Override
    public void stopPlaying(){
        System.out.println("VIDEO STOP");
    }

    
}

class Podcast implements Playable{
    String host;

    public Podcast(String host){
        this.host = host;
    }

    @Override
    public void displayMetaData(){
        System.out.println("Host: " + host);
    }

    @Override
    public void startPlaying(){
        System.out.println("PODCAST START");
    }

    @Override
    public void stopPlaying(){
        System.out.println("PODCAST STOP");
    }

}

public class MediaPlayer {
    public static void main(String[] args){
        Music music = new Music("Post Malone", 100000000,1);
        Video video = new Video("A director name");
        Podcast podcast = new Podcast("TEDx");

        music.displayMetaData();
        music.startPlaying();
        music.stopPlaying();
        music.displayChartInfo();
        System.out.println();
        
        video.displayMetaData();
        video.startPlaying();
        video.stopPlaying();
        System.out.println();

        podcast.displayMetaData();
        podcast.startPlaying();
        podcast.stopPlaying();
        System.out.println();
    }
}