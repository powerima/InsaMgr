<template>
	<div id="app">
    <InsaHeader></InsaHeader>
    <InsaInput></InsaInput>
    <InsaFooter></InsaFooter>
  </div>
</template>

<script>
import InsaFooter from './components/content/InsaFooter.vue'
import InsaHeader from './components/content/InsaHeader.vue'
import InsaInput from './components/content/InsaInput.vue'
import InsaList from './components/content/InsaList.vue'
import InsaMain from './components/main/InsaMain.vue'

export default {
  component: {
    'InsaFooter': InsaFooter,
    'InsaHeader': InsaHeader,
    'InsaList': InsaList,
    'InsaInput': InsaInput,
    'InsaMain': InsaMain
  }
}
</script>

<style>

</style>