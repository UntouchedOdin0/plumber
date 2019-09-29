package me.bristermitten.plumber.object.builder.impl;

import com.google.inject.Inject;
import com.google.inject.assistedinject.Assisted;
import me.bristermitten.plumber.object.builder.PlayerActionBuilder;
import me.bristermitten.plumber.scheduling.TaskFactory;
import me.bristermitten.plumber.scheduling.timings.TimeUnitPickerFactory;
import org.jetbrains.annotations.NotNull;

public class PlayerTaskLengthConfiguration extends DefaultTaskLengthConfiguration<PlayerActionBuilder> {
    @Inject
    public PlayerTaskLengthConfiguration(@Assisted @NotNull PlayerActionBuilder value,
                                         @NotNull TimeUnitPickerFactory factory, TaskFactory taskFactory) {
        super(value, factory, taskFactory);
    }
}