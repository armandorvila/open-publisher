﻿//------------------------------------------------------------------------------
// <auto-generated>
//     Este código fue generado por una herramienta.
//     Versión de runtime:4.0.30319.1
//
//     Los cambios en este archivo podrían causar un comportamiento incorrecto y se perderán si
//     se vuelve a generar el código.
// </auto-generated>
//------------------------------------------------------------------------------

namespace WSClientPublisher.Business.Authors {
    
    
    [System.CodeDom.Compiler.GeneratedCodeAttribute("System.ServiceModel", "4.0.0.0")]
    [System.ServiceModel.ServiceContractAttribute(Namespace="http://authors.business.publisher.armandorv.com/", ConfigurationName="Business.Authors.AuthorsService")]
    public interface AuthorsService {
        
        // CODEGEN: Se está generando un contrato de mensaje, ya que la operación deleteAuthor no es RPC ni está encapsulada en un documento.
        [System.ServiceModel.OperationContractAttribute(Action="", ReplyAction="*")]
        [System.ServiceModel.XmlSerializerFormatAttribute(SupportFaults=true)]
        WSClientPublisher.Business.Authors.deleteAuthorResponse1 deleteAuthor(WSClientPublisher.Business.Authors.deleteAuthorRequest request);
        
        // CODEGEN: Se está generando un contrato de mensaje, ya que la operación enrollAuthor no es RPC ni está encapsulada en un documento.
        [System.ServiceModel.OperationContractAttribute(Action="", ReplyAction="*")]
        [System.ServiceModel.XmlSerializerFormatAttribute(SupportFaults=true)]
        WSClientPublisher.Business.Authors.enrollAuthorResponse1 enrollAuthor(WSClientPublisher.Business.Authors.enrollAuthorRequest request);
        
        // CODEGEN: Se está generando un contrato de mensaje, ya que la operación getAllAuthors no es RPC ni está encapsulada en un documento.
        [System.ServiceModel.OperationContractAttribute(Action="", ReplyAction="*")]
        [System.ServiceModel.XmlSerializerFormatAttribute(SupportFaults=true)]
        WSClientPublisher.Business.Authors.getAllAuthorsResponse getAllAuthors(WSClientPublisher.Business.Authors.getAllAuthorsRequest request);
        
        // CODEGEN: Se está generando un contrato de mensaje, ya que la operación getAuthorByuserName no es RPC ni está encapsulada en un documento.
        [System.ServiceModel.OperationContractAttribute(Action="", ReplyAction="*")]
        [System.ServiceModel.XmlSerializerFormatAttribute(SupportFaults=true)]
        WSClientPublisher.Business.Authors.getAuthorByuserNameResponse1 getAuthorByuserName(WSClientPublisher.Business.Authors.getAuthorByuserNameRequest request);
        
        // CODEGEN: Se está generando un contrato de mensaje, ya que la operación modifyAuthor no es RPC ni está encapsulada en un documento.
        [System.ServiceModel.OperationContractAttribute(Action="", ReplyAction="*")]
        [System.ServiceModel.XmlSerializerFormatAttribute(SupportFaults=true)]
        WSClientPublisher.Business.Authors.modifyAuthorResponse1 modifyAuthor(WSClientPublisher.Business.Authors.modifyAuthorRequest request);
    }
    
