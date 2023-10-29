package Lab_11_new;
public class Student {

    private Long id;
    private String name;
    private Integer totalScore;

    public Student(long id, String name, int totalScore) {
        this.id = id;
        this.name = name;
        this.totalScore = totalScore;
    }

    public Long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getTotalScore() {
        return totalScore;
    }

    public void setTotalScore(int totalScore) {
        this.totalScore = totalScore;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", totalScore=" + totalScore +
                '}';
    }
}