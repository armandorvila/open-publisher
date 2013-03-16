﻿//------------------------------------------------------------------------------
// <auto-generated>
//     Este código fue generado por una herramienta.
//     Versión de runtime:4.0.30319.1
//
//     Los cambios en este archivo podrían causar un comportamiento incorrecto y se perderán si
//     se vuelve a generar el código.
// </auto-generated>
//------------------------------------------------------------------------------

namespace WSClientPublisher.Business.Articles {
    
    
    [System.CodeDom.Compiler.GeneratedCodeAttribute("System.ServiceModel", "4.0.0.0")]
    [System.ServiceModel.ServiceContractAttribute(Namespace="http://articles.business.publisher.armandorv.com/", ConfigurationName="Business.Articles.ArticlesService")]
    public interface ArticlesService {
        
        // CODEGEN: Se está generando un contrato de mensaje, ya que la operación deleteArticle no es RPC ni está encapsulada en un documento.
        [System.ServiceModel.OperationContractAttribute(Action="", ReplyAction="*")]
        [System.ServiceModel.XmlSerializerFormatAttribute(SupportFaults=true)]
        WSClientPublisher.Business.Articles.deleteArticleResponse1 deleteArticle(WSClientPublisher.Business.Articles.deleteArticleRequest request);
        
        // CODEGEN: Se está generando un contrato de mensaje, ya que la operación getAllArticles no es RPC ni está encapsulada en un documento.
        [System.ServiceModel.OperationContractAttribute(Action="", ReplyAction="*")]
        [System.ServiceModel.XmlSerializerFormatAttribute(SupportFaults=true)]
        WSClientPublisher.Business.Articles.getAllArticlesResponse getAllArticles(WSClientPublisher.Business.Articles.getAllArticlesRequest request);
        
        // CODEGEN: Se está generando un contrato de mensaje, ya que la operación getAllArticlesOfAuthor no es RPC ni está encapsulada en un documento.
        [System.ServiceModel.OperationContractAttribute(Action="", ReplyAction="*")]
        [System.ServiceModel.XmlSerializerFormatAttribute(SupportFaults=true)]
        WSClientPublisher.Business.Articles.getAllArticlesOfAuthorResponse getAllArticlesOfAuthor(WSClientPublisher.Business.Articles.getAllArticlesOfAuthorRequest request);
        
        // CODEGEN: Se está generando un contrato de mensaje, ya que la operación getArticleByID no es RPC ni está encapsulada en un documento.
        [System.ServiceModel.OperationContractAttribute(Action="", ReplyAction="*")]
        [System.ServiceModel.XmlSerializerFormatAttribute(SupportFaults=true)]
        WSClientPublisher.Business.Articles.getArticleByIDResponse1 getArticleByID(WSClientPublisher.Business.Articles.getArticleByIDRequest request);
        
        // CODEGEN: Se está generando un contrato de mensaje, ya que la operación modifyArticle no es RPC ni está encapsulada en un documento.
        [System.ServiceModel.OperationContractAttribute(Action="", ReplyAction="*")]
        [System.ServiceModel.XmlSerializerFormatAttribute(SupportFaults=true)]
        WSClientPublisher.Business.Articles.modifyArticleResponse1 modifyArticle(WSClientPublisher.Business.Articles.modifyArticleRequest request);
        
        // CODEGEN: Se está generando un contrato de mensaje, ya que la operación publishArticle no es RPC ni está encapsulada en un documento.
        [System.ServiceModel.OperationContractAttribute(Action="", ReplyAction="*")]
        [System.ServiceModel.XmlSerializerFormatAttribute(SupportFaults=true)]
        WSClientPublisher.Business.Articles.publishArticleResponse1 publishArticle(WSClientPublisher.Business.Articles.publishArticleRequest request);
    }
    
