package cn.xwjrfw.p2p.model.bean;

/**
 * 登录用户信息bean
 */

public class UserInfo extends BaseResponse {

    private DataBean data;

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {
        @Override
        public String toString() {
            return "DataBean{" +
                    "id='" + id + '\'' +
                    ", _class='" + _class + '\'' +
                    ", nickName='" + nickName + '\'' +
                    ", name='" + name + '\'' +
                    ", idCard='" + idCard + '\'' +
                    ", phone='" + phone + '\'' +
                    ", password='" + password + '\'' +
                    ", avatar='" + avatar + '\'' +
                    ", gender='" + gender + '\'' +
                    ", birthday='" + birthday + '\'' +
                    ", age='" + age + '\'' +
                    ", region='" + region + '\'' +
                    ", qqOpenId='" + qqOpenId + '\'' +
                    ", wechatOpenId='" + wechatOpenId + '\'' +
                    ", createTime='" + createTime + '\'' +
                    ", token='" + token + '\'' +
                    ", complete=" + complete +
                    ", balance=" + balance +
                    ", isLogin=" + isLogin +
                    '}';
        }

        private String id;
        private String _class;
        private String nickName;
        private String name;
        private String idCard;
        private String phone;
        private String password;
        private String avatar;
        private String gender;
        private String birthday;
        private String age;
        private String region;
        private String qqOpenId;
        private String wechatOpenId;
        private String createTime;
        private String token;
        private int complete;
        private int balance;
        private boolean isLogin;

        public boolean isLogin() {
            return isLogin;
        }

        public void setLogin(boolean login) {
            isLogin = login;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String get_class() {
            return _class;
        }

        public void set_class(String _class) {
            this._class = _class;
        }

        public String getNickName() {
            return nickName;
        }

        public void setNickName(String nickName) {
            this.nickName = nickName;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getIdCard() {
            return idCard;
        }

        public void setIdCard(String idCard) {
            this.idCard = idCard;
        }

        public String getPhone() {
            return phone;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public String getAvatar() {
            return avatar;
        }

        public void setAvatar(String avatar) {
            this.avatar = avatar;
        }

        public String getGender() {
            return gender;
        }

        public void setGender(String gender) {
            this.gender = gender;
        }

        public String getBirthday() {
            return birthday;
        }

        public void setBirthday(String birthday) {
            this.birthday = birthday;
        }

        public String getAge() {
            return age;
        }

        public void setAge(String age) {
            this.age = age;
        }

        public String getRegion() {
            return region;
        }

        public void setRegion(String region) {
            this.region = region;
        }

        public String getQqOpenId() {
            return qqOpenId;
        }

        public void setQqOpenId(String qqOpenId) {
            this.qqOpenId = qqOpenId;
        }

        public String getWechatOpenId() {
            return wechatOpenId;
        }

        public void setWechatOpenId(String wechatOpenId) {
            this.wechatOpenId = wechatOpenId;
        }

        public String getCreateTime() {
            return createTime;
        }

        public void setCreateTime(String createTime) {
            this.createTime = createTime;
        }

        public String getToken() {
            return token;
        }

        public void setToken(String token) {
            this.token = token;
        }

        public int getComplete() {
            return complete;
        }

        public void setComplete(int complete) {
            this.complete = complete;
        }

        public int getBalance() {
            return balance;
        }

        public void setBalance(int balance) {
            this.balance = balance;
        }
    }
}
