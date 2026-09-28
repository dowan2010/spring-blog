package com.dowan.portfolio.domain.post.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity(name = "post_tags")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class PostTag {

    @EmbeddedId
    private PostTagId postTagId;

    @ManyToOne
    @MapsId(value = "postId")
    @JoinColumn(name = "post_id")
    private Post post;


    @ManyToOne
    @MapsId(value = "tagId")
    @JoinColumn(name = "tag_id")
    private Tag tag;

}
