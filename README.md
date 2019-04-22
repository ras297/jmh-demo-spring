# JMH Demo

JMH is short for Java Microbenchmark Harness. JMH is a toolkit that helps you implement Java microbenchmarks correctly.

## Summary
Java Microbenchmarks are Hard because there are many optimizations that the JVM or underlying hardware may apply to your component when the benchmark executes that component in isolation.
 
 Writing a correct Java microbenchmark typically entails preventing the optimizations the JVM and hardware may apply during microbenchmark execution which could not have been applied in a real production system. That is what JMH - the Java Microbenchmark Harness - is helping you do. 

###Running Your JMH Benchmarks
java -jar target/benchmarks.jar
###JMH Benchmark Modes
* Throughput
* Average Time
* Sample Time
* Single Shot Time
* All

 The default benchmark mode is Throughput. 
## References
* [JMH - Java Microbenchmark Harness](http://tutorials.jenkov.com/java-performance/jmh.html)
