import java.util.Date;

public class WorkshopManagerSingleton extends Person{
    private int YearsOfExperience;
    private Date ExperienceDate;
    private Date PromotionDate;
    private Status Status;

    private static WorkshopManagerSingleton instance;

    private WorkshopManagerSingleton(String firstName, String lastName, String email, String login, String password, int yearsOfExperience, Date experienceDate, Date promotionDate, Status status) {
        super(firstName, lastName, email, login, password);
        YearsOfExperience = yearsOfExperience;
        ExperienceDate = experienceDate;
        PromotionDate = promotionDate;
        Status = status;
    }

    public static WorkshopManagerSingleton getInstance(String firstName, String lastName, String email, String login, String password, int yearsOfExperience, Date experienceDate, Date promotionDate, Status status)
    {
        if(instance == null)
            instance = new WorkshopManagerSingleton(firstName,lastName,email,login,password,yearsOfExperience,experienceDate,promotionDate,status);
        return instance;
    }

    @Override
    public String toString() {
        return "WorkshopManagerSingleton{" +
                super.toString() +
                "YearsOfExperience=" + YearsOfExperience +
                ", ExperienceDate=" + ExperienceDate +
                ", PromotionDate=" + PromotionDate +
                ", Status=" + Status +
                '}';
    }

}
