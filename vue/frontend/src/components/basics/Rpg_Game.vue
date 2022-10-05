<template>
  <div>
    <h1>RPG GAME</h1>
    <h3>상점</h3>
    <label>
      <input type="checkbox" v-model="shopView" v-on:click="shuffleShopList()">
      판매 목록
    </label>
    <button v-on:click="calcBuyList()">구매 확정</button>
    <table border="1" v-if="shopView">
      <tr>
        <th align="center" width="40">번호</th>
        <th align="center" width="120">아이템명</th>
        <th align="center" width="160">가격</th>
        <th align="center" width="320">아이템 설명</th>
        <th align="center" width="40">구매</th>
      </tr>
      <tr v-for="(item, index) in shopList" :key="index">
        <th align="center" width="40">{{ index }}</th>
        <th align="center" width="120">{{ item.name }}</th>
        <th align="center" width="160">{{ item.price.toLocaleString() }}</th>
        <th align="center" width="320">{{ item.effect.description }}</th>
        <th align="center" width="40">
          <label>
            <input type="checkbox" v-model="shopListValue" :value="index">
          </label>
        </th>
      </tr>
    </table>
    <br/><br/>
    <h3>캐릭터 상태 창</h3>
    <P>HP: {{ characterStatus.currentHp }}/{{ characterStatus.hp }} MP: {{
        characterStatus.currentMp
      }}/{{ characterStatus.mp }}
      ATK: {{ characterStatus.atk }} LV: {{ characterStatus.level }} 직업: {{ characterStatus.currentJob }}</P>
    <p>STR: {{ characterStatus.str.toLocaleString() }} INT: {{ characterStatus.int }} DEX:
      {{ characterStatus.dex.toLocaleString() }}
      VIT: {{ characterStatus.vit }} DEF: {{ characterStatus.def }} MEN: {{ characterStatus.men }}</p>
    <p>경험치: {{ characterStatus.currentLevelBar.toLocaleString() }} / {{ characterStatus.totalLevelBar }}</p>
    <p>소지금: {{ characterStatus.money.toLocaleString() }}</p>

    (고정)몬스터 이름: <input v-model="name">



  </div>
</template>

<script>
export default {
  // eslint-disable-next-line vue/multi-word-component-names
  name: "Rpg_Game",
  data() {
    return {
      shopView: false,
      shopList: [],
      shopListValue: [],
      itemBooks: [
        {name: 'HP포션 I', price: 50, effect: {description: 'hp 200 회복', amount: 200}},
        {name: 'HP포션 II', price: 200, effect: {description: 'hp 600 회복', amount: 600}},
        {name: '낡은 검', price: 5000000, effect: {description: '무기 공격력 100', amount: 100}},
        {name: '검', price: 50000000, effect: {description: '무기 공격력 200', amount: 200}},
        {name: '강철 검', price: 150000000, effect: {description: '무기 공격력 300', amount: 300}},
        {name: '화염검', price: 550000000, effect: {description: '무기 공격력 500', amount: 500}},
        {name: '군주의검', price: 100000000, effect: {description: '무기 공격력 1000', amount: 1000}},
        {name: '아이스소드', price: 150000000, effect: {description: '무기 공격력 2000', amount: 2000}},
        {name: '칠지도', price: 200000000, effect: {description: '무기 공격력 2000', amount: 2000}},
        {name: '군주의휘장', price: 1000000000, effect: {description: '악세사리 공격력 1000', amount: 1000}}
      ],
      monsterBooks: [
        {monsterId: 1, name: '슬라임', hp: 50, exp: 10, dropMoney: 5},
        {monsterId: 2, name: '고블린', hp: 100, exp: 20, dropMoney: 10},
        {monsterId: 3, name: '놀', hp: 200, exp: 40, dropMoney: 20},
        {monsterId: 4, name: '멧돼지', hp: 400, exp: 100, dropMoney: 20},
        {monsterId: 5, name: '스켈레톤', hp: 350, exp: 90, dropMoney: 10},
        {monsterId: 6, name: '오크', hp: 550, exp: 150, dropMoney: 40},
        {monsterId: 7, name: '홉고블린', hp: 650, exp: 180, dropMoney: 50},
        {monsterId: 8, name: '스켈레톤 아처', hp: 300, exp: 150, dropMoney: 50},
        {monsterId: 9, name: '트롤', hp: 800, exp: 200, dropMoney: 80},
        {monsterId: 10, name: '좀비', hp: 350, exp: 90, dropMoney: 50},
        {monsterId: 11, name: '고블린 매지션', hp: 700, exp: 500, dropMoney: 300},
        {monsterId: 12, name: '오우거', hp: 1000, exp: 250, dropMoney: 50},
        {monsterId: 13, name: '고스트', hp: 750, exp: 300, dropMoney: 1},
        {monsterId: 14, name: '골렘', hp: 2000, exp: 400, dropMoney: 100},
        {monsterId: 15, name: '와이번', hp: 3500, exp: 500, dropMoney: 150},
        {monsterId: 16, name: '리치', hp: 2000, exp: 1000, dropMoney: 500},
        {monsterId: 17, name: '스켈레톤 기사', hp: 2500, exp: 700, dropMoney: 100},
        {monsterId: 18, name: '웨어울프', hp: 5000, exp: 1000, dropMoney: 700},
        {monsterId: 19, name: '미노타우루스', hp: 10000, exp: 1500, dropMoney: 1000},
        {monsterId: 20, name: '드레이크', hp: 20000, exp: 5000, dropMoney: 50000},
        {monsterId: 21, name: '죽음의 군주', hp: 1000000, exp: 200000, dropMoney: 1000000},
        {monsterId: 9999, name: '하이퍼 메탈 슬라임', hp: 1000, exp: 5000000, dropMoney: 10000000}
      ],
      monsterLists: [
        {id: 1, name: '슬라임', hp: 50},
        {id: 2, name: '고블린', hp: 100},
        {id: 3, name: '놀', hp: 200},
      ],
      characterStatus: {
        level: 1,
        currentHp: 50,
        hp: 50,
        currentMp: 30,
        mp: 30,
        itemAtk: 0,
        defaultAtk: 10,
        atk: 10,
        str: 10,
        int: 10,
        dex: 10,
        vit: 10,
        def: 10,
        men: 0,
        totalLevelBar: 10,
        currentLevelBar: 0,
        money: 0,
        currentJob: '모험가'
      },
    }
  },
  methods: {
    shuffleShopList() {
      if (!this.shopView) {
        this.shopListValue = []
      }

      for (let i = 0; i < 10; i++) {
        let ranIdx = Math.floor(Math.random() * this.itemBooks.length)
        this.shopList[i] = this.itemBooks[ranIdx]
      }
    },
    calcBuyList(){
      //let tmpSum = 0

      for (let i = 0; i < this.shopListValue.length; i++) {
        for (let j = 0; j < this.shopList.length; j++) {
          if (this.shopListValue[i] === j){
            //tmpSum += this.shopList[j].price
            break
          }
        }
      }
    /*  if(this.characterStatus.money - tmpSum >= 0){
        this.characterStatus.money -= tmpSum
        for (let i = 0; i < this.shopListValue.length; i++) {
          this.myInventory push({

          })
        }
      }*/
    }
  }
}


</script>

<style scoped>

</style>