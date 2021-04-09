# Notes
Random notes lol

## Why are strings immutable in Java?
Short answer: because of the features that immutability provides, such as caching, security, easy reuse without replication, etc.
* Caching the String literals and reusing them saves a lot of heap space because different String variables refer to the same object in the String pool. 
* String intern pool serves exactly this purpose.
* [Source](https://www.baeldung.com/java-string-immutable)
