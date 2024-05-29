package com.indeed.proctor.common.model;

import lombok.Builder;
import lombok.Data;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.util.List;

@Data
@Builder
public class PayloadExperimentConfig {
    @Nullable String priority;
    @Nonnull List<String> namespace;
}
