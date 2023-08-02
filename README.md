# guava-escape

## What

This package is a fork of [Guava](https://github.com/google/guava) around roughly release `32.1.1` which
* Is shaded under `dev.mccue.guava`
* Only contains the contents of the `com.google.common.escape` package
* Has a proper `module-info.java`
* Has all usages of `sun.misc.*` removed

## Why

* It [doesn't seem like guava will be modularized any time soon](https://github.com/google/guava/issues/2970#issuecomment-1572148291)
* I want to enable more libraries to be fully modular so that the `jlink`
workflow is more viable
* Mechanical refactors are a really easy thing to do to fall asleep. This is how I count sheep.

## Why Not

* The transformation from Guava code to this was not _entirely_ mechanical.
* I did make some small changes to APIs and internals that were Java 8 specific.
* I haven't ported over the unit tests
* GWT, j2objc, j2cl, etc. are not things I care about or want to support.
* Does not include any android specific code. Equivalent to the `-jre` build.
* Compiled for Java 9+, not Java 8

## Usage

For the most part, you should be able to just find+replace all
references to `com.google.common` with `dev.mccue.guava`.

Consult the [original documentation](https://github.com/google/guava) for
in-depth usage guides.

```xml
<dependency>
    <groupId>dev.mccue</groupId>
    <artifactId>guava-escape</artifactId>
    <version>0.0.2</version>
</dependency>
```