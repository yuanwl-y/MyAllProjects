create table if not exists gspw.gspw_archives
(
    archives_id                 int auto_increment comment '主键'
    primary key,
    archives_name               varchar(200)  null comment '姓名',
    archives_sex                varchar(200)  null comment '性别',
    archives_age                varchar(200)  null comment '年龄',
    user_org                    varchar(100)  null comment '所属单位',
    user_orgCode                varchar(100)  null comment '所属单位编码',
    user_dept                   varchar(100)  null comment '所属部门',
    user_deptCode               varchar(100)  null comment '所属部门编码',
    user_type                   varchar(100)  null comment '人员类型',
    archives_certificate_type   varchar(100)  null comment '证书类型',
    archives_certificate_number varchar(100)  null comment '证书编号',
    archives_test_state         varchar(100)  null comment '安规考试',
    archives_insurance_state    varchar(100)  null comment '保险购置',
    archives_physical_state     varchar(100)  null comment '体检状态',
    archives_state              varchar(100)  null comment '人员状态',
    archives_photo              varchar(200)  null comment '照片信息',
    archives_photo_ur           varchar(200)  null comment '照片路径',
    archives_code               varchar(200)  null comment '二维码信息',
    user_workCode               varchar(200)  null comment '用户工号',
    deleteMark                  int           null comment '删除标记',
    user_place                  varchar(200)  null comment '负责单位',
    user_placeCode              varchar(200)  null comment '负责单位编码',
    user_post                   varchar(200)  null comment '岗位/职务',
    user_subpackage             varchar(20)   null comment '分包标识（0是，1否）',
    departMentInfo              varchar(200)  null comment '部门/单位',
    userFirstOrg                varchar(200)  null comment '市州单位名称',
    userFirstOrgCode            varchar(200)  null comment '市州单位编码',
    idCard                      varchar(200)  null,
    phone                       varchar(200)  null,
    isBlackList                 int           null,
    outCompanyId                int           null,
    userTeamId                  int           null comment '班组id',
    createtime                  varchar(200)  null comment '档案创建时间',
    idcard_url                  varchar(1000) null comment '身份证照片路径'
    )
    comment '人员档案表';

create table if not exists gspw.gspw_archives_record
(
    id                 int auto_increment
    primary key,
    id_card            varchar(200) null comment '身份证',
    update_time        varchar(200) null comment '修改时间',
    update_person_id   int          null comment '修改人id',
    update_person_name varchar(200) null comment '修改人名字',
    oldcompany_name    varchar(200) null comment '以前所在公司名字',
    oldcompany_code    varchar(200) null comment '以前所在公司编码',
    nowcompany_name    varchar(200) null comment '现在所在公司名称',
    nowcompany_code    varchar(200) null comment '现在所在公司编码',
    oldoutcompany_name varchar(200) null comment '以前分包单位名称',
    oldoutcompany_code varchar(200) null comment '以前分包单位编码',
    nowoutcompany_name varchar(200) null comment '现在分包单位名称',
    nowoutcompany_code varchar(200) null comment '现在分包单位编码',
    archives_id        int          null comment '被修改人主键'
    );

create table if not exists gspw.gspw_blacklist
(
    workCode       varchar(200) charset utf8mb3 null comment '工号',
    joinTime       varchar(200) charset utf8mb3 null comment '加入时间',
    accessName     varchar(200) charset utf8mb3 null comment '加入人名字',
    accessWorkCode varchar(200) charset utf8mb3 null comment '加入人工号',
    reason         varchar(200) charset utf8mb3 null comment '原因',
    deleteMark     int                          null comment '删除标记',
    black_type     int default 1                not null
    )
    charset = latin1;

create table if not exists gspw.gspw_cancelplan
(
    cancelPlanId        int auto_increment comment '主键'
    primary key,
    startTime           varchar(200) null comment '开始时间',
    endTime             varchar(200) null comment '结束时间',
    cancel_id           int          null comment '取消人id',
    cancel_name         varchar(200) null comment '取消人名字',
    cancelTime          varchar(200) null comment '取消时间',
    cancelResult        varchar(200) null comment '取消原因',
    constructionPlan_id int          null comment '施工计划主键',
    deleteMark          int          null comment '删除标记',
    days                varchar(30)  null comment '取消天数',
    taskId              varchar(200) null comment '任务id',
    status              int          null comment '状态（0编制 1审核中 2归档 3回退）',
    auditUserName       varchar(200) null comment '审核人名字',
    auditWorkCode       varchar(200) null comment '审核人工号',
    auditResult         varchar(200) null comment '审核结果',
    auditContext        varchar(200) null comment '审核内容'
    );