    /// <comentarios/>
    [System.CodeDom.Compiler.GeneratedCodeAttribute("System.Xml", "4.0.30319.1")]
    [System.SerializableAttribute()]
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.ComponentModel.DesignerCategoryAttribute("code")]
    [System.Xml.Serialization.XmlTypeAttribute(Namespace="http://articles.business.publisher.armandorv.com/")]
    public partial class deleteArticle : object, System.ComponentModel.INotifyPropertyChanged {
        
        private long arg0Field;
        
        /// <comentarios/>
        [System.Xml.Serialization.XmlElementAttribute(Form=System.Xml.Schema.XmlSchemaForm.Unqualified, Order=0)]
        public long arg0 {
            get {
                return this.arg0Field;
            }
            set {
                this.arg0Field = value;
                this.RaisePropertyChanged("arg0");
            }
        }
        
        public event System.ComponentModel.PropertyChangedEventHandler PropertyChanged;
        
        protected void RaisePropertyChanged(string propertyName) {
            System.ComponentModel.PropertyChangedEventHandler propertyChanged = this.PropertyChanged;
            if ((propertyChanged != null)) {
                propertyChanged(this, new System.ComponentModel.PropertyChangedEventArgs(propertyName));
            }
        }
    }
    
    /// <comentarios/>
    [System.CodeDom.Compiler.GeneratedCodeAttribute("System.Xml", "4.0.30319.1")]
    [System.SerializableAttribute()]
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.ComponentModel.DesignerCategoryAttribute("code")]
    [System.Xml.Serialization.XmlTypeAttribute(Namespace="http://articles.business.publisher.armandorv.com/")]
    public partial class publishArticleResponse : object, System.ComponentModel.INotifyPropertyChanged {
        
        public event System.ComponentModel.PropertyChangedEventHandler PropertyChanged;
        
        protected void RaisePropertyChanged(string propertyName) {
            System.ComponentModel.PropertyChangedEventHandler propertyChanged = this.PropertyChanged;
            if ((propertyChanged != null)) {
                propertyChanged(this, new System.ComponentModel.PropertyChangedEventArgs(propertyName));
            }
        }
    }
    
    /// <comentarios/>
    [System.CodeDom.Compiler.GeneratedCodeAttribute("System.Xml", "4.0.30319.1")]
    [System.SerializableAttribute()]
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.ComponentModel.DesignerCategoryAttribute("code")]
    [System.Xml.Serialization.XmlTypeAttribute(Namespace="http://articles.business.publisher.armandorv.com/")]
    public partial class publishArticle : object, System.ComponentModel.INotifyPropertyChanged {
        
        private long arg0Field;
        
        private article arg1Field;
        
        /// <comentarios/>
        [System.Xml.Serialization.XmlElementAttribute(Form=System.Xml.Schema.XmlSchemaForm.Unqualified, Order=0)]
        public long arg0 {
            get {
                return this.arg0Field;
            }
            set {
                this.arg0Field = value;
                this.RaisePropertyChanged("arg0");
            }
        }
        
        /// <comentarios/>
        [System.Xml.Serialization.XmlElementAttribute(Form=System.Xml.Schema.XmlSchemaForm.Unqualified, Order=1)]
        public article arg1 {
            get {
                return this.arg1Field;
            }
            set {
                this.arg1Field = value;
                this.RaisePropertyChanged("arg1");
            }
        }
        
        public event System.ComponentModel.PropertyChangedEventHandler PropertyChanged;
        
        protected void RaisePropertyChanged(string propertyName) {
            System.ComponentModel.PropertyChangedEventHandler propertyChanged = this.PropertyChanged;
            if ((propertyChanged != null)) {
                propertyChanged(this, new System.ComponentModel.PropertyChangedEventArgs(propertyName));
            }
        }
    }
    
    /// <comentarios/>
    [System.CodeDom.Compiler.GeneratedCodeAttribute("System.Xml", "4.0.30319.1")]
    [System.SerializableAttribute()]
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.ComponentModel.DesignerCategoryAttribute("code")]
    [System.Xml.Serialization.XmlTypeAttribute(Namespace="http://articles.business.publisher.armandorv.com/")]
    public partial class article : object, System.ComponentModel.INotifyPropertyChanged {
        
        private string authorField;
        
        private System.DateTime dateOfCreationField;
        
        private bool dateOfCreationFieldSpecified;
        
        private string descriptionField;
        
        private string fileNameField;
        
        private long idField;
        
        private string subjectField;
        
        private string titleField;
        
        private string urlField;
        
        /// <comentarios/>
        [System.Xml.Serialization.XmlElementAttribute(Form=System.Xml.Schema.XmlSchemaForm.Unqualified, Order=0)]
        public string author {
            get {
                return this.authorField;
            }
            set {
                this.authorField = value;
                this.RaisePropertyChanged("author");
            }
        }
        
        /// <comentarios/>
        [System.Xml.Serialization.XmlElementAttribute(Form=System.Xml.Schema.XmlSchemaForm.Unqualified, Order=1)]
        public System.DateTime dateOfCreation {
            get {
                return this.dateOfCreationField;
            }
            set {
                this.dateOfCreationField = value;
                this.RaisePropertyChanged("dateOfCreation");
            }
        }
        
        /// <comentarios/>
        [System.Xml.Serialization.XmlIgnoreAttribute()]
        public bool dateOfCreationSpecified {
            get {
                return this.dateOfCreationFieldSpecified;
            }
            set {
                this.dateOfCreationFieldSpecified = value;
                this.RaisePropertyChanged("dateOfCreationSpecified");
            }
        }
        
        /// <comentarios/>
        [System.Xml.Serialization.XmlElementAttribute(Form=System.Xml.Schema.XmlSchemaForm.Unqualified, Order=2)]
        public string description {
            get {
                return this.descriptionField;
            }
            set {
                this.descriptionField = value;
                this.RaisePropertyChanged("description");
            }
        }
        
        /// <comentarios/>
        [System.Xml.Serialization.XmlElementAttribute(Form=System.Xml.Schema.XmlSchemaForm.Unqualified, Order=3)]
        public string fileName {
            get {
                return this.fileNameField;
            }
            set {
                this.fileNameField = value;
                this.RaisePropertyChanged("fileName");
            }
        }
        
        /// <comentarios/>
        [System.Xml.Serialization.XmlElementAttribute(Form=System.Xml.Schema.XmlSchemaForm.Unqualified, Order=4)]
        public long id {
            get {
                return this.idField;
            }
            set {
                this.idField = value;
                this.RaisePropertyChanged("id");
            }
        }
        
        /// <comentarios/>
        [System.Xml.Serialization.XmlElementAttribute(Form=System.Xml.Schema.XmlSchemaForm.Unqualified, Order=5)]
        public string subject {
            get {
                return this.subjectField;
            }
            set {
                this.subjectField = value;
                this.RaisePropertyChanged("subject");
            }
        }
        
        /// <comentarios/>
        [System.Xml.Serialization.XmlElementAttribute(Form=System.Xml.Schema.XmlSchemaForm.Unqualified, Order=6)]
        public string title {
            get {
                return this.titleField;
            }
            set {
                this.titleField = value;
                this.RaisePropertyChanged("title");
            }
        }
        
        /// <comentarios/>
        [System.Xml.Serialization.XmlElementAttribute(Form=System.Xml.Schema.XmlSchemaForm.Unqualified, Order=7)]
        public string url {
            get {
                return this.urlField;
            }
            set {
                this.urlField = value;
                this.RaisePropertyChanged("url");
            }
        }
        
        public event System.ComponentModel.PropertyChangedEventHandler PropertyChanged;
        
        protected void RaisePropertyChanged(string propertyName) {
            System.ComponentModel.PropertyChangedEventHandler propertyChanged = this.PropertyChanged;
            if ((propertyChanged != null)) {
                propertyChanged(this, new System.ComponentModel.PropertyChangedEventArgs(propertyName));
            }
        }
    }
    
    /// <comentarios/>
    [System.CodeDom.Compiler.GeneratedCodeAttribute("System.Xml", "4.0.30319.1")]
    [System.SerializableAttribute()]
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.ComponentModel.DesignerCategoryAttribute("code")]
    [System.Xml.Serialization.XmlTypeAttribute(Namespace="http://articles.business.publisher.armandorv.com/")]
    public partial class modifyArticleResponse : object, System.ComponentModel.INotifyPropertyChanged {
        
        public event System.ComponentModel.PropertyChangedEventHandler PropertyChanged;
        
        protected void RaisePropertyChanged(string propertyName) {
            System.ComponentModel.PropertyChangedEventHandler propertyChanged = this.PropertyChanged;
            if ((propertyChanged != null)) {
                propertyChanged(this, new System.ComponentModel.PropertyChangedEventArgs(propertyName));
            }
        }
    }
    
    /// <comentarios/>
    [System.CodeDom.Compiler.GeneratedCodeAttribute("System.Xml", "4.0.30319.1")]
    [System.SerializableAttribute()]
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.ComponentModel.DesignerCategoryAttribute("code")]
    [System.Xml.Serialization.XmlTypeAttribute(Namespace="http://articles.business.publisher.armandorv.com/")]
    public partial class modifyArticle : object, System.ComponentModel.INotifyPropertyChanged {
        
        private article arg0Field;
        
        /// <comentarios/>
        [System.Xml.Serialization.XmlElementAttribute(Form=System.Xml.Schema.XmlSchemaForm.Unqualified, Order=0)]
        public article arg0 {
            get {
                return this.arg0Field;
            }
            set {
                this.arg0Field = value;
                this.RaisePropertyChanged("arg0");
            }
        }
        
        public event System.ComponentModel.PropertyChangedEventHandler PropertyChanged;
        
        protected void RaisePropertyChanged(string propertyName) {
            System.ComponentModel.PropertyChangedEventHandler propertyChanged = this.PropertyChanged;
            if ((propertyChanged != null)) {
                propertyChanged(this, new System.ComponentModel.PropertyChangedEventArgs(propertyName));
            }
        }
    }
    
    /// <comentarios/>
    [System.CodeDom.Compiler.GeneratedCodeAttribute("System.Xml", "4.0.30319.1")]
    [System.SerializableAttribute()]
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.ComponentModel.DesignerCategoryAttribute("code")]
    [System.Xml.Serialization.XmlTypeAttribute(Namespace="http://articles.business.publisher.armandorv.com/")]
    public partial class getArticleByIDResponse : object, System.ComponentModel.INotifyPropertyChanged {
        
        private article returnField;
        
        /// <comentarios/>
        [System.Xml.Serialization.XmlElementAttribute(Form=System.Xml.Schema.XmlSchemaForm.Unqualified, Order=0)]
        public article @return {
            get {
                return this.returnField;
            }
            set {
                this.returnField = value;
                this.RaisePropertyChanged("return");
            }
        }
        
        public event System.ComponentModel.PropertyChangedEventHandler PropertyChanged;
        
        protected void RaisePropertyChanged(string propertyName) {
            System.ComponentModel.PropertyChangedEventHandler propertyChanged = this.PropertyChanged;
            if ((propertyChanged != null)) {
                propertyChanged(this, new System.ComponentModel.PropertyChangedEventArgs(propertyName));
            }
        }
    }
    
    /// <comentarios/>
    [System.CodeDom.Compiler.GeneratedCodeAttribute("System.Xml", "4.0.30319.1")]
    [System.SerializableAttribute()]
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.ComponentModel.DesignerCategoryAttribute("code")]
    [System.Xml.Serialization.XmlTypeAttribute(Namespace="http://articles.business.publisher.armandorv.com/")]
    public partial class getArticleByID : object, System.ComponentModel.INotifyPropertyChanged {
        
        private long arg0Field;
        
        /// <comentarios/>
        [System.Xml.Serialization.XmlElementAttribute(Form=System.Xml.Schema.XmlSchemaForm.Unqualified, Order=0)]
        public long arg0 {
            get {
                return this.arg0Field;
            }
            set {
                this.arg0Field = value;
                this.RaisePropertyChanged("arg0");
            }
        }
        
        public event System.ComponentModel.PropertyChangedEventHandler PropertyChanged;
        
        protected void RaisePropertyChanged(string propertyName) {
            System.ComponentModel.PropertyChangedEventHandler propertyChanged = this.PropertyChanged;
            if ((propertyChanged != null)) {
                propertyChanged(this, new System.ComponentModel.PropertyChangedEventArgs(propertyName));
            }
        }
    }
    
    /// <comentarios/>
    [System.CodeDom.Compiler.GeneratedCodeAttribute("System.Xml", "4.0.30319.1")]
    [System.SerializableAttribute()]
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.ComponentModel.DesignerCategoryAttribute("code")]
    [System.Xml.Serialization.XmlTypeAttribute(Namespace="http://articles.business.publisher.armandorv.com/")]
    public partial class getAllArticlesOfAuthor : object, System.ComponentModel.INotifyPropertyChanged {
        
        private long arg0Field;
        
        /// <comentarios/>
        [System.Xml.Serialization.XmlElementAttribute(Form=System.Xml.Schema.XmlSchemaForm.Unqualified, Order=0)]
        public long arg0 {
            get {
                return this.arg0Field;
            }
            set {
                this.arg0Field = value;
                this.RaisePropertyChanged("arg0");
            }
        }
        
        public event System.ComponentModel.PropertyChangedEventHandler PropertyChanged;
        
        protected void RaisePropertyChanged(string propertyName) {
            System.ComponentModel.PropertyChangedEventHandler propertyChanged = this.PropertyChanged;
            if ((propertyChanged != null)) {
                propertyChanged(this, new System.ComponentModel.PropertyChangedEventArgs(propertyName));
            }
        }
    }
    
    /// <comentarios/>
    [System.CodeDom.Compiler.GeneratedCodeAttribute("System.Xml", "4.0.30319.1")]
    [System.SerializableAttribute()]
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.ComponentModel.DesignerCategoryAttribute("code")]
    [System.Xml.Serialization.XmlTypeAttribute(Namespace="http://articles.business.publisher.armandorv.com/")]
    public partial class getAllArticles : object, System.ComponentModel.INotifyPropertyChanged {
        
        public event System.ComponentModel.PropertyChangedEventHandler PropertyChanged;
        
        protected void RaisePropertyChanged(string propertyName) {
            System.ComponentModel.PropertyChangedEventHandler propertyChanged = this.PropertyChanged;
            if ((propertyChanged != null)) {
                propertyChanged(this, new System.ComponentModel.PropertyChangedEventArgs(propertyName));
            }
        }
    }
    
    /// <comentarios/>
    [System.CodeDom.Compiler.GeneratedCodeAttribute("System.Xml", "4.0.30319.1")]
    [System.SerializableAttribute()]
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.ComponentModel.DesignerCategoryAttribute("code")]
    [System.Xml.Serialization.XmlTypeAttribute(Namespace="http://articles.business.publisher.armandorv.com/")]
    public partial class deleteArticleResponse : object, System.ComponentModel.INotifyPropertyChanged {
        
        public event System.ComponentModel.PropertyChangedEventHandler PropertyChanged;
        
        protected void RaisePropertyChanged(string propertyName) {
            System.ComponentModel.PropertyChangedEventHandler propertyChanged = this.PropertyChanged;
            if ((propertyChanged != null)) {
                propertyChanged(this, new System.ComponentModel.PropertyChangedEventArgs(propertyName));
            }
        }
    }
    
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.CodeDom.Compiler.GeneratedCodeAttribute("System.ServiceModel", "4.0.0.0")]
    [System.ComponentModel.EditorBrowsableAttribute(System.ComponentModel.EditorBrowsableState.Advanced)]
    [System.ServiceModel.MessageContractAttribute(IsWrapped=false)]
    public partial class deleteArticleRequest {
        
        [System.ServiceModel.MessageBodyMemberAttribute(Namespace="http://articles.business.publisher.armandorv.com/", Order=0)]
        public WSClientPublisher.Business.Articles.deleteArticle deleteArticle;
        
        public deleteArticleRequest() {
        }
        
        public deleteArticleRequest(WSClientPublisher.Business.Articles.deleteArticle deleteArticle) {
            this.deleteArticle = deleteArticle;
        }
    }
    
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.CodeDom.Compiler.GeneratedCodeAttribute("System.ServiceModel", "4.0.0.0")]
    [System.ComponentModel.EditorBrowsableAttribute(System.ComponentModel.EditorBrowsableState.Advanced)]
    [System.ServiceModel.MessageContractAttribute(IsWrapped=false)]
    public partial class deleteArticleResponse1 {
        
        [System.ServiceModel.MessageBodyMemberAttribute(Namespace="http://articles.business.publisher.armandorv.com/", Order=0)]
        public WSClientPublisher.Business.Articles.deleteArticleResponse deleteArticleResponse;
        
        public deleteArticleResponse1() {
        }
        
        public deleteArticleResponse1(WSClientPublisher.Business.Articles.deleteArticleResponse deleteArticleResponse) {
            this.deleteArticleResponse = deleteArticleResponse;
        }
    }
    
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.CodeDom.Compiler.GeneratedCodeAttribute("System.ServiceModel", "4.0.0.0")]
    [System.ComponentModel.EditorBrowsableAttribute(System.ComponentModel.EditorBrowsableState.Advanced)]
    [System.ServiceModel.MessageContractAttribute(IsWrapped=false)]
    public partial class getAllArticlesRequest {
        
        [System.ServiceModel.MessageBodyMemberAttribute(Namespace="http://articles.business.publisher.armandorv.com/", Order=0)]
        public WSClientPublisher.Business.Articles.getAllArticles getAllArticles;
        
        public getAllArticlesRequest() {
        }
        
        public getAllArticlesRequest(WSClientPublisher.Business.Articles.getAllArticles getAllArticles) {
            this.getAllArticles = getAllArticles;
        }
    }
    
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.CodeDom.Compiler.GeneratedCodeAttribute("System.ServiceModel", "4.0.0.0")]
    [System.ComponentModel.EditorBrowsableAttribute(System.ComponentModel.EditorBrowsableState.Advanced)]
    [System.ServiceModel.MessageContractAttribute(IsWrapped=false)]
    public partial class getAllArticlesResponse {
        
        [System.ServiceModel.MessageBodyMemberAttribute(Name="getAllArticlesResponse", Namespace="http://articles.business.publisher.armandorv.com/", Order=0)]
        [System.Xml.Serialization.XmlArrayItemAttribute("return", Form=System.Xml.Schema.XmlSchemaForm.Unqualified, IsNullable=false)]
        public article[] getAllArticlesResponse1;
        
        public getAllArticlesResponse() {
        }
        
        public getAllArticlesResponse(article[] getAllArticlesResponse1) {
            this.getAllArticlesResponse1 = getAllArticlesResponse1;
        }
    }
    
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.CodeDom.Compiler.GeneratedCodeAttribute("System.ServiceModel", "4.0.0.0")]
    [System.ComponentModel.EditorBrowsableAttribute(System.ComponentModel.EditorBrowsableState.Advanced)]
    [System.ServiceModel.MessageContractAttribute(IsWrapped=false)]
    public partial class getAllArticlesOfAuthorRequest {
        
        [System.ServiceModel.MessageBodyMemberAttribute(Namespace="http://articles.business.publisher.armandorv.com/", Order=0)]
        public WSClientPublisher.Business.Articles.getAllArticlesOfAuthor getAllArticlesOfAuthor;
        
        public getAllArticlesOfAuthorRequest() {
        }
        
        public getAllArticlesOfAuthorRequest(WSClientPublisher.Business.Articles.getAllArticlesOfAuthor getAllArticlesOfAuthor) {
            this.getAllArticlesOfAuthor = getAllArticlesOfAuthor;
        }
    }
    
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.CodeDom.Compiler.GeneratedCodeAttribute("System.ServiceModel", "4.0.0.0")]
    [System.ComponentModel.EditorBrowsableAttribute(System.ComponentModel.EditorBrowsableState.Advanced)]
    [System.ServiceModel.MessageContractAttribute(IsWrapped=false)]
    public partial class getAllArticlesOfAuthorResponse {
        
        [System.ServiceModel.MessageBodyMemberAttribute(Name="getAllArticlesOfAuthorResponse", Namespace="http://articles.business.publisher.armandorv.com/", Order=0)]
        [System.Xml.Serialization.XmlArrayItemAttribute("return", Form=System.Xml.Schema.XmlSchemaForm.Unqualified, IsNullable=false)]
        public article[] getAllArticlesOfAuthorResponse1;
        
        public getAllArticlesOfAuthorResponse() {
        }
        
        public getAllArticlesOfAuthorResponse(article[] getAllArticlesOfAuthorResponse1) {
            this.getAllArticlesOfAuthorResponse1 = getAllArticlesOfAuthorResponse1;
        }
    }
    
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.CodeDom.Compiler.GeneratedCodeAttribute("System.ServiceModel", "4.0.0.0")]
    [System.ComponentModel.EditorBrowsableAttribute(System.ComponentModel.EditorBrowsableState.Advanced)]
    [System.ServiceModel.MessageContractAttribute(IsWrapped=false)]
    public partial class getArticleByIDRequest {
        
        [System.ServiceModel.MessageBodyMemberAttribute(Namespace="http://articles.business.publisher.armandorv.com/", Order=0)]
        public WSClientPublisher.Business.Articles.getArticleByID getArticleByID;
        
        public getArticleByIDRequest() {
        }
        
        public getArticleByIDRequest(WSClientPublisher.Business.Articles.getArticleByID getArticleByID) {
            this.getArticleByID = getArticleByID;
        }
    }
    
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.CodeDom.Compiler.GeneratedCodeAttribute("System.ServiceModel", "4.0.0.0")]
    [System.ComponentModel.EditorBrowsableAttribute(System.ComponentModel.EditorBrowsableState.Advanced)]
    [System.ServiceModel.MessageContractAttribute(IsWrapped=false)]
    public partial class getArticleByIDResponse1 {
        
        [System.ServiceModel.MessageBodyMemberAttribute(Namespace="http://articles.business.publisher.armandorv.com/", Order=0)]
        public WSClientPublisher.Business.Articles.getArticleByIDResponse getArticleByIDResponse;
        
        public getArticleByIDResponse1() {
        }
        
        public getArticleByIDResponse1(WSClientPublisher.Business.Articles.getArticleByIDResponse getArticleByIDResponse) {
            this.getArticleByIDResponse = getArticleByIDResponse;
        }
    }
    
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.CodeDom.Compiler.GeneratedCodeAttribute("System.ServiceModel", "4.0.0.0")]
    [System.ComponentModel.EditorBrowsableAttribute(System.ComponentModel.EditorBrowsableState.Advanced)]
    [System.ServiceModel.MessageContractAttribute(IsWrapped=false)]
    public partial class modifyArticleRequest {
        
        [System.ServiceModel.MessageBodyMemberAttribute(Namespace="http://articles.business.publisher.armandorv.com/", Order=0)]
        public WSClientPublisher.Business.Articles.modifyArticle modifyArticle;
        
        public modifyArticleRequest() {
        }
        
        public modifyArticleRequest(WSClientPublisher.Business.Articles.modifyArticle modifyArticle) {
            this.modifyArticle = modifyArticle;
        }
    }
    
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.CodeDom.Compiler.GeneratedCodeAttribute("System.ServiceModel", "4.0.0.0")]
    [System.ComponentModel.EditorBrowsableAttribute(System.ComponentModel.EditorBrowsableState.Advanced)]
    [System.ServiceModel.MessageContractAttribute(IsWrapped=false)]
    public partial class modifyArticleResponse1 {
        
        [System.ServiceModel.MessageBodyMemberAttribute(Namespace="http://articles.business.publisher.armandorv.com/", Order=0)]
        public WSClientPublisher.Business.Articles.modifyArticleResponse modifyArticleResponse;
        
        public modifyArticleResponse1() {
        }
        
        public modifyArticleResponse1(WSClientPublisher.Business.Articles.modifyArticleResponse modifyArticleResponse) {
            this.modifyArticleResponse = modifyArticleResponse;
        }
    }
    
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.CodeDom.Compiler.GeneratedCodeAttribute("System.ServiceModel", "4.0.0.0")]
    [System.ComponentModel.EditorBrowsableAttribute(System.ComponentModel.EditorBrowsableState.Advanced)]
    [System.ServiceModel.MessageContractAttribute(IsWrapped=false)]
    public partial class publishArticleRequest {
        
        [System.ServiceModel.MessageBodyMemberAttribute(Namespace="http://articles.business.publisher.armandorv.com/", Order=0)]
        public WSClientPublisher.Business.Articles.publishArticle publishArticle;
        
        public publishArticleRequest() {
        }
        
        public publishArticleRequest(WSClientPublisher.Business.Articles.publishArticle publishArticle) {
            this.publishArticle = publishArticle;
        }
    }
    
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.CodeDom.Compiler.GeneratedCodeAttribute("System.ServiceModel", "4.0.0.0")]
    [System.ComponentModel.EditorBrowsableAttribute(System.ComponentModel.EditorBrowsableState.Advanced)]
    [System.ServiceModel.MessageContractAttribute(IsWrapped=false)]
    public partial class publishArticleResponse1 {
        
        [System.ServiceModel.MessageBodyMemberAttribute(Namespace="http://articles.business.publisher.armandorv.com/", Order=0)]
        public WSClientPublisher.Business.Articles.publishArticleResponse publishArticleResponse;
        
        public publishArticleResponse1() {
        }
        
        public publishArticleResponse1(WSClientPublisher.Business.Articles.publishArticleResponse publishArticleResponse) {
            this.publishArticleResponse = publishArticleResponse;
        }
    }
    
    [System.CodeDom.Compiler.GeneratedCodeAttribute("System.ServiceModel", "4.0.0.0")]
    public interface ArticlesServiceChannel : WSClientPublisher.Business.Articles.ArticlesService, System.ServiceModel.IClientChannel {
    }
    
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.CodeDom.Compiler.GeneratedCodeAttribute("System.ServiceModel", "4.0.0.0")]
    public partial class ArticlesServiceClient : System.ServiceModel.ClientBase<WSClientPublisher.Business.Articles.ArticlesService>, WSClientPublisher.Business.Articles.ArticlesService {
        
        public ArticlesServiceClient() {
        }
        
        public ArticlesServiceClient(string endpointConfigurationName) : 
                base(endpointConfigurationName) {
        }
        
        public ArticlesServiceClient(string endpointConfigurationName, string remoteAddress) : 
                base(endpointConfigurationName, remoteAddress) {
        }
        
        public ArticlesServiceClient(string endpointConfigurationName, System.ServiceModel.EndpointAddress remoteAddress) : 
                base(endpointConfigurationName, remoteAddress) {
        }
        
        public ArticlesServiceClient(System.ServiceModel.Channels.Binding binding, System.ServiceModel.EndpointAddress remoteAddress) : 
                base(binding, remoteAddress) {
        }
        
        [System.ComponentModel.EditorBrowsableAttribute(System.ComponentModel.EditorBrowsableState.Advanced)]
        WSClientPublisher.Business.Articles.deleteArticleResponse1 WSClientPublisher.Business.Articles.ArticlesService.deleteArticle(WSClientPublisher.Business.Articles.deleteArticleRequest request) {
            return base.Channel.deleteArticle(request);
        }
        
        public WSClientPublisher.Business.Articles.deleteArticleResponse deleteArticle(WSClientPublisher.Business.Articles.deleteArticle deleteArticle1) {
            WSClientPublisher.Business.Articles.deleteArticleRequest inValue = new WSClientPublisher.Business.Articles.deleteArticleRequest();
            inValue.deleteArticle = deleteArticle1;
            WSClientPublisher.Business.Articles.deleteArticleResponse1 retVal = ((WSClientPublisher.Business.Articles.ArticlesService)(this)).deleteArticle(inValue);
            return retVal.deleteArticleResponse;
        }
        
        [System.ComponentModel.EditorBrowsableAttribute(System.ComponentModel.EditorBrowsableState.Advanced)]
        WSClientPublisher.Business.Articles.getAllArticlesResponse WSClientPublisher.Business.Articles.ArticlesService.getAllArticles(WSClientPublisher.Business.Articles.getAllArticlesRequest request) {
            return base.Channel.getAllArticles(request);
        }
        
        public article[] getAllArticles(WSClientPublisher.Business.Articles.getAllArticles getAllArticles1) {
            WSClientPublisher.Business.Articles.getAllArticlesRequest inValue = new WSClientPublisher.Business.Articles.getAllArticlesRequest();
            inValue.getAllArticles = getAllArticles1;
            WSClientPublisher.Business.Articles.getAllArticlesResponse retVal = ((WSClientPublisher.Business.Articles.ArticlesService)(this)).getAllArticles(inValue);
            return retVal.getAllArticlesResponse1;
        }
        
        [System.ComponentModel.EditorBrowsableAttribute(System.ComponentModel.EditorBrowsableState.Advanced)]
        WSClientPublisher.Business.Articles.getAllArticlesOfAuthorResponse WSClientPublisher.Business.Articles.ArticlesService.getAllArticlesOfAuthor(WSClientPublisher.Business.Articles.getAllArticlesOfAuthorRequest request) {
            return base.Channel.getAllArticlesOfAuthor(request);
        }
        
        public article[] getAllArticlesOfAuthor(WSClientPublisher.Business.Articles.getAllArticlesOfAuthor getAllArticlesOfAuthor1) {
            WSClientPublisher.Business.Articles.getAllArticlesOfAuthorRequest inValue = new WSClientPublisher.Business.Articles.getAllArticlesOfAuthorRequest();
            inValue.getAllArticlesOfAuthor = getAllArticlesOfAuthor1;
            WSClientPublisher.Business.Articles.getAllArticlesOfAuthorResponse retVal = ((WSClientPublisher.Business.Articles.ArticlesService)(this)).getAllArticlesOfAuthor(inValue);
            return retVal.getAllArticlesOfAuthorResponse1;
        }
        
        [System.ComponentModel.EditorBrowsableAttribute(System.ComponentModel.EditorBrowsableState.Advanced)]
        WSClientPublisher.Business.Articles.getArticleByIDResponse1 WSClientPublisher.Business.Articles.ArticlesService.getArticleByID(WSClientPublisher.Business.Articles.getArticleByIDRequest request) {
            return base.Channel.getArticleByID(request);
        }
        
        public WSClientPublisher.Business.Articles.getArticleByIDResponse getArticleByID(WSClientPublisher.Business.Articles.getArticleByID getArticleByID1) {
            WSClientPublisher.Business.Articles.getArticleByIDRequest inValue = new WSClientPublisher.Business.Articles.getArticleByIDRequest();
            inValue.getArticleByID = getArticleByID1;
            WSClientPublisher.Business.Articles.getArticleByIDResponse1 retVal = ((WSClientPublisher.Business.Articles.ArticlesService)(this)).getArticleByID(inValue);
            return retVal.getArticleByIDResponse;
        }
        
        [System.ComponentModel.EditorBrowsableAttribute(System.ComponentModel.EditorBrowsableState.Advanced)]
        WSClientPublisher.Business.Articles.modifyArticleResponse1 WSClientPublisher.Business.Articles.ArticlesService.modifyArticle(WSClientPublisher.Business.Articles.modifyArticleRequest request) {
            return base.Channel.modifyArticle(request);
        }
        
        public WSClientPublisher.Business.Articles.modifyArticleResponse modifyArticle(WSClientPublisher.Business.Articles.modifyArticle modifyArticle1) {
            WSClientPublisher.Business.Articles.modifyArticleRequest inValue = new WSClientPublisher.Business.Articles.modifyArticleRequest();
            inValue.modifyArticle = modifyArticle1;
            WSClientPublisher.Business.Articles.modifyArticleResponse1 retVal = ((WSClientPublisher.Business.Articles.ArticlesService)(this)).modifyArticle(inValue);
            return retVal.modifyArticleResponse;
        }
        
        [System.ComponentModel.EditorBrowsableAttribute(System.ComponentModel.EditorBrowsableState.Advanced)]
        WSClientPublisher.Business.Articles.publishArticleResponse1 WSClientPublisher.Business.Articles.ArticlesService.publishArticle(WSClientPublisher.Business.Articles.publishArticleRequest request) {
            return base.Channel.publishArticle(request);
        }
        
        public WSClientPublisher.Business.Articles.publishArticleResponse publishArticle(WSClientPublisher.Business.Articles.publishArticle publishArticle1) {
            WSClientPublisher.Business.Articles.publishArticleRequest inValue = new WSClientPublisher.Business.Articles.publishArticleRequest();
            inValue.publishArticle = publishArticle1;
            WSClientPublisher.Business.Articles.publishArticleResponse1 retVal = ((WSClientPublisher.Business.Articles.ArticlesService)(this)).publishArticle(inValue);
            return retVal.publishArticleResponse;
        }
    }
}