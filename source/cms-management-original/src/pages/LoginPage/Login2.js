import React, { Component } from "react";

class Login2 extends Component {
  render() {
    return (
      <div>

<div ng-hide="!authenticated" class="ng-hide">

    <div style="display: inherit;" id="mainwrapper" class="clearfix">

        <div>

<div class="umb-app-header">
    
     

    <div class="flex items-center">
        <ul class="umb-app-header__actions">
            <li data-element="global-search" class="umb-app-header__action">
                <a href="#" hotkey="ctrl+space" ng-click="searchClick()" prevent-default="" style="font-size: 20px;">
                    <i class="umb-app-header__action-icon icon-search"></i>
                </a>
            </li>
            <li data-element="global-help" class="umb-app-header__action">
                <a href="#" hotkey="ctrl+shift+h" ng-click="helpClick()" prevent-default="">
                    <i class="umb-app-header__action-icon icon-help-alt"></i>
                </a>
            </li>
            <li data-element="global-user" class="umb-app-header__action">
                <a ng-href="" ng-click="avatarClick()" hotkey="ctrl+shift+u" title="" prevent-default="" href="">
                    <div size="xxs" color="secondary" name="" img-src="assets/img/application/logo.png" img-srcset="assets/img/application/logo@2x.png 2x, assets/img/application/logo@3x.png 3x">
<img class="umb-avatar umb-avatar--xxs" ng-if="imgSrc" ng-src="assets/img/application/logo.png" ng-srcset="assets/img/application/logo@2x.png 2x, assets/img/application/logo@3x.png 3x" src="assets/img/application/logo.png" srcset="assets/img/application/logo@2x.png 2x,assets/img/application/logo@3x.png 3x"/> 
 
</div>
                </a>
            </li>
        </ul>
    </div>

</div>

 

</div>

        <div class="umb-app-content">
            <div id="leftcolumn" ng-controller="Umbraco.NavigationController" ng-mouseleave="leaveTree($event)" ng-mouseenter="enterTree($event)">
<div id="navigation" ng-show="showNavigation" class="fill umb-modalcolumn ng-hide" ng-animate="'slide'" nav-resize="" ng-class="{'--notInFront': infiniteMode}">

    <div class="navigation-inner-container">
        <div id="tree" ng-show="authenticated" class="ng-hide">
            <ul class="umb-tree" ng-class="{'hide-options': hideoptions === 'true'}" api="treeApi" on-init="onTreeInit()">

 <li ng-if="!tree.root.containsGroups">
    <div class="umb-tree-root" data-element="tree-root" ng-class="getNodeCssClass(tree.root)" ng-hide="hideheader === 'true'" on-right-click="altSelect(tree.root, $event)">
        <h5>
            <a ng-href="#/" ng-click="select(tree.root, $event)" class="umb-tree-root-link" data-element="tree-root-link" href="#/">
                 
                
            </a>
        </h5>
        <a data-element="tree-item-options" class="umb-options ng-hide" ng-hide="tree.root.isContainer || !tree.root.menuUrl" ng-click="options(tree.root, $event)" ng-swipe-right="options(tree.root, $event)">
            <i></i><i></i><i></i>
        </a>
    </div>
     
</li> 

</ul>
        </div>
    </div>

    <div class="offset6" id="navOffset" style="z-index: 10">

    </div>

    <div class="umb-editor__overlay"></div>

</div>

</div>

            <section id="contentwrapper">

                <div id="contentcolumn">

                     <div class="umb-editor" ng-view=""><div ng-controller="Umbraco.LoginController">

</div></div>
                     

                    <div class="umb-editors">

 

</div>
                </div>

            </section>

        </div>

         

        <div class="umb-notifications" id="umb-notifications-wrapper">
<ul class="umb-notifications__notifications">
     
</ul>
</div>

    </div>

    
     

</div>

 

 

 <umb-login ng-if="login.show" on-login="hideLoginScreen()"><div class="login-overlay">

<div id="login" class="umb-modalcolumn umb-dialog" ng-class="{'show-validation': vm.loginForm.$invalid}">

     <div class="login-overlay__background-image" ng-if="vm.backgroundImage" ng-style="{'background-image':'url(' + vm.backgroundImage + ')'}" style="background-image: url(&quot;assets/img/installer.jpg&quot;);"></div> 

    <div class="login-overlay__logo">
        <img ng-src="assets/img/application/logo.png" ng-srcset="assets/img/application/logo@2x.png 2x, assets/img/application/logo@3x.png 3x" srcset="assets/img/application/logo@2x.png 2x,assets/img/application/logo@3x.png 3x" src="assets/img/application/logo.png"/>
    </div>

    <div ng-show="vm.invitedUser != null" class="umb-login-container ng-hide">

        <form name="inviteUserPasswordForm" novalidate="" ng-submit="vm.inviteSavePassword()" val-form-manager="" class="ng-pristine ng-valid">
             
        </form>
        
    </div>
     
    <div ng-show="vm.invitedUser == null &amp;&amp; !vm.inviteStep" class="umb-login-container">

        <div class="form">
            <h1>Happy manic Monday </h1>

            <div ng-show="vm.view == 'login'">

                <p>
                    <span ng-show="vm.isTimedOut" class="ng-hide"><localize key="login_timeout">Session timed out</localize>.</span>
                </p>

                 

                <form method="POST" name="vm.loginForm" ng-submit="vm.loginSubmit(vm.login, vm.password)" class="ng-pristine ng-valid">

                    <div class="control-group ng-hide" ng-show="vm.loginForm.$invalid">
                        <div class="text-error"></div>
                    </div>

                    <div class="control-group" ng-class="{error: vm.loginForm.username.$invalid}">
                        <label>Email</label>
                        <input type="text" ng-model="vm.login" name="username" class="-full-width-input ng-pristine ng-valid ng-empty ng-touched" placeholder="Enter your email" focus-when="true"/>
                    </div>

                    <div class="control-group" ng-class="{error: vm.loginForm.password.$invalid}">
                        <label><localize key="general_password">Password</localize></label>
                        <input type="password" ng-model="vm.password" name="password" class="-full-width-input ng-pristine ng-untouched ng-valid ng-empty" localize="placeholder" placeholder="Enter your password"/>
                        <div class="password-toggle">
                            <a href="#" prevent-default="" ng-click="vm.togglePassword()">
                                <span class="password-text show"><localize key="login_showPassword">Show password</localize></span>
                                <span class="password-text hide"><localize key="login_hidePassword">Hide password</localize></span>
                            </a>
                        </div>
                    </div>

                    <div class="flex justify-between items-center">
                        <umb-button button-style="success" size="m" label-key="general_login" state="vm.loginStates.submitButton" type="submit"><div class="umb-button" ng-class="{'umb-button--block': vm.blockElement}" data-element="">

 <div ng-if="vm.innerState">
    <div class="icon-check umb-button__success -hidden -white" ng-class="{'-hidden': vm.innerState !== 'success', '-white': vm.style}"></div>
    <div class="icon-delete umb-button__error -hidden -white" ng-class="{'-hidden': vm.innerState !== 'error', '-white': vm.style}"></div>
    <div class="umb-button__progress -hidden -white" ng-class="{'-hidden': vm.innerState !== 'busy', '-white': vm.style}"></div>
     
</div> 

 

 

 <button ng-if="vm.type === 'submit'" type="submit" class="btn umb-button__button btn-success umb-button--m" hotkey="" hotkey-when-hidden="" ng-disabled="vm.disabled">
    <span class="umb-button__content" ng-class="{'-hidden': vm.innerState !== 'init'}">
         
        Login
         
    </span>
</button> 

</div>
</umb-button>
                        <div ng-show="vm.allowPasswordReset" class="ng-hide">
                            <a class="muted" style="text-decoration: underline;" href="#" prevent-default="" ng-click="vm.showRequestPasswordReset()"><localize key="login_forgottenPassword">Forgotten password?</localize></a>
                        </div>
                    </div>

                </form>
            </div>

            <div ng-show="vm.view == 'request-password-reset'" class="ng-hide">
                <p>
                    <localize key="login_forgottenPasswordInstruction">An email will be sent to the address specified with a link to reset your password</localize>
                </p>

                <form method="POST" name="vm.requestPasswordResetForm" ng-submit="vm.requestPasswordResetSubmit(email)" class="ng-pristine ng-valid ng-valid-val-email">
                    <div class="control-group" ng-class="{error: requestPasswordResetForm.email.$invalid}">
                        <label><localize key="general_email">Email</localize></label>
                        <input type="email" val-email="" ng-model="email" name="email" class="-full-width-input ng-pristine ng-untouched ng-valid ng-empty ng-valid-val-email" localize="placeholder" placeholder="Enter your email" focus-when="false"/>
                    </div>

                    <div class="control-group ng-hide" ng-show="requestPasswordResetForm.$invalid">
                        <div class="text-error"></div>
                    </div>

                    <div class="control-group ng-hide" ng-show="vm.showEmailResetConfirmation">
                        <div class="text-info">
                            <localize key="login_requestPasswordResetConfirmation">An email with password reset instructions will be sent to the specified address if it matched our records</localize>
                        </div>
                    </div>

                    <div class="flex justify-between items-center">
                        <button type="submit" class="btn btn-success" val-trigger-change="#login .form input"><localize key="general_submit">Submit</localize></button>
                        <a class="muted" href="#" prevent-default="" ng-click="vm.showLogin()" style="text-decoration: underline;"><localize key="login_returnToLogin">Return to login form</localize></a>
                    </div>

                </form>
            </div>

            <div ng-show="vm.view == 'set-password'" class="ng-hide">

                <p ng-hide="vm.resetComplete">
                    <localize key="login_setPasswordInstruction">Please provide a new password</localize>
                </p>

                <form method="POST" name="vm.setPasswordForm" ng-submit="vm.setPasswordSubmit(vm.password, vm.confirmPassword)" class="ng-pristine ng-valid">

                    <div ng-hide="vm.resetComplete" class="control-group" ng-class="{error: vm.setPasswordForm.password.$invalid}">
                        <label><localize key="user_newPassword">New password</localize></label>
                        <input type="password" ng-model="vm.password" name="password" class="-full-width-input ng-pristine ng-untouched ng-valid ng-empty" localize="placeholder" placeholder="Enter your password" focus-when="false"/>
                    </div>

                    <div ng-hide="vm.resetComplete" class="control-group" ng-class="{error: vm.setPasswordForm.confirmPassword.$invalid}">
                        <label><localize key="user_confirmNewPassword">Confirm new password</localize></label>
                        <input type="password" ng-model="vm.confirmPassword" name="confirmPassword" class="-full-width-input ng-pristine ng-untouched ng-valid ng-empty" localize="placeholder" placeholder="Confirm your password"/>
                    </div>

                    <div ng-hide="vm.resetComplete" class="control-group" ng-show="vm.setPasswordForm.$invalid">
                        <div class="text-error"></div>
                    </div>

                    <div class="control-group ng-hide" ng-show="vm.showSetPasswordConfirmation">
                        <div class="text-info">
                            <localize key="login_setPasswordConfirmation">Your Password has been updated</localize>
                        </div>
                    </div>

                    <div class="flex justify-between items-center">
                        <button ng-hide="vm.resetComplete" type="submit" class="btn btn-success" val-trigger-change="#login .form input"><localize key="general_submit">Submit</localize></button>
                        <a class="muted" href="#" prevent-default="" ng-click="vm.showLogin()"><localize key="login_returnToLogin">Return to login form</localize></a>
                    </div>

                </form>
            </div>

            <div ng-show="vm.view == 'password-reset-code-expired'" class="ng-hide">
                 

                <div class="switch-view">
                    <a class="muted" href="#" prevent-default="" ng-click="vm.showLogin()"><localize key="login_returnToLogin">Return to login form</localize></a>
                </div>
            </div>
        </div>
    </div>
</div>
</div>    
</umb-login> 
      </div>
    );
  }
}

export default Login2;
