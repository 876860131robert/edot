package com.asiainfo.aigov.model.healthcare.doctor;

public class PublicDoctorCircleVisual {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PUBLIC_DOCTOR_CIRCLE_VISUAL.DOCTOR_CIRCLE_VISUAL_ID
     *
     * @mbggenerated Tue Apr 18 21:44:35 CST 2017
     */
    private String doctorCircleVisualId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PUBLIC_DOCTOR_CIRCLE_VISUAL.DOCTOR_CIRCLE_ID
     *
     * @mbggenerated Tue Apr 18 21:44:35 CST 2017
     */
    private String doctorCircleId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PUBLIC_DOCTOR_CIRCLE_VISUAL.USER_ID
     *
     * @mbggenerated Tue Apr 18 21:44:35 CST 2017
     */
    private String userId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PUBLIC_DOCTOR_CIRCLE_VISUAL.DOCTOR_CIRCLE_VISUAL_ID
     *
     * @return the value of PUBLIC_DOCTOR_CIRCLE_VISUAL.DOCTOR_CIRCLE_VISUAL_ID
     *
     * @mbggenerated Tue Apr 18 21:44:35 CST 2017
     */
    public String getDoctorCircleVisualId() {
        return doctorCircleVisualId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PUBLIC_DOCTOR_CIRCLE_VISUAL.DOCTOR_CIRCLE_VISUAL_ID
     *
     * @param doctorCircleVisualId the value for PUBLIC_DOCTOR_CIRCLE_VISUAL.DOCTOR_CIRCLE_VISUAL_ID
     *
     * @mbggenerated Tue Apr 18 21:44:35 CST 2017
     */
    public void setDoctorCircleVisualId(String doctorCircleVisualId) {
        this.doctorCircleVisualId = doctorCircleVisualId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PUBLIC_DOCTOR_CIRCLE_VISUAL.DOCTOR_CIRCLE_ID
     *
     * @return the value of PUBLIC_DOCTOR_CIRCLE_VISUAL.DOCTOR_CIRCLE_ID
     *
     * @mbggenerated Tue Apr 18 21:44:35 CST 2017
     */
    public String getDoctorCircleId() {
        return doctorCircleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PUBLIC_DOCTOR_CIRCLE_VISUAL.DOCTOR_CIRCLE_ID
     *
     * @param doctorCircleId the value for PUBLIC_DOCTOR_CIRCLE_VISUAL.DOCTOR_CIRCLE_ID
     *
     * @mbggenerated Tue Apr 18 21:44:35 CST 2017
     */
    public void setDoctorCircleId(String doctorCircleId) {
        this.doctorCircleId = doctorCircleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PUBLIC_DOCTOR_CIRCLE_VISUAL.USER_ID
     *
     * @return the value of PUBLIC_DOCTOR_CIRCLE_VISUAL.USER_ID
     *
     * @mbggenerated Tue Apr 18 21:44:35 CST 2017
     */
    public String getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PUBLIC_DOCTOR_CIRCLE_VISUAL.USER_ID
     *
     * @param userId the value for PUBLIC_DOCTOR_CIRCLE_VISUAL.USER_ID
     *
     * @mbggenerated Tue Apr 18 21:44:35 CST 2017
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC_DOCTOR_CIRCLE_VISUAL
     *
     * @mbggenerated Tue Apr 18 21:44:35 CST 2017
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", doctorCircleVisualId=").append(doctorCircleVisualId);
        sb.append(", doctorCircleId=").append(doctorCircleId);
        sb.append(", userId=").append(userId);
        sb.append("]");
        return sb.toString();
    }
}