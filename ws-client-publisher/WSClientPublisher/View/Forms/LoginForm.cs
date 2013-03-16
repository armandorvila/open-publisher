using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Windows.Forms;
using WSClientPublisher.Business.Security;
using WSClientPublisher.Commands;

namespace WSClientPublisher.View.Forms
{
    public partial class LoginForm : Form
    {
        public LoginForm()
        {
            InitializeComponent();
        }

        private void loginEvent(object sender, EventArgs e)
        {
            String username = this.usernameTextBox.Text;
            String pass = this.passwordTextBox.Text;
            if (!pass.Equals("") && !username.Equals(""))
            {

                SecurityService service = new SecurityServiceClient();
                getUserByUsername serviceParm = new getUserByUsername();
                serviceParm.arg0 = username;
                getUserByUsernameRequest request = new getUserByUsernameRequest();
                request.getUserByUsername = serviceParm;
                getUserByUsernameResponse1 response = service.getUserByUsername(request);
                user user = response.getUserByUsernameResponse.@return;
                if (user != null && pass.Equals(user.password))
                {

                    Session.SESSION.put("author", user.author);
                    MainForm mf = new MainForm();
                    mf.Show();


                }
                else
                {
                    MessageBox.Show("Invlaid User Or password.");
                }
            }
            else
            {

                MessageBox.Show("You must introduce user and pass");
            }

        }

        private void pressEnter(object sender, PreviewKeyDownEventArgs e)
        {
            if (e.KeyCode.Equals(Keys.Enter))
            {
                this.loginEvent(sender, e);
            }
        }
    }

}