create index idc_constructionPlan_id
    on gspw.gspw_cancelplan (constructionPlan_id);

create table if not exists gspw.gspw_clock
(
    clock_id            int auto_increment comment '主键'
    primary key,
    sign_time           varchar(100)  null comment '签到时间',
    back_time           varchar(100)  null comment '签退时间',
    clock_addr          varchar(200)  null comment '签到坐标',
    sign_clock_mark     int           null comment '签到标记(1:正常 2:迟到)',
    archives_id         int           null comment '用户id',
    deleteMark          int default 0 null comment '删除标记',
    day                 int           null,
    back_clock_mark     int           null comment '签退标记',
    back_addr           varchar(200)  null,
    constructionPlan_id int           null,
    sign_lati           varchar(200)  null,
    back_lati           varchar(200)  null,
    workLoad            varchar(200)  null,
    path                varchar(2000) null,
    work_ticket_url     varchar(2000) null comment '工作票照片',
    ground_protect_url  varchar(2000) null comment '接地保护照片',
    work_map_url        varchar(2000) null comment '施工蓝图'
    )
    comment '签到记录表';

create index idx_archives_id
    on gspw.gspw_clock (archives_id);

create index idx_constructionPlan_id
    on gspw.gspw_clock (constructionPlan_id);

create table if not exists gspw.gspw_constructionplan
(
    constructionPlan_id        int auto_increment comment '主键'
    primary key,
    surveyInfo_id              int           null comment '工程名称(勘察信息主键)',
    constructionPlan_content   varchar(1024) null comment '作业内容',
    constructionPlan_startTime datetime      null comment '开始时间',
    constructionPlan_endTime   datetime      null comment '结束时间',
    archives_name              varchar(200)  null comment '负责人',
    archives_id                int           null comment '档案id',
    constructionPlan_addr      varchar(1000) null comment '地点（坐标）',
    constructionPlan_number    int           null comment '人数',
    taskid                     varchar(100)  null comment '流程任务id',
    constructionPlan_state     varchar(10)   null comment '状态（0编制 1审核中 2归档 3回退）',
    constructionPlan_kind      int           null comment '施工计划种类0代表临时施工计划 1代表正常施工计划',
    flowaudit_startDate        datetime      null comment '流程开始时间',
    deleteMark                 int           null comment '删除标记',
    super_visor                int           null comment '监理人id',
    supervisor_name            varchar(100)  null comment '监理人名称',
    people_ids                 varchar(1000) null comment '施工人id集合字符串',
    update_time                datetime      null comment '变更时间',
    update_state               int           null comment '变更标记',
    safetyOfficer_name         varchar(100)  null comment '技术员名字',
    technician_name            varchar(100)  null comment '技术员名字',
    safety_officer             int           null comment '安全员id',
    create_date                datetime      null comment '创建时间',
    technician                 int           null comment '技术员id',
    supervisor_orgcode         varchar(100)  null comment '监理单位代码',
    supervisor_orgname         varchar(100)  null comment '监理单位名称'
    )
    comment '施工计划表';

create index archives_name
    on gspw.gspw_constructionplan (archives_name);

create index idx_archives_id
    on gspw.gspw_constructionplan (archives_id);

create index idx_surveyInfo_id
    on gspw.gspw_constructionplan (surveyInfo_id);

create table if not exists gspw.gspw_constructionplan_flowaudit
(
    constructionPlan_flowaudit_id      int auto_increment comment '主键'
    primary key,
    constructionPlan_id                int                     null comment '审核任务id',
    user_name                          varchar(200) default '' null comment '审核人姓名',
    user_deptCode                      varchar(100)            null comment '审核人部门编码',
    user_dept                          varchar(500) default '' null comment '审核人部门',
    user_workCode                      varchar(100)            null comment '审核人工号',
    user_orgCode                       varchar(100)            null comment '审核单位编码',
    user_org                           varchar(100)            null comment '审核单位',
    constructionPlan_flowaudit_date    datetime                null comment '审核时间',
    constructionPlan_flowaudit_context varchar(4000)           null comment '审核意见',
    constructionPlan_flowaudit_result  varchar(200)            null comment '审核结果',
    taskid                             varchar(100)            null comment '任务id',
    deleteMark                         int                     null comment '删除标记(1 已删除)'
    )
    comment '施工计划审核表';

