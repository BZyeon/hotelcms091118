package hotelcmshsjnewnew.domain;

import hotelcmshsjnewnew.domain.*;
import hotelcmshsjnewnew.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class CheckInInfoRegistered extends AbstractEvent {

    private Long accomodationId;
    private Long roomId;
    private Date checkInTime;

    public CheckInInfoRegistered(Accomodation aggregate) {
        super(aggregate);
    }

    public CheckInInfoRegistered() {
        super();
    }
}
//>>> DDD / Domain Event
