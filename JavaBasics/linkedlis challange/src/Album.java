import java.util.ArrayList;

public class Album {
    String nameofalbum;
    ArrayList<PlayList> listofsong ;

    public Album(String nameofalbum) {
        this.nameofalbum = nameofalbum;
        listofsong = new ArrayList<PlayList>();
    }

    public String getNameofalbum() {
        return nameofalbum;
    }

    public ArrayList<PlayList> getListofsong() {
        return listofsong;
    }

    public boolean addsong(String name , double duration){
        if (findsong(name) == null) {
            listofsong.add( new PlayList( name , duration ));
            return true;
        }
        return false;
    }

    private PlayList findsong (String nameofsong){
        for (int i  =0  ; i< listofsong.size() ; ++i){
            if (listofsong.get(i).getTitle() == nameofsong){
                return listofsong.get(i);
            }
        }
        return null;
    }

}

