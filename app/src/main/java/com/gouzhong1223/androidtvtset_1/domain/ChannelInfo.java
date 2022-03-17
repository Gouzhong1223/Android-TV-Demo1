package com.gouzhong1223.androidtvtset_1.domain;

/**
 * @Author : Gouzhong
 * @Blog : www.gouzhong1223.com
 * @Description : ChannelInfo 实体类
 * @Date : create by QingSong in 2022-03-15 13:31
 * @Email : gouzhong1223@gmail.com
 * @Since : JDK 1.8
 * @PackageName : com.gouzhong1223.androidtvtset_1.domain
 * @ProjectName : Android TV Tset-1
 * @Version : 1.0.0
 */
public class ChannelInfo {
    /*
     子信道布局，即子信道在MSC 中的位置
     */
    private int[] subChOrganization;
    /*
     服务名，用来关联label
      */
    private int serviceId;
    /*
    发射软件上通道的名称
    */
    private String label;
    /*
    ID，本来是125bytes, 这里仅仅记录是否被选中
    */
    private boolean isSelect = false;
    /*
    传输模式，没使用，固定为0
    */
    private int transmissionMode = 0;
    /*
    节目类型，只有3种
     */
    private int type;
    /*
     子信道编号
     */
    private int subCh;

    public int[] getSubChOrganization() {
        return subChOrganization;
    }

    public void setSubChOrganization(int[] subChOrganization) {
        this.subChOrganization = subChOrganization;
    }

    public int getServiceId() {
        return serviceId;
    }

    public void setServiceId(int serviceId) {
        this.serviceId = serviceId;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public boolean isSelect() {
        return isSelect;
    }

    public void setSelect(boolean select) {
        isSelect = select;
    }

    public int getTransmissionMode() {
        return transmissionMode;
    }

    public void setTransmissionMode(int transmissionMode) {
        this.transmissionMode = transmissionMode;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getSubCh() {
        return subCh;
    }

    public void setSubCh(int subCh) {
        this.subCh = subCh;
    }

    public ChannelInfo(int[] subChOrganization, int serviceId, String label, boolean isSelect, int transmissionMode, int type, int subCh) {
        this.subChOrganization = subChOrganization;
        this.serviceId = serviceId;
        this.label = label;
        this.isSelect = isSelect;
        this.transmissionMode = transmissionMode;
        this.type = type;
        this.subCh = subCh;
    }
}
