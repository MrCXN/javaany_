package xiyun.cxn.java.model;

/**
 * @program javaany_
 * @description: test
 * @author: cxn
 * @create: 2019/04/19 15:33
 */
public class Anything extends BaseAnything{

        private int id;
        private String name;
        private String passwd;
        private String sex;
        private String address;

        // 构造器尽量缩小范围
        private Anything() {
        }

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public String getPasswd() {
            return passwd;
        }

        public String getSex() {
            return sex;
        }

        public String getAddress() {
            return address;
        }


        public String toChileToLike(){
            return super.toLike();
        }

        /**
         * Student的创建完全依靠Student.Builder，使用一种方法链的方式来创建
         *
         */
        public static class Builder {

            private Anything target;

            public Builder() {
                 target = new Anything();
            }

            public Builder address(int id) {
                target.id = id;
                return this;
            }

            public Builder like(String like) {
                target.setLike(like);
                return this;
            }

            public Builder name(String name) {
                target.name = name;
                return this;
            }

            public Builder password(String passwd) {
                target.passwd = passwd;
                return this;
            }

            public Builder sex(String sex) {
                target.sex = sex;
                return this;
            }

            public Builder address(String address) {
                target.address = address;
                return this;
            }

            public Anything build() {
                return target;
            }
        }
}
