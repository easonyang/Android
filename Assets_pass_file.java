	Context mContext = getApplicationContext();		
	String[] arrayOfString = { "com.android.browser_preferences_MiSi.xml" };
    	String str = mContext.getFilesDir().getParent() + "/files/";
        int i = 0;
       	while (i < arrayOfString.length) {
       		String str1 = "";
       		if (!new File(str + arrayOfString[i]).exists())
       			str1 = mContext.getFilesDir().getParent() + "/files/"
       					+ arrayOfString[i];
       			try {
       				InputStream localInputStream = mContext.getResources()
       						.getAssets().open(arrayOfString[i]);//"raw/" + arrayOfString[i]
       				copyFile(str1, localInputStream, localInputStream.available());
       				++i;
       			} catch (IOException localIOException) {
       				localIOException.printStackTrace();
       				break;
       			}
       		}
	private static void copyFile(String paramString,InputStream paramInputStream, int paramInt) 
	{
		try {
			FileOutputStream localFileOutputStream = new FileOutputStream(
					paramString);
			byte[] arrayOfByte = new byte[paramInt];
			paramInputStream.read(arrayOfByte);
			localFileOutputStream.write(arrayOfByte);
			localFileOutputStream.close();
			return;
		} catch (Exception localException) {
			localException.printStackTrace();
		}
	}
