<template>
  <div>
<rpg-game-component/>
  </div>
</template>

<script>
import Rpg_Game from "@/components/basics/Rpg_Game";

export default {
  name: "RpgGameView",
  components:{
    'rpg-game-component': Rpg_Game
  }
}
</script>

<style scoped>

</style>