package me.dio.domain.model;

public abstract class AbstractContent {
    private Long id;
    private String icon;
    private String description;

    public AbstractContent() {
    }

    public AbstractContent(Long id, String icon, String description) {
        this.id = id;
        this.icon = icon;
        this.description = description;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIcon() {
        return this.icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
