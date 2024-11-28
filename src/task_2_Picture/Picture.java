package task_2_Picture;

class Picture {
    private String name;
    private short year;
    private String author;
    private String theme;
    private String category;
    private String[] colors;
    private boolean isWithFrames;
    private String canvas;
    private Size size;

    public Picture(String name, short year, String author, String theme, String category,
                   String[] colors, boolean isWithFrames, String canvas, Size size) {
        this.name = name;
        this.year = year;
        this.author = author;
        this.theme = theme;
        this.category = category;
        this.colors = colors;
        this.isWithFrames = isWithFrames;
        this.canvas = canvas;
        this.size = size;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setYear(short year) {
        this.year = year;
    }

    public String getName() {
        return name;
    }
    public short getYear() {
        return year;
    }

    public String getAuthor() {
        return author;
    }

    public String getTheme() {
        return theme;
    }

    public String getCategory() {
        return category;
    }

    public String[] getColors() {
        return colors;
    }

    public boolean isWithFrames() {
        return isWithFrames;
    }

    public String getCanvas() {
        return canvas;
    }

    public Size getSize() {
        return size;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setColors(String[] colors) {
        this.colors = colors;
    }

    public void setWithFrames(boolean withFrames) {
        isWithFrames = withFrames;
    }

    public void setCanvas(String canvas) {
        this.canvas = canvas;
    }

    public void setSize(Size size) {
        this.size = size;
    }
}
