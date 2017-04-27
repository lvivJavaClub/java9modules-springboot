module userservice {
    requires spring.data.mongodb;
    requires lombok;
    requires spring.beans;
    requires spring.context;

    requires spring.data.commons;
    requires mongo.java.driver;

    exports com.lohika.java9modules.user;
    exports com.lohika.java9modules.user.service;

    opens com.lohika.java9modules.user.service;
}