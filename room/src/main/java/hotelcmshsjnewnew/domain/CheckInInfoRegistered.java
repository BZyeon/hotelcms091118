package hotelcmshsjnewnew.domain;

import hotelcmshsjnewnew.domain.*;
import hotelcmshsjnewnew.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class CheckInInfoRegistered extends AbstractEvent {

    private Long accomodationId;
    private Long roomId;
    private Date checkInTime;
}
