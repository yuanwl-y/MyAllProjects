package com.ywl.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * 
 * @TableName gspw_userteam
 */
@TableName(value ="gspw_userteam")
@Data
public class GspwUserteam implements Serializable {
    /**
     * 
     */
    @TableId(value = "tId", type = IdType.AUTO)
    private Integer tid;

    /**
     * 所在部门编码
     */
    @TableField(value = "userDeptNo")
    private String userdeptno;

    /**
     * 所在班组
     */
    @TableField(value = "userTeam")
    private String userteam;

    /**
     * 所在部门名称
     */
    @TableField(value = "userDeptName")
    private String userdeptname;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        GspwUserteam other = (GspwUserteam) that;
        return (this.getTid() == null ? other.getTid() == null : this.getTid().equals(other.getTid()))
            && (this.getUserdeptno() == null ? other.getUserdeptno() == null : this.getUserdeptno().equals(other.getUserdeptno()))
            && (this.getUserteam() == null ? other.getUserteam() == null : this.getUserteam().equals(other.getUserteam()))
            && (this.getUserdeptname() == null ? other.getUserdeptname() == null : this.getUserdeptname().equals(other.getUserdeptname()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getTid() == null) ? 0 : getTid().hashCode());
        result = prime * result + ((getUserdeptno() == null) ? 0 : getUserdeptno().hashCode());
        result = prime * result + ((getUserteam() == null) ? 0 : getUserteam().hashCode());
        result = prime * result + ((getUserdeptname() == null) ? 0 : getUserdeptname().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", tid=").append(tid);
        sb.append(", userdeptno=").append(userdeptno);
        sb.append(", userteam=").append(userteam);
        sb.append(", userdeptname=").append(userdeptname);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}