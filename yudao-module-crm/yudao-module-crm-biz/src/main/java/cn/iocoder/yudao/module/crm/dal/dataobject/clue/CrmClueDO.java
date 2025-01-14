package cn.iocoder.yudao.module.crm.dal.dataobject.clue;

import cn.iocoder.yudao.framework.mybatis.core.dataobject.BaseDO;
import cn.iocoder.yudao.module.crm.dal.dataobject.customer.CrmCustomerDO;
import cn.iocoder.yudao.module.crm.enums.DictTypeConstants;
import com.baomidou.mybatisplus.annotation.KeySequence;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.*;

import java.time.LocalDateTime;

// TODO 芋艿：字段的顺序，需要整理下；
/**
 * 线索 DO
 *
 * @author Wanwan
 */
@TableName("crm_clue")
@KeySequence("crm_clue_seq") // 用于 Oracle、PostgreSQL、Kingbase、DB2、H2 数据库的主键自增。如果是 MySQL 等数据库，可不写。
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CrmClueDO extends BaseDO {

    /**
     * 编号，主键自增
     */
    @TableId
    private Long id;
    /**
     * 转化状态
     */
    private Boolean transformStatus;
    /**
     * 跟进状态
     */
    private Boolean followUpStatus;
    /**
     * 线索名称
     */
    private String name;
    /**
     * 客户 id
     *
     * 关联 {@link CrmCustomerDO#getId()}
     */
    private Long customerId;
    /**
     * 下次联系时间
     */
    private LocalDateTime contactNextTime;
    /**
     * 电话
     */
    private String telephone;
    /**
     * 手机号
     */
    private String mobile;
    /**
     * 地址
     */
    private String address;
    /**
     * 最后跟进时间 TODO 添加跟进记录时更新该值
     */
    private LocalDateTime contactLastTime;
    /**
     * 备注
     */
    private String remark;
    /**
     * 负责人的用户编号
     * 关联 AdminUserDO 的 id 字段
     */
    private Long ownerUserId;
    /**
     * 所属行业
     * 对应字典 {@link DictTypeConstants#CRM_CUSTOMER_INDUSTRY}
     */
    private Integer industryId;
    /**
     * 客户等级
     * 对应字典 {@link DictTypeConstants#CRM_CUSTOMER_LEVEL}
     */
    private Integer level;
    /**
     * 客户来源
     * 对应字典 {@link DictTypeConstants#CRM_CUSTOMER_SOURCE}
     */
    private Integer source;
    /**
     * 网址
     */
    private String website;
    /**
     * QQ
     */
    private String qq;
    /**
     * wechat
     */
    private String wechat;
    /**
     * email
     */
    private String email;
    /**
     * 客户描述
     */
    private String description;
}
