package com.armandorv.publisher.presentation.displaytag;

import java.util.Iterator;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.Tag;

import org.apache.log4j.Logger;
import org.apache.struts2.views.jsp.TagUtils;
import org.displaytag.Messages;
import org.displaytag.localization.I18nResourceProvider;
import org.displaytag.localization.LocaleResolver;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.LocaleProvider;
import com.opensymphony.xwork2.TextProvider;
import com.opensymphony.xwork2.util.ValueStack;

public class I18nStruts2Adapter implements LocaleResolver, I18nResourceProvider {

    public static final String UNDEFINED_KEY = "???"; //$NON-NLS-1$
	private static Logger log = Logger.getLogger(I18nStruts2Adapter.class);
    
	@Override
	public Locale resolveLocale(HttpServletRequest request) {
		Locale result = null;
        ValueStack stack = ActionContext.getContext().getValueStack();

        @SuppressWarnings("rawtypes")
		Iterator iterator = stack.getRoot().iterator();
        while (iterator.hasNext()) {
            Object o = iterator.next();

            if (o instanceof LocaleProvider) {
                LocaleProvider lp = (LocaleProvider) o;
                result = lp.getLocale();

                break;
            }
        }

        if (result == null) {
            log.debug("Missing LocalProvider actions, init locale to default");
            result = Locale.getDefault();
        }

        return result;
	}
	
	@Override
	public String getResource(String resourceKey, String defaultValue, 
			Tag tag, PageContext pageContext) {
		
		 // if resourceKey isn't defined either, use defaultValue
        String key = (resourceKey != null) ? resourceKey : defaultValue;
        String message = null;
        ValueStack stack = TagUtils.getStack(pageContext);
        @SuppressWarnings("rawtypes")
		Iterator iterator = stack.getRoot().iterator();

        while (iterator.hasNext()) {
            Object o = iterator.next();

            if (o instanceof TextProvider) {
                TextProvider tp = (TextProvider) o;
                message = tp.getText(key);

                break;
            }
        }

        // if user explicitely added a titleKey we guess this is an error
        if (message == null && resourceKey != null) {
            log.debug(Messages
                    .getString("Localization.missingkey", resourceKey)); //$NON-NLS-1$
            message = UNDEFINED_KEY + resourceKey + UNDEFINED_KEY;
        }

        return message;
	}

}
