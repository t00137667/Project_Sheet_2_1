public class Film {
    private String title;
    private String director;
    private int duration;
    private static int filmCount;

    public Film(String title,String director,int duration){
        setTitle(title);
        setDirector(director);
        setDuration(duration);
        filmCount++;
    }

    public Film(){
        this("Unknown","Unknown",0);
    }

    public String getTitle() {
        return title;
    }

    public int getDuration() {
        return duration;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public static int getFilmCount() {
        return filmCount;
    }

    public static void setFilmCount(int filmCount) {
        Film.filmCount = filmCount;
    }

    public String toString() {

        return String.format("Film: %s\nDirector: %s\nDuration: %d",getTitle(),getDirector(),getDuration());
    }
}
