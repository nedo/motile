package com.motile;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class CustomHTMLWebView extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_custom_htmlweb_view);
	
		WebView webview = (WebView)findViewById(R.id.CustomHTMLWebView);
		String contents = "<html><head><title>Registration Form</title></head>" +
				"" +"<body>" +
						"<h1>RegistrationForm</h1>" +
						"<form id='Register'><table cellpadding='2' cellspacing='0' border='0'> " +
						"	<tr> <td width='130'>" +
						"		<vllabel validators='UserID,UserIDExist' errclass='error' for='UserID' cerrclass='controlerror'>User ID:</vllabel> </td>" +
							"<td width='140'> <input name='UserID' type='text' class='control' id='UserID' size='15'>        " +
						"<vlvalidator name='UserID' type='required' control='UserID' errmsg='User ID required'> " +
						" <vlvalidator name='UserIDExist' type='custom' control='UserID' errmsg='User ID already exist' function='UserIDCheck'>      </td>" +
						"<td width='300' rowspan='7' valign='top'><vlsummary class='error' headertext='Error(s) found:' displaymode='bulletlist'>      </td>    </tr>" +
						"<tr>      <td>        <vllabel errclass='error' validators='Password,PassCmp' for='Password' cerrclass='controlerror'>Password:</vllabel>      </td>  " +
						"<td>        <input name='Password' type='password' class='control' id='Password' size='15'>" +
						"<vlvalidator type='required' name='Password' control='Password' errmsg='Password required'>" +
						"<vlvalidator name='PassCmp' type='compare' control='Password' comparecontrol='Password2' operator='e' validtype='string' errmsg='Both Password fields must be equal'>" +
						"</td>    </tr>    <tr>      <td>        <vllabel validators='Password,PassCmp' errclass='error' for='Password2' cerrclass='controlerror'>Confirm Password:</vllabel>      </td>" +
						"<td>        <input name='Password2' type='PASSWORD' class='control' id='Password2' size='15'>      </td>    </tr>" +
						"<tr>      <td>        <vllabel errclass='error' validators='NameReq,NameRegExp' for='Name' cerrclass='controlerror'>Name:</vllabel>      </td>   " +
						"<td>        <input name='Name' type='text' class='control' id='Name' size='15'>        <vlvalidator type='required' name='NameReq' control='Name' errmsg='Name required'>" +
						"<vlvalidator type='regexp' name='NameRegExp'" +
						" control='Name' >      </td>    </tr>" +
						"<tr>      <td>        <vllabel errclass='error' validators='EmailReq,Email' for='Email' cerrclass='controlerror'>E-mail:</vllabel>      </td>" +
						"<td>        <input name='Email' type='TEXT' class='control' id='Email' size='15'>        <vlvalidator type='required' name='EmailReq' control='Email' errmsg='E-mail required'>  " +
						"<vlvalidator type='format' format='email' name='Email' control='Email' errmsg='Invalid E-mail'>      </td>    </tr>    <tr>      <td colspan=2>      " +
						"<input name='Agreement' type='checkbox' id='Agreement' value='1'>" +
						" <vllabel errclass='error' validators='Agreement' for='Agreement'>I agree with the terms of service</vllabel> " +
						"<vlvalidator type='required' name='Agreement' control='Agreement' errmsg='Agreement checkbox must be selected'>      </td>    </tr>    <tr>      <td colspan='2'>  " +
						" <input type='submit' class='control' value='Register'><input type='reset' class='control' value='Reset'>" +
						"</td>" +
						"</tr>" +
						"</table>" +
						"</form>" +
						"</body>" +
						"</html>";
		webview.getSettings().setBuiltInZoomControls(true);
		webview.setWebViewClient(new WebViewClient());		
		webview.loadData(contents, "text/html", null); 
	}


	
}
