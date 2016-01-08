package com.rex.wepeiyang.bean;

import java.util.List;

/**
 * Created by sunjuntao on 15/12/3.
 */
public class Main {
    public int error_code;
    public String message;
    public Data data;


    public class Data {
        public List<Carousel> carousel;
        public News news;
        public Service service;

        public class Carousel {
            public int index;
            public String subject;
            public String pic;
        }

        public class News {
            public List<Campus> campus;
            public List<Annoucement> annoucements;
            public List<Job> jobs;

            public class Campus {
                public int index;
                public String pic;
                public String addat;
                public String visitcount;
                public String subject;
            }

            public class Annoucement {
                public int index;
                public String subject;
                public String addat;
                public String gonggao;
            }

            public class Job {
                public int id;
                public String title;
                public String date;
            }
        }

        public class Service {
            List<LostFound> lost;
            List<LostFound> found;

            public class LostFound {
                public int id;
                public String ename;
            }
        }
    }
}