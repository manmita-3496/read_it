package com.example.reddit.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    @Entity
    public class Comment {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        private String text;
        @ManyToOne(fetch = FetchType.LAZY)
        @JoinColumn(name = "postId", referencedColumnName = "postId")
        private Post post;
        private Instant createdDate;
        @ManyToOne(fetch = FetchType.LAZY)
        @JoinColumn(name = "userId", referencedColumnName = "userId")
        private User user;
    }

