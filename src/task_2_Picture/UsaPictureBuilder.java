package task_2_Picture;

class UsaPictureBuilder extends PictureBuilder {

    public UsaPictureBuilder() {
        this.picture = new Picture("", (short) 0, "", "", "", null, false, "", null);
    }

    @Override
    public PictureBuilder setBasicParams(String name, short year, String author) {
        picture.setName(name);
        picture.setYear(year);
        picture.setAuthor(author);
        return this;
    }

    @Override
    public PictureBuilder setSizeParams(Size size) {
        picture.setSize(size);
        return this;
    }

    @Override
    public PictureBuilder setColorParams(String[] colors, boolean withFrames, String canvas) {
        picture.setColors(colors);
        picture.setWithFrames(withFrames);
        picture.setCanvas(canvas);
        return this;
    }

    @Override
    public PictureBuilder setCategoryParams(String theme, String category) {
        picture.setTheme(theme);
        picture.setCategory(category);
        return this;
    }

    @Override
    public Picture build() {
        return picture;
    }
}
