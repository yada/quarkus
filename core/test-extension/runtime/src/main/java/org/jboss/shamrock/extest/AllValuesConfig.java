package io.quarkus.extest;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalLong;

import io.quarkus.runtime.annotations.ConfigGroup;
import io.quarkus.runtime.annotations.ConfigItem;

@ConfigGroup
public class AllValuesConfig {
    /** a long primitive */
    @ConfigItem
    public long longPrimitive;
    /** a double primitive */
    @ConfigItem
    public double doublePrimitive;
    /** a long value */
    @ConfigItem
    public Long longValue;
    /** an optional long value */
    @ConfigItem
    public OptionalLong optLongValue;
    /** an optional double value */
    @ConfigItem
    public OptionalDouble optDoubleValue;
    /** an optional long value */
    @ConfigItem
    public Optional<Long> optionalLongValue;
    /** A config object with a static of(String) method */
    @ConfigItem
    public ObjectOfValue oov;
    /** A config object with a static of(String) method and default value */
    @ConfigItem(defaultValue = "defaultPart1+defaultPart2")
    public ObjectOfValue oovWithDefault;
    /** A config object with a static valueOf(String) method */
    @ConfigItem
    public ObjectValueOf ovo;
    /** A config object with a static of(String) method and default value */
    @ConfigItem(defaultValue = "defaultPart1+defaultPart2")
    public ObjectValueOf ovoWithDefault;
    /** A map of config group objects */
    @ConfigItem
    public Map<String, NestedConfig> nestedConfigMap;
    /** A List of string values */
    @ConfigItem
    public List<String> stringList;
    /** A List of long values */
    @ConfigItem
    public List<Long> longList;

    @Override
    public String toString() {
        return "AllValuesConfig{" +
                "longPrimitive=" + longPrimitive +
                ", longValue=" + longValue +
                ", optLongValue=" + optLongValue +
                ", optionalLongValue=" + optionalLongValue +
                ", oov=" + oov +
                ", oovWithDefault=" + oovWithDefault +
                ", ovo=" + ovo +
                ", ovoWithDefault=" + ovoWithDefault +
                '}';
    }
}
