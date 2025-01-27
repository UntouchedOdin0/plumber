package me.bristermitten.plumber.scheduling;

import me.bristermitten.plumber.aspect.AspectAnnotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Aspect annotation linking to {@link SchedulerAspect}
 * Currently, does nothing as the scheduler aspect is always loaded
 */
@AspectAnnotation(target = SchedulerAspect.class)
@Retention(RetentionPolicy.RUNTIME)
public @interface ScheduledTask {


}