create table if not exists gspw.gspw_dispatch
(
    dispatch_id         int auto_increment comment '调度主键'
    primary key,
    archives_id         int                             not null comment '关联人员档案id',
    start_time          datetime                        not null comment '开始时间',
    end_time            datetime                        not null comment '结束时间',
    deletemark          int                             not null comment '删除标记',
    constructionPlan_id int                             not null comment '施工计划关联的id',
    dispatch_type       varchar(32) collate utf8mb3_bin not null comment '人员调度种类',
    dispatch_state      int                             null comment '人员调度状态 0,空闲 1,执行 2,挂起'
    );

create index index_archives
    on gspw.gspw_dispatch (archives_id);

create index index_time
    on gspw.gspw_dispatch (end_time, start_time);

create table if not exists gspw.gspw_file
(
    file_id    int auto_increment comment '主键'
    primary key,
    file_name  varchar(255) charset utf8mb3  null comment '文件名称',
    file_url   varchar(2000) charset utf8mb3 null comment '文件路径',
    file_date  datetime                      null comment '添加时间',
    deleteMark int                           null
    )
    comment '文件表' charset = latin1;

create table if not exists gspw.gspw_integratedproject
(
    integratedProject_id    int auto_increment comment '综合计划批次id'
    primary key,
    integratedProject_name  varchar(100) null comment '综合计划批次名称',
    integratedProject_year  varchar(200) null comment '批次年度',
    integratedProject_state int          null comment '批次状态',
    integratedProject_stick int          null comment '置顶字段',
    deleteMark              int          null comment '删除标记（1 已删除）'
    )
    comment '综合计划表';

create table if not exists gspw.gspw_load_device
(
    device_id       int auto_increment comment '主键'
    primary key,
    device_score_id int                      null comment '评分详情id',
    device_type_id  int          default 0   null comment '设备类型id',
    device_name     varchar(200)             null comment '设备名称',
    device_purpose  varchar(200)             null comment '用途',
    device_no       varchar(4)   default '0' null comment '必备数量',
    device_final_no varchar(4)   default '0' null comment '实际数量',
    device_context  varchar(618) default '0' null comment '备注',
    device_url      varchar(618) default '0' null comment '图片url集合',
    device_grade    varchar(3)   default '0' null comment '分数',
    delete_mark     int          default 1   not null comment '设备类型0小类1大类'
    )
    comment '承载力分析_设备详情表';

create table if not exists gspw.gspw_load_device_type
(
    devicetype_id   int auto_increment
    primary key,
    devicetype_name varchar(50)   not null comment '设备类型名称',
    delete_mark     int default 1 not null comment '0表示删除 1表示未删除',
    device_state    int default 0 not null comment '0表示 小型设备 1表示大型设备'
    );

create table if not exists gspw.gspw_load_score
(
    score_id              int auto_increment comment '主键'
    primary key,
    score_project_name    varchar(200) default '0' null comment '工程名称',
    score_project_id      int          default 0   null comment '工程id',
    score_contractor      varchar(200) default '0' null comment '承包商',
    score_contractor_code varchar(200) default '0' null comment '承包商编码',
    score_owner_grade     int          default 0   null comment '业主评分',
    score_city_grade      int          default 0   null comment '市公司管理评分',
    score_dept_name       varchar(200) default '0' null comment '施工项目部',
    score_dept_code       varchar(200) default '0' null comment '施工项目部编码',
    score_group           varchar(200) default '0' null comment '评分组',
    score_group_code      varchar(200) default '0' null comment '评分组编码',
    score_total           varchar(50)              null comment '合计',
    score_time            varchar(50)  default '0' null comment '发布时间',
    score_state           int          default 0   null comment '发布状态0发布 1未发布',
    score_orgcode         varchar(50)              null comment '负责单位编码',
    score_orgcitycode     varchar(50)              null comment '市州单位编码',
    delete_mark           varchar(50)              null,
    select_state          int                      null comment '0发布 1未发布'
    )
    comment '承载力分析_打分详情表';

