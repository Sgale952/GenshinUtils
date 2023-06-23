package sgale952.gutils.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ScrollBar;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

import static sgale952.gutils.generator.Team.*;

public class GeneratorController {

    @FXML
    private ScrollBar scroll;
    @FXML
    private AnchorPane pane;
    @FXML
    private ImageView frame1, frame2, frame3, frame4;
    @FXML
    private Button backButton;
    @FXML
    private CheckBox selectAll, Kirara, Baizhu, Kaveh, Mika, Dehya, Yaoyao, Alhaitham, Wanderer, Faruzan, Layla, Nahida,
            Nilou, Cyno, Candace, Dori, Collei, Tighnari, Heizou, Shinobu, Yelan, Ayato, Miko, Shenhe, YunJin, Gorou, Itto,
            Thoma, Kokomi, Raiden, Sara, Aloy, Yoimiya, Sayu, Ayaka, Kazuha, Eula, Yanfei, Rosaria, Hutao, Xiao, Ganyu, Albedo,
            Zhongli, Xinyan, Tartaglia, Diona, Jean, Lisa, Barbara, Kaeya, Diluc, Razor, Amber, Venti, Xiangling, Beidou, Xingqiu,
            Ningguang, Klee, Fischl, Bennett, Noelle, Qiqi, Chongyun, Mona, Keqing, Sucrose, Traveler;
    @FXML
    void initialize() {
        scroll.setMin(0);
        scroll.setMax(2120);
        scroll.setValue(0);

        scroll.valueProperty().addListener(event->{pane.setTranslateY(-10-scroll.getValue());});
    }

    Handlers handler = new Handlers();

    public void backButtonHandler() throws IOException {
        handler.changeScene(backButton, "/sgale952/gutils/Generator/genMenu.fxml");
    }

    public void generateButtonHandler(){
        if(characterCheckList.size()>=4){
            int[] characters = randTeam();
            frame1.setImage(new Image("sgale952/gutils/Image/character/"+getCharacterFrame(characters[0])+".png"));
            frame2.setImage(new Image("sgale952/gutils/Image/character/"+getCharacterFrame(characters[1])+".png"));
            frame3.setImage(new Image("sgale952/gutils/Image/character/"+getCharacterFrame(characters[2])+".png"));
            frame4.setImage(new Image("sgale952/gutils/Image/character/"+getCharacterFrame(characters[3])+".png"));
        }
    }

    public void selectAllHandler(){
        handler.checkSelected(selectAll, Kirara);
        handler.checkSelected(selectAll, Baizhu);
        handler.checkSelected(selectAll, Kaveh);
        handler.checkSelected(selectAll, Mika);
        handler.checkSelected(selectAll, Dehya);
        handler.checkSelected(selectAll, Yaoyao);
        handler.checkSelected(selectAll, Alhaitham);
        handler.checkSelected(selectAll, Wanderer);
        handler.checkSelected(selectAll, Faruzan);
        handler.checkSelected(selectAll, Layla);
        handler.checkSelected(selectAll, Nahida);
        handler.checkSelected(selectAll, Nilou);
        handler.checkSelected(selectAll, Cyno);
        handler.checkSelected(selectAll, Candace);
        handler.checkSelected(selectAll, Dori);
        handler.checkSelected(selectAll, Collei);
        handler.checkSelected(selectAll, Tighnari);
        handler.checkSelected(selectAll, Heizou);
        handler.checkSelected(selectAll, Shinobu);
        handler.checkSelected(selectAll, Yelan);
        handler.checkSelected(selectAll, Ayato);
        handler.checkSelected(selectAll, Miko);
        handler.checkSelected(selectAll, Shenhe);
        handler.checkSelected(selectAll, YunJin);
        handler.checkSelected(selectAll, Gorou);
        handler.checkSelected(selectAll, Itto);
        handler.checkSelected(selectAll, Thoma);
        handler.checkSelected(selectAll, Kokomi);
        handler.checkSelected(selectAll, Raiden);
        handler.checkSelected(selectAll, Sara);
        handler.checkSelected(selectAll, Aloy);
        handler.checkSelected(selectAll, Yoimiya);
        handler.checkSelected(selectAll, Sayu);
        handler.checkSelected(selectAll, Ayaka);
        handler.checkSelected(selectAll, Kazuha);
        handler.checkSelected(selectAll, Eula);
        handler.checkSelected(selectAll, Yanfei);
        handler.checkSelected(selectAll, Rosaria);
        handler.checkSelected(selectAll, Hutao);
        handler.checkSelected(selectAll, Xiao);
        handler.checkSelected(selectAll, Ganyu);
        handler.checkSelected(selectAll, Albedo);
        handler.checkSelected(selectAll, Zhongli);
        handler.checkSelected(selectAll, Xinyan);
        handler.checkSelected(selectAll, Tartaglia);
        handler.checkSelected(selectAll, Diona);
        handler.checkSelected(selectAll, Jean);
        handler.checkSelected(selectAll, Lisa);
        handler.checkSelected(selectAll, Barbara);
        handler.checkSelected(selectAll, Kaeya);
        handler.checkSelected(selectAll, Diluc);
        handler.checkSelected(selectAll, Razor);
        handler.checkSelected(selectAll, Amber);
        handler.checkSelected(selectAll, Venti);
        handler.checkSelected(selectAll, Xiangling);
        handler.checkSelected(selectAll, Beidou);
        handler.checkSelected(selectAll, Xingqiu);
        handler.checkSelected(selectAll, Ningguang);
        handler.checkSelected(selectAll, Klee);
        handler.checkSelected(selectAll, Fischl);
        handler.checkSelected(selectAll, Bennett);
        handler.checkSelected(selectAll, Noelle);
        handler.checkSelected(selectAll, Qiqi);
        handler.checkSelected(selectAll, Chongyun);
        handler.checkSelected(selectAll, Mona);
        handler.checkSelected(selectAll, Keqing);
        handler.checkSelected(selectAll, Sucrose);
        handler.checkSelected(selectAll, Traveler);
    }

