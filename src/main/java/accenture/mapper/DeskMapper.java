package accenture.mapper;

import accenture.dto.DeskDto;
import accenture.entity.Desk;
import org.springframework.stereotype.Component;

@Component
public class DeskMapper {

    public DeskDto map(Desk desk) {
        return new DeskDto()
                .setNumber(desk.getDeskNumber())
                .setOfficeAddress(desk.getOffice().getAddress());
    }
}
