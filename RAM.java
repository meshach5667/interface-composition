/**
 * RAM
 */
public class RAM {

    String name = "DDR4";

    int readSpeed = 3;

    float writeSpeed = 1.5F;

    @Override
    public String toString() {
        return "RAM{" +
                "name='" + name + '\'' +
                ", readSpeed=" + readSpeed +
                ", writeSpeed=" + writeSpeed +
                '}';
    }
}