package lin.jun.bin.model;

/**
 * 单词学院等级
 */
public class SchoolGrade {

    private String id;

    private String name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "SchoolGrade{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
