package com.ywl.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.time.LocalDateTime;
import lombok.Data;

/**
 * 日志记录表
 * @TableName gspw_log
 */
@TableName(value ="gspw_log")
@Data
public class GspwLog {
    /**
     * 主键
     */
    @TableId(value = "log_id", type = IdType.AUTO)
    private Integer logId;

    /**
     * 操作表的主键
     */
    @TableField(value = "log_operationid")
    private Integer logOperationid;

    /**
     * 表名
     */
    @TableField(value = "log_tablename")
    private String logTablename;

    /**
     * 操作动作
     */
    @TableField(value = "log_operation")
    private String logOperation;

    /**
     * 操作内容
     */
    @TableField(value = "log_context")
    private String logContext;

    /**
     * 
     */
    @TableField(value = "archives_id")
    private String archivesId;

    /**
     * 操作日期
     */
    @TableField(value = "log_date")
    private LocalDateTime logDate;

    /**
     * 删除标记
     */
    @TableField(value = "deleteMark")
    private Integer deletemark;

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
        GspwLog other = (GspwLog) that;
        return (this.getLogId() == null ? other.getLogId() == null : this.getLogId().equals(other.getLogId()))
            && (this.getLogOperationid() == null ? other.getLogOperationid() == null : this.getLogOperationid().equals(other.getLogOperationid()))
            && (this.getLogTablename() == null ? other.getLogTablename() == null : this.getLogTablename().equals(other.getLogTablename()))
            && (this.getLogOperation() == null ? other.getLogOperation() == null : this.getLogOperation().equals(other.getLogOperation()))
            && (this.getLogContext() == null ? other.getLogContext() == null : this.getLogContext().equals(other.getLogContext()))
            && (this.getArchivesId() == null ? other.getArchivesId() == null : this.getArchivesId().equals(other.getArchivesId()))
            && (this.getLogDate() == null ? other.getLogDate() == null : this.getLogDate().equals(other.getLogDate()))
            && (this.getDeletemark() == null ? other.getDeletemark() == null : this.getDeletemark().equals(other.getDeletemark()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getLogId() == null) ? 0 : getLogId().hashCode());
        result = prime * result + ((getLogOperationid() == null) ? 0 : getLogOperationid().hashCode());
        result = prime * result + ((getLogTablename() == null) ? 0 : getLogTablename().hashCode());
        result = prime * result + ((getLogOperation() == null) ? 0 : getLogOperation().hashCode());
        result = prime * result + ((getLogContext() == null) ? 0 : getLogContext().hashCode());
        result = prime * result + ((getArchivesId() == null) ? 0 : getArchivesId().hashCode());
        result = prime * result + ((getLogDate() == null) ? 0 : getLogDate().hashCode());
        result = prime * result + ((getDeletemark() == null) ? 0 : getDeletemark().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", logId=").append(logId);
        sb.append(", logOperationid=").append(logOperationid);
        sb.append(", logTablename=").append(logTablename);
        sb.append(", logOperation=").append(logOperation);
        sb.append(", logContext=").append(logContext);
        sb.append(", archivesId=").append(archivesId);
        sb.append(", logDate=").append(logDate);
        sb.append(", deletemark=").append(deletemark);
        sb.append("]");
        return sb.toString();
    }
}