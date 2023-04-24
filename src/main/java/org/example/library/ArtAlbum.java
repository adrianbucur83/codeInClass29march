package org.example.library;

public class ArtAlbum extends Book{
    public ArtAlbum(String type, String title, String paperQuality) {
        super.title = title;
        this.numberOfPages = numberOfPages;
        this.paperQuality = paperQuality;
    }

    private String paperQuality;

    @Override
    public String toString() {
        return super.toString() + "is a art album, paper quality is " + paperQuality;
    }
}
