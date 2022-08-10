package edu.javacourse.studentorder.domain;

public class StudentOrd {

   private long studentOrderId;
   private Adalt husband;
   private Adalt wife;
   private Child child;


   public long getStudentOrderId() {
      return studentOrderId;
   }

   public void setStudentOrderId(long studentOrderId) {
      this.studentOrderId = studentOrderId;
   }

   public Adalt getHusband() {
      return husband;
   }

   public void setHusband(Adalt husband) {
      this.husband = husband;
   }

   public Adalt getWife() {
      return wife;
   }

   public void setWife(Adalt wife) {
      this.wife = wife;
   }

   public Child getChild() {
      return child;
   }

   public void setChild(Child child) {
      this.child = child;
   }
}
