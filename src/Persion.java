public class Persion {
    private String name;
    private String gender;
    private String dayOfBirth;

    public Persion(String name, String gender, String dayOfBirth) {
        this.name = name;
        this.gender = gender;
        this.dayOfBirth = dayOfBirth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDayOfBirth() {
        return dayOfBirth;
    }

    public void setDayOfBirth(String dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }

    @Override
    public String toString() {
        return "Persion{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", dayOfBirth='" + dayOfBirth + '\'' +
                '}';
    }
}