package com.dowan.portfolio.domain.post.entity;

import jakarta.persistence.Embeddable;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class PostTagId implements Serializable {

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        PostTagId postTagId = (PostTagId) o;
        return Objects.equals(postId, postTagId.postId) && Objects.equals(tagId, postTagId.tagId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(postId, tagId);
    }

    private Long postId;
    private Long tagId;
}
