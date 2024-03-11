package dm.applicantcodingcamp.bikerental.storage;

import dm.applicantcodingcamp.bikerental.model.Bike;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.Collection;
import java.util.HashSet;

@ConfigurationProperties("bikerental")
public class MemoryStorage {

    private static final MemoryStorage instance = new MemoryStorage();

    public MemoryStorage() {
        bikes = new HashSet<>();
    }

    @Setter
    @Getter
    private Collection<Bike> bikes;

    public static MemoryStorage get() {
        return instance;
    }
}
