package task_2_Picture;

public class Main {
    public static void main(String[] args) {
        Size size = new Size();
        size.setHeight((short) 100);
        size.setWidth((short) 150);

        PictureBuilder usaBuilder = new UsaPictureBuilder();
        Picture usaPicture = usaBuilder
                .setBasicParams("Statue of Liberty", (short) 2022, "John Doe")
                .setSizeParams(size)
                .setColorParams(new String[]{"Red", "Blue"}, true, "CanvasTypeA")
                .setCategoryParams("Historical", "National")
                .build();

        System.out.println("USA Picture: " + usaPicture.getName() + ", " + usaPicture.getYear());

        PictureBuilder ukraineBuilder = new UkrainePictureBuilder();
        Picture ukrainePicture = ukraineBuilder
                .setBasicParams("Carpathian Landscape", (short) 2023, "Ivan Ivanov")
                .setSizeParams(size)
                .setColorParams(new String[]{"Green", "Brown"}, false, "CanvasTypeB")
                .setCategoryParams("Nature", "Mountain")
                .build();

        System.out.println("Ukraine Picture: " + ukrainePicture.getName() + ", " + ukrainePicture.getYear());
    }
}