create table if not exists gspw.gspw_load_time
(
    time_id       int auto_increment comment '主键'
    primary key,
    time_details  varchar(100) default '0' not null comment '时间详情',
    time_org_code varchar(100) default '0' not null comment '被发布的施工单位',
    time_score_id int                      null comment '发布详情'
    )
    comment '承载力模块_评分发布时间表';

create table if not exists gspw.gspw_load_type
(
    type_id       int auto_increment
    primary key,
    type_name     varchar(100) default '0' not null comment '打分类型名称',
    type_grade    varchar(3)               not null comment '该类型的总分',
    type_method   varchar(1020)            not null comment '评价方法',
    type_standard varchar(1020)            not null comment '评价标准',
    delete_mark   int          default 0   not null comment '删除标记'
    )
    comment '承载力分析_打分类型表';

create table if not exists gspw.gspw_load_type_grade
(
    grade_id       int auto_increment
    primary key,
    grade_vo       int default 0 null,
    grade_url      varchar(1024) null,
    grade_type_id  int           null,
    grade_score_id int           null,
    delete_mark    int default 1 not null,
    role           varchar(50)   not null comment '角色'
    )
    comment '每一个小类的评分';

create table if not exists gspw.gspw_log
(
    log_id          int auto_increment comment '主键'
    primary key,
    log_operationid int           null comment '操作表的主键',
    log_tablename   varchar(500)  null comment '表名',
    log_operation   varchar(500)  null comment '操作动作',
    log_context     varchar(4000) null comment '操作内容',
    archives_id     varchar(100)  null,
    log_date        datetime      null comment '操作日期',
    deleteMark      int           null comment '删除标记'
    )
    comment '日志记录表';

create index idx_archives_id
    on gspw.gspw_log (archives_id);

create table if not exists gspw.gspw_monproject
(
    monproject_id                     varchar(36)   not null comment '主键'
    primary key,
    monproject_name                   varchar(500)  null comment '单体项目名称',
    monproject_wbs                    varchar(200)  null comment '单体项目编码',
    project_wbs                       varchar(200)  null comment '打包wbs编码',
    monproject_investment             varchar(100)  null comment '投资金额',
    monproject_context                varchar(4000) null comment '单体项目内容',
    monproject_date                   datetime      null,
    monproject_flowaudit_userWorkCode varchar(100)  null,
    monproject_flowaudit_userName     varchar(100)  null,
    monproject_report_userName        varchar(100)  null,
    monproject_report_userWorkCode    varchar(100)  null,
    monproject_isUse                  int           null,
    status                            varchar(100)  null,
    taskid                            varchar(100)  null,
    deleteMark                        int           null
    )
    comment '单体项目';

create index idx_project_wbs
    on gspw.gspw_monproject (project_wbs);

create table if not exists gspw.gspw_monproject_flowaudit
(
    monproject_flowaudit_id      varchar(36)   not null comment 'uuid'
    primary key,
    monproject_id                varchar(100)  null comment '单体项目主键',
    user_name                    varchar(200)  null comment '审核人姓名',
    user_deptCode                varchar(200)  null comment '审核人单位编码',
    user_dept                    varchar(500)  null comment '审核人部门',
    user_workCode                varchar(100)  null comment '审核工号',
    user_orgCode                 varchar(100)  null comment '审核人单位编码',
    user_org                     varchar(100)  null comment '审核人单位',
    monproject_flowaudit_date    datetime      null comment '审核时间',
    monproject_flowaudit_context varchar(4000) null comment '审核内容',
    monproject_flowaudit_result  varchar(100)  null comment '审核结果',
    taskid                       varchar(100)  null comment '任务id',
    deleteMark                   int           null
    )
    comment '单体项目审核表';

create table if not exists gspw.gspw_notice
(
    id            int auto_increment
    primary key,
    file_path     varchar(200) null comment '文件路径',
    is_case       int          null comment '是否案例',
    user_org      varchar(200) null comment '上传人所在县单位名称',
    user_org_code varchar(200) null comment '上传人所在县单位编码',
    user_workcode varchar(200) null comment '上传人工号',
    user_name     varchar(200) null comment '上传人姓名',
    file_name     varchar(200) null comment '文件名',
    deletemark    int          null comment '删除标记'
    );

