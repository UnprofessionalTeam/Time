package sys.domain.user;

public class TimeInfo {
    private double wenTi;
    private double shuangChuang;
    private double zhiYuan;
    private double xiaoYuan;
    private double liXiang;

    public TimeInfo() {
    }

    public TimeInfo(double wenTi, double shuangChuang, double zhiYuan, double xiaoYuan, double liXiang) {
        this.wenTi = wenTi;
        this.shuangChuang = shuangChuang;
        this.zhiYuan = zhiYuan;
        this.xiaoYuan = xiaoYuan;
        this.liXiang = liXiang;
    }

    public double getWenTi() {
        return wenTi;
    }

    public void setWenTi(double wenTi) {
        this.wenTi = wenTi;
    }

    public double getShuangChuang() {
        return shuangChuang;
    }

    public void setShuangChuang(double shuangChuang) {
        this.shuangChuang = shuangChuang;
    }

    public double getZhiYuan() {
        return zhiYuan;
    }

    public void setZhiYuan(double zhiYuan) {
        this.zhiYuan = zhiYuan;
    }

    public double getXiaoYuan() {
        return xiaoYuan;
    }

    public void setXiaoYuan(double xiaoYuan) {
        this.xiaoYuan = xiaoYuan;
    }

    public double getLiXiang() {
        return liXiang;
    }

    public void setLiXiang(double liXiang) {
        this.liXiang = liXiang;
    }
}
