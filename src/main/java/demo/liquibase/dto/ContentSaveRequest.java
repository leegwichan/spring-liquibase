package demo.liquibase.dto;

import demo.liquibase.v2.AfterContent;

public record ContentSaveRequest(String name, String categoryLabel) {
}
