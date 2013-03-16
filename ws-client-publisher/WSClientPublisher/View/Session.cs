using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace WSClientPublisher.View
{
    public class Session
    {

        public static Session SESSION = new Session();
        private IDictionary<String, Object> session;

        private Session()
        {
            session = new Dictionary<String, Object>();
        }

        public void put(String key,object value){
            if (this.session.ContainsKey(key))
            this.session.Remove(key);
                
            this.session.Add(key, value);
       
 
        }

        public object get(String key)
        {
            return this.session[key];
        }

        public void clearSession()
        {
            this.session = new Dictionary<String, Object>();
        }
    }
}
