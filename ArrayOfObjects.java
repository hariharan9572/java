class Students{
    int rollno;
    String name;
    int marks;
}

public class ArrayOfObjects {
    public static void main(String[] args){

        Students s1 = new Students();
        s1.rollno = 1;
        s1.name = "Hari";
        s1.marks = 90;

        Students s2 = new Students();
        s2.rollno = 2;
        s2.name = "Divya";
        s2.marks = 98;

        Students s3 = new Students();
        s3.rollno = 3;
        s3.name = "Viji";
        s3.marks = 99;

        Students[] students = new Students[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        // for(int i=0;i<students.length;i++){
        //     System.out.println(students[i].name + " : " + students[i].marks);
        // }

        for(Students stud : students){
            System.out.println(stud.name + " : " + stud.marks);
        }

        // int[] nums = new int[6];

        // nums[0] = 3;
        // nums[1] = 4;
        // nums[2] = 5;
        // nums[3] = 6;

        // for(int i=0;i<nums.length;i++){
        //     System.out.println(nums[i]);
        // }
    }
}
