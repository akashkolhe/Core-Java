import sun.audio.*;
class Ex{
    public static void main(String[] args) {
        Sound("Kesariya.mp3");
    }
    public static void Sound(String Path){
        try{
            InputStream in = new FileInputStream(new File(Path));
            AudioStream audios = new AudioStream(in);
            AudioPlayer.player.start(audios);
        }
        catch(Exception e){}
    }
}