    public void KiraraCheck(){
        handler.characterCheck(Kirara);
    }
    public void BaizhuCheck(){
        handler.characterCheck(Baizhu);
    }
    public void KavehCheck(){
        handler.characterCheck(Kaveh);
    }
    public void MikaCheck(){
        handler.characterCheck(Mika);
    }
    public void DehyaCheck(){
        handler.characterCheck(Dehya);
    }
    public void YaoyaoCheck(){
        handler.characterCheck(Yaoyao);
    }
    public void AlhaithamCheck(){
        handler.characterCheck(Alhaitham);
    }
    public void WandererCheck(){
        handler.characterCheck(Wanderer);
    }
    public void FaruzanCheck(){
        handler.characterCheck(Faruzan);
    }
    public void LaylaCheck(){
        handler.characterCheck(Layla);
    }
    public void NahidaCheck(){
        handler.characterCheck(Nahida);
    }
    public void NilouCheck(){
        handler.characterCheck(Nilou);
    }
    public void CynoCheck(){
        handler.characterCheck(Cyno);
    }
    public void CandaceCheck(){
        handler.characterCheck(Candace);
    }
    public void DoriCheck(){
        handler.characterCheck(Dori);
    }
    public void ColleiCheck(){
        handler.characterCheck(Collei);
    }
    public void TighnariCheck(){
        handler.characterCheck(Tighnari);
    }
    public void HeizouCheck(){
        handler.characterCheck(Heizou);
    }
    public void ShinobuCheck(){
        handler.characterCheck(Shinobu);
    }
    public void YelanCheck(){
        handler.characterCheck(Yelan);
    }
    public void AyatoCheck(){
        handler.characterCheck(Ayato);
    }
    public void MikoCheck(){
        handler.characterCheck(Miko);
    }
    public void ShenheCheck(){
        handler.characterCheck(Shenhe);
    }
    public void YunJinCheck(){
        handler.characterCheck(YunJin);
    }
    public void GorouCheck(){
        handler.characterCheck(Gorou);
    }
    public void IttoCheck(){
        handler.characterCheck(Itto);
    }
    public void ThomaCheck(){
        handler.characterCheck(Thoma);
    }
    public void KokomiCheck(){
        handler.characterCheck(Kokomi);
    }
    public void RaidenCheck(){
        handler.characterCheck(Raiden);
    }
    public void SaraCheck(){
        handler.characterCheck(Sara);
    }
    public void AloyCheck(){
        handler.characterCheck(Aloy);
    }
    public void YoimiyaCheck(){
        handler.characterCheck(Yoimiya);
    }
    public void SayuCheck(){
        handler.characterCheck(Sayu);
    }
    public void AyakaCheck(){
        handler.characterCheck(Ayaka);
    }
    public void KazuhaCheck(){
        handler.characterCheck(Kazuha);
    }
    public void EulaCheck(){
        handler.characterCheck(Eula);
    }
    public void YanfeiCheck(){
        handler.characterCheck(Yanfei);
    }
    public void RosariaCheck(){
        handler.characterCheck(Rosaria);
    }
    public void HutaoCheck(){
        handler.characterCheck(Hutao);
    }
    public void XiaoCheck(){
        handler.characterCheck(Xiao);
    }
    public void GanyuCheck(){
        handler.characterCheck(Ganyu);
    }
    public void AlbedoCheck(){
        handler.characterCheck(Albedo);
    }
    public void ZhongliCheck(){
        handler.characterCheck(Zhongli);
    }
    public void XinyanCheck(){
        handler.characterCheck(Xinyan);
    }
    public void TartagliaCheck(){
        handler.characterCheck(Tartaglia);
    }
    public void DionaCheck(){
        handler.characterCheck(Diona);
    }
    public void JeanCheck(){
        handler.characterCheck(Jean);
    }
    public void LisaCheck(){
        handler.characterCheck(Lisa);
    }
    public void BarbaraCheck(){
        handler.characterCheck(Barbara);
    }
    public void KaeyaCheck(){
        handler.characterCheck(Kaeya);
    }
    public void DilucCheck(){
        handler.characterCheck(Diluc);
    }
    public void RazorCheck(){
        handler.characterCheck(Razor);
    }
    public void AmberCheck(){
        handler.characterCheck(Amber);
    }
    public void VentiCheck(){
        handler.characterCheck(Venti);
    }
    public void XianglingCheck(){
        handler.characterCheck(Xiangling);
    }
    public void BeidouCheck(){
        handler.characterCheck(Beidou);
    }
    public void XingqiuCheck(){
        handler.characterCheck(Xingqiu);
    }
    public void NingguangCheck(){
        handler.characterCheck(Ningguang);
    }
    public void KleeCheck(){
        handler.characterCheck(Klee);
    }
    public void FischlCheck(){
        handler.characterCheck(Fischl);
    }
    public void BennettCheck(){
        handler.characterCheck(Bennett);
    }
    public void NoelleCheck(){
        handler.characterCheck(Noelle);
    }
    public void QiqiCheck(){
        handler.characterCheck(Qiqi);
    }
    public void ChongyunCheck(){
        handler.characterCheck(Chongyun);
    }
    public void MonaCheck(){
        handler.characterCheck(Mona);
    }
    public void KeqingCheck(){
        handler.characterCheck(Keqing);
    }
    public void SucroseCheck(){
        handler.characterCheck(Sucrose);
    }
    public void TravelerCheck(){
        handler.characterCheck(Traveler);
    }
}