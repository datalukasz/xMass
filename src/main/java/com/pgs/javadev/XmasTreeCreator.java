package com.pgs.javadev;

public class XmasTreeCreator {

    public static String s = "";
    public static StringBuilder q = new StringBuilder(s);

    public String createXmasTree(String text, int levels, int direction) {
        switch (direction) {
            case 1:
                return this.drawUP(text, levels);
            case 2:
                return this.drawDown(text, levels);
            case 3:
                return this.drawRight(text, levels);
            case 4:
                return this.drawLeft(text, levels);

        }
        return "";
    }

    private static String drawUP(String text, int levels) {

        int j = 1;
        for (int i = levels; i > 0; i--) {

            loop(" ", i - 1);
            loop(text, j);
            q.append("\n");
            j += 2;

        }
        return q.toString();
    }

    private static String drawDown(String text, int levels) {

        int z = 1 + (levels - 1) * 2;
        for (int i = 0; i < levels; i++) {

            loop(" ", i);
            loop(text, z);
            q.append("\n");
            z -= 2;
        }
        return q.toString();
    }

    private static String drawRight(String text, int levels) {

        int medium = levels / 2;

        for (int i = 0; i < levels; i++) {

            if (i < medium) {
                loop(text, i + 1);
                q.append("\n");

            } else if (i == medium) {
                loop(text, i + 1);
                q.append("\n");
            } else {

                loop(text, levels - i);
                q.append("\n");
            }
        }

        return q.toString();
    }

    private static String drawLeft(String text, int levels) {

        int medium = levels / 2;

        for (int i = 0; i < levels; i++) {

            if (i < medium) {
                loop(" ", levels / 2 - i);
                loop(text, i + 1);
                q.append("\n");

            } else if (i == medium) {
                loop(" ", levels / 2 - i);
                loop(text, i + 1);
                q.append("\n");
            } else {

                loop(" ", i - medium);
                loop(text, levels - i);
                q.append("\n");
            }
        }

        return q.toString();
    }

    private static String loop(String text, int levels) {
        for (int i = 0; i < levels; i++) {
            q.append(text);

        }
        return q.toString();
    }

}
