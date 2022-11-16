package com.ampei.framework.model;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author ampei
 * @since 2022-09-14
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("t_user")
public class User extends Model<User> {

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    private String username;
    private String nickname;
    private String gender;
    private String telephone;
    private LocalDateTime registerdate;
    private String address;
    @TableField("addTime")
    private LocalDateTime addTime;
    @TableField("updateTime")
    private LocalDateTime updateTime;

}
