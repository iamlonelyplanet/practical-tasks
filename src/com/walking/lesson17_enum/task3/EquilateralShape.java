package com.walking.lesson17_enum.task3;


enum EquilateralShape {


//    EQUILATERAL_TRIANGLE {
//        final String SPACE_SYM = " ";
//        final String EMPTY_SYM = "";
//        final String NEW_STRING = "\n";
//        final String TRIANGLE_LEFT = "/";
//        final String TRIANGLE_RIGHT = "\\";
//        final String HORIZONTAL_SYM = "--";
//

//        draw(size);
//
//
//        public String draw(int size) {
//            String triangle = EMPTY_SYM;
//            for (int i = 0; i < size; i++) {
//                for (int j = 0; j < size - i; j++) {
//                    triangle += SPACE_SYM;
//                }
//
//                triangle += TRIANGLE_LEFT;
//
//                for (int j = 0; j < 2 * i; j++) {
//                    triangle += SPACE_SYM;
//                }
//
//                triangle += TRIANGLE_RIGHT + NEW_STRING;
//            }
//
//            triangle += SPACE_SYM;
//
//            for (int i = 0; i < size; i++) {
//                triangle += HORIZONTAL_SYM;
//            }
//
//            return triangle;
//
//        },
//
//        SQUARE {
//            final String SPACE_SYM = " ";
//            final String EMPTY_SYM = "";
//            final String NEW_STRING = "\n";
//            final String VERTICAL_SYM = "|";
//            final String HORIZONTAL_SYM = "-";
//
//            public String draw ( int size){
//                return drawTopLine(size) + drawMiddleLines() + drawTopLine();
//
//            String drawTopLine () {
//                String line = EMPTY_SYM;
//
//                for (int i = 0; i < size; i++) {
//                    line += HORIZONTAL_SYM;
//                }
//                line += EMPTY_SYM + NEW_STRING;
//
//                return line;
//            }
//
//             String drawMiddleLines () {
//                String line = EMPTY_SYM;
//                for (int i = 0; i < size - 2; i++) {
//                    line += VERTICAL_SYM;
//
//                    for (int j = 0; j < size - 2; j++) {
//                        line += SPACE_SYM;
//                    }
//
//                    line += VERTICAL_SYM;
//                    line += NEW_STRING;
//                }
//
//                return line;
//            }
//        }
//
//
//        public String draw(int size) {
//            return "";
//        }
//    };
//
//    abstract String draw(int size);
}
