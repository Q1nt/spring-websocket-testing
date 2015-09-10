package base.model;

import java.util.Date;

/**
 * @author sol
 * @since 10.09.15.
 */
public class OutputMessage extends Message {

    private Date date;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
