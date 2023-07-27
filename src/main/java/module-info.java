module dev.mccue.guava.escape {
    requires static com.google.errorprone.annotations;
    requires static dev.mccue.jsr305;
    requires static org.checkerframework.checker.qual;

    requires transitive dev.mccue.guava.base;

    exports dev.mccue.guava.escape;
}