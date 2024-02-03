package LearnTheBasics;

public class DataTypes {

    public static void main(String[] args) {

        System.out.println(dataTypes("Long"));

    }
    public static int dataTypes(String type) {


        if (type.equals("Character")) {

            return 1;

        }

        else if(type.equals("Integer")) {

            return 4;

        }

        else if (type.equals("Float")) {

            return 4;

        }

        else if (type.equals("Long")) {

            return 8;

        }

        else if (type.equals("Double")) {

            return 8;

        }

        return -1;

    }

}