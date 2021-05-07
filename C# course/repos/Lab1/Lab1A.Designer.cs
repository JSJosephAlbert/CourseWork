namespace Lab1
{
    partial class Lab1A
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
            this.btnC = new System.Windows.Forms.Button();
            this.btnF = new System.Windows.Forms.Button();
            this.txtInput = new System.Windows.Forms.TextBox();
            this.txtResult = new System.Windows.Forms.TextBox();
            this.SuspendLayout();
            // 
            // btnC
            // 
            this.btnC.Location = new System.Drawing.Point(54, 80);
            this.btnC.Name = "btnC";
            this.btnC.Size = new System.Drawing.Size(74, 71);
            this.btnC.TabIndex = 0;
            this.btnC.Text = "Convert to Celsius";
            this.btnC.UseVisualStyleBackColor = true;
            this.btnC.Click += new System.EventHandler(this.btnC_Click);
            // 
            // btnF
            // 
            this.btnF.Location = new System.Drawing.Point(134, 80);
            this.btnF.Name = "btnF";
            this.btnF.Size = new System.Drawing.Size(73, 71);
            this.btnF.TabIndex = 1;
            this.btnF.Text = "Convert to Fahrenheit";
            this.btnF.UseVisualStyleBackColor = true;
            this.btnF.Click += new System.EventHandler(this.btnF_Click);
            // 
            // txtInput
            // 
            this.txtInput.Location = new System.Drawing.Point(54, 54);
            this.txtInput.Name = "txtInput";
            this.txtInput.Size = new System.Drawing.Size(153, 20);
            this.txtInput.TabIndex = 2;
            // 
            // txtResult
            // 
            this.txtResult.Location = new System.Drawing.Point(54, 157);
            this.txtResult.Name = "txtResult";
            this.txtResult.ReadOnly = true;
            this.txtResult.Size = new System.Drawing.Size(153, 20);
            this.txtResult.TabIndex = 3;
            // 
            // Lab1A
            // 
            this.ClientSize = new System.Drawing.Size(252, 234);
            this.Controls.Add(this.txtResult);
            this.Controls.Add(this.txtInput);
            this.Controls.Add(this.btnF);
            this.Controls.Add(this.btnC);
            this.Name = "Lab1A";
            this.Load += new System.EventHandler(this.Lab1A_Load_1);
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Button btnC;
        private System.Windows.Forms.Button btnF;
        private System.Windows.Forms.TextBox txtInput;
        private System.Windows.Forms.TextBox txtResult;
    }
}