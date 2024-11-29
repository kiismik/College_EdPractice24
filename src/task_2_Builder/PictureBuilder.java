package task_2_Picture;

abstract class PictureBuilder {
    protected Picture picture;

    public PictureBuilder() {
        this.picture = null;
    }

    public abstract PictureBuilder setBasicParams(String name, short year, String author);

    public abstract PictureBuilder setSizeParams(Size size);

    public abstract PictureBuilder setColorParams(String[] colors, boolean withFrames, String canvas);

    public abstract PictureBuilder setCategoryParams(String theme, String category);

    public abstract Picture build();
}

