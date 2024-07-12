package com.saroguitar.dev.runnerz.user;

public record Address(
        String street,
        String suite,
        String city,
        String zipcode,
        Geo goe
) {
}
