package accenture.dto;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class DeskDto {

    private String number;
    private String officeAddress;
}
