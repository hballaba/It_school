package com.functionalProgramming;

@FunctionalInterface
interface TriFunction<A, B, C, D> {

    D apply(A a, B b, C c);
}

