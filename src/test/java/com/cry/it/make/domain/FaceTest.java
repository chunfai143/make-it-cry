package com.cry.it.make.domain;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class FaceTest {

    @Test
    public void should_smile() throws Exception {
        assertThat(new Face().questionFace(), is("question"));
        assertThat(new Face().cryFace(), is("cry"));
        assertThat(new Face().smileFace(), is("smile"));
    }
}