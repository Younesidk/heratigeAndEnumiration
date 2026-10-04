import java.util.Date;

public class WorkshopManager extends Person{
    private int YearsOfExperience;
    private Date ExperienceDate;
    private Date PromotionDate;
    private Status Status;

    public WorkshopManager(){

    }

    public WorkshopManager(String firstName, String lastName, String email, String login, String password, int yearsOfExperience, Date experienceDate, Date promotionDate, Status status) {
        super(firstName, lastName, email, login, password);
        YearsOfExperience = yearsOfExperience;
        ExperienceDate = experienceDate;
        PromotionDate = promotionDate;
        Status = status;
    }

    @Override
    public String toString() {
        return "WorkshopManager{" +
                super.toString() +
                "YearsOfExperience=" + YearsOfExperience +
                ", ExperienceDate=" + ExperienceDate +
                ", PromotionDate=" + PromotionDate +
                ", Status=" + Status +
                '}';
    }

    public int UpdateExperience(Date experienceDate)
    {
        return 0;
    }
}