    /// <comentarios/>
    [System.CodeDom.Compiler.GeneratedCodeAttribute("System.Xml", "4.0.30319.1")]
    [System.SerializableAttribute()]
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.ComponentModel.DesignerCategoryAttribute("code")]
    [System.Xml.Serialization.XmlTypeAttribute(Namespace="http://authors.business.publisher.armandorv.com/")]
    public partial class deleteAuthor : object, System.ComponentModel.INotifyPropertyChanged {
        
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
    [System.Xml.Serialization.XmlTypeAttribute(Namespace="http://authors.business.publisher.armandorv.com/")]
    public partial class modifyAuthorResponse : object, System.ComponentModel.INotifyPropertyChanged {
        
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
    [System.Xml.Serialization.XmlTypeAttribute(Namespace="http://authors.business.publisher.armandorv.com/")]
    public partial class modifyAuthor : object, System.ComponentModel.INotifyPropertyChanged {
        
        private author arg0Field;
        
        /// <comentarios/>
        [System.Xml.Serialization.XmlElementAttribute(Form=System.Xml.Schema.XmlSchemaForm.Unqualified, Order=0)]
        public author arg0 {
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
    [System.Xml.Serialization.XmlTypeAttribute(Namespace="http://authors.business.publisher.armandorv.com/")]
    public partial class author : object, System.ComponentModel.INotifyPropertyChanged {
        
        private System.DateTime dateOfJoiningField;
        
        private bool dateOfJoiningFieldSpecified;
        
        private long idField;
        
        private string nameField;
        
        private string surnameField;
        
        /// <comentarios/>
        [System.Xml.Serialization.XmlElementAttribute(Form=System.Xml.Schema.XmlSchemaForm.Unqualified, Order=0)]
        public System.DateTime dateOfJoining {
            get {
                return this.dateOfJoiningField;
            }
            set {
                this.dateOfJoiningField = value;
                this.RaisePropertyChanged("dateOfJoining");
            }
        }
        
        /// <comentarios/>
        [System.Xml.Serialization.XmlIgnoreAttribute()]
        public bool dateOfJoiningSpecified {
            get {
                return this.dateOfJoiningFieldSpecified;
            }
            set {
                this.dateOfJoiningFieldSpecified = value;
                this.RaisePropertyChanged("dateOfJoiningSpecified");
            }
        }
        
        /// <comentarios/>
        [System.Xml.Serialization.XmlElementAttribute(Form=System.Xml.Schema.XmlSchemaForm.Unqualified, Order=1)]
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
        [System.Xml.Serialization.XmlElementAttribute(Form=System.Xml.Schema.XmlSchemaForm.Unqualified, Order=2)]
        public string name {
            get {
                return this.nameField;
            }
            set {
                this.nameField = value;
                this.RaisePropertyChanged("name");
            }
        }
        
        /// <comentarios/>
        [System.Xml.Serialization.XmlElementAttribute(Form=System.Xml.Schema.XmlSchemaForm.Unqualified, Order=3)]
        public string surname {
            get {
                return this.surnameField;
            }
            set {
                this.surnameField = value;
                this.RaisePropertyChanged("surname");
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
    [System.Xml.Serialization.XmlTypeAttribute(Namespace="http://authors.business.publisher.armandorv.com/")]
    public partial class getAuthorByuserNameResponse : object, System.ComponentModel.INotifyPropertyChanged {
        
        private author returnField;
        
        /// <comentarios/>
        [System.Xml.Serialization.XmlElementAttribute(Form=System.Xml.Schema.XmlSchemaForm.Unqualified, Order=0)]
        public author @return {
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
    [System.Xml.Serialization.XmlTypeAttribute(Namespace="http://authors.business.publisher.armandorv.com/")]
    public partial class getAuthorByuserName : object, System.ComponentModel.INotifyPropertyChanged {
        
        private string arg0Field;
        
        /// <comentarios/>
        [System.Xml.Serialization.XmlElementAttribute(Form=System.Xml.Schema.XmlSchemaForm.Unqualified, Order=0)]
        public string arg0 {
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
    [System.Xml.Serialization.XmlTypeAttribute(Namespace="http://authors.business.publisher.armandorv.com/")]
    public partial class getAllAuthors : object, System.ComponentModel.INotifyPropertyChanged {
        
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
    [System.Xml.Serialization.XmlTypeAttribute(Namespace="http://authors.business.publisher.armandorv.com/")]
    public partial class enrollAuthorResponse : object, System.ComponentModel.INotifyPropertyChanged {
        
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
    [System.Xml.Serialization.XmlTypeAttribute(Namespace="http://authors.business.publisher.armandorv.com/")]
    public partial class user : object, System.ComponentModel.INotifyPropertyChanged {
        
        private author authorField;
        
        private string passwordField;
        
        private string userNameField;
        
        /// <comentarios/>
        [System.Xml.Serialization.XmlElementAttribute(Form=System.Xml.Schema.XmlSchemaForm.Unqualified, Order=0)]
        public author author {
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
        public string password {
            get {
                return this.passwordField;
            }
            set {
                this.passwordField = value;
                this.RaisePropertyChanged("password");
            }
        }
        
        /// <comentarios/>
        [System.Xml.Serialization.XmlElementAttribute(Form=System.Xml.Schema.XmlSchemaForm.Unqualified, Order=2)]
        public string userName {
            get {
                return this.userNameField;
            }
            set {
                this.userNameField = value;
                this.RaisePropertyChanged("userName");
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
    [System.Xml.Serialization.XmlTypeAttribute(Namespace="http://authors.business.publisher.armandorv.com/")]
    public partial class enrollAuthor : object, System.ComponentModel.INotifyPropertyChanged {
        
        private user arg0Field;
        
        private author arg1Field;
        
        /// <comentarios/>
        [System.Xml.Serialization.XmlElementAttribute(Form=System.Xml.Schema.XmlSchemaForm.Unqualified, Order=0)]
        public user arg0 {
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
        public author arg1 {
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
    [System.Xml.Serialization.XmlTypeAttribute(Namespace="http://authors.business.publisher.armandorv.com/")]
    public partial class deleteAuthorResponse : object, System.ComponentModel.INotifyPropertyChanged {
        
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
    public partial class deleteAuthorRequest {
        
        [System.ServiceModel.MessageBodyMemberAttribute(Namespace="http://authors.business.publisher.armandorv.com/", Order=0)]
        public WSClientPublisher.Business.Authors.deleteAuthor deleteAuthor;
        
        public deleteAuthorRequest() {
        }
        
        public deleteAuthorRequest(WSClientPublisher.Business.Authors.deleteAuthor deleteAuthor) {
            this.deleteAuthor = deleteAuthor;
        }
    }
    
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.CodeDom.Compiler.GeneratedCodeAttribute("System.ServiceModel", "4.0.0.0")]
    [System.ComponentModel.EditorBrowsableAttribute(System.ComponentModel.EditorBrowsableState.Advanced)]
    [System.ServiceModel.MessageContractAttribute(IsWrapped=false)]
    public partial class deleteAuthorResponse1 {
        
        [System.ServiceModel.MessageBodyMemberAttribute(Namespace="http://authors.business.publisher.armandorv.com/", Order=0)]
        public WSClientPublisher.Business.Authors.deleteAuthorResponse deleteAuthorResponse;
        
        public deleteAuthorResponse1() {
        }
        
        public deleteAuthorResponse1(WSClientPublisher.Business.Authors.deleteAuthorResponse deleteAuthorResponse) {
            this.deleteAuthorResponse = deleteAuthorResponse;
        }
    }
    
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.CodeDom.Compiler.GeneratedCodeAttribute("System.ServiceModel", "4.0.0.0")]
    [System.ComponentModel.EditorBrowsableAttribute(System.ComponentModel.EditorBrowsableState.Advanced)]
    [System.ServiceModel.MessageContractAttribute(IsWrapped=false)]
    public partial class enrollAuthorRequest {
        
        [System.ServiceModel.MessageBodyMemberAttribute(Namespace="http://authors.business.publisher.armandorv.com/", Order=0)]
        public WSClientPublisher.Business.Authors.enrollAuthor enrollAuthor;
        
        public enrollAuthorRequest() {
        }
        
        public enrollAuthorRequest(WSClientPublisher.Business.Authors.enrollAuthor enrollAuthor) {
            this.enrollAuthor = enrollAuthor;
        }
    }
    
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.CodeDom.Compiler.GeneratedCodeAttribute("System.ServiceModel", "4.0.0.0")]
    [System.ComponentModel.EditorBrowsableAttribute(System.ComponentModel.EditorBrowsableState.Advanced)]
    [System.ServiceModel.MessageContractAttribute(IsWrapped=false)]
    public partial class enrollAuthorResponse1 {
        
        [System.ServiceModel.MessageBodyMemberAttribute(Namespace="http://authors.business.publisher.armandorv.com/", Order=0)]
        public WSClientPublisher.Business.Authors.enrollAuthorResponse enrollAuthorResponse;
        
        public enrollAuthorResponse1() {
        }
        
        public enrollAuthorResponse1(WSClientPublisher.Business.Authors.enrollAuthorResponse enrollAuthorResponse) {
            this.enrollAuthorResponse = enrollAuthorResponse;
        }
    }
    
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.CodeDom.Compiler.GeneratedCodeAttribute("System.ServiceModel", "4.0.0.0")]
    [System.ComponentModel.EditorBrowsableAttribute(System.ComponentModel.EditorBrowsableState.Advanced)]
    [System.ServiceModel.MessageContractAttribute(IsWrapped=false)]
    public partial class getAllAuthorsRequest {
        
        [System.ServiceModel.MessageBodyMemberAttribute(Namespace="http://authors.business.publisher.armandorv.com/", Order=0)]
        public WSClientPublisher.Business.Authors.getAllAuthors getAllAuthors;
        
        public getAllAuthorsRequest() {
        }
        
        public getAllAuthorsRequest(WSClientPublisher.Business.Authors.getAllAuthors getAllAuthors) {
            this.getAllAuthors = getAllAuthors;
        }
    }
    
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.CodeDom.Compiler.GeneratedCodeAttribute("System.ServiceModel", "4.0.0.0")]
    [System.ComponentModel.EditorBrowsableAttribute(System.ComponentModel.EditorBrowsableState.Advanced)]
    [System.ServiceModel.MessageContractAttribute(IsWrapped=false)]
    public partial class getAllAuthorsResponse {
        
        [System.ServiceModel.MessageBodyMemberAttribute(Name="getAllAuthorsResponse", Namespace="http://authors.business.publisher.armandorv.com/", Order=0)]
        [System.Xml.Serialization.XmlArrayItemAttribute("return", Form=System.Xml.Schema.XmlSchemaForm.Unqualified, IsNullable=false)]
        public author[] getAllAuthorsResponse1;
        
        public getAllAuthorsResponse() {
        }
        
        public getAllAuthorsResponse(author[] getAllAuthorsResponse1) {
            this.getAllAuthorsResponse1 = getAllAuthorsResponse1;
        }
    }
    
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.CodeDom.Compiler.GeneratedCodeAttribute("System.ServiceModel", "4.0.0.0")]
    [System.ComponentModel.EditorBrowsableAttribute(System.ComponentModel.EditorBrowsableState.Advanced)]
    [System.ServiceModel.MessageContractAttribute(IsWrapped=false)]
    public partial class getAuthorByuserNameRequest {
        
        [System.ServiceModel.MessageBodyMemberAttribute(Namespace="http://authors.business.publisher.armandorv.com/", Order=0)]
        public WSClientPublisher.Business.Authors.getAuthorByuserName getAuthorByuserName;
        
        public getAuthorByuserNameRequest() {
        }
        
        public getAuthorByuserNameRequest(WSClientPublisher.Business.Authors.getAuthorByuserName getAuthorByuserName) {
            this.getAuthorByuserName = getAuthorByuserName;
        }
    }
    
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.CodeDom.Compiler.GeneratedCodeAttribute("System.ServiceModel", "4.0.0.0")]
    [System.ComponentModel.EditorBrowsableAttribute(System.ComponentModel.EditorBrowsableState.Advanced)]
    [System.ServiceModel.MessageContractAttribute(IsWrapped=false)]
    public partial class getAuthorByuserNameResponse1 {
        
        [System.ServiceModel.MessageBodyMemberAttribute(Namespace="http://authors.business.publisher.armandorv.com/", Order=0)]
        public WSClientPublisher.Business.Authors.getAuthorByuserNameResponse getAuthorByuserNameResponse;
        
        public getAuthorByuserNameResponse1() {
        }
        
        public getAuthorByuserNameResponse1(WSClientPublisher.Business.Authors.getAuthorByuserNameResponse getAuthorByuserNameResponse) {
            this.getAuthorByuserNameResponse = getAuthorByuserNameResponse;
        }
    }
    
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.CodeDom.Compiler.GeneratedCodeAttribute("System.ServiceModel", "4.0.0.0")]
    [System.ComponentModel.EditorBrowsableAttribute(System.ComponentModel.EditorBrowsableState.Advanced)]
    [System.ServiceModel.MessageContractAttribute(IsWrapped=false)]
    public partial class modifyAuthorRequest {
        
        [System.ServiceModel.MessageBodyMemberAttribute(Namespace="http://authors.business.publisher.armandorv.com/", Order=0)]
        public WSClientPublisher.Business.Authors.modifyAuthor modifyAuthor;
        
        public modifyAuthorRequest() {
        }
        
        public modifyAuthorRequest(WSClientPublisher.Business.Authors.modifyAuthor modifyAuthor) {
            this.modifyAuthor = modifyAuthor;
        }
    }
    
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.CodeDom.Compiler.GeneratedCodeAttribute("System.ServiceModel", "4.0.0.0")]
    [System.ComponentModel.EditorBrowsableAttribute(System.ComponentModel.EditorBrowsableState.Advanced)]
    [System.ServiceModel.MessageContractAttribute(IsWrapped=false)]
    public partial class modifyAuthorResponse1 {
        
        [System.ServiceModel.MessageBodyMemberAttribute(Namespace="http://authors.business.publisher.armandorv.com/", Order=0)]
        public WSClientPublisher.Business.Authors.modifyAuthorResponse modifyAuthorResponse;
        
        public modifyAuthorResponse1() {
        }
        
        public modifyAuthorResponse1(WSClientPublisher.Business.Authors.modifyAuthorResponse modifyAuthorResponse) {
            this.modifyAuthorResponse = modifyAuthorResponse;
        }
    }
    
    [System.CodeDom.Compiler.GeneratedCodeAttribute("System.ServiceModel", "4.0.0.0")]
    public interface AuthorsServiceChannel : WSClientPublisher.Business.Authors.AuthorsService, System.ServiceModel.IClientChannel {
    }
    
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.CodeDom.Compiler.GeneratedCodeAttribute("System.ServiceModel", "4.0.0.0")]
    public partial class AuthorsServiceClient : System.ServiceModel.ClientBase<WSClientPublisher.Business.Authors.AuthorsService>, WSClientPublisher.Business.Authors.AuthorsService {
        
        public AuthorsServiceClient() {
        }
        
        public AuthorsServiceClient(string endpointConfigurationName) : 
                base(endpointConfigurationName) {
        }
        
        public AuthorsServiceClient(string endpointConfigurationName, string remoteAddress) : 
                base(endpointConfigurationName, remoteAddress) {
        }
        
        public AuthorsServiceClient(string endpointConfigurationName, System.ServiceModel.EndpointAddress remoteAddress) : 
                base(endpointConfigurationName, remoteAddress) {
        }
        
        public AuthorsServiceClient(System.ServiceModel.Channels.Binding binding, System.ServiceModel.EndpointAddress remoteAddress) : 
                base(binding, remoteAddress) {
        }
        
        [System.ComponentModel.EditorBrowsableAttribute(System.ComponentModel.EditorBrowsableState.Advanced)]
        WSClientPublisher.Business.Authors.deleteAuthorResponse1 WSClientPublisher.Business.Authors.AuthorsService.deleteAuthor(WSClientPublisher.Business.Authors.deleteAuthorRequest request) {
            return base.Channel.deleteAuthor(request);
        }
        
        public WSClientPublisher.Business.Authors.deleteAuthorResponse deleteAuthor(WSClientPublisher.Business.Authors.deleteAuthor deleteAuthor1) {
            WSClientPublisher.Business.Authors.deleteAuthorRequest inValue = new WSClientPublisher.Business.Authors.deleteAuthorRequest();
            inValue.deleteAuthor = deleteAuthor1;
            WSClientPublisher.Business.Authors.deleteAuthorResponse1 retVal = ((WSClientPublisher.Business.Authors.AuthorsService)(this)).deleteAuthor(inValue);
            return retVal.deleteAuthorResponse;
        }
        
        [System.ComponentModel.EditorBrowsableAttribute(System.ComponentModel.EditorBrowsableState.Advanced)]
        WSClientPublisher.Business.Authors.enrollAuthorResponse1 WSClientPublisher.Business.Authors.AuthorsService.enrollAuthor(WSClientPublisher.Business.Authors.enrollAuthorRequest request) {
            return base.Channel.enrollAuthor(request);
        }
        
        public WSClientPublisher.Business.Authors.enrollAuthorResponse enrollAuthor(WSClientPublisher.Business.Authors.enrollAuthor enrollAuthor1) {
            WSClientPublisher.Business.Authors.enrollAuthorRequest inValue = new WSClientPublisher.Business.Authors.enrollAuthorRequest();
            inValue.enrollAuthor = enrollAuthor1;
            WSClientPublisher.Business.Authors.enrollAuthorResponse1 retVal = ((WSClientPublisher.Business.Authors.AuthorsService)(this)).enrollAuthor(inValue);
            return retVal.enrollAuthorResponse;
        }
        
        [System.ComponentModel.EditorBrowsableAttribute(System.ComponentModel.EditorBrowsableState.Advanced)]
        WSClientPublisher.Business.Authors.getAllAuthorsResponse WSClientPublisher.Business.Authors.AuthorsService.getAllAuthors(WSClientPublisher.Business.Authors.getAllAuthorsRequest request) {
            return base.Channel.getAllAuthors(request);
        }
        
        public author[] getAllAuthors(WSClientPublisher.Business.Authors.getAllAuthors getAllAuthors1) {
            WSClientPublisher.Business.Authors.getAllAuthorsRequest inValue = new WSClientPublisher.Business.Authors.getAllAuthorsRequest();
            inValue.getAllAuthors = getAllAuthors1;
            WSClientPublisher.Business.Authors.getAllAuthorsResponse retVal = ((WSClientPublisher.Business.Authors.AuthorsService)(this)).getAllAuthors(inValue);
            return retVal.getAllAuthorsResponse1;
        }
        
        [System.ComponentModel.EditorBrowsableAttribute(System.ComponentModel.EditorBrowsableState.Advanced)]
        WSClientPublisher.Business.Authors.getAuthorByuserNameResponse1 WSClientPublisher.Business.Authors.AuthorsService.getAuthorByuserName(WSClientPublisher.Business.Authors.getAuthorByuserNameRequest request) {
            return base.Channel.getAuthorByuserName(request);
        }
        
        public WSClientPublisher.Business.Authors.getAuthorByuserNameResponse getAuthorByuserName(WSClientPublisher.Business.Authors.getAuthorByuserName getAuthorByuserName1) {
            WSClientPublisher.Business.Authors.getAuthorByuserNameRequest inValue = new WSClientPublisher.Business.Authors.getAuthorByuserNameRequest();
            inValue.getAuthorByuserName = getAuthorByuserName1;
            WSClientPublisher.Business.Authors.getAuthorByuserNameResponse1 retVal = ((WSClientPublisher.Business.Authors.AuthorsService)(this)).getAuthorByuserName(inValue);
            return retVal.getAuthorByuserNameResponse;
        }
        
        [System.ComponentModel.EditorBrowsableAttribute(System.ComponentModel.EditorBrowsableState.Advanced)]
        WSClientPublisher.Business.Authors.modifyAuthorResponse1 WSClientPublisher.Business.Authors.AuthorsService.modifyAuthor(WSClientPublisher.Business.Authors.modifyAuthorRequest request) {
            return base.Channel.modifyAuthor(request);
        }
        
        public WSClientPublisher.Business.Authors.modifyAuthorResponse modifyAuthor(WSClientPublisher.Business.Authors.modifyAuthor modifyAuthor1) {
            WSClientPublisher.Business.Authors.modifyAuthorRequest inValue = new WSClientPublisher.Business.Authors.modifyAuthorRequest();
            inValue.modifyAuthor = modifyAuthor1;
            WSClientPublisher.Business.Authors.modifyAuthorResponse1 retVal = ((WSClientPublisher.Business.Authors.AuthorsService)(this)).modifyAuthor(inValue);
            return retVal.modifyAuthorResponse;
        }
    }
}
