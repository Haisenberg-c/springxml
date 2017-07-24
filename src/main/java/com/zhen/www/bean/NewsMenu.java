package com.zhen.www.bean;

import javax.persistence.*;

@Entity
@Table(name = "news_menu", schema = "travel")
public class NewsMenu {
    private int menuId;
    private String menuName;
    private String menuPath;
    private Integer menuStatus;

    @Id
    @Column(name = "menu_id")
    public int getMenuId() {
        return menuId;
    }

    public void setMenuId(int menuId) {
        this.menuId = menuId;
    }

    @Basic
    @Column(name = "menu_name")
    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    @Basic
    @Column(name = "menu_path")
    public String getMenuPath() {
        return menuPath;
    }

    public void setMenuPath(String menuPath) {
        this.menuPath = menuPath;
    }

    @Basic
    @Column(name = "menu_status")
    public Integer getMenuStatus() {
        return menuStatus;
    }

    public void setMenuStatus(Integer menuStatus) {
        this.menuStatus = menuStatus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        NewsMenu newsMenu = (NewsMenu) o;

        if (menuId != newsMenu.menuId) return false;
        if (menuName != null ? !menuName.equals(newsMenu.menuName) : newsMenu.menuName != null) return false;
        if (menuPath != null ? !menuPath.equals(newsMenu.menuPath) : newsMenu.menuPath != null) return false;
        if (menuStatus != null ? !menuStatus.equals(newsMenu.menuStatus) : newsMenu.menuStatus != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = menuId;
        result = 31 * result + (menuName != null ? menuName.hashCode() : 0);
        result = 31 * result + (menuPath != null ? menuPath.hashCode() : 0);
        result = 31 * result + (menuStatus != null ? menuStatus.hashCode() : 0);
        return result;
    }
}
