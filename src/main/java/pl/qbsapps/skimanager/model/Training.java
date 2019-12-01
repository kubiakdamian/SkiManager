package pl.qbsapps.skimanager.model;

import lombok.Data;

import java.util.List;

@Data
public class Training {

    private int trainingNumber;

    private List<SkiJumper> skiJumpers;
}
