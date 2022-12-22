package accenture.mapper;

import accenture.dto.OfficeDto;
import accenture.entity.Office;
import org.springframework.stereotype.Component;

@Component
public class OfficeMapper {
    public OfficeDto map(Office office) {
        return new OfficeDto().setAddress(office.getAddress())
                .setCity(office.getCity())
                .setCountry(office.getCountry())
                .setDeskNumber(office.getDesks().size())
                .setClosingTime(office.getClosingTime());
    }
}
