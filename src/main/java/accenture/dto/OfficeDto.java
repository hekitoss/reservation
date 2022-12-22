package accenture.dto;

import lombok.Data;
import lombok.experimental.Accessors;

import java.time.LocalTime;

@Data
@Accessors(chain = true)
public class OfficeDto {

    private String address;
    private String City;
    private String Country;
    private int deskNumber;
    private LocalTime closingTime;
}
