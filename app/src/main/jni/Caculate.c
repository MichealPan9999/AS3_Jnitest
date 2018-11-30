#include "com_example_panzq_simpleandroid_15_2_CalculateUtil.h"
/*
 * Class:     com_example_panzq_simpleandroid_15_2_CalculateUtil
 * Method:    add
 * Signature: (DD)D
 */
JNIEXPORT jdouble JNICALL Java_com_example_panzq_simpleandroid_115_12_CalculateUtil_add
  (JNIEnv *env, jobject obj, jdouble a, jdouble b)
  {
        a+b;
  }

/*
 * Class:     com_example_panzq_simpleandroid_15_2_CalculateUtil
 * Method:    sub
 * Signature: (DD)D
 */
JNIEXPORT jdouble JNICALL Java_com_example_panzq_simpleandroid_115_12_CalculateUtil_sub
  (JNIEnv *env, jobject obj, jdouble a, jdouble b)
  {
        return a-b;
  }

/*
 * Class:     com_example_panzq_simpleandroid_15_2_CalculateUtil
 * Method:    mul
 * Signature: (DD)D
 */
JNIEXPORT jdouble JNICALL Java_com_example_panzq_simpleandroid_115_12_CalculateUtil_mul
   (JNIEnv *env, jobject obj, jdouble a, jdouble b){
        return a * b;
   }

/*
 * Class:     com_example_panzq_simpleandroid_15_2_CalculateUtil
 * Method:    div
 * Signature: (DD)D
 */
JNIEXPORT jdouble JNICALL Java_com_example_panzq_simpleandroid_115_12_CalculateUtil_div
  (JNIEnv *env, jobject obj, jdouble a, jdouble b){
        return a / b;
  }