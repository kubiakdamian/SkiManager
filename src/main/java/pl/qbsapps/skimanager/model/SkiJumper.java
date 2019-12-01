package pl.qbsapps.skimanager.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class SkiJumper {

    private String firstName;

    private String lastName;

    private int position;
}
