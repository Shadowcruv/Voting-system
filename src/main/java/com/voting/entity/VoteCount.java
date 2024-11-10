package com.voting.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class VoteCount {
    private Long id;
    private int totalVotes;
    private int trumpVotes;
    private int kamalaVotes;
    private LocalDateTime endTime;


}

