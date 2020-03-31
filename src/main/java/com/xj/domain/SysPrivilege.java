package com.xj.domain;

public class SysPrivilege {
    private Long id;
    private String privilegeName;
    private String privilegeURL;

    @Override
    public String toString() {
        return "SysPrivilege{" +
                "id=" + id +
                ", privilegeName='" + privilegeName + '\'' +
                ", privilegeURL='" + privilegeURL + '\'' +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPrivilegeName() {
        return privilegeName;
    }

    public void setPrivilegeName(String privilegeName) {
        this.privilegeName = privilegeName;
    }

    public String getPrivilegeURL() {
        return privilegeURL;
    }

    public void setPrivilegeURL(String privilegeURL) {
        this.privilegeURL = privilegeURL;
    }
}
