namespace WSClientPublisher.View.Forms
{
    partial class MainForm
    {
        /// <summary>
        /// Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        /// Required method for Designer support - do not modify
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            this.tabContainer = new System.Windows.Forms.TabControl();
            this.homeTab = new System.Windows.Forms.TabPage();
            this.homeTextBoxDate = new System.Windows.Forms.TextBox();
            this.homeTextBoxSurname = new System.Windows.Forms.TextBox();
            this.homeTextBoxName = new System.Windows.Forms.TextBox();
            this.homeLabelDate = new System.Windows.Forms.Label();
            this.homeSurname = new System.Windows.Forms.Label();
            this.homeLabelName = new System.Windows.Forms.Label();
            this.homeLabelTitle = new System.Windows.Forms.Label();
            this.profileTab = new System.Windows.Forms.TabPage();
            this.modifyProfileButton = new System.Windows.Forms.Button();
            this.profileTextBoxSurname = new System.Windows.Forms.TextBox();
            this.profileTextBoxName = new System.Windows.Forms.TextBox();
            this.profileLabelSurname = new System.Windows.Forms.Label();
            this.profileLabelTitle = new System.Windows.Forms.Label();
            this.profileLabelName = new System.Windows.Forms.Label();
            this.articlesTab = new System.Windows.Forms.TabPage();
            this.descriptionTextBox = new System.Windows.Forms.TextBox();
            this.authorTextBox = new System.Windows.Forms.TextBox();
            this.subjectTextBox = new System.Windows.Forms.TextBox();
            this.titleTextBox = new System.Windows.Forms.TextBox();
            this.authorLabel = new System.Windows.Forms.Label();
            this.descriptionLabel = new System.Windows.Forms.Label();
            this.subjectLabel = new System.Windows.Forms.Label();
            this.titleLabel = new System.Windows.Forms.Label();
            this.modifyArticleButton = new System.Windows.Forms.Button();
            this.articlesList = new System.Windows.Forms.ListBox();
            this.articlesLabelHeader = new System.Windows.Forms.Label();
            this.headerLabel = new System.Windows.Forms.Label();
            this.tabContainer.SuspendLayout();
            this.homeTab.SuspendLayout();
            this.profileTab.SuspendLayout();
            this.articlesTab.SuspendLayout();
            this.SuspendLayout();
            // 
            // tabContainer
            // 
            this.tabContainer.Controls.Add(this.homeTab);
            this.tabContainer.Controls.Add(this.profileTab);
            this.tabContainer.Controls.Add(this.articlesTab);
            this.tabContainer.Location = new System.Drawing.Point(30, 108);
            this.tabContainer.Name = "tabContainer";
            this.tabContainer.SelectedIndex = 0;
            this.tabContainer.Size = new System.Drawing.Size(612, 341);
            this.tabContainer.TabIndex = 0;
            // 
            // homeTab
            // 
            this.homeTab.Controls.Add(this.homeTextBoxDate);
            this.homeTab.Controls.Add(this.homeTextBoxSurname);
            this.homeTab.Controls.Add(this.homeTextBoxName);
            this.homeTab.Controls.Add(this.homeLabelDate);
            this.homeTab.Controls.Add(this.homeSurname);
            this.homeTab.Controls.Add(this.homeLabelName);
            this.homeTab.Controls.Add(this.homeLabelTitle);
            this.homeTab.Location = new System.Drawing.Point(4, 22);
            this.homeTab.Name = "homeTab";
            this.homeTab.Padding = new System.Windows.Forms.Padding(3);
            this.homeTab.Size = new System.Drawing.Size(604, 315);
            this.homeTab.TabIndex = 0;
            this.homeTab.Text = "Home";
            this.homeTab.UseVisualStyleBackColor = true;
            // 
            // homeTextBoxDate
            // 
            this.homeTextBoxDate.Enabled = false;
            this.homeTextBoxDate.Location = new System.Drawing.Point(280, 218);
            this.homeTextBoxDate.Name = "homeTextBoxDate";
            this.homeTextBoxDate.ReadOnly = true;
            this.homeTextBoxDate.Size = new System.Drawing.Size(199, 20);
            this.homeTextBoxDate.TabIndex = 6;
            // 
            // homeTextBoxSurname
            // 
            this.homeTextBoxSurname.Enabled = false;
            this.homeTextBoxSurname.Location = new System.Drawing.Point(280, 166);
            this.homeTextBoxSurname.Name = "homeTextBoxSurname";
            this.homeTextBoxSurname.ReadOnly = true;
            this.homeTextBoxSurname.Size = new System.Drawing.Size(199, 20);
            this.homeTextBoxSurname.TabIndex = 5;
            // 
            // homeTextBoxName
            // 
            this.homeTextBoxName.Enabled = false;
            this.homeTextBoxName.Location = new System.Drawing.Point(280, 112);
            this.homeTextBoxName.Name = "homeTextBoxName";
            this.homeTextBoxName.ReadOnly = true;
            this.homeTextBoxName.Size = new System.Drawing.Size(199, 20);
            this.homeTextBoxName.TabIndex = 4;
            // 
            // homeLabelDate
            // 
            this.homeLabelDate.AutoSize = true;
            this.homeLabelDate.Font = new System.Drawing.Font("Baskerville Old Face", 14.25F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.homeLabelDate.Location = new System.Drawing.Point(47, 217);
            this.homeLabelDate.Name = "homeLabelDate";
            this.homeLabelDate.Size = new System.Drawing.Size(146, 22);
            this.homeLabelDate.TabIndex = 3;
            this.homeLabelDate.Text = "Date Of Joining";
            // 
            // homeSurname
            // 
            this.homeSurname.AutoSize = true;
            this.homeSurname.Font = new System.Drawing.Font("Baskerville Old Face", 14.25F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.homeSurname.Location = new System.Drawing.Point(47, 168);
            this.homeSurname.Name = "homeSurname";
            this.homeSurname.Size = new System.Drawing.Size(86, 22);
            this.homeSurname.TabIndex = 2;
            this.homeSurname.Text = "Surname";
            // 
            // homeLabelName
            // 
            this.homeLabelName.AutoSize = true;
            this.homeLabelName.Font = new System.Drawing.Font("Baskerville Old Face", 14.25F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.homeLabelName.Location = new System.Drawing.Point(47, 114);
            this.homeLabelName.Name = "homeLabelName";
            this.homeLabelName.Size = new System.Drawing.Size(66, 22);
            this.homeLabelName.TabIndex = 1;
            this.homeLabelName.Text = "Name:";
            // 
            // homeLabelTitle
            // 
            this.homeLabelTitle.AutoSize = true;
            this.homeLabelTitle.Font = new System.Drawing.Font("Baskerville Old Face", 18F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.homeLabelTitle.Location = new System.Drawing.Point(46, 44);
            this.homeLabelTitle.Name = "homeLabelTitle";
            this.homeLabelTitle.Size = new System.Drawing.Size(108, 27);
            this.homeLabelTitle.TabIndex = 0;
            this.homeLabelTitle.Text = "You Are:";
            // 
            // profileTab
            // 
            this.profileTab.Controls.Add(this.modifyProfileButton);
            this.profileTab.Controls.Add(this.profileTextBoxSurname);
            this.profileTab.Controls.Add(this.profileTextBoxName);
            this.profileTab.Controls.Add(this.profileLabelSurname);
            this.profileTab.Controls.Add(this.profileLabelTitle);
            this.profileTab.Controls.Add(this.profileLabelName);
            this.profileTab.Location = new System.Drawing.Point(4, 22);
            this.profileTab.Name = "profileTab";
            this.profileTab.Padding = new System.Windows.Forms.Padding(3);
            this.profileTab.Size = new System.Drawing.Size(604, 315);
            this.profileTab.TabIndex = 1;
            this.profileTab.Text = "Profile";
            this.profileTab.UseVisualStyleBackColor = true;
            // 
            // modifyProfileButton
            // 
            this.modifyProfileButton.Location = new System.Drawing.Point(464, 224);
            this.modifyProfileButton.Name = "modifyProfileButton";
            this.modifyProfileButton.Size = new System.Drawing.Size(75, 23);
            this.modifyProfileButton.TabIndex = 6;
            this.modifyProfileButton.Text = "modify";
            this.modifyProfileButton.UseVisualStyleBackColor = true;
            this.modifyProfileButton.Click += new System.EventHandler(this.modifyProfile);
            // 
            // profileTextBoxSurname
            // 
            this.profileTextBoxSurname.Location = new System.Drawing.Point(240, 223);
            this.profileTextBoxSurname.Name = "profileTextBoxSurname";
            this.profileTextBoxSurname.Size = new System.Drawing.Size(169, 20);
            this.profileTextBoxSurname.TabIndex = 5;
            // 
            // profileTextBoxName
            // 
            this.profileTextBoxName.Location = new System.Drawing.Point(240, 153);
            this.profileTextBoxName.Name = "profileTextBoxName";
            this.profileTextBoxName.Size = new System.Drawing.Size(169, 20);
            this.profileTextBoxName.TabIndex = 4;
            // 
            // profileLabelSurname
            // 
            this.profileLabelSurname.AutoSize = true;
            this.profileLabelSurname.Font = new System.Drawing.Font("Baskerville Old Face", 14.25F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.profileLabelSurname.Location = new System.Drawing.Point(42, 223);
            this.profileLabelSurname.Name = "profileLabelSurname";
            this.profileLabelSurname.Size = new System.Drawing.Size(86, 22);
            this.profileLabelSurname.TabIndex = 3;
            this.profileLabelSurname.Text = "Surname";
            // 
            // profileLabelTitle
            // 
            this.profileLabelTitle.AutoSize = true;
            this.profileLabelTitle.Font = new System.Drawing.Font("Baskerville Old Face", 14.25F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.profileLabelTitle.Location = new System.Drawing.Point(42, 66);
            this.profileLabelTitle.Name = "profileLabelTitle";
            this.profileLabelTitle.Size = new System.Drawing.Size(185, 22);
            this.profileLabelTitle.TabIndex = 1;
            this.profileLabelTitle.Text = "Modify Your Profile";
            // 
            // profileLabelName
            // 
            this.profileLabelName.AutoSize = true;
            this.profileLabelName.Font = new System.Drawing.Font("Baskerville Old Face", 14.25F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.profileLabelName.Location = new System.Drawing.Point(42, 150);
            this.profileLabelName.Name = "profileLabelName";
            this.profileLabelName.Size = new System.Drawing.Size(60, 22);
            this.profileLabelName.TabIndex = 0;
            this.profileLabelName.Text = "Name";
            // 
            // articlesTab
            // 
            this.articlesTab.Controls.Add(this.descriptionTextBox);
            this.articlesTab.Controls.Add(this.authorTextBox);
            this.articlesTab.Controls.Add(this.subjectTextBox);
            this.articlesTab.Controls.Add(this.titleTextBox);
            this.articlesTab.Controls.Add(this.authorLabel);
            this.articlesTab.Controls.Add(this.descriptionLabel);
            this.articlesTab.Controls.Add(this.subjectLabel);
            this.articlesTab.Controls.Add(this.titleLabel);
            this.articlesTab.Controls.Add(this.modifyArticleButton);
            this.articlesTab.Controls.Add(this.articlesList);
            this.articlesTab.Controls.Add(this.articlesLabelHeader);
            this.articlesTab.Location = new System.Drawing.Point(4, 22);
            this.articlesTab.Name = "articlesTab";
            this.articlesTab.Padding = new System.Windows.Forms.Padding(3);
            this.articlesTab.Size = new System.Drawing.Size(604, 315);
            this.articlesTab.TabIndex = 2;
            this.articlesTab.Text = "Articles";
            this.articlesTab.UseVisualStyleBackColor = true;
            // 
            // descriptionTextBox
            // 
            this.descriptionTextBox.Location = new System.Drawing.Point(368, 204);
            this.descriptionTextBox.Name = "descriptionTextBox";
            this.descriptionTextBox.Size = new System.Drawing.Size(100, 20);
            this.descriptionTextBox.TabIndex = 10;
            // 
            // authorTextBox
            // 
            this.authorTextBox.Location = new System.Drawing.Point(368, 164);
            this.authorTextBox.Name = "authorTextBox";
            this.authorTextBox.Size = new System.Drawing.Size(100, 20);
            this.authorTextBox.TabIndex = 9;
            // 
            // subjectTextBox
            // 
            this.subjectTextBox.Location = new System.Drawing.Point(368, 125);
            this.subjectTextBox.Name = "subjectTextBox";
            this.subjectTextBox.Size = new System.Drawing.Size(100, 20);
            this.subjectTextBox.TabIndex = 8;
            // 
            // titleTextBox
            // 
            this.titleTextBox.Location = new System.Drawing.Point(368, 87);
            this.titleTextBox.Name = "titleTextBox";
            this.titleTextBox.Size = new System.Drawing.Size(100, 20);
            this.titleTextBox.TabIndex = 7;
            // 
            // authorLabel
            // 
            this.authorLabel.AutoSize = true;
            this.authorLabel.Font = new System.Drawing.Font("Baskerville Old Face", 11.25F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.authorLabel.Location = new System.Drawing.Point(249, 167);
            this.authorLabel.Name = "authorLabel";
            this.authorLabel.Size = new System.Drawing.Size(57, 17);
            this.authorLabel.TabIndex = 6;
            this.authorLabel.Text = "Author";
            // 
            // descriptionLabel
            // 
            this.descriptionLabel.AutoSize = true;
            this.descriptionLabel.Font = new System.Drawing.Font("Baskerville Old Face", 11.25F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.descriptionLabel.Location = new System.Drawing.Point(249, 207);
            this.descriptionLabel.Name = "descriptionLabel";
            this.descriptionLabel.Size = new System.Drawing.Size(90, 17);
            this.descriptionLabel.TabIndex = 5;
            this.descriptionLabel.Text = "Description";
            // 
            // subjectLabel
            // 
            this.subjectLabel.AutoSize = true;
            this.subjectLabel.Font = new System.Drawing.Font("Baskerville Old Face", 11.25F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.subjectLabel.Location = new System.Drawing.Point(249, 125);
            this.subjectLabel.Name = "subjectLabel";
            this.subjectLabel.Size = new System.Drawing.Size(59, 17);
            this.subjectLabel.TabIndex = 4;
            this.subjectLabel.Text = "Subject";
            // 
            // titleLabel
            // 
            this.titleLabel.AutoSize = true;
            this.titleLabel.Font = new System.Drawing.Font("Baskerville Old Face", 11.25F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.titleLabel.Location = new System.Drawing.Point(249, 90);
            this.titleLabel.Name = "titleLabel";
            this.titleLabel.Size = new System.Drawing.Size(42, 17);
            this.titleLabel.TabIndex = 3;
            this.titleLabel.Text = "Title";
            // 
            // modifyArticleButton
            // 
            this.modifyArticleButton.Location = new System.Drawing.Point(368, 253);
            this.modifyArticleButton.Name = "modifyArticleButton";
            this.modifyArticleButton.Size = new System.Drawing.Size(75, 23);
            this.modifyArticleButton.TabIndex = 2;
            this.modifyArticleButton.Text = "Modify";
            this.modifyArticleButton.UseVisualStyleBackColor = true;
            this.modifyArticleButton.Click += new System.EventHandler(this.modifyArticle);
            // 
            // articlesList
            // 
            this.articlesList.FormattingEnabled = true;
            this.articlesList.Location = new System.Drawing.Point(45, 90);
            this.articlesList.Name = "articlesList";
            this.articlesList.Size = new System.Drawing.Size(155, 186);
            this.articlesList.TabIndex = 1;
            this.articlesList.SelectedIndexChanged += new System.EventHandler(this.changeArticle);
            // 
            // articlesLabelHeader
            // 
            this.articlesLabelHeader.AutoSize = true;
            this.articlesLabelHeader.Font = new System.Drawing.Font("Baskerville Old Face", 18.25F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.articlesLabelHeader.Location = new System.Drawing.Point(40, 21);
            this.articlesLabelHeader.Name = "articlesLabelHeader";
            this.articlesLabelHeader.Size = new System.Drawing.Size(94, 28);
            this.articlesLabelHeader.TabIndex = 0;
            this.articlesLabelHeader.Text = "Articles";
            // 
            // headerLabel
            // 
            this.headerLabel.AutoSize = true;
            this.headerLabel.Font = new System.Drawing.Font("Baskerville Old Face", 18F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.headerLabel.Location = new System.Drawing.Point(31, 35);
            this.headerLabel.Name = "headerLabel";
            this.headerLabel.Size = new System.Drawing.Size(177, 27);
            this.headerLabel.TabIndex = 1;
            this.headerLabel.Text = "Open Publisher";
            // 
            // MainForm
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(690, 497);
            this.Controls.Add(this.headerLabel);
            this.Controls.Add(this.tabContainer);
            this.MinimizeBox = false;
            this.Name = "MainForm";
            this.Text = "Open Publisher";
            this.tabContainer.ResumeLayout(false);
            this.homeTab.ResumeLayout(false);
            this.homeTab.PerformLayout();
            this.profileTab.ResumeLayout(false);
            this.profileTab.PerformLayout();
            this.articlesTab.ResumeLayout(false);
            this.articlesTab.PerformLayout();
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.TabControl tabContainer;
        private System.Windows.Forms.TabPage homeTab;
        private System.Windows.Forms.TabPage profileTab;
        private System.Windows.Forms.Label headerLabel;
        private System.Windows.Forms.TextBox homeTextBoxDate;
        private System.Windows.Forms.TextBox homeTextBoxSurname;
        private System.Windows.Forms.TextBox homeTextBoxName;
        private System.Windows.Forms.Label homeLabelDate;
        private System.Windows.Forms.Label homeSurname;
        private System.Windows.Forms.Label homeLabelName;
        private System.Windows.Forms.Label homeLabelTitle;
        private System.Windows.Forms.TabPage articlesTab;
        private System.Windows.Forms.Button modifyProfileButton;
        private System.Windows.Forms.TextBox profileTextBoxSurname;
        private System.Windows.Forms.TextBox profileTextBoxName;
        private System.Windows.Forms.Label profileLabelSurname;
        private System.Windows.Forms.Label profileLabelTitle;
        private System.Windows.Forms.Label profileLabelName;
        private System.Windows.Forms.Label articlesLabelHeader;
        private System.Windows.Forms.Label authorLabel;
        private System.Windows.Forms.Label descriptionLabel;
        private System.Windows.Forms.Label subjectLabel;
        private System.Windows.Forms.Label titleLabel;
        private System.Windows.Forms.Button modifyArticleButton;
        private System.Windows.Forms.ListBox articlesList;
        private System.Windows.Forms.TextBox descriptionTextBox;
        private System.Windows.Forms.TextBox authorTextBox;
        private System.Windows.Forms.TextBox subjectTextBox;
        private System.Windows.Forms.TextBox titleTextBox;
    }
}