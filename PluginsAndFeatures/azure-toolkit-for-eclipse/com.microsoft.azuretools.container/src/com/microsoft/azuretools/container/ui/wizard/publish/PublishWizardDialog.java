/**
 * Copyright (c) Microsoft Corporation
 *
 * All rights reserved.
 *
 * MIT License
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated
 * documentation files (the "Software"), to deal in the Software without restriction, including without limitation
 * the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and
 * to permit persons to whom the Software is furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all copies or substantial portions of
 * the Software.
 *
 * THE SOFTWARE IS PROVIDED *AS IS*, WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO
 * THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT,
 * TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package com.microsoft.azuretools.container.ui.wizard.publish;

import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.wizard.IWizard;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Shell;

import com.microsoft.azuretools.container.views.PublishWizardPageView;
import com.microsoft.azuretools.core.components.AzureWizardDialog;

public class PublishWizardDialog extends AzureWizardDialog {

    public PublishWizardDialog(Shell parentShell, IWizard newWizard) {
        super(parentShell, newWizard);
        this.setHelpAvailable(false);
    }

    @Override
    protected void nextPressed() {
        ((PublishWizardPageView) this.getCurrentPage()).onWizardNextPressed();
    }

    @Override
    protected void finishPressed() {
        ((PublishWizardPageView) this.getCurrentPage()).onWizardFinishPressed();
    }

    public void doFinishPressed() {
        super.finishPressed();
    }

    public void doCancelPressed() {
        super.cancelPressed();
    }
    
    public void doNextPressed() {
        super.nextPressed();
    }
    
    public void setCancelEnabled(boolean enabled){
        Button btnCancel = getButton(IDialogConstants.CANCEL_ID);
        btnCancel.setEnabled(enabled);
    }
    
    public void setBackEnabled(boolean enabled){
        Button btnBack = getButton(IDialogConstants.BACK_ID);
        btnBack.setEnabled(enabled);
    }
    
    public void setNextEnabled(boolean enabled){
        Button btnNext = getButton(IDialogConstants.NEXT_ID);
        btnNext.setEnabled(enabled);
    }
    
    public void setFinishEnabled(boolean enabled){
        Button btnFinish = getButton(IDialogConstants.FINISH_ID);
        btnFinish.setEnabled(enabled);
    }

    public void setButtonsEnabled(boolean enableStatus) {
        setFinishEnabled(enableStatus);
        setNextEnabled(enableStatus);
        setBackEnabled(enableStatus);
        setCancelEnabled(enableStatus);
    }


}
