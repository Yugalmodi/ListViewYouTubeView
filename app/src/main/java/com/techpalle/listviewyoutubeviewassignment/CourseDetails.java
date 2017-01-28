package com.techpalle.listviewyoutubeviewassignment;

/**
 * Created by DELL on 12/7/2016.
 */
public class CourseDetails {
    private String cno, cname, cduration, cvideoLink;

    public CourseDetails() {
    }

    public CourseDetails(String cno, String cname, String cduration, String cvideoLink) {
        this.cno = cno;
        this.cname = cname;
        this.cduration = cduration;
        this.cvideoLink = cvideoLink;
    }

    public String getCno() {
        return cno;
    }

    public void setCno(String cno) {
        this.cno = cno;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getCduration() {
        return cduration;
    }

    public void setCduration(String cduration) {
        this.cduration = cduration;
    }

    public String getCvideoLink() {
        return cvideoLink;
    }

    public void setCvideoLink(String cvideoLink) {
        this.cvideoLink = cvideoLink;
    }
}
