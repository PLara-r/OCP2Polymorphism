public class Main {
    public void checkSound(LivesInOcean animal) {
        animal.makeSound();
    }
    public static void main(String[] args) {
        Main o = new Main();
        o.checkSound(new Dolphin());
        o.checkSound(new Whale());
    }}

//whistle
//sing
//В этом примере кода наш Oceanographerкласс включает метод с именем checkSound(),
// способный принимать любой объект, класс которого реализует LivesInOceanинтерфейс.
// Мы также можем создавать новые объекты, такие как Fishили Lobster,
// которые также реализуют LivesInOceanинтерфейс и которые будут совместимы с нашим Oceanographerклассом.