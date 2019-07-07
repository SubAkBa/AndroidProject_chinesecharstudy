package com.example.sonwo.third;

import java.util.*;

/**
 * Created by sonwo on 2018-04-01.
 */

public class ItemManager {
    ArrayList<HanJaItem> hanjaitems = new ArrayList<HanJaItem>();
    ArrayList<BusuItem> busuitems = new ArrayList<BusuItem>();
    ArrayList<InterpretationItem> interItems = new ArrayList<InterpretationItem>();
    ArrayList<PartItem> partitems = new ArrayList<PartItem>();

    public ArrayList<HanJaItem> getHanjaitems(){ return hanjaitems; }
    public ArrayList<BusuItem> getBusuitems(){ return busuitems; }
    public ArrayList<InterpretationItem> getInterItems(){ return interItems; }
    public ArrayList<PartItem> getPartItems(){ return partitems; }

    public void AddPartItems(){
        partitems.clear();

        partitems.add(new PartItem("加")); partitems.add(new PartItem("可")); partitems.add(new PartItem("家"));
        partitems.add(new PartItem("賈")); partitems.add(new PartItem("叚")); partitems.add(new PartItem("各"));
        partitems.add(new PartItem("去")); partitems.add(new PartItem("干")); partitems.add(new PartItem("間"));
        partitems.add(new PartItem("曷")); partitems.add(new PartItem("甲")); partitems.add(new PartItem("岡"));
        partitems.add(new PartItem("固")); partitems.add(new PartItem("巨")); partitems.add(new PartItem("古"));
        partitems.add(new PartItem("夬")); partitems.add(new PartItem("巠")); partitems.add(new PartItem("竟"));
        partitems.add(new PartItem("瓜")); partitems.add(new PartItem("告")); partitems.add(new PartItem("柬"));
        partitems.add(new PartItem("監")); partitems.add(new PartItem("甘")); partitems.add(new PartItem("咸"));
        partitems.add(new PartItem("工")); partitems.add(new PartItem("乚")); partitems.add(new PartItem("殳"));
        partitems.add(new PartItem("京")); partitems.add(new PartItem("景")); partitems.add(new PartItem("鳥"));
        partitems.add(new PartItem("僉")); partitems.add(new PartItem("建")); partitems.add(new PartItem("共"));
        partitems.add(new PartItem("巩")); partitems.add(new PartItem("甚")); partitems.add(new PartItem("旣"));
        partitems.add(new PartItem("冓")); partitems.add(new PartItem("公")); partitems.add(new PartItem("圭"));
        partitems.add(new PartItem("高")); partitems.add(new PartItem("果")); partitems.add(new PartItem("夸"));
        partitems.add(new PartItem("咼")); partitems.add(new PartItem("雚")); partitems.add(new PartItem("官"));
        partitems.add(new PartItem("舌")); partitems.add(new PartItem("王")); partitems.add(new PartItem("廣"));
        partitems.add(new PartItem("光")); partitems.add(new PartItem("卦")); partitems.add(new PartItem("鬼"));
        partitems.add(new PartItem("察")); partitems.add(new PartItem("祭")); partitems.add(new PartItem("斬"));
        partitems.add(new PartItem("參")); partitems.add(new PartItem("占")); partitems.add(new PartItem("韱"));
        partitems.add(new PartItem("朁")); partitems.add(new PartItem("昌")); partitems.add(new PartItem("倉"));
        partitems.add(new PartItem("章")); partitems.add(new PartItem("敞")); partitems.add(new PartItem("長"));
        partitems.add(new PartItem("張")); partitems.add(new PartItem("采")); partitems.add(new PartItem("責"));
        partitems.add(new PartItem("朿")); partitems.add(new PartItem("妻")); partitems.add(new PartItem("脊"));
        partitems.add(new PartItem("戔")); partitems.add(new PartItem("耑")); partitems.add(new PartItem("亶"));
        partitems.add(new PartItem("育攵")); partitems.add(new PartItem("詹")); partitems.add(new PartItem("臽"));
        partitems.add(new PartItem("枼")); partitems.add(new PartItem("靑")); partitems.add(new PartItem("帝"));
        partitems.add(new PartItem("聽")); partitems.add(new PartItem("帶")); partitems.add(new PartItem("弟"));
        partitems.add(new PartItem("焦")); partitems.add(new PartItem("肖")); partitems.add(new PartItem("昔"));
        partitems.add(new PartItem("少")); partitems.add(new PartItem("")); partitems.add(new PartItem(""));
    }

