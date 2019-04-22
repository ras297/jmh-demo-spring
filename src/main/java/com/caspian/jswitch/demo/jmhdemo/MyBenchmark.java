package com.caspian.jswitch.demo.jmhdemo;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.annotations.OutputTimeUnit;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.State;
import org.openjdk.jmh.infra.Blackhole;

import java.util.concurrent.TimeUnit;

public class MyBenchmark {
  @State(Scope.Thread)
  public static class MyState {
    public int a = 1;
    public int b = 2;
  }

  @Benchmark @BenchmarkMode(Mode.Throughput) @OutputTimeUnit(TimeUnit.MINUTES)
  public void testMethod(MyState state, Blackhole blackhole) {
    int sum1 = state.a + state.b;
    int sum2 = state.a + state.a + state.b + state.b;

    blackhole.consume(sum1);
    blackhole.consume(sum2);
  }
}
