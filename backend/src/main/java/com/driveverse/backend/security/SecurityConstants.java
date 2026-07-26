package com.driveverse.backend.security;

public class SecurityConstants {

    private SecurityConstants() {
    }

    public static final String SECRET_KEY =
            "DriveVerseSecretKey2026ThisShouldBeLongEnoughForJwtSecurity";

    public static final long JWT_EXPIRATION = 86400000; // 24 hours

    public static final String TOKEN_PREFIX = "Bearer ";

    public static final String HEADER_STRING = "Authorization";

}