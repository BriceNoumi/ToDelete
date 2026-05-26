@Override
public void configureApiVersioning(ApiVersionConfigurer configurer) {
    configurer
        .usePathSegment(1)
        .addSupportedVersions("1", "2")
        .setDefaultVersion("1")
        .applyToController(clazz ->
            clazz.getPackageName().startsWith("com.example.api")
        );
}

@Override
public void configureApiVersioning(ApiVersionConfigurer configurer) {
    configurer
        .usePathSegment(1)
        .addSupportedVersions("1", "2")
        .setDefaultVersion("1")
        .applyToPath(path -> path.startsWith("/api/"));  // ✅ KEY LINE
}
``