    public void AddInterItems(){
        interItems.add(new InterpretationItem("脚光", "다리 각 / 빛 광", "사회적 관심이나 흥미"));
        interItems.add(new InterpretationItem("干城", "방패 간 / 성 성", "나라를 지키는 믿음직한 군대나 인물"));
        interItems.add(new InterpretationItem("傾國", "기울 경 / 나라 국", "뛰어나게 아름다운 여인"));
        interItems.add(new InterpretationItem("鷄肋", "닭 계 / 갈빗대 륵", "아무 소용 없으나 버리기에 아까운 것"));
        interItems.add(new InterpretationItem("鷄皮", "닭 계 / 가죽 피", "늙은 사람"));
        interItems.add(new InterpretationItem("股肱", "넓적다리 고 / 팔뚝 굉", "임금이 가장 신임하는 신하"));
        interItems.add(new InterpretationItem("膏粱", "기름 고 / 기장 량", "맛있는 음식/부귀한 가문"));
        interItems.add(new InterpretationItem("高枕", "높을 고 / 베개 침", "근심 없이 편안히 지냄"));
        interItems.add(new InterpretationItem("敲推", "두드릴 고 / 밀 퇴(추)", "시문을 지을 때 고치고 다듬는 것"));
        interItems.add(new InterpretationItem("古稀", "옛 고 / 드물 희", "일흔 살"));
        interItems.add(new InterpretationItem("骨肉", "뼈 골 / 고기 육", "혈육"));
        interItems.add(new InterpretationItem("瓜期", "외(오이) 과 / 기약할 기", "여자 나이 16세/벼슬에서 물러날 때"));
        interItems.add(new InterpretationItem("瓜滿", "외(오이) 과 / 찰 만", "여자 나이 16세/벼슬에서 물러날 때"));
        interItems.add(new InterpretationItem("觀火", "볼 관 / 불 화", "분명함/뻔함"));
        interItems.add(new InterpretationItem("光陰", "빛 광 / 그늘 음", "시간/세월"));
        interItems.add(new InterpretationItem("掛冠", "걸 괘 / 갓 관", "벼슬아치가 벼슬을 내놓고 물러남"));
        interItems.add(new InterpretationItem("槐夢", "회화나무,느티나무 괴 / 꿈 몽", "헛된 한때의 부귀영화"));
        interItems.add(new InterpretationItem("嬌客", "아리따울 교 / 손 객", "사위"));
        interItems.add(new InterpretationItem("驅馳", "몰 구 / 달릴 치", "매우 바쁘게 돌아다님"));
        interItems.add(new InterpretationItem("國色", "나라 국 / 색 색", "나라 안에서 으뜸가는 미인"));
        interItems.add(new InterpretationItem("國香", "나라 국 / 향기 향", "나라 안에서 으뜸가는 미인"));
        interItems.add(new InterpretationItem("權輿", "권세 권 / 수레 여", "사물의 시초"));
        interItems.add(new InterpretationItem("規矩", "법 규 / 모날,법 구", "일상생활에서 지켜야 할 법도"));
        interItems.add(new InterpretationItem("克己", "이길 극 / 몸 기", "욕심을 눌러 이김"));
        interItems.add(new InterpretationItem("錦歸", "비단 금 / 돌아갈 귀", "출세하여 고향에 돌아감"));
        interItems.add(new InterpretationItem("琴瑟", "거문고 금 / 비파 슬", "부부간의 사랑"));
        interItems.add(new InterpretationItem("杞憂", "구기자 기 / 근심 우", "앞일에 대한 쓸데없는 걱정"));
        interItems.add(new InterpretationItem("南面", "남녘 남 / 낯 면", "임금이 되어 나라를 다스림"));
        interItems.add(new InterpretationItem("濫觴", "넘칠 남(람) / 잔 상", "사물의 처음이나 기원"));
        interItems.add(new InterpretationItem("綠林", "푸를 녹(록) / 수풀 림", "적이나 도둑의 소굴"));
        interItems.add(new InterpretationItem("壟斷", "밭 두둑 농(롱) / 끊을 단", "이익이나 권리를 독차지함"));
        interItems.add(new InterpretationItem("籠絡", "대바구니 농(롱) / 이을 락", "상대를 제 마음대로 놀림"));
        interItems.add(new InterpretationItem("牢籠", "우리 뇌(뢰) / 대바구니 롱", "상대를 제 마음대로 놀림"));
        interItems.add(new InterpretationItem("累卵", "쌓을 누(루) / 알 란", "대단히 위태로움"));
        interItems.add(new InterpretationItem("圖南", "그림 도 / 남녘 남", "웅대한 일을 계획하고 있음"));
        interItems.add(new InterpretationItem("桃源", "복숭아 도 / 근원 원", "살기 좋은 이상향/별 천지"));
        interItems.add(new InterpretationItem("塗炭", "칠할 도 / 숯 탄", "몸시 어렵고 고통스러움"));
        interItems.add(new InterpretationItem("棟梁", "마룻대 동 / 들보,돌다리 량", "한 나라를 맡을 만한 인재"));
        interItems.add(new InterpretationItem("凍梨", "얼 동 / 배 리", "아흔 살"));
        interItems.add(new InterpretationItem("冬扇", "겨울 동 / 부채 선", "철에 맞지 아니함"));
        interItems.add(new InterpretationItem("銅臭", "구리 동 / 냄새 취", "돈으로 벼슬을 사거나 수전노(구두쇠) 짓을 함"));
        interItems.add(new InterpretationItem("頭角", "머리 두 / 뿔 각", "뛰어난 학식이나 재능"));
        interItems.add(new InterpretationItem("杜撰", "막을 두 / 지을 찬", "전거나 출처가 확실하지 못한 저술/틀린 곳이 많은 작품"));
        interItems.add(new InterpretationItem("望九", "바랄 망 / 아홉 구", "81세"));
        interItems.add(new InterpretationItem("望百", "바랄 망 / 일백 백", "91세"));
        interItems.add(new InterpretationItem("望八", "바랄 망 / 여덟 팔", "71세"));
        interItems.add(new InterpretationItem("矛盾", "창 모 / 방패 순", "두 가지 이치가 서로 어긋나 맞지 않음"));
        interItems.add(new InterpretationItem("木鐸", "나무 목 / 방울 탁", "세상 사람들을 각성시키고 가르쳐 인도하는 사람"));
        interItems.add(new InterpretationItem("蒙塵", "어두울 몽 / 티끌 진", "임금이 난리를 피하여 안전한 곳으로 떠남"));
        interItems.add(new InterpretationItem("米壽", "쌀 미 / 목숨 수", "88세"));
        interItems.add(new InterpretationItem("半壽", "반 반 / 목숨 수", "81세"));
        interItems.add(new InterpretationItem("半子", "반 반 / 아들 자", "사위"));
        interItems.add(new InterpretationItem("跋扈", "밟을 발 / 따를 호", "권세를 멋대로 부리며 함부로 날뜀/제어하기 어려운 강한 세력"));
        interItems.add(new InterpretationItem("白眉", "흰 백 / 눈썹 미", "여럿 가운데에서 가장 뛰어난 사람이나 물건"));
        interItems.add(new InterpretationItem("魄散", "넋 백 / 흩어질 산", "몹시 놀람"));
        interItems.add(new InterpretationItem("白壽", "흰 백 / 목숨 수", "99살"));
        interItems.add(new InterpretationItem("伏龍", "엎드릴 복 / 용 룡", "숨어 세상에 나오지 않은 뛰어난 선비"));
        interItems.add(new InterpretationItem("覆轍", "다시 복(덮을 부) / 바퀴자국 철", "앞서 가던 사람이 실패한 자취"));
        interItems.add(new InterpretationItem("鳳兒", "봉새 봉 / 아이 아", "장차 큰 인물이 될 만한 소년"));
        interItems.add(new InterpretationItem("駙馬", "부마(임금의 사위) 부 / 말 마", "임금의 사위"));
        interItems.add(new InterpretationItem("不肖", "아닐 불 / 닮을 초", "어버이의 덕망에 미치지 못하는 어리석은 사람"));
        interItems.add(new InterpretationItem("不惑", "아닐 불 / 미혹할 혹", "마흔 살"));
        interItems.add(new InterpretationItem("鵬圖", "새 붕 / 그림 도", "한없이 큰 포부"));
        interItems.add(new InterpretationItem("比翼", "견줄 비 / 날개 익", "부부 금실이 좋음"));
        interItems.add(new InterpretationItem("蛇足", "뱀 사 / 발 족", "쓸데없는 짓"));
        interItems.add(new InterpretationItem("傘壽", "우산 산 / 목숨 수", "80세"));
        interItems.add(new InterpretationItem("三徙", "석 삼 / 옮길 사", "자식의 교육에 정성을 다함"));
        interItems.add(new InterpretationItem("桑年", "뽕나무 상 / 해 년", "48세"));
        interItems.add(new InterpretationItem("嘗膽", "맛볼 상 / 쓸개 담", "마음먹은 일을 이루기 위하여 온갖 어려움과 괴로움을 참고 견딤"));
        interItems.add(new InterpretationItem("桑弧", "뽕나무 상 / 활 호", "남자가 큰 뜻을 세움"));
        interItems.add(new InterpretationItem("鼠竊", "쥐 서 / 훔칠 절", "좀도둑"));
        interItems.add(new InterpretationItem("首鼠", "머리 수 / 쥐 서", "머뭇거리며 전퇴나 거취를 정하지 못함"));
        interItems.add(new InterpretationItem("守株", "지킬 수 / 그루 주", "융통성이 없는 어리석은 사람"));
        interItems.add(new InterpretationItem("菽麥", "콩 숙 / 보리 맥", "세상 물정을 모르거나 사리분별을 못하는 사람"));
        interItems.add(new InterpretationItem("市虎", "저자 시 / 범 호", "여러 사람이 한 입으로 하는 거짓말은 쇠도 녹임"));
        interItems.add(new InterpretationItem("食言", "밥 식 / 말씀 언", "약속을 지키지 않음"));
        interItems.add(new InterpretationItem("宸襟", "대궐 신 / 옷깃 금", "임금의 마음"));
        interItems.add(new InterpretationItem("薪米", "섶나무 신 / 쌀 미", "생활의 재료"));
        interItems.add(new InterpretationItem("握髮", "쥘 악 / 터럭 발", "政事에 바쁨"));
        interItems.add(new InterpretationItem("雁書", "기러기 안 / 글 서", "먼 곳에서 온 소식이나 편지"));
        interItems.add(new InterpretationItem("壓卷", "누를 압 / 책 권", "제일 잘된 책이나 작품"));
        interItems.add(new InterpretationItem("艾年", "쑥 애 / 해 년", "쉰 살"));
        interItems.add(new InterpretationItem("粱肉", "기장 양(량) / 고기 육", "좋은 음식"));
        interItems.add(new InterpretationItem("逆鱗", "거스를 역 / 비늘 린", "임금의 분노"));
        interItems.add(new InterpretationItem("燃眉", "탈 연 / 눈썹 미", "매우 급함"));
        interItems.add(new InterpretationItem("煙霞", "연기 연 / 노을 하", "고요한 산수의 경치"));
        interItems.add(new InterpretationItem("蝸角", "달팽이 와 / 뿔 각", "세상이 좁음"));
        interItems.add(new InterpretationItem("臥龍", "누울 와 / 용 룡", "숨어 세상에 나오지 않은 뛰어난 선비"));
        interItems.add(new InterpretationItem("完璧", "완전할 완 / 구슬 벽", "결함이 없이 완전함"));
        interItems.add(new InterpretationItem("鴛鴦", "원앙 원 / 원앙 앙", "사이좋은 부부"));
        interItems.add(new InterpretationItem("衣鉢", "옷 의 / 바리때(승려밥그릇) 발", "불교에서 스승으로부터 전하는 敎法이나 불교의 깊은 뜻"));
        interItems.add(new InterpretationItem("而立", "말이을 이 / 설 립", "30세"));
        interItems.add(new InterpretationItem("耳順", "귀 이 / 순할 순", "60세"));
        interItems.add(new InterpretationItem("一髮", "한 일 / 터럭 발", "극히 작음/여유가 없음"));
        interItems.add(new InterpretationItem("蔗境", "사탕수수 자 / 지경 경", "이야기 따위가 점점 재미있어짐"));
        interItems.add(new InterpretationItem("刺股", "찌를 자 / 넓적다리 고", "졸음을 극복하고 열심히 공부함"));
        interItems.add(new InterpretationItem("長川", "긴 장 / 내 천", "밤낮으로 쉬지 않고 연달아"));
        interItems.add(new InterpretationItem("折角", "꺾을 절 / 뿔 각", "상대방의 기세를 누르거나 콧대를 납작하게 만듦"));
        interItems.add(new InterpretationItem("切磨", "끊을 절 / 갈 마", "덕행과 학문을 닦음"));
        interItems.add(new InterpretationItem("折箭", "꺾을 절 / 살(矢) 전", "덕행과 학문을 닦음"));
        interItems.add(new InterpretationItem("折檻", "꺾을 절 / 난간 함", "강경하게 간(諫)함/엄하게 꾸짖음"));
        interItems.add(new InterpretationItem("點額", "점 점 / 이마 액", "시험에 낙제함"));
        interItems.add(new InterpretationItem("點睛", "점 점 / 눈동자 정", "가장 중요한 부분을 완성함"));
        interItems.add(new InterpretationItem("糟糠", "지게미 조 / 겨 강", "가난한 사람이 먹는 초라한 음식/가난을 함께 한 아내"));
        interItems.add(new InterpretationItem("卒壽", "마칠 졸 / 목숨 수", "90세"));
        interItems.add(new InterpretationItem("踵武", "발꿈치 종 / 굳셀 무", "뒤를 이음"));
        interItems.add(new InterpretationItem("從心", "좇을 종 / 마음 심", "일흔 살"));
        interItems.add(new InterpretationItem("櫛雨", "빗 즐 / 비 우", "오랜 세월을 객지에서 방랑하며 온갖 고생을 다 함"));
        interItems.add(new InterpretationItem("知音", "알 지 / 소리 음", "마음이 서로 통하는 친한 벗"));
        interItems.add(new InterpretationItem("咫尺", "여덟치 지 / 자 척", "아주 가까운 거리"));
        interItems.add(new InterpretationItem("津梁", "나루 진 / 들보,돌다리 량", "사방으로 이리저리 몹시 바쁘게 돌아다님"));
        interItems.add(new InterpretationItem("秦火", "성(姓) 진 / 불 화", "분서갱유"));
        interItems.add(new InterpretationItem("桎梏", "차꼬 질 / 수갑 곡", "자유가 없는 고통스런 상태"));
        interItems.add(new InterpretationItem("蹉跌", "거꾸러질 질 / 미끄러질 차", "하던 일이나 계획이 틀어짐"));
        interItems.add(new InterpretationItem("滄桑", "큰바다 창 / 뽕나무 상", "세상일의 변천이 심함"));
        interItems.add(new InterpretationItem("楚歌", "초나라 초 / 노래 가", "사방 어디에도 도울 사람이 없는 외롭고 곤란한 지경"));
        interItems.add(new InterpretationItem("焦眉", "탈 초 / 눈썹 미", "매우 급함"));
        interItems.add(new InterpretationItem("錐囊", "송곳 추 / 주머니 낭", "재능이 뛰어난 사람"));
        interItems.add(new InterpretationItem("秋扇", "가을 추 / 부채 선", "철이 지나서 쓸모없이 된 물건/이성의 사랑을 잃은 사람"));
        interItems.add(new InterpretationItem("秋毫", "가을 추 / 터럭 호", "매우 작거나 적음"));
        interItems.add(new InterpretationItem("逐鹿", "쫓을 축 / 사슴 록", "서로 이기려고 다투며 덤벼듦"));
        interItems.add(new InterpretationItem("春秋", "봄 춘 / 가을 추", "나이/연세/세월/역사"));
        interItems.add(new InterpretationItem("破鏡", "깨뜨릴 파 / 거울 경", "이지러진 달/부부가 헤어짐"));
        interItems.add(new InterpretationItem("破瓜", "깨뜨릴 파 / 외(오이) 과", "여자 나이 16세/남자 나이 64세"));
        interItems.add(new InterpretationItem("破僻", "깨뜨릴 파 / 궁벽할 벽", "양반이 없는 시골이나 인구수가 적은 성씨에 인재가 나서 본래의 미천한 상태를 벗어남"));
        interItems.add(new InterpretationItem("幣帛", "화폐 폐 / 비단 백", "예물/선물"));
        interItems.add(new InterpretationItem("風燈", "바람 풍 / 등 등", "매우 위태함"));
        interItems.add(new InterpretationItem("風燭", "바람 풍 / 촛불 촉", "매우 위태함"));
        interItems.add(new InterpretationItem("鶴髮", "학 학 / 터럭 발", "늙은 사람"));
        interItems.add(new InterpretationItem("懸梁", "달(繫) 현 / 들보,돌다리 량", "졸음을 극복하고 열심히 공부함"));
        interItems.add(new InterpretationItem("血肉", "피 혈 / 고기 육", "겨레붙이/골육"));
        interItems.add(new InterpretationItem("荊妻", "가시 형 / 아내 처", "남에게 자기의 아내를 낮추어 이르는 말"));
        interItems.add(new InterpretationItem("糊口", "풀칠할 호 / 입 구", "겨우 끼니를 이어 감"));
        interItems.add(new InterpretationItem("毫釐", "터럭 호 / 다스릴 리", "조금/아주 적은 분량"));
        interItems.add(new InterpretationItem("畵餠", "그림 화 / 떡 병", "아무 소용없는 것"));
        interItems.add(new InterpretationItem("還甲", "돌아올 환 / 갑 갑", "만 60세"));
        interItems.add(new InterpretationItem("換骨", "바꿀 환 / 뼈 골", "더 좋게 바뀜"));
        interItems.add(new InterpretationItem("黃口", "누를 황 / 입 구", "철없는 사람"));
        interItems.add(new InterpretationItem("膾炙", "회 회 / 구울 자", "어떤 사물이 칭찬을 받으면 사람의 입에 자주 오르내리며 널리 퍼짐"));
        interItems.add(new InterpretationItem("嚆矢", "울릴 효 / 화살 시", "어떤 사물이나 현상이 시작되어 나온 맨 처음"));
        interItems.add(new InterpretationItem("喜壽", "기쁠 희 / 목숨 수", "77세"));
        interItems.add(new InterpretationItem("茶飯事", "차 다 / 밥 반 / 일 사", "예삿일/흔한 일"));
        interItems.add(new InterpretationItem("斷末摩", "끊을 단 / 끝 말 / 문지를 마", "숨이 끊어질 때의 모진 고통/임종(臨終)"));
        interItems.add(new InterpretationItem("東郭履", "동녘 동 / 둘레,외성 곽 / 밟을 리", "매우 가난함"));
        interItems.add(new InterpretationItem("登龍門", "오를 등 / 용 용(룡) / 문 문", "크게 출세함/출세를 위한 관문"));
        interItems.add(new InterpretationItem("巫山雲", "무당 무 / 뫼 산 / 구름 운", "남녀의 情交"));
        interItems.add(new InterpretationItem("未亡人", "아닐 미 / 망할 망 / 사람 인", "남편이 죽고 홀로 남은 여자"));
        interItems.add(new InterpretationItem("彌縫策", "미륵,오랠 미 / 꿰맬 봉 / 꾀 책", "임시방편의 계책"));
        interItems.add(new InterpretationItem("白眼視", "흰 백 / 눈 안 / 볼 시", "남을 업신여기거나 무시함"));
        interItems.add(new InterpretationItem("獅子吼", "사자 사 / 아들 자 / 울부짖을 후", "부처의 위엄 있는 설법/열변을 토하는 연설/질투심이 강한 아내가 남편에게 암팡스럽게 떠드는 일"));
        interItems.add(new InterpretationItem("三昧境", "석 삼 / 어두울 매 / 지경 경", "잡념을 떠나서 오직 하나의 대상에만 정신을 집중하는 경지"));
        interItems.add(new InterpretationItem("笑中刀", "웃을 소 / 가운데 중 / 칼 도", "겉으로는 웃으나 속에는 해칠 마음을 품음"));
        interItems.add(new InterpretationItem("蜃氣樓", "큰조개 신 / 기운 기 / 다락 루", "홀연히 나타나 짧은 시간 동안 유지되다가 사라지는 아름답고 환상적인 일이나 현상 따위"));
        interItems.add(new InterpretationItem("眼中釘", "눈 안 / 가운데 중 / 못 정", "눈에 거슬리는 사람"));
        interItems.add(new InterpretationItem("如反掌", "같을 여 / 돌이킬,돌아올 반 / 손바닥 장", "일이 매우 쉬움"));
        interItems.add(new InterpretationItem("連理枝", "이을 연(련) / 다스릴 리 / 가지 지", "부부의 사이가 좋음"));
        interItems.add(new InterpretationItem("五車書", "다섯 오 / 수레 거 / 글 서", "아주 많은 책"));
        interItems.add(new InterpretationItem("蝸角觝", "달팽이 와 / 뿔 각 / 닿을 저", "하찮은 일로 벌이는 싸움"));
        interItems.add(new InterpretationItem("鴛鴦契", "원앙 원 / 원앙 앙 / 맺을 계", "금실이 좋음"));
        interItems.add(new InterpretationItem("一字師", "한 일 / 글자 자 / 스승 사", "핵심을 짚어주는 스승"));
        interItems.add(new InterpretationItem("知天命", "알 지 / 하늘 천 / 목숨 명", "50세"));
        interItems.add(new InterpretationItem("指呼間", "가리킬 지 / 부를 호 / 사이 간", "아주 가까운 거리"));
        interItems.add(new InterpretationItem("千里眼", "일천 천 / 마을 리 / 눈 안", "뛰어난 통찰력"));
        interItems.add(new InterpretationItem("鐵面皮", "철 철 / 낯 면 / 가죽 피", "염치가 없고 뻔뻔스러운 사람"));
        interItems.add(new InterpretationItem("靑眼視", "푸를 청 / 눈 안 / 볼 시", "좋게 보고 잘 대함"));
        interItems.add(new InterpretationItem("破天荒", "깨트릴 파 / 하늘 천 / 거칠 황", "이전에 아무도 하지 못한 일을 처음으로 해냄"));
        interItems.add(new InterpretationItem("蒲柳質", "부들 포 / 버들 류 / 바탕 질", "몸이 약하여 병에 걸리기 쉬운 체질"));
        interItems.add(new InterpretationItem("披肝膽", "헤칠 피 / 간 간 / 쓸개 담", "서로 속마음을 털어놓고 친하게 사귐"));
        interItems.add(new InterpretationItem("解語花", "풀 해 / 말씀 어 / 꽃 화", "아름다운 여인/기생"));
        interItems.add(new InterpretationItem("糊口策", "풀칠할 호 / 입 구 / 꾀 책", "겨우겨우 먹고 살아갈 계책"));
        interItems.add(new InterpretationItem("紅一點", "붉을 홍 / 한 일 / 점 점", "많은 남자 사이에 끼어 있는 한 사람의 여자"));
        interItems.add(new InterpretationItem("花風病", "꽃 화 / 바람 풍 / 병 병", "상사병(相思病)"));
    }

    public void AddBusuItems(int strcount){
        busuitems.clear();

        switch(strcount) {
            case 1:
                busuitems.add(new BusuItem("一")); busuitems.add(new BusuItem("丨")); busuitems.add(new BusuItem("丿"));
                busuitems.add(new BusuItem("丶")); busuitems.add(new BusuItem("乙")); busuitems.add(new BusuItem("亅"));
                break;
            case 2:
                busuitems.add(new BusuItem("十")); busuitems.add(new BusuItem("厂")); busuitems.add(new BusuItem("匚"));
                busuitems.add(new BusuItem("卜")); busuitems.add(new BusuItem("冂")); busuitems.add(new BusuItem("八"));
                busuitems.add(new BusuItem("人")); busuitems.add(new BusuItem("勹")); busuitems.add(new BusuItem("儿"));
                busuitems.add(new BusuItem("匕")); busuitems.add(new BusuItem("几")); busuitems.add(new BusuItem("亠"));
                busuitems.add(new BusuItem("冫")); busuitems.add(new BusuItem("冖")); busuitems.add(new BusuItem("凵"));
                busuitems.add(new BusuItem("卩")); busuitems.add(new BusuItem("刀")); busuitems.add(new BusuItem("刂"));
                busuitems.add(new BusuItem("力")); busuitems.add(new BusuItem("又")); busuitems.add(new BusuItem("厶"));
                busuitems.add(new BusuItem("廴"));
                break;
            case 3:
                busuitems.add(new BusuItem("干")); busuitems.add(new BusuItem("工")); busuitems.add(new BusuItem("土"));
                busuitems.add(new BusuItem("士")); busuitems.add(new BusuItem("寸")); busuitems.add(new BusuItem("廾"));
                busuitems.add(new BusuItem("大")); busuitems.add(new BusuItem("尢")); busuitems.add(new BusuItem("弋"));
                busuitems.add(new BusuItem("小")); busuitems.add(new BusuItem("口")); busuitems.add(new BusuItem("山"));
                busuitems.add(new BusuItem("巾")); busuitems.add(new BusuItem("彳"));busuitems.add(new BusuItem("彡"));
                busuitems.add(new BusuItem("夕")); busuitems.add(new BusuItem("夂")); busuitems.add(new BusuItem("丬"));
                busuitems.add(new BusuItem("广")); busuitems.add(new BusuItem("宀")); busuitems.add(new BusuItem("辵"));
                busuitems.add(new BusuItem("彐")); busuitems.add(new BusuItem("尸")); busuitems.add(new BusuItem("己"));
                busuitems.add(new BusuItem("弓")); busuitems.add(new BusuItem("子")); busuitems.add(new BusuItem("屮"));
                busuitems.add(new BusuItem("女")); busuitems.add(new BusuItem("幺")); busuitems.add(new BusuItem("巛"));
                break;
            case 4:
                busuitems.add(new BusuItem("无")); busuitems.add(new BusuItem("木")); busuitems.add(new BusuItem("支"));
                busuitems.add(new BusuItem("犬")); busuitems.add(new BusuItem("歹")); busuitems.add(new BusuItem("牙"));
                busuitems.add(new BusuItem("戈")); busuitems.add(new BusuItem("比")); busuitems.add(new BusuItem("瓦"));
                busuitems.add(new BusuItem("止")); busuitems.add(new BusuItem("攴")); busuitems.add(new BusuItem("日"));
                busuitems.add(new BusuItem("水")); busuitems.add(new BusuItem("牛")); busuitems.add(new BusuItem("手"));
                busuitems.add(new BusuItem("气")); busuitems.add(new BusuItem("毛")); busuitems.add(new BusuItem("長"));
                busuitems.add(new BusuItem("片")); busuitems.add(new BusuItem("斤")); busuitems.add(new BusuItem("爪"));
                busuitems.add(new BusuItem("父")); busuitems.add(new BusuItem("月")); busuitems.add(new BusuItem("氏"));
                busuitems.add(new BusuItem("欠")); busuitems.add(new BusuItem("殳")); busuitems.add(new BusuItem("文"));
                busuitems.add(new BusuItem("方")); busuitems.add(new BusuItem("火")); busuitems.add(new BusuItem("斗"));
                busuitems.add(new BusuItem("户")); busuitems.add(new BusuItem("心"));
                break;
            case 5:
                busuitems.add(new BusuItem("母")); busuitems.add(new BusuItem("玉")); busuitems.add(new BusuItem("示"));
                busuitems.add(new BusuItem("甘")); busuitems.add(new BusuItem("石")); busuitems.add(new BusuItem("业"));
                busuitems.add(new BusuItem("目")); busuitems.add(new BusuItem("田")); busuitems.add(new BusuItem("罒"));
                busuitems.add(new BusuItem("皿")); busuitems.add(new BusuItem("生")); busuitems.add(new BusuItem("矢"));
                busuitems.add(new BusuItem("禾")); busuitems.add(new BusuItem("白")); busuitems.add(new BusuItem("瓜"));
                busuitems.add(new BusuItem("疒")); busuitems.add(new BusuItem("立")); busuitems.add(new BusuItem("穴"));
                busuitems.add(new BusuItem("疋")); busuitems.add(new BusuItem("皮")); busuitems.add(new BusuItem("癶"));
                busuitems.add(new BusuItem("矛"));
                break;
            case 6:
                busuitems.add(new BusuItem("艸")); busuitems.add(new BusuItem("耒")); busuitems.add(new BusuItem("老"));
                busuitems.add(new BusuItem("耳")); busuitems.add(new BusuItem("臣")); busuitems.add(new BusuItem("覀"));
                busuitems.add(new BusuItem("而")); busuitems.add(new BusuItem("至")); busuitems.add(new BusuItem("虍"));
                busuitems.add(new BusuItem("虫")); busuitems.add(new BusuItem("肉")); busuitems.add(new BusuItem("缶"));
                busuitems.add(new BusuItem("舌")); busuitems.add(new BusuItem("竹")); busuitems.add(new BusuItem("臼"));
                busuitems.add(new BusuItem("自")); busuitems.add(new BusuItem("血")); busuitems.add(new BusuItem("舟"));
                busuitems.add(new BusuItem("色")); busuitems.add(new BusuItem("衣")); busuitems.add(new BusuItem("羊"));
                busuitems.add(new BusuItem("米")); busuitems.add(new BusuItem("聿")); busuitems.add(new BusuItem("艮"));
                busuitems.add(new BusuItem("羽")); busuitems.add(new BusuItem("糸"));
                break;
            case 7:
                busuitems.add(new BusuItem("貝")); busuitems.add(new BusuItem("車")); busuitems.add(new BusuItem("走"));
                busuitems.add(new BusuItem("赤")); busuitems.add(new BusuItem("豆")); busuitems.add(new BusuItem("酉"));
                busuitems.add(new BusuItem("辰")); busuitems.add(new BusuItem("豕")); busuitems.add(new BusuItem("里"));
                busuitems.add(new BusuItem("足")); busuitems.add(new BusuItem("邑")); busuitems.add(new BusuItem("身"));
                busuitems.add(new BusuItem("釆")); busuitems.add(new BusuItem("谷")); busuitems.add(new BusuItem("豸"));
                busuitems.add(new BusuItem("角")); busuitems.add(new BusuItem("言")); busuitems.add(new BusuItem("辛"));
                break;
            case 8:
                busuitems.add(new BusuItem("門")); busuitems.add(new BusuItem("青")); busuitems.add(new BusuItem("龺"));
                busuitems.add(new BusuItem("雨")); busuitems.add(new BusuItem("非")); busuitems.add(new BusuItem("隹"));
                busuitems.add(new BusuItem("阜")); busuitems.add(new BusuItem("金")); busuitems.add(new BusuItem("隶"));
                break;
            case 9:
                busuitems.add(new BusuItem("頁")); busuitems.add(new BusuItem("風")); busuitems.add(new BusuItem("馬"));
                busuitems.add(new BusuItem("韋")); busuitems.add(new BusuItem("革")); busuitems.add(new BusuItem("面"));
                busuitems.add(new BusuItem("韭")); busuitems.add(new BusuItem("香")); busuitems.add(new BusuItem("食"));
                busuitems.add(new BusuItem("音")); busuitems.add(new BusuItem("首")); busuitems.add(new BusuItem("飛"));
                break;
            case 10:
                busuitems.add(new BusuItem("鬼")); busuitems.add(new BusuItem("骨")); busuitems.add(new BusuItem("髟"));
                busuitems.add(new BusuItem("鬲")); busuitems.add(new BusuItem("鬥")); busuitems.add(new BusuItem("高"));
                busuitems.add(new BusuItem("魚")); busuitems.add(new BusuItem("鹵")); busuitems.add(new BusuItem("麥"));
                busuitems.add(new BusuItem("麻")); busuitems.add(new BusuItem("鹿")); busuitems.add(new BusuItem("鳥"));
                busuitems.add(new BusuItem("黄")); busuitems.add(new BusuItem("黑")); busuitems.add(new BusuItem("黍"));
                busuitems.add(new BusuItem("鼎")); busuitems.add(new BusuItem("黽")); busuitems.add(new BusuItem("鼓"));
                busuitems.add(new BusuItem("鼠")); busuitems.add(new BusuItem("齊")); busuitems.add(new BusuItem("鼻"));
                busuitems.add(new BusuItem("齒")); busuitems.add(new BusuItem("龠")); busuitems.add(new BusuItem("龜"));
                busuitems.add(new BusuItem("龍"));
                break;
        }
    }

    public void AddHanJaItems(){
        hanjaitems.clear();

        hanjaitems.add(new HanJaItem("袈", "가사", "가", "衣", "중의옷", "加"));
        hanjaitems.add(new HanJaItem("苛", "가혹할", "가", "艸", "", "可"));
        hanjaitems.add(new HanJaItem("呵", "꾸짖을", "가", "口", "", "可"));
        hanjaitems.add(new HanJaItem("駕", "멍에", "가", "馬", "쟁기를 끌때 목에 거는 막대", "加"));
        hanjaitems.add(new HanJaItem("哥", "성", "가", "口", "姓", "可"));
        hanjaitems.add(new HanJaItem("嫁", "시집갈", "가", "女", "", "家"));
        hanjaitems.add(new HanJaItem("稼", "심을", "가", "禾", "", "家"));
        hanjaitems.add(new HanJaItem("嘉", "아름다울", "가", "口", "향내를 피우거나 음악을 연주", "加"));
        hanjaitems.add(new HanJaItem("柯", "가지", "가", "木", "", "可"));
        hanjaitems.add(new HanJaItem("迦", "부처이름", "가", "辵", "", "加"));
        hanjaitems.add(new HanJaItem("賈", "성/장사", "가/고", "貝", "姓", "賈"));
        hanjaitems.add(new HanJaItem("軻", "수레/사람이름", "가", "車", "", "可"));
        hanjaitems.add(new HanJaItem("伽", "절", "가", "人", "", "加"));
        hanjaitems.add(new HanJaItem("架", "시렁", "가", "木", "물건을 놓기 위해 나무를 가로질러 만든 것", "加"));
        hanjaitems.add(new HanJaItem("佳", "아름다울", "가", "人", "외모가 아름다운", "圭"));
        hanjaitems.add(new HanJaItem("暇", "틈/겨를", "가", "日", "", "叚"));
        hanjaitems.add(new HanJaItem("街", "거리", "가", "行", "", "圭"));
        hanjaitems.add(new HanJaItem("假", "거짓", "가", "人", "", "叚"));
        hanjaitems.add(new HanJaItem("價", "값", "가", "人", "", "賈"));
        hanjaitems.add(new HanJaItem("加", "더할", "가", "力", "", "加"));
        hanjaitems.add(new HanJaItem("可", "옳을", "가", "口", "", "可"));
        hanjaitems.add(new HanJaItem("歌", "노래", "가", "欠", "", "可"));
        hanjaitems.add(new HanJaItem("家", "집", "가", "宀", "", "家"));

        hanjaitems.add(new HanJaItem("殼", "껍질", "각", "殳", "", "殳"));
        hanjaitems.add(new HanJaItem("恪", "삼갈", "각", "心", "", "各"));
        hanjaitems.add(new HanJaItem("珏", "쌍옥", "각", "玉", ""));
        hanjaitems.add(new HanJaItem("却", "물리칠", "각", "卩", "", "去"));
        hanjaitems.add(new HanJaItem("脚", "다리", "각", "肉", "", "去"));
        hanjaitems.add(new HanJaItem("閣", "집", "각", "門", "", "各/門"));
        hanjaitems.add(new HanJaItem("覺", "깨달을", "각", "見", ""));
        hanjaitems.add(new HanJaItem("刻", "새길", "각", "刀", ""));
        hanjaitems.add(new HanJaItem("各", "각각", "각", "口", "", "各"));
        hanjaitems.add(new HanJaItem("角", "뿔/모서리", "각", "角", ""));

        hanjaitems.add(new HanJaItem("揀", "가릴", "간", "手", "잘잘못을 따져서 분간", "柬"));
        hanjaitems.add(new HanJaItem("奸", "간사할", "간", "女", "", "干"));
        hanjaitems.add(new HanJaItem("癎", "간질", "간", "疒", "", "間"));
        hanjaitems.add(new HanJaItem("諫", "간할", "간", "言", "", "柬"));
        hanjaitems.add(new HanJaItem("墾", "개간할", "간", "土", ""));
        hanjaitems.add(new HanJaItem("竿", "낚싯대", "간", "竹", "", "干"));
        hanjaitems.add(new HanJaItem("澗", "산골물", "간", "水", "", "間"));
        hanjaitems.add(new HanJaItem("艱", "어려울", "간", "艮", ""));
        hanjaitems.add(new HanJaItem("艮", "괘이름/머무를", "간", "艮",  ""));
        hanjaitems.add(new HanJaItem("杆", "몽둥이/나무방패", "간", "木", "", "干"));
        hanjaitems.add(new HanJaItem("姦", "간음할", "간", "女", ""));
        hanjaitems.add(new HanJaItem("肝", "간", "간", "肉", "", "干"));
        hanjaitems.add(new HanJaItem("懇", "간절할", "간", "心", ""));
        hanjaitems.add(new HanJaItem("刊", "새길", "간", "刀", "", "干"));
        hanjaitems.add(new HanJaItem("幹", "줄기", "간", "干", ""));
        hanjaitems.add(new HanJaItem("簡", "대쪽/간략할/편지", "간", "竹", "", "間"));
        hanjaitems.add(new HanJaItem("干", "방패/거스를", "간", "干",  "", "干"));
        hanjaitems.add(new HanJaItem("看", "볼", "간", "目", ""));
        hanjaitems.add(new HanJaItem("間", "사이", "간", "門", "", "間"));

        hanjaitems.add(new HanJaItem("褐", "갈색/굵은베", "갈", "衣", "칡 섬유로 짠 거친 베옷", "曷"));
        hanjaitems.add(new HanJaItem("喝", "꾸짖을", "갈", "口", "", "曷"));
        hanjaitems.add(new HanJaItem("竭", "다할", "갈", "立", "", "曷"));
        hanjaitems.add(new HanJaItem("鞨", "오랑캐이름", "갈", "革", "", "曷"));
        hanjaitems.add(new HanJaItem("葛", "칡", "갈", "艸", "", "曷"));
        hanjaitems.add(new HanJaItem("渴", "목마를", "갈", "水", "", "曷"));

        hanjaitems.add(new HanJaItem("紺", "감색/연보라", "감", "糸", "", "甘"));
        hanjaitems.add(new HanJaItem("疳", "감질", "감", "疒", "", "甘"));
        hanjaitems.add(new HanJaItem("堪", "견딜", "감", "土", "", "甚"));
        hanjaitems.add(new HanJaItem("瞰", "굽어볼", "감", "目", ""));
        hanjaitems.add(new HanJaItem("柑", "귤", "감", "木", "", "甘"));
        hanjaitems.add(new HanJaItem("勘", "헤아릴/조사할", "감", "力", "", "甚"));
        hanjaitems.add(new HanJaItem("憾", "섭섭할", "감", "心", "", "咸"));
        hanjaitems.add(new HanJaItem("鑑", "거울", "감", "金", "", "監"));
        hanjaitems.add(new HanJaItem("敢", "굳셀/감히/구태여", "감", "攴", ""));
        hanjaitems.add(new HanJaItem("甘", "달", "감", "甘",  "", "甘"));
        hanjaitems.add(new HanJaItem("減", "덜", "감", "水", "", "咸"));
        hanjaitems.add(new HanJaItem("監", "볼", "감", "皿", "", "監"));
        hanjaitems.add(new HanJaItem("感", "느낄", "감", "心", "", "咸"));

        hanjaitems.add(new HanJaItem("匣", "갑", "갑", "匚", "넣은 물건을 감추는 작은 상자(匣)", "甲"));
        hanjaitems.add(new HanJaItem("閘", "수문", "갑", "門", "물을 덮어 싸서 가두는 문", "甲/門"));
        hanjaitems.add(new HanJaItem("鉀", "갑옷", "갑", "金", "", "甲"));
        hanjaitems.add(new HanJaItem("岬", "곶/산기슭", "갑", "山", "산의 허리 부분(串)", "甲"));
        hanjaitems.add(new HanJaItem("甲", "갑옷", "갑", "田", "씨앗의 모양으로 껍질이 단단하다", "甲"));

        hanjaitems.add(new HanJaItem("糠", "겨", "강", "米", ""));
        hanjaitems.add(new HanJaItem("薑", "생강", "강", "艸", ""));
        hanjaitems.add(new HanJaItem("腔", "속빌/창자", "강", "肉", ""));
        hanjaitems.add(new HanJaItem("慷", "슬플", "강", "心", ""));
        hanjaitems.add(new HanJaItem("彊", "굳셀", "강", "弓", "행위의 굳셈"));
        hanjaitems.add(new HanJaItem("岡", "산등성이/언덕", "강", "山", "", "岡"));
        hanjaitems.add(new HanJaItem("姜", "성", "강", "女", "姓"));
        hanjaitems.add(new HanJaItem("崗", "산등성이/언덕", "강", "山", "", "岡"));
        hanjaitems.add(new HanJaItem("疆", "지경", "강", "田", ""));
        hanjaitems.add(new HanJaItem("鋼", "강철", "강", "金", "", "岡"));
        hanjaitems.add(new HanJaItem("剛", "굳셀", "강", "刀", "칼이 바위도 자를 만하다", "岡"));
        hanjaitems.add(new HanJaItem("綱", "벼리/줄거리", "강", "糸", "그물을 오므렸다 폈다 할 수 있는 줄", "岡"));
        hanjaitems.add(new HanJaItem("降", "내릴/항복할", "강/항", "阜", ""));
        hanjaitems.add(new HanJaItem("講", "욀", "강", "言", "", "冓"));
        hanjaitems.add(new HanJaItem("康", "편안", "강", "广", ""));
        hanjaitems.add(new HanJaItem("强", "강할", "강", "弓", ""));
        hanjaitems.add(new HanJaItem("江", "강", "강", "水", "", "工"));

        hanjaitems.add(new HanJaItem("凱", "개선할", "개", "几", "싸움에 이기고 풍악을 울리며 돌아오다"));
        hanjaitems.add(new HanJaItem("芥", "겨자", "개", "艸", "", "介"));
        hanjaitems.add(new HanJaItem("箇", "낱", "개", "竹", "물건 셀 때의 助辭", "固"));
        hanjaitems.add(new HanJaItem("漑", "물댈", "개", "水", "", "旣"));
        hanjaitems.add(new HanJaItem("愾", "성낼/한숨쉴", "개", "心", ""));
        hanjaitems.add(new HanJaItem("塏", "높은땅", "개", "土", ""));
        hanjaitems.add(new HanJaItem("价", "클/심부름할", "개", "人", "", "介"));
        hanjaitems.add(new HanJaItem("皆", "다", "개", "白", "總"));
        hanjaitems.add(new HanJaItem("慨", "슬퍼할", "개", "心", "", "旣"));
        hanjaitems.add(new HanJaItem("介", "낄", "개", "人", "", "介"));
        hanjaitems.add(new HanJaItem("槪", "대개", "개", "木", "", "旣"));
        hanjaitems.add(new HanJaItem("蓋", "덮을", "개", "艸", ""));
        hanjaitems.add(new HanJaItem("個", "낱", "개", "人", "몸뚱이를 물건처럼 세는 것", "固"));
        hanjaitems.add(new HanJaItem("改", "고칠", "개", "攴", ""));
        hanjaitems.add(new HanJaItem("開", "열", "개", "門", "", "門"));

        hanjaitems.add(new HanJaItem("客", "손", "객", "宀", "", "各"));

        hanjaitems.add(new HanJaItem("羹", "국", "갱", "羊", ""));
        hanjaitems.add(new HanJaItem("坑", "구덩이", "갱", "土", ""));

        hanjaitems.add(new HanJaItem("醵", "추렴할", "거/갹", "酉", "여럿이 얼마씩 돈을 내어 거두다"));
        hanjaitems.add(new HanJaItem("渠", "개천", "거", "水", ""));
        hanjaitems.add(new HanJaItem("倨", "거만할", "거", "人", "", "古"));
        hanjaitems.add(new HanJaItem("距", "상거할/떨어질", "거", "足", "相距", "巨"));
        hanjaitems.add(new HanJaItem("據", "근거", "거", "手", ""));
        hanjaitems.add(new HanJaItem("拒", "막을", "거", "手", "", "巨"));
        hanjaitems.add(new HanJaItem("居", "살", "거", "尸", "", "古"));
        hanjaitems.add(new HanJaItem("巨", "클", "거", "工", "", "巨"));
        hanjaitems.add(new HanJaItem("去", "갈", "거", "厶", "", "去"));
        hanjaitems.add(new HanJaItem("擧", "들/높이올릴", "거", "手", ""));
        hanjaitems.add(new HanJaItem("車", "수레", "거/차", "車",  ""));

        hanjaitems.add(new HanJaItem("虔", "공경할/삼갈", "건", "虍", ""));
        hanjaitems.add(new HanJaItem("巾", "수건", "건", "巾",  ""));
        hanjaitems.add(new HanJaItem("腱", "힘줄", "건", "肉", "", "建"));
        hanjaitems.add(new HanJaItem("鍵", "자물쇠/열쇠", "건", "金", "", "建"));
        hanjaitems.add(new HanJaItem("乾", "하늘/마를", "건", "乙", ""));
        hanjaitems.add(new HanJaItem("健", "굳셀", "건", "人", "", "建"));
        hanjaitems.add(new HanJaItem("件", "물건", "건", "人", ""));
        hanjaitems.add(new HanJaItem("建", "세울", "건", "廴", "", "建"));

        hanjaitems.add(new HanJaItem("杰", "뛰어날", "걸", "木", "불에 타지 않고 의연히 남아있는 나무"));
        hanjaitems.add(new HanJaItem("桀", "하왕이름", "걸", "木", "본래는 좌우 양발을 나무에 결박하는 형벌(夏)"));
        hanjaitems.add(new HanJaItem("乞", "빌", "걸", "乙", ""));
        hanjaitems.add(new HanJaItem("傑", "뛰어날", "걸", "人", "많은 사람 가운데서 빼어났다"));

        hanjaitems.add(new HanJaItem("劍", "칼", "검", "刀", "", "僉"));
        hanjaitems.add(new HanJaItem("儉", "검소할", "검", "人", "", "僉"));
        hanjaitems.add(new HanJaItem("檢", "검사할", "검", "木", "", "僉"));

        hanjaitems.add(new HanJaItem("怯", "겁낼", "겁", "心", "", "去"));
        hanjaitems.add(new HanJaItem("劫", "위협할", "겁", "力", "", "去"));

        hanjaitems.add(new HanJaItem("偈", "불시", "게", "手", "", "曷"));
        hanjaitems.add(new HanJaItem("揭", "높이들/걸", "게", "手", "", "曷"));
        hanjaitems.add(new HanJaItem("憩", "쉴", "게", "心", ""));

        hanjaitems.add(new HanJaItem("膈", "가슴", "격", "肉", ""));
        hanjaitems.add(new HanJaItem("檄", "격문", "격", "木", "사람의 마음을 쳐서 움직이는 글"));
        hanjaitems.add(new HanJaItem("覡", "박수", "격", "見", "巫는 여자 무당(男巫)"));
        hanjaitems.add(new HanJaItem("隔", "사이뜰", "격", "阜", ""));
        hanjaitems.add(new HanJaItem("激", "격할", "격", "水", ""));
        hanjaitems.add(new HanJaItem("擊", "칠", "격", "手", ""));
        hanjaitems.add(new HanJaItem("格", "격식", "격", "木", "", "各"));

        hanjaitems.add(new HanJaItem("繭", "고치", "견", "糸", ""));
        hanjaitems.add(new HanJaItem("譴", "꾸짖을", "견", "言", ""));
        hanjaitems.add(new HanJaItem("鵑", "두견새", "견", "鳥", "가늘고 작은 새"));
        hanjaitems.add(new HanJaItem("甄", "질그릇", "견", "瓦", "굴뚝이 있는 가마에서 구운 그릇"));
        hanjaitems.add(new HanJaItem("遣", "보낼", "견", "辵", ""));
        hanjaitems.add(new HanJaItem("絹", "비단", "견", "糸", "명주"));
        hanjaitems.add(new HanJaItem("肩", "어깨", "견", "肉", ""));
        hanjaitems.add(new HanJaItem("牽", "이끌/끌", "견", "牛", ""));
        hanjaitems.add(new HanJaItem("犬", "개", "견", "犬",  ""));
        hanjaitems.add(new HanJaItem("堅", "굳을", "견", "土", ""));
        hanjaitems.add(new HanJaItem("見", "볼/뵐", "견/현", "見",  ""));

        hanjaitems.add(new HanJaItem("訣", "이별할", "결", "言", "", "夬"));
        hanjaitems.add(new HanJaItem("潔", "깨끗할", "결", "水", ""));
        hanjaitems.add(new HanJaItem("缺", "이지러질", "결", "缶", "", "夬"));
        hanjaitems.add(new HanJaItem("決", "결단할", "결", "水", "", "夬"));
        hanjaitems.add(new HanJaItem("結", "맺을", "결", "糸", ""));

        hanjaitems.add(new HanJaItem("謙", "겸손할", "겸", "言", ""));
        hanjaitems.add(new HanJaItem("兼", "겸할", "겸", "八", ""));

        hanjaitems.add(new HanJaItem("痙", "경련", "경", "疒", "痙攣", "巠"));
        hanjaitems.add(new HanJaItem("磬", "경쇠", "경", "石", "망치 등으로 쳐서 소리를 내는 악기"));
        hanjaitems.add(new HanJaItem("鯨", "고래", "경", "魚", "", "京"));
        hanjaitems.add(new HanJaItem("勁", "굳셀", "경", "力", "", "巠"));
        hanjaitems.add(new HanJaItem("憬", "깨달을/동경할", "경", "心", "", "景"));
        hanjaitems.add(new HanJaItem("頸", "목", "경", "頁", "", "巠"));
        hanjaitems.add(new HanJaItem("脛", "정강이/종아리", "경", "肉", "", "巠"));
        hanjaitems.add(new HanJaItem("莖", "줄기", "경", "艸", "", "巠"));
        hanjaitems.add(new HanJaItem("梗", "줄거리/줄기/막힐", "경", "木", "산 느릅나무"));
        hanjaitems.add(new HanJaItem("儆", "경계할", "경", "人", ""));
        hanjaitems.add(new HanJaItem("瓊", "구슬", "경", "玉", "붉고 아름다운 옥"));
        hanjaitems.add(new HanJaItem("炅", "빛날", "경", "火", ""));
        hanjaitems.add(new HanJaItem("璟", "옥빛", "경", "玉", "", "景"));
        hanjaitems.add(new HanJaItem("竟", "마침내", "경", "立", "", "竟"));
        hanjaitems.add(new HanJaItem("卿", "벼슬", "경", "卩", ""));
        hanjaitems.add(new HanJaItem("庚", "별", "경", "广", ""));
        hanjaitems.add(new HanJaItem("硬", "굳을", "경", "石", ""));
        hanjaitems.add(new HanJaItem("耕", "밭갈", "경", "耒", ""));
        hanjaitems.add(new HanJaItem("頃", "이랑/잠깐", "경", "頁", ""));
        hanjaitems.add(new HanJaItem("徑", "지름길/곧을", "경", "彳", "", "巠"));
        hanjaitems.add(new HanJaItem("鏡", "거울", "경", "金", "", "竟"));
        hanjaitems.add(new HanJaItem("更", "고칠/다시", "경/갱", "曰", ""));
        hanjaitems.add(new HanJaItem("傾", "기울", "경", "人", ""));
        hanjaitems.add(new HanJaItem("驚", "놀랄", "경", "馬", ""));
        hanjaitems.add(new HanJaItem("慶", "경사", "경", "广", ""));
        hanjaitems.add(new HanJaItem("警", "깨우칠/경게할", "경", "言", ""));
        hanjaitems.add(new HanJaItem("境", "지경", "경", "土", "", "竟"));
        hanjaitems.add(new HanJaItem("經", "지날/글/다스릴", "경", "糸", "", "巠"));
        hanjaitems.add(new HanJaItem("輕", "가벼울", "경", "車", "", "巠"));
        hanjaitems.add(new HanJaItem("敬", "공경", "경", "攴", ""));
        hanjaitems.add(new HanJaItem("競", "다툴", "경", "立", "", "竟"));
        hanjaitems.add(new HanJaItem("景", "볕", "경", "日", "", "景/京"));
        hanjaitems.add(new HanJaItem("京", "서울", "경", "亠", "", "京"));

        hanjaitems.add(new HanJaItem("悸", "두근거릴", "계", "心", ""));
        hanjaitems.add(new HanJaItem("繫", "맬", "계", "糸", ""));
        hanjaitems.add(new HanJaItem("癸", "북방/천간/헤아릴", "계", "癶", ""));
        hanjaitems.add(new HanJaItem("桂", "계수나무", "계", "木", "", "圭"));
        hanjaitems.add(new HanJaItem("械", "기계/형틀", "계", "木", ""));
        hanjaitems.add(new HanJaItem("契", "맺을", "계", "大", ""));
        hanjaitems.add(new HanJaItem("溪", "시내", "계", "水", ""));
        hanjaitems.add(new HanJaItem("啓", "열", "계", "口", "사람들을 가르쳐 슬기와 지능을 열어주다"));
        hanjaitems.add(new HanJaItem("戒", "경계할", "계", "戈", ""));
        hanjaitems.add(new HanJaItem("季", "계절/끝", "계", "子", ""));
        hanjaitems.add(new HanJaItem("鷄", "닭", "계", "鳥", "", "鳥"));
        hanjaitems.add(new HanJaItem("階", "섬돌", "계", "阜", "언덕 모양으로 쌓아 올린 층계"));
        hanjaitems.add(new HanJaItem("系", "이어맬", "계", "糸", "손과 실이 이어져 있다"));
        hanjaitems.add(new HanJaItem("繼", "이을", "계", "糸", "실을 이어 맨다"));
        hanjaitems.add(new HanJaItem("係", "맬", "계", "人", "실의 끝을 잡고 이리 저리 움직이다"));
        hanjaitems.add(new HanJaItem("計", "셀", "계", "言", ""));
        hanjaitems.add(new HanJaItem("界", "지경", "계", "田", ""));

        hanjaitems.add(new HanJaItem("痼", "고질", "고", "疒", "", "固"));
        hanjaitems.add(new HanJaItem("膏", "기름", "고", "肉", ""));
        hanjaitems.add(new HanJaItem("股", "넓적다리", "고", "肉", "", "殳"));
        hanjaitems.add(new HanJaItem("叩", "두드릴", "고", "口", "앉아서 머리를 땅에 톡톡 두드리는 모양"));
        hanjaitems.add(new HanJaItem("敲", "두드릴", "고", "支", ""));
        hanjaitems.add(new HanJaItem("錮", "막을", "고", "金", "구속하여 행동의 자유를 제한", "固"));
        hanjaitems.add(new HanJaItem("袴", "바지", "고", "衣", "", "夸"));
        hanjaitems.add(new HanJaItem("呱", "울", "고", "口", "", "瓜"));
        hanjaitems.add(new HanJaItem("拷", "칠", "고", "手", ""));
        hanjaitems.add(new HanJaItem("辜", "허물", "고", "辛", ""));
        hanjaitems.add(new HanJaItem("皐", "언덕", "고", "白", "姓氏"));
        hanjaitems.add(new HanJaItem("雇", "품팔", "고", "隹", "남의 집에 철새(隹)처럼 잠시 머물러 일하는 사람"));
        hanjaitems.add(new HanJaItem("顧", "돌아볼", "고", "頁", ""));
        hanjaitems.add(new HanJaItem("枯", "마를", "고", "木", "", "古"));
        hanjaitems.add(new HanJaItem("鼓", "북", "고", "鼓", ""));
        hanjaitems.add(new HanJaItem("姑", "시어미", "고", "女", "", "古"));
        hanjaitems.add(new HanJaItem("稿", "원고/볏짚", "고", "禾", "", "高"));
        hanjaitems.add(new HanJaItem("庫", "곳집", "고", "广", ""));
        hanjaitems.add(new HanJaItem("孤", "외로울", "고", "子", "", "瓜"));
        hanjaitems.add(new HanJaItem("故", "연고", "고", "支", "낡다/사람의 죽음을 완곡/본디"));
        hanjaitems.add(new HanJaItem("告", "고할", "고", "口", "", "告"));
        hanjaitems.add(new HanJaItem("固", "굳을", "고", "口", "", "固/古"));
        hanjaitems.add(new HanJaItem("考", "생각할", "고", "老", ""));
        hanjaitems.add(new HanJaItem("高", "높을", "고", "高", "", "高"));
        hanjaitems.add(new HanJaItem("苦", "쓸", "고", "艸", "", "古"));
        hanjaitems.add(new HanJaItem("古", "예", "고", "口", "", "古"));

        hanjaitems.add(new HanJaItem("鵠", "고니/과녁", "곡", "鳥", "", "告"));
        hanjaitems.add(new HanJaItem("梏", "수갑", "곡", "木", "", "告"));
        hanjaitems.add(new HanJaItem("谷", "골", "곡", "谷", "골짜기"));
        hanjaitems.add(new HanJaItem("哭", "울", "곡", "口", ""));
        hanjaitems.add(new HanJaItem("穀", "곡식", "곡", "禾", ""));
        hanjaitems.add(new HanJaItem("曲", "굽을", "곡", "曰", ""));

        hanjaitems.add(new HanJaItem("袞", "곤룡포", "곤", "衣", "공식적으로 입는 옷/임금의 정복"));
        hanjaitems.add(new HanJaItem("昆", "맏", "곤", "日", "벌레"));
        hanjaitems.add(new HanJaItem("棍", "몽둥이", "곤", "木", "묶다"));
        hanjaitems.add(new HanJaItem("坤", "따", "곤", "土", "땅"));
        hanjaitems.add(new HanJaItem("困", "곤할", "곤", "口", ""));

        hanjaitems.add(new HanJaItem("汨", "골몰할/물이름", "골/멱", "水", ""));
        hanjaitems.add(new HanJaItem("骨", "뼈", "골", "骨", ""));

        hanjaitems.add(new HanJaItem("鞏", "굳을", "공", "革", "", "巩"));
        hanjaitems.add(new HanJaItem("拱", "팔짱낄", "공", "手", "", "共"));
        hanjaitems.add(new HanJaItem("恭", "공손할", "공", "心", ""));
        hanjaitems.add(new HanJaItem("恐", "두려울", "공", "心", "", "巩"));
        hanjaitems.add(new HanJaItem("貢", "바칠", "공", "貝", "", "工"));
        hanjaitems.add(new HanJaItem("供", "이바지할", "공", "人", "", "共"));
        hanjaitems.add(new HanJaItem("孔", "구멍", "공", "子", "", "乚"));
        hanjaitems.add(new HanJaItem("攻", "칠(擊)", "공", "攴", "", "工"));
        hanjaitems.add(new HanJaItem("功", "공(勳)", "공", "力", "", "工"));
        hanjaitems.add(new HanJaItem("公", "공평할", "공", "八", "", "公"));
        hanjaitems.add(new HanJaItem("共", "한가지", "공", "八", "함께", "共"));
        hanjaitems.add(new HanJaItem("空", "빌", "공", "穴", "하늘", "工"));
        hanjaitems.add(new HanJaItem("工", "장인", "공", "工", "만들다", "工"));

        hanjaitems.add(new HanJaItem("顆", "낟알", "과", "頁", "", "果"));
        hanjaitems.add(new HanJaItem("菓", "과자/실과", "과", "艸", "", "果"));
        hanjaitems.add(new HanJaItem("瓜", "오이", "과", "瓜", "", "瓜"));
        hanjaitems.add(new HanJaItem("戈", "창", "과", "戈", "", ""));
        hanjaitems.add(new HanJaItem("誇", "자랑할", "과", "言", "", "夸"));
        hanjaitems.add(new HanJaItem("寡", "적을", "과", "宀", "과부", ""));
        hanjaitems.add(new HanJaItem("課", "공부할/과정", "과", "言", "부세", "果"));
        hanjaitems.add(new HanJaItem("過", "지날", "과", "辵", "지나치다/허물", "咼"));
        hanjaitems.add(new HanJaItem("科", "과목", "과", "禾", "", ""));
        hanjaitems.add(new HanJaItem("果", "실과", "과", "木", "과일", "果"));

        hanjaitems.add(new HanJaItem("廓", "둘레/클", "곽/확", "广", "", "郭"));
        hanjaitems.add(new HanJaItem("槨", "외관", "곽/확", "木", "外棺", "郭"));
        hanjaitems.add(new HanJaItem("藿", "콩잎/미역", "곽/확", "艸", ""));
        hanjaitems.add(new HanJaItem("郭", "둘레/외성", "곽/확", "邑", "", "郭"));

        hanjaitems.add(new HanJaItem("顴", "광대뼈", "관", "頁", "", "雚"));
        hanjaitems.add(new HanJaItem("棺", "널", "관", "木", "", "官"));
        hanjaitems.add(new HanJaItem("灌", "물댈", "관", "水", "", "雚"));
        hanjaitems.add(new HanJaItem("串", "꿸/땅이름", "관/곶", "丨", "바다 쪽으로 좁고 길에 뻗어 있는 땅", ""));
        hanjaitems.add(new HanJaItem("琯", "옥피리", "관", "玉", "옥으로 만든 대롱", "官"));
        hanjaitems.add(new HanJaItem("款", "항목", "관", "欠", "하고자하다/한탄하다/문서/기록/새기다", ""));
        hanjaitems.add(new HanJaItem("冠", "갓", "관", "冖", "", ""));
        hanjaitems.add(new HanJaItem("貫", "꿸", "관", "貝", "", "貫"));
        hanjaitems.add(new HanJaItem("寬", "너그러울", "관", "宀", "", ""));
        hanjaitems.add(new HanJaItem("慣", "익숙할", "관", "心", "", "貫"));
        hanjaitems.add(new HanJaItem("館", "집", "관", "食", "", "官"));
        hanjaitems.add(new HanJaItem("管", "대롱/주관할", "관", "竹", "", "官"));
        hanjaitems.add(new HanJaItem("官", "벼슬", "관", "宀", "", "官"));
        hanjaitems.add(new HanJaItem("關", "관계할", "관", "門", "", "門"));
        hanjaitems.add(new HanJaItem("觀", "볼", "관", "見", "", "雚"));

        hanjaitems.add(new HanJaItem("刮", "긁을", "괄", "刀", "", "舌"));
        hanjaitems.add(new HanJaItem("括", "묶을", "괄", "手", "", "舌"));

        hanjaitems.add(new HanJaItem("壙", "뫼구덩이", "광", "土", "시체가 놓이는 무덤의 구덩이 부분", "廣"));
        hanjaitems.add(new HanJaItem("匡", "바를", "광", "匚", "바로잡다", "王"));
        hanjaitems.add(new HanJaItem("曠", "빌", "광", "日", "밝다/광활하다/크다/멀다", "廣"));
        hanjaitems.add(new HanJaItem("胱", "오줌통", "광", "肉", "", "光"));
        hanjaitems.add(new HanJaItem("狂", "미칠", "광", "犬", "", "王"));
        hanjaitems.add(new HanJaItem("鑛", "쇳돌", "광", "金", "", "廣"));
        hanjaitems.add(new HanJaItem("廣", "넓을", "광", "广", "", "廣"));
        hanjaitems.add(new HanJaItem("光", "빛", "광", "儿", "", "光"));

        hanjaitems.add(new HanJaItem("卦", "점괘", "괘", "卜", "", "卦"));
        hanjaitems.add(new HanJaItem("罫", "줄", "괘", "罒", "가로세로 교차한 선", "卦"));
        hanjaitems.add(new HanJaItem("掛", "걸", "괘", "手", "", "卦"));

        hanjaitems.add(new HanJaItem("魁", "괴수", "괴", "鬼", "우두머리", "鬼"));
        hanjaitems.add(new HanJaItem("乖", "어그러질", "괴", "丿", "", ""));
        hanjaitems.add(new HanJaItem("拐", "후릴", "괴", "手", "유괴하다", ""));
        hanjaitems.add(new HanJaItem("傀", "허수아비", "괴", "人", "귀신에 홀려 넋 빠진 사람", "鬼"));
        hanjaitems.add(new HanJaItem("槐", "회화나무/느티나무", "괴", "木", "구불구불하고 못생긴 나무", "鬼"));
        hanjaitems.add(new HanJaItem("愧", "부끄러울", "괴", "土", "", "鬼"));
        hanjaitems.add(new HanJaItem("塊", "흙덩이", "괴", "土", "", "鬼"));
        hanjaitems.add(new HanJaItem("怪", "괴이할", "괴", "心", "", ""));
        hanjaitems.add(new HanJaItem("壞", "무너질", "괴", "土", "", ""));


        hanjaitems.add(new HanJaItem("擦", "문지를", "찰", "手", "", "察"));
        hanjaitems.add(new HanJaItem("刹", "절", "찰", "刀", "", ""));
        hanjaitems.add(new HanJaItem("札", "편지", "찰", "木", "", ""));
        hanjaitems.add(new HanJaItem("察", "살필", "찰", "宀", "", "察/祭"));

        hanjaitems.add(new HanJaItem("塹", "구덩이", "참", "土", "", "斬"));
        hanjaitems.add(new HanJaItem("懺", "뉘우칠", "참", "心", "", "韱"));
        hanjaitems.add(new HanJaItem("站", "역마을", "참", "立", "", "占"));
        hanjaitems.add(new HanJaItem("讖", "예언", "참", "言", "", "韱"));
        hanjaitems.add(new HanJaItem("僭", "주제넘을", "참", "人", "", "朁"));
        hanjaitems.add(new HanJaItem("讒", "참소할", "참", "言", "", ""));
        hanjaitems.add(new HanJaItem("斬", "벨", "참", "斤", "", "斬"));
        hanjaitems.add(new HanJaItem("慙", "부끄러울", "참", "心", "", "斬"));
        hanjaitems.add(new HanJaItem("慘", "참혹할", "참", "心", "", "參"));
        hanjaitems.add(new HanJaItem("參", "참여할/석", "참/삼", "厶", "", "參"));

        hanjaitems.add(new HanJaItem("廠", "공장", "창", "广", "", "敞"));
        hanjaitems.add(new HanJaItem("倡", "광대", "창", "人", "", "昌"));
        hanjaitems.add(new HanJaItem("漲", "넘칠", "창", "水", "", "張"));
        hanjaitems.add(new HanJaItem("猖", "미쳐날뛸", "창", "犬", "", "昌"));
        hanjaitems.add(new HanJaItem("艙", "부두", "창", "舟", "", "倉"));
        hanjaitems.add(new HanJaItem("瘡", "부스럼", "창", "疒", "", "倉"));
        hanjaitems.add(new HanJaItem("脹", "부을", "창", "肉", "", "長"));
        hanjaitems.add(new HanJaItem("愴", "슬플", "창", "心", "", "倉"));
        hanjaitems.add(new HanJaItem("槍", "창", "창", "木", "", "倉"));
        hanjaitems.add(new HanJaItem("娼", "창녀", "창", "女", "", "昌"));
        hanjaitems.add(new HanJaItem("菖", "창포", "창", "艸", "", "昌"));
        hanjaitems.add(new HanJaItem("彰", "드러날", "창", "彡", "", "章"));
        hanjaitems.add(new HanJaItem("敞", "시원할", "창", "攴", "", "敞"));
        hanjaitems.add(new HanJaItem("滄", "큰바다", "창", "水", "", "倉"));
        hanjaitems.add(new HanJaItem("昶", "해길/화창할", "창", "日", "", ""));
        hanjaitems.add(new HanJaItem("暢", "화창할", "창", "日", "", ""));
        hanjaitems.add(new HanJaItem("倉", "곳집", "창", "人", "", "倉"));
        hanjaitems.add(new HanJaItem("昌", "창성할", "창", "曰", "", "昌"));
        hanjaitems.add(new HanJaItem("蒼", "푸를", "창", "艸", "", "倉"));
        hanjaitems.add(new HanJaItem("創", "비롯할", "창", "刀", "", "倉"));
        hanjaitems.add(new HanJaItem("唱", "부를", "창", "口", "", "昌"));
        hanjaitems.add(new HanJaItem("窓", "창문", "창", "穴", "", ""));

        hanjaitems.add(new HanJaItem("寨", "목책", "채", "宀", "", ""));
        hanjaitems.add(new HanJaItem("埰", "사패지", "채", "土", "향리로서 문무과나 생원에 합격된 사람과 특별한 군공(軍功)이 있는 사람에게 부역을 면제하여 주는 증서", "采"));
        hanjaitems.add(new HanJaItem("蔡", "성", "채", "艸", "姓", "祭"));
        hanjaitems.add(new HanJaItem("采", "풍채", "채", "采", "", "采"));
        hanjaitems.add(new HanJaItem("菜", "나물", "채", "艹", "", "采"));
        hanjaitems.add(new HanJaItem("債", "빚", "채", "人", "", "責"));
        hanjaitems.add(new HanJaItem("彩", "채색", "채", "彡", "", "采"));
        hanjaitems.add(new HanJaItem("採", "캘", "채", "手", "", "采"));

        hanjaitems.add(new HanJaItem("柵", "울타리", "책", "木", "", "冊"));
        hanjaitems.add(new HanJaItem("策", "꾀", "책", "竹", "", "朿"));
        hanjaitems.add(new HanJaItem("冊", "책", "책", "冂", "", "冊"));
        hanjaitems.add(new HanJaItem("責", "꾸짖을", "책", "貝", "", "責"));

        hanjaitems.add(new HanJaItem("凄", "쓸쓸할", "처", "冫", "", "妻"));
        hanjaitems.add(new HanJaItem("悽", "슬퍼할", "처", "心", "", "妻"));
        hanjaitems.add(new HanJaItem("妻", "아내", "처", "女", "", "妻"));
        hanjaitems.add(new HanJaItem("處", "곳", "처", "虍", "", ""));

        hanjaitems.add(new HanJaItem("擲", "던질", "척", "手", "", ""));
        hanjaitems.add(new HanJaItem("脊", "등마루/등뼈", "척", "肉", "", "脊"));
        hanjaitems.add(new HanJaItem("滌", "씻을", "척", "水", "", ""));
        hanjaitems.add(new HanJaItem("瘠", "여윌", "척", "疒", "", "脊"));
        hanjaitems.add(new HanJaItem("陟", "오를", "척", "阜", "", ""));
        hanjaitems.add(new HanJaItem("隻", "외짝", "척", "隹", "", ""));
        hanjaitems.add(new HanJaItem("斥", "물리칠", "척", "斤", "", ""));
        hanjaitems.add(new HanJaItem("拓", "넓힐/박을", "척/탁", "手", "", ""));
        hanjaitems.add(new HanJaItem("尺", "자", "척", "尸", "", ""));
        hanjaitems.add(new HanJaItem("戚", "친척", "척", "戈", "", ""));

        hanjaitems.add(new HanJaItem("穿", "뚫을", "천", "穴", "", ""));
        hanjaitems.add(new HanJaItem("擅", "멋대로할", "천", "手", "", "亶"));
        hanjaitems.add(new HanJaItem("闡", "열/밝힐", "천", "門", "", "門"));
        hanjaitems.add(new HanJaItem("喘", "숨찰", "천", "口", "", "耑"));
        hanjaitems.add(new HanJaItem("釧", "팔찌", "천", "金", "", "川"));
        hanjaitems.add(new HanJaItem("薦", "천거할", "천", "艸", "", ""));
        hanjaitems.add(new HanJaItem("踐", "밟을", "천", "足", "", "戔"));
        hanjaitems.add(new HanJaItem("淺", "얕을", "천", "水", "", "戔"));
        hanjaitems.add(new HanJaItem("遷", "옮길", "천", "辶", "", ""));
        hanjaitems.add(new HanJaItem("賤", "천할", "천", "貝", "", "戔"));
        hanjaitems.add(new HanJaItem("泉", "샘", "천", "水", "", ""));
        hanjaitems.add(new HanJaItem("川", "내", "천", "巛", "", "川"));
        hanjaitems.add(new HanJaItem("天", "일천", "천", "大", "", ""));
        hanjaitems.add(new HanJaItem("千", "하늘", "천", "十", "", ""));

        hanjaitems.add(new HanJaItem("轍", "바퀴자국", "철", "車", "", "育攵"));
        hanjaitems.add(new HanJaItem("凸", "볼록할", "철", "凵", "", ""));
        hanjaitems.add(new HanJaItem("綴", "엮을", "철", "糸", "", ""));
        hanjaitems.add(new HanJaItem("撤", "거둘", "철", "手", "", "育攵"));
        hanjaitems.add(new HanJaItem("澈", "맑을", "철", "水", "", "育攵"));
        hanjaitems.add(new HanJaItem("喆", "밝을/쌍길", "철", "口", "", ""));
        hanjaitems.add(new HanJaItem("哲", "밝을", "철", "口", "", ""));
        hanjaitems.add(new HanJaItem("徹", "통할", "철", "彳", "", "育攵"));
        hanjaitems.add(new HanJaItem("鐵", "쇠", "철", "金", "", ""));

        hanjaitems.add(new HanJaItem("僉", "다/여러", "첨", "人", "", "僉"));
        hanjaitems.add(new HanJaItem("諂", "아첨할", "첨", "言", "", "臽"));
        hanjaitems.add(new HanJaItem("籤", "제비", "첨", "竹", "점대", "韱"));
        hanjaitems.add(new HanJaItem("瞻", "볼", "첨", "目", "", "詹"));
        hanjaitems.add(new HanJaItem("添", "더할", "첨", "水", "", ""));
        hanjaitems.add(new HanJaItem("尖", "뾰족할", "첨", "小", "", ""));

        hanjaitems.add(new HanJaItem("疊", "거듭", "첩", "田", "", ""));
        hanjaitems.add(new HanJaItem("帖", "문서", "첩", "巾", "", "占"));
        hanjaitems.add(new HanJaItem("貼", "붙일", "첩", "貝", "", "占"));
        hanjaitems.add(new HanJaItem("捷", "빠를", "첩", "手", "", ""));
        hanjaitems.add(new HanJaItem("牒", "편지", "첩", "片", "", "枼"));
        hanjaitems.add(new HanJaItem("諜", "염탐할", "첩", "言", "", "枼"));
        hanjaitems.add(new HanJaItem("妾", "첩", "첩", "女", "", ""));

        hanjaitems.add(new HanJaItem("晴", "갤", "청", "日", "", "靑"));
        hanjaitems.add(new HanJaItem("廳", "관청", "청", "广", "", "聽"));
        hanjaitems.add(new HanJaItem("聽", "들을", "청", "耳", "", "聽"));
        hanjaitems.add(new HanJaItem("請", "청할", "청", "言", "", "靑"));
        hanjaitems.add(new HanJaItem("淸", "맑을", "청", "水", "", "靑"));
        hanjaitems.add(new HanJaItem("靑", "푸를", "청", "靑", "", "靑"));

        hanjaitems.add(new HanJaItem("涕", "눈물", "체", "水", "", "弟"));
        hanjaitems.add(new HanJaItem("諦", "살필", "체", "言", "", "帝"));
        hanjaitems.add(new HanJaItem("締", "맺을", "체", "糸", "", "帝"));
        hanjaitems.add(new HanJaItem("遞", "갈릴", "체", "辵", "", ""));
        hanjaitems.add(new HanJaItem("替", "바꿀", "체", "日", "", ""));
        hanjaitems.add(new HanJaItem("逮", "잡을", "체", "辵", "", ""));
        hanjaitems.add(new HanJaItem("滯", "막힐", "체", "水", "", "帶"));
        hanjaitems.add(new HanJaItem("體", "몸", "체", "骨", "", ""));

        hanjaitems.add(new HanJaItem("梢", "나무끝", "초", "木", "", "肖"));
        hanjaitems.add(new HanJaItem("樵", "나무할", "초", "木", "", "焦"));
        hanjaitems.add(new HanJaItem("貂", "담비", "초", "豸", "", ""));
        hanjaitems.add(new HanJaItem("炒", "볶을", "초", "火", "떠들다/시끄럽다", "少"));
        hanjaitems.add(new HanJaItem("礁", "암초", "초", "石", "", "焦"));
        hanjaitems.add(new HanJaItem("稍", "점점", "초", "禾", "", "肖"));
        hanjaitems.add(new HanJaItem("醋", "초", "초", "酉", "식초", "昔"));
        hanjaitems.add(new HanJaItem("憔", "파리할", "초", "心", "", "焦"));
        hanjaitems.add(new HanJaItem("蕉", "파초", "초", "艸", "", "焦"));
        hanjaitems.add(new HanJaItem("硝", "화약", "초", "石", "", "肖"));
        hanjaitems.add(new HanJaItem("哨", "망볼", "초", "口", "", "肖"));


    }
}
