package com.smartnews.jpa_entity_generator.rule;
import lombok.Data;

/**
 * Rule used to remove prefix from Java class name for an entity.
 */
@Data
public class ClassPrefixRemoveRule {
    String classPrefix;
}
