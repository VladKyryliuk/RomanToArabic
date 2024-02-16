import org.example.Convertor.toArabic
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

/*
  @author Vlad
  @project   RomanToArabic
  @class  ConvertorTest
  @version  1.0.0 
  @since 2/16/2024 - 10.25
*/

class ConvertorTest {

    @Test
    fun WhenRomanNumberIs_MDSVC_Then_null() {
        assertEquals(null,"MDSVC".toArabic())
    }
    @Test
    fun WhenRomanNumberIs_a_To_z_Then_null() {
        for (char in 'a'..'z'){
            assertEquals(null,char.toString().toArabic())
        }
    }
    @Test
    fun WhenRomanNumberIs_I_Then_1() {
        assertEquals(1,"I".toArabic())
    }
    @Test
    fun WhenRomanNumberIs_II_Then_2() {
        assertEquals(2,"II".toArabic())
    }
    @Test
    fun WhenRomanNumberIs_IV_Then_4() {
        assertEquals(4,"IV".toArabic())
    }
    @Test
    fun WhenRomanNumberIs_V_Then_5() {
        assertEquals(5,"V".toArabic())
    }
    @Test
    fun WhenRomanNumberIs_VI_Then_6() {
        assertEquals(6,"VI".toArabic())
    }
    @Test
    fun WhenRomanNumberIs_VII_Then_7() {
        assertEquals(7,"VII".toArabic())
    }
    @Test
    fun WhenRomanNumberIs_IX_Then_9() {
        assertEquals(9,"IX".toArabic())
    }
    @Test
    fun WhenRomanNumberIs_X_Then_10() {
        assertEquals(10,"X".toArabic())
    }
    @Test
    fun WhenRomanNumberIs_XI_Then_11() {
        assertEquals(11,"XI".toArabic())
    }
    @Test
    fun WhenRomanNumberIs_XII_Then_12() {
        assertEquals(12,"XII".toArabic())
    }
    @Test
    fun WhenRomanNumberIs_XV_Then_15() {
        assertEquals(15,"XV".toArabic())
    }
    @Test
    fun WhenRomanNumberIs_XVI_Then_16() {
        assertEquals(16,"XVI".toArabic())
    }
    @Test
    fun WhenRomanNumberIs_XIX_Then_19() {
        assertEquals(19,"XIX".toArabic())
    }
    @Test
    fun WhenRomanNumberIs_XX_Then_20() {
        assertEquals(20,"XX".toArabic())
    }
    @Test
    fun WhenRomanNumberIs_XXI_Then_21() {
        assertEquals(21,"XXI".toArabic())
    }
    @Test
    fun WhenRomanNumberIs_XXIV_Then_24() {
        assertEquals(24,"XXIV".toArabic())
    }
    @Test
    fun WhenRomanNumberIs_XXX_Then_30() {
        assertEquals(30,"XXX".toArabic())
    }
    @Test
    fun WhenRomanNumberIs_XXXI_Then_31() {
        assertEquals(31,"XXXI".toArabic())
    }
    @Test
    fun WhenRomanNumberIs_XXXIV_Then_34() {
        assertEquals(34,"XXXIV".toArabic())
    }
    @Test
    fun WhenRomanNumberIs_XXXV_Then_35() {
        assertEquals(35,"XXXV".toArabic())
    }
    @Test
    fun WhenRomanNumberIs_XL_Then_40() {
        assertEquals(40,"XL".toArabic())
    }
    @Test
    fun WhenRomanNumberIs_L_Then_50() {
        assertEquals(50,"L".toArabic())
    }
    @Test
    fun WhenRomanNumberIs_LX_Then_60() {
        assertEquals(60,"LX".toArabic())
    }
    @Test
    fun WhenRomanNumberIs_LXX_Then_70() {
        assertEquals(70,"LXX".toArabic())
    }
    @Test
    fun WhenRomanNumberIs_XC_Then_90() {
        assertEquals(90,"XC".toArabic())
    }
    @Test
    fun WhenRomanNumberIs_C_Then_100() {
        assertEquals(100,"C".toArabic())
    }
    @Test
    fun WhenRomanNumberIs_CC_Then_200() {
        assertEquals(200,"CC".toArabic())
    }
    @Test
    fun WhenRomanNumberIs_CCC_Then_300() {
        assertEquals(300,"CCC".toArabic())
    }
    @Test
    fun WhenRomanNumberIs_CD_Then_400() {
        assertEquals(400,"CD".toArabic())
    }
    @Test
    fun WhenRomanNumberIs_D_Then_500() {
        assertEquals(500,"D".toArabic())
    }
    @Test
    fun WhenRomanNumberIs_DC_Then_600() {
        assertEquals(600,"DC".toArabic())
    }
    @Test
    fun WhenRomanNumberIs_DCC_Then_700() {
        assertEquals(700,"DCC".toArabic())
    }
    @Test
    fun WhenRomanNumberIs_CM_Then_900() {
        assertEquals(900,"CM".toArabic())
    }
    @Test
    fun WhenRomanNumberIs_M_Then_1000() {
        assertEquals(1000,"M".toArabic())
    }
    @Test
    fun WhenRomanNumberIs_MC_Then_1100() {
        assertEquals(1100,"MC".toArabic())
    }
    @Test
    fun WhenRomanNumberIs_MCD_Then_1400() {
        assertEquals(1400,"MCD".toArabic())
    }
    @Test
    fun WhenRomanNumberIs_MD_Then_1500() {
        assertEquals(1500,"MD".toArabic())
    }
    @Test
    fun WhenRomanNumberIs_MCM_Then_1900() {
        assertEquals(1900,"MCM".toArabic())
    }
    @Test
    fun WhenRomanNumberIs_MM_Then_2000() {
        assertEquals(2000,"MM".toArabic())
    }
    @Test
    fun WhenRomanNumberIs_MMM_Then_3000() {
        assertEquals(3000,"MMM".toArabic())
    }
    @Test
    fun WhenRomanNumberIs_MMMM_Then_null() {
        assertEquals(null,"MMMM".toArabic())
    }
}