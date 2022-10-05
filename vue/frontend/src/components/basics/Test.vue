<template>
  <div>
    <h1>{{ testMsg }}</h1>
    <li v-for="(item, index) in lists" :key="index">
      {{ item }}
    </li>
    <br/>
    <button v-on:click="clickHandler">클릭해봐</button>
    <br/><br/>
    <input v-model="initMsg">
    <p>{{ initMsg }}</p>

    <button v-on:click="show=!show">쇼타임!</button>
    <p v-if="show">보였다 안보였다</p>

    <p>{{ lists[0] }}</p><br/>
    <p>{{ lists[0] }}</p><br/>
    <p>{{ lists[1] }}</p><br/>
    <p>{{ lists[2] }}</p><br/>

    <p>{{ count }}번 클릭했습니다</p>
    <button v-on:click="increment">카운트 버튼</button>


  </div>
</template>

<script>
export default {
  // eslint-disable-next-line vue/multi-word-component-names
  name: "Test",
  data() {
    return {
      testMsg: "My Message",
      lists: ['apple', 'banana', 'grape'],
      initMsg: "양방향 맵핑이 가능",
      show: true,
      count: 0
    }
  },
  methods: {
    clickHandler(event) {
      alert("이벤트 발생: " + event.target)
    },
    increment() {
      this.count += 1
    }

  }
}
</script>

<style scoped>

</style>