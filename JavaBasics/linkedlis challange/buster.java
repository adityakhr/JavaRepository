import java.util.ArrayList;

public class buster {

    private ArrayList<Album> album = new ArrayList<Album>();
    public boolean addalbum(String albumname , String songname , double songduration ){
        Album existing  = findalbum(albumname);
        if (existing == null){
            album.add(albumname);
            return true;
        }
        if (existing != null){
            existing.addsong(songname , songduration);
            return true;
        }
        return false;
    }

    public void printalbum(String name ){
        Album al = findalbum(name);
        if (al != null){
            ArrayList<PlayList> songs = al.getListofsong();
            for (int i = 0 ; i<songs.size() ; ++i){
                System.out.println((i+1)+". "+ songs.get(i).getTitle()+" ("+songs.get(i).getDuration()+")");
            }
        }
    }
    private Album findalbum(String name){
        for (int i = 0 ; i<album.size() ; ++i){
            if (album.get(i).getNameofalbum() == name){
                return album.get(i);
            }
        }
        return null;
    }

}
