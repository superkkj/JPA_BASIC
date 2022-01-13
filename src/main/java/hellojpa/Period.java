package hellojpa;

import javax.persistence.Embeddable;
import java.time.LocalDateTime;

@Embeddable //여긴 값 타입이야
public class Period {


    //기간
    private LocalDateTime startDate;
    private LocalDateTime endDate;

    public boolean isWork() {
        return false;
    }

    public LocalDateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDateTime startDate) {
        this.startDate = startDate;
    }

    public LocalDateTime getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDateTime endDate) {
        this.endDate = endDate;
    }
}
