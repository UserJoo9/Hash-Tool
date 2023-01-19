package com.example.hashtool;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javax.swing.*;

public class Controller {

    @FXML
    private CheckBox md2Check;

    @FXML
    private TextField md2Field;

    @FXML
    private CheckBox md5Check;

    @FXML
    private TextField md5Field;

    @FXML
    private TextArea plainTextField;

    @FXML
    private CheckBox ripemdCheck;

    @FXML
    private TextField ripemdField;

    @FXML
    private CheckBox sha1Check;

    @FXML
    private TextField sha1Field;

    @FXML
    private CheckBox sha2224Check;

    @FXML
    private TextField sha2224Field;

    @FXML
    private CheckBox sha2256Check;

    @FXML
    private TextField sha2256Field;

    @FXML
    private CheckBox sha2384Check;

    @FXML
    private TextField sha2384Field;

    @FXML
    private CheckBox sha2512Check;

    @FXML
    private TextField sha2512Field;

    @FXML
    private CheckBox sha3224Check;

    @FXML
    private TextField sha3224Field;

    @FXML
    private CheckBox sha3256Check;

    @FXML
    private TextField sha3256Field;

    @FXML
    private CheckBox sha3384Check;

    @FXML
    private TextField sha3384Field;

    @FXML
    private CheckBox sha3512Check;

    @FXML
    private TextField sha3512Field;

    @FXML
    private CheckBox whirlpoolCheck;

    @FXML
    private TextField whirlpoolField;

    @FXML
    void destroyAll(ActionEvent event) {
        md2Field.clear();
        md5Field.clear();
        ripemdField.clear();
        sha1Field.clear();
        sha2224Field.clear();
        sha2256Field.clear();
        sha2384Field.clear();
        sha2512Field.clear();
        sha3224Field.clear();
        sha3256Field.clear();
        sha3384Field.clear();
        sha3512Field.clear();
        whirlpoolField.clear();
    }

    @FXML
    void hashAll(ActionEvent event) {

        String plainText = plainTextField.getText();
        if (plainText.equals("")){
            JOptionPane.showMessageDialog(null, "Empty plain text!");
        }else {

            if (md2Check.isSelected()) {
                MD2 md2 = new MD2();
                md2Field.setText(md2.Encrypt_MD2(plainText));
            }

            if (md5Check.isSelected()) {
                MD5 md5 = new MD5();
                md5Field.setText(md5.Encrypt_MD5(plainText));
            }

            if (ripemdCheck.isSelected()) {
                Ripemd_160 rip = new Ripemd_160();
                ripemdField.setText(rip.Hash_Ripemd_160(plainText));
            }

            if (sha1Check.isSelected()) {
                Sha_1 sha1 = new Sha_1();
                sha1Field.setText(sha1.Encrypt_sha_1(plainText));
            }

            if (sha2224Check.isSelected()) {
                Sha2_224 sha2224 = new Sha2_224();
                sha2224Field.setText(sha2224.Hash_sha2_224(plainText));
            }

            if (sha2256Check.isSelected()) {
                Sha2_256 sha2256 = new Sha2_256();
                sha2256Field.setText(sha2256.Hash_sha2_256(plainText));
            }

            if (sha2384Check.isSelected()) {
                Sha2_384 sha2384 = new Sha2_384();
                sha2384Field.setText(sha2384.Hash_sha2_384(plainText));
            }


            if (sha2512Check.isSelected()) {
                Sha2_512 sha2512 = new Sha2_512();
                sha2512Field.setText(sha2512.Hash_sha2_512(plainText));
            }


            if (sha3224Check.isSelected()) {
                Sha3_224 sha3224 = new Sha3_224();
                sha3224Field.setText(sha3224.Hash_sha3_224(plainText));
            }

            if (sha3256Check.isSelected()) {
                Sha3_256 sha3256 = new Sha3_256();
                sha3256Field.setText(sha3256.Hash_sha3_256(plainText));
            }

            if (sha3384Check.isSelected()) {
                Sha3_384 sha3384 = new Sha3_384();
                sha3384Field.setText(sha3384.Hash_sha3_384(plainText));
            }

            if (sha3512Check.isSelected()) {
                Sha3_512 sha3512 = new Sha3_512();
                sha3512Field.setText(sha3512.Hash_sha3_512(plainText));
            }

            if (whirlpoolCheck.isSelected()) {
                Whirlpool wp = new Whirlpool();
                whirlpoolField.setText(wp.hash_Whirlpool(plainText));
            }
        }

    }

}
