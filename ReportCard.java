package com.example.android.miwok;

/**
 * Created by luisp on 24/05/2017.
 */

/**
 * {@link ReportCard} represents the marks that are applied to different subjects.
 */
public class ReportCard {

    /** Name of subjects marks */
    private int mMathsMark;
    private int mCProgramming;
    private int mAndroidProgrammingMark;
    private int mGeneralPhysicsMark;
    private int mQuantumPhysicsMark;
    private int mChemicalPhysicsMark;

    /**
     * Create a new ReportCard object.
     *
     * @param mathsMark is the mark for maths
     *
     * @param cProgrammingMark the mark for C Programming
     *
     * @param androidProgrammingMark is the mark for Android Programming
     *
     * @param generalPhysicsMark the mark for General Physics
     *
     * @param quantumPhysiscsMark is the mark for Quantum Physiscs
     *
     * @param chemicalPhysicsMark the mark for Chemical Physics
     *
     *
     * Constructor
     */
    public ReportCard(int mathsMark, int cProgrammingMark, int androidProgrammingMark, int generalPhysicsMark,
                      int quantumPhysiscsMark, int chemicalPhysicsMark) {

        mMathsMark = mathsMark;
        mCProgramming = cProgrammingMark;
        mAndroidProgrammingMark = androidProgrammingMark;
        mGeneralPhysicsMark = generalPhysicsMark;
        mQuantumPhysicsMark = quantumPhysiscsMark;
        mChemicalPhysicsMark = chemicalPhysicsMark;
    }


        /**  GETTERS DEFINITION */
        /**  ****************** */

        /** Get the Maths mark */
        public int getMathsMark() {
            return mMathsMark;
        }

        /** Get the C Programming mark */
        public int getCProgrammingMark() {
            return mCProgramming;
        }

        /** Get the Android Programming mark */
        public int getAndroidProgrammingMark() {
            return mAndroidProgrammingMark;
        }

        /** Get the General Physics mark */
        public int getGeneralPhysicsMark() {
            return mGeneralPhysicsMark;
        }

        /** Get the Quantum Physiscs mark */
        public int getQuantumPhysiscsMark() {
            return mQuantumPhysicsMark;
        }

        /** Get the Chemical Physics mark */
        public int getChemicalPhysiscsMark() {
            return mChemicalPhysicsMark;
        }

        /**  SETTERS DEFINITION */
        /**  ****************** */

        /** Set the Maths mark */
        public void setMathsMark(int mathsMark) {
            mMathsMark = mathsMark;
        }

        /** Set the C Programming mark */
        public void setCProgrammingMark(int cProgrammingMark) {
            mCProgramming = cProgrammingMark;
        }

        /** Set the Android Programming mark */
        public void setAndroidProgrammingMark(int androidProgrammingMark) {
            mAndroidProgrammingMark = androidProgrammingMark;
        }

        /** Set the General Physics mark */
        public void setGeneralPhysicsMark(int generalPhysicsMark) {
            mGeneralPhysicsMark = generalPhysicsMark;
        }

        /** Set the Quantum Physiscs mark */
        public void setQuantumPhysiscsMark(int quantumPhysiscsMark) {
            mQuantumPhysicsMark = quantumPhysiscsMark;
        }

        /** Set the Chemical Physics mark */
        public void setChemicalPhysiscsMark(int chemicalPhysiscsMark) {
            mChemicalPhysicsMark = chemicalPhysiscsMark;
        }

    @Override
    public String toString() {
        return "ReportCard{" +
                "mMathsMark=" + mMathsMark + "\n" +
                ", mCProgramming=" + mCProgramming + "\n" +
                ", mAndroidProgrammingMark=" + mAndroidProgrammingMark + "\n" +
                ", mGeneralPhysicsMark=" + mGeneralPhysicsMark + "\n" +
                ", mQuantumPhysicsMark=" + mQuantumPhysicsMark + "\n" +
                ", mChemicalPhysicsMark=" + mChemicalPhysicsMark + "\n" +
                '}';
    }
}

