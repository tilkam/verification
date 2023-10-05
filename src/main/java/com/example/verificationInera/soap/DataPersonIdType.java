package com.example.verificationInera.soap;

import com.github.javafaker.Faker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class DataPersonIdType {
    Faker faker = new Faker();

    public String getRandomId() {
        Optional<String> getRandom = generatePatientId().stream().findAny();
        return getRandom.orElse("Inget giltigt ID tillgängligt");
    }
    public String getRandomType(){
        Optional<String> getRandom = generateTypes().stream().findAny();
        return getRandom.orElse("Ingen giltig typ");
    }

    private List<String> generatePatientId() {
        List<String> id = new ArrayList<>();
        while (id.size() < 20) {
            id.add(faker.idNumber().validSvSeSsn());
        }
        return shuffleAndFilterId(id);
    }

    private List<String> shuffleAndFilterId(List<String> id) {
        List<String> filteredList = id.stream()
                .filter(b -> !b.contains("+"))
                .collect(Collectors.toList());

        Collections.shuffle(filteredList);
        return filteredList;
    }

    private List<String> generateTypes() {
        List<String> types = new ArrayList<>();
        while (types.size() < 20) {
            types.add(faker.code().gtin13());
        }
        return types;
    }
}