create table if not exists gspw.gspw_orgnature
(
    nature_id           int          not null comment '主键'
    primary key,
    nature_orgname      varchar(100) null comment '单位名',
    nature_name         varchar(100) null comment '性质名称',
    nature_abbreviation varchar(100) null comment '简称',
    nature_code         varchar(100) null comment '排序字段'
    )
    comment '单位性质';

create table if not exists gspw.gspw_outcompany
(
    loaded_photo_url         varchar(200)                 null,
    safety_photo_url         varchar(200)                 null,
    qualifications_photh_url varchar(200)                 null,
    id                       int auto_increment
    primary key,
    companyName              varchar(200) charset utf8mb3 null comment '外包单位名称',
    subCompany               varchar(200) charset utf8mb3 null comment '所属单位',
    legal_person             varchar(200) charset utf8mb3 not null,
    license_photo_url        varchar(200)                 not null
    )
    charset = latin1;

create table if not exists gspw.gspw_packproject
(
    packProject_id       int auto_increment comment '主键'
    primary key,
    packProject_name     varchar(200) null comment '项目名称',
    packProject_wbs      varchar(100) null comment '打包项目wbs编码',
    packProject_number   varchar(100) null comment '业务编码',
    integratedProject_id int          null comment '综合计划批次id',
    packProject_org      varchar(200) null comment '创建单位',
    packProject_orgCode  varchar(200) null comment '创建单位编码',
    deleteMark           int          null comment '删除标记',
    time                 datetime     null
    )
    comment '项目打包表';

create index idx_integratedProject_id
    on gspw.gspw_packproject (integratedProject_id);

create index idx_packProject_wbs
    on gspw.gspw_packproject (packProject_wbs);

create table if not exists gspw.gspw_planchange_auit
(
    planChangeAuid_id     int auto_increment comment '变更审核主键'
    primary key,
    content_id            varchar(36)  null comment '变更表id',
    taskId                varchar(200) null comment '任务id',
    audit_username        varchar(200) null comment '审核业主名字',
    audit_worknum         varchar(200) null comment '审核业主工号',
    audit_result          varchar(200) null comment '审核结果',
    audit_context         varchar(200) null comment '审核内容',
    status                int          null comment '状态（0编制 1审核中 2归档 3回退 4.未全员审核通过）',
    audit_managername     varchar(200) null comment '审核的市管理员名字',
    audit_managerworknum  varchar(200) null comment '审核的市管理员工号',
    audit_manager_result  varchar(200) null comment '市管理员审核结果',
    audit_manager_context varchar(200) null comment '市管理员审核内容',
    report_time           varchar(200) null comment '上报时间',
    audit_time            varchar(200) null comment '审核时间',
    manager_audit_time    varchar(200) null comment '市管理员审核时间'
    );

create index idx_content_id
    on gspw.gspw_planchange_auit (content_id);

create table if not exists gspw.gspw_planchange_content
(
    uuid                varchar(36)   not null
    primary key,
    constructionplan_id int           null comment '审核表主键',
    planchange_type     int           null comment '变更类型（1,变更内容  2，变更人员  3变更日计划时间）',
    planchange_content  varchar(4000) null comment '变更内容',
    last_content        varchar(4000) null comment '变更前的内容',
    reason              varchar(4000) null comment '变更原因',
    create_date         datetime      null comment '创建时间',
    deleteMark          int           null comment '删除标记'
    )
    comment '施工计划变更 内容表';

create index idx_constructionplan_id
    on gspw.gspw_planchange_content (constructionplan_id);

create table if not exists gspw.gspw_post
(
    id     int auto_increment
    primary key,
    post   varchar(200) charset utf8mb3 null comment '职位',
    number int                          null comment '序号'
    )
    charset = latin1;

create table if not exists gspw.gspw_preparation
(
    preparation_id                  int auto_increment comment '主键id'
    primary key,
    preparation_constructionPlan_id int          not null comment '对应的施工计划id',
    preparation_jiaodi              varchar(512) null comment '交底',
    preparation_lantu               varchar(512) null comment '蓝图',
    preparation_piao                varchar(512) null comment '工作票',
    preparation_jiedi               varchar(512) null comment '接地'
    )
    comment '施工计划签到前需要的施工蓝图，安全接地，安全交底，工作票照片路径';

