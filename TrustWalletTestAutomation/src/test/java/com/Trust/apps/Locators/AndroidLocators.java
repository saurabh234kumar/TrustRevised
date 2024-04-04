package com.Trust.apps.Locators;

public class AndroidLocators {
	
	//Page Objects - Continue as guest

	public static final String GetStarted_XPath = "//android.widget.TextView[@text='Get Started']";
	public static final String Home_XPath = "//android.widget.TextView[contains(@text,'Home')]";
	public static final String Swap_XPath = "//android.widget.TextView[contains(@text,'Swap')]";

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static final String ContGuest_ID = "com.localy.localy:id/buttonContinue";
	
	// Page Objects - SignIn
	public static final String SIGN_ID = "com.amazon.mShop.android.shopping:id/sign_in_button";
	public static final String SignInEmail_XPath = "//android.widget.EditText[contains(@resource-id,'ap_email_login') and @index='1']";
	public static final String ConfirmEmail_XPath = "//android.widget.Button[contains(@resource-id,'continue') and @index='0']";
	public static final String SignInPassword_XPath = "//android.widget.EditText[contains(@resource-id,'ap_password') and @index='1']";
	public static final String SignInButton_XPath = "//android.widget.Button[contains(@resource-id,'signInSubmit') and @index='0']";

	

	// Page Objects - Menu
	public static final String SkipSIGN_ID = "com.amazon.mShop.android.shopping:id/skip_sign_in_button";
	
	public static final String MenuButton_XPath = "//android.widget.ImageView[@content-desc='Navigation panel, button, double tap to open side panel']";
	public static final String ButtSettingson_ID = "com.amazon.mShop.android.shopping:id/drawer_arrow";
	public static final String ButtSettingson1_XPath = "//android.widget.TextView[@text='Settings']";
	public static final String CountryChangeButton_XPath = "//android.widget.LinearLayout[contains(@resource-id,'com.amazon.mShop.android.shopping:id/anp_drawer_item') and @index='0']";
	
	public static final String CountryChangeButton1_XPath = "//android.widget.Button[@text='Country: United Arab Emirates']";
	public static final String CountryChangeUSTOUAEButton_XPath = "//android.widget.Button[@text='Country/Region: United States']";
	public static final String CountrySelectionButton_XPath = "//android.widget.RadioButton[@text='United States Amazon.com']";
	public static final String CountrySelectionButton1_XPath = "//android.widget.RadioButton[@text='United Arab Emirates Amazon.ae']";
	public static final String Done_XPath = "//android.widget.Button[@text='Done']";
	
	// Page Objects - My Account Payment
	public static final String YourAccount_XPath = "//android.widget.TextView[@text='Your Account']";
	public static final String YourPayment_XPath = "//android.widget.TextView[@text='Your Payments']";
	public static final String PaymentType_XPath = "//android.widget.TextView[@text='Visa']";
	public static final String ManageGiftCardBalance_XPath = "//android.widget.TextView[@text='Manage gift card balance']";
	public static final String ZeroGiftCardBalance_XPath = "//android.view.View[@text='$0.00']";
	
	public static final String ManageYourAddress_XPath = "//android.widget.TextView[@text='Your Addresses']";
	public static final String AddNewAddress_XPath = "//android.view.View[contains(@resource-id,'ya-myab-mash-navigate-to') and @index='1']";
	public static final String StreetAddress_XPath ="//android.widget.EditText[contains(@resource-id,'address-ui-widgets-enterAddressLine1') and @index='1']";
	public static final String CityAddress_XPath ="//android.widget.EditText[contains(@resource-id,'address-ui-widgets-enterAddressCity') and @index='1']";
	public static final String ZipCodeAddress_XPath ="//android.widget.EditText[contains(@resource-id,'address-ui-widgets-enterAddressPostalCode') and @index='1']";
	public static final String StateAddress_XPath ="//android.widget.Spinner[contains(@resource-id,'address-ui-widgets-enterAddressStateOrRegion-dropdown-nativeId') and @index='18']";
	public static final String AddAddress_XPath ="//android.widget.Button[@text='Add address']";
	public static final String StateSelection_XPath ="//android.view.View[@text='Alabama, in list, item 1 of 62']";
	
	// Page Objects - Menu/Category
	public static final String ShopByDept_XPath = "//android.widget.TextView[@text='Shop by Department']";
	public static final String Electronics_XPath = "//android.widget.TextView[@text='Electronics']";
	public static final String TvVideo_XPath = "//android.widget.Image[@text='TV & Video']";

	// Page Objects - HomePage
	public static final String HP_SearchField_ID = "com.amazon.mShop.android.shopping:id/rs_search_src_text";
	public static final String HP_SearchSujjestion_ID = "com.amazon.mShop.android.shopping:id/iss_search_dropdown_item_suggestions";
	public static final String DealCurrency_XPath =	 "//android.widget.TextView[@text='AED 1,430.00']";
	
	// Page Objects - HomePage
	public static final String SLP_SearchSujjestion_XPath = "//android.widget.TextView[@text='AED 1,430.00']";
	public static final String PDP_image_ID = "imageBlock_feature_div";
	
	public static final String PDP_ProductPrice_XPath ="//android.view.View[contains(@resource-id,'priceblock_ourprice') and @index='0']";
	public static final String PDPStock_XPath ="//android.view.View[contains(@resource-id,'availability') and @index='0']";
	public static final String PDP_AddToCart_XPath = "//android.widget.Button[@text='Add to Cart']";

		

}
