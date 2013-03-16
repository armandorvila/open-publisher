using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Windows.Forms;
using WSClientPublisher.Business.Security;
using WSClientPublisher.Business.Articles;
using WSClientPublisher.Business.Authors;
using WSClientPublisher.Commands;

namespace WSClientPublisher.View.Forms
{
    public partial class MainForm : Form
    {


        public MainForm()
        {
            InitializeComponent();
            this.initHome();
            this.initProfile();
            this.initArticles();
        }

        private void initHome()
        {
           Business.Security.author author = (Business.Security.author)Session.SESSION.get("author");
            this.homeTextBoxName.Text = author.name;
            this.homeTextBoxSurname.Text = author.surname;
            this.homeTextBoxDate.Text = author.dateOfJoining.ToShortDateString();
        }

        private void initProfile()
        {
            Business.Security.author author = ( Business.Security.author)Session.SESSION.get("author");
            this.profileTextBoxName.Text = author.name;
            this.profileTextBoxSurname.Text = author.surname;

        }

        private void initArticles()
        {
            Business.Security.author author = (Business.Security.author)Session.SESSION.get("author");
            article[] articles = new GetAllArticlesOfAuthor().execute(author.id);
            Session.SESSION.put("articles", articles);
            
            foreach (article art in articles)
            {
                this.articlesList.Items.Add(art.title);
            }
            if (articles.Length > 0)
            {
                this.titleTextBox.Text = articles[0].title;
                this.subjectTextBox.Text = articles[0].subject;
                this.authorTextBox.Text = articles[0].author;
                this.descriptionTextBox.Text = articles[0].description;
            }


        }

        private void changeArticle(object sender, EventArgs e)
        {
            int index = this.articlesList.SelectedIndex;
            article[] articles = (article[])Session.SESSION.get("articles");
            article selected = articles[index];
            selected = new GetArticleByID().execute(selected.id);
           
            this.titleTextBox.Text = selected.title;
            this.subjectTextBox.Text = selected.subject;
            this.authorTextBox.Text = selected.author;
            this.descriptionTextBox.Text = selected.description;
        }

        private void modifyArticle(object sender, EventArgs e)
        {
            int index = this.articlesList.SelectedIndex;
            article[] articles = (article[])Session.SESSION.get("articles");
            article selected = articles[index];
            selected = new GetArticleByID().execute(selected.id);
            
            selected.title = this.titleTextBox.Text;
            selected.subject = this.subjectTextBox.Text;
            selected.description = this.descriptionTextBox.Text;
            selected.author = this.authorTextBox.Text;

            new ModifyArticle().execute(selected);
        }

        private void modifyProfile(object sender, EventArgs e)
        {
            Business.Security.author author = (Business.Security.author)Session.SESSION.get("author");
            author.name = this.profileTextBoxName.Text;
            author.surname = this.profileTextBoxSurname.Text;
            Business.Authors.author newAuthor = new Business.Authors.author();
            
            newAuthor .id= author.id;
            newAuthor.name = this.profileTextBoxName.Text;
            newAuthor.surname = this.profileTextBoxSurname.Text;
            newAuthor.dateOfJoiningSpecified = true;
            newAuthor.dateOfJoining = author.dateOfJoining;

            new ModifyProfile().execute(newAuthor);


        }

    }
}