create table if not exists gspw.gspw_result_summary
(
    id            int auto_increment comment '主键'
    primary key,
    org_name      varchar(200) null comment '单位名称',
    org_code      varchar(200) null comment '单位编码',
    result        varchar(200) null comment '考核结果',
    release_time  varchar(200) null comment '发布事件',
    user_name     varchar(200) null comment '发布人名字',
    user_workcode varchar(200) null comment '发布人工号',
    total_score   int          null comment '总成绩'
    );

create table if not exists gspw.gspw_score
(
    id                       int auto_increment
    primary key,
    user_worknumber          varchar(200)  null comment '添加人工号',
    user_name                varchar(200)  null comment '添加人名字',
    org_name                 varchar(200)  null comment '添加人所属单位名称',
    org_code                 varchar(200)  null comment '添加人所属单位编码',
    build_department_grade   int           null comment '项目部建设分数',
    work_grade               int           null comment '文明施工分数',
    pay_grade                int           null comment '资金支付分数',
    material_grade           int           null comment '结余物资分数',
    waste_material_grade     int           null comment '废旧物资分数',
    project_safe_grade       int           null comment '项目安全分数',
    project_quality_grade    int           null comment '项目质量分数',
    project_progress_grade   int           null comment '项目进度分数',
    system_application_grade int           null comment '系统应用分数',
    quantity_grade           int           null comment '工程量准确性分数',
    finish_grade             int           null comment '竣工结算分数',
    data_grade               int           null comment '资料及时性分数',
    company_grade            int           null comment '企业资质分数',
    engineer_grade           int           null comment '大型机械分数',
    manager_grade            int           null,
    result_grade             int           null comment '业绩分数',
    person_grade             int           null comment '企业人员分数',
    record_grade             int           null comment '企业不良信用记录分数',
    project_manager_grade    int           null comment '项目经理分数',
    prize_grade              int default 0 null comment '获奖加分分数',
    break_rules_grade        int default 0 null comment '违章事件扣分分数',
    default_grade            int default 0 null comment '违约事件扣分分数',
    break_promise_grade      int default 0 null comment '失信事件扣分分数',
    release_org_name         varchar(200)  null comment '发布单位名称',
    release_org_code         varchar(200)  null comment '发布单位编码'
    );

create table if not exists gspw.gspw_specialintegrated
(
    special_id     varchar(36)   not null comment '主键'
    primary key,
    special_name   varchar(400)  null comment '专项批次名字',
    special_year   varchar(20)   null comment '年度',
    special_stick  int           null comment '置顶标记',
    integrated_id  varchar(4000) null comment '批次主键用,分隔',
    special_remark varchar(2000) null comment '备注',
    deleteMark     int           null
    )
    comment '专项批次';

create table if not exists gspw.gspw_surveyinfo
(
    surveyInfo_id       int auto_increment comment '主键'
    primary key,
    packProject_id      int           null comment '项目名称(项目打包主键）',
    monproject_id       varchar(36)   null,
    surveyInfo_wbs      varchar(100)  null comment 'ERP项目编码',
    surveyInfo_name     varchar(100)  null comment '工程名称',
    surveyInfo_position varchar(1000) null comment '工程位置（坐标）',
    deleteMark          int           null comment '删除标记',
    panoramic_photo     varchar(2000) null comment '全景照片',
    disclose_photo      varchar(2000) null comment '交底照片',
    workTicket_photo    varchar(2000) null comment '工作量照片',
    content             varchar(2500) null comment '勘察备注',
    is_import           int           null
    )
    comment '现场勘查表';

create index idx_monProject_id
    on gspw.gspw_surveyinfo (monproject_id);

create index idx_packProject_id
    on gspw.gspw_surveyinfo (packProject_id);

create table if not exists gspw.gspw_userteam
(
    tId          int auto_increment
    primary key,
    userDeptNo   varchar(200) charset utf8mb3 null comment '所在部门编码',
    userTeam     varchar(200) charset utf8mb3 null comment '所在班组',
    userDeptName varchar(200) charset utf8mb3 null comment '所在部门名称'
    )
    charset = latin1;

create table if not exists gspw.gspw_version
(
    version_id      int          not null comment '主键'
    primary key,
    version_no      varchar(100) null comment '版本号',
    version_name    varchar(100) null comment '版本名',
    version_force   int          null comment '是否强制更新（0:不强制  1:强制）',
    version_context varchar(400) null comment '更新内容',
    version_url     varchar(200) null comment '下载路径'
    )
    comment '版本表';

