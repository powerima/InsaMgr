<template>
    <div class="main">
        <div class="section section-basic">
            <div class="container">               
                <div class="md-layout">
                    <div class="md-layout-item">
                        <md-field>
                        <label>아이디</label>
                        <md-input v-model="id" type="text"></md-input>
                        </md-field>
                    </div>
                    <div class="md-layout-item">
                        <md-field>
                        <label>비밀번호</label>
                        <md-input v-model="password" type="text"></md-input>
                        </md-field>
                    </div>
                    <div class="md-layout-item">
                        <md-button class="md-info md-sm" v-on:click="insertTest">등록</md-button>
                    </div>
                </div>               
            </div>
        </div>
    </div>
</template>

<script>
export default {
    data() {
        return {
            id: '',
            password: ''
        }
    },
    methods: {        
        insertTest() {
            var params = new URLSearchParams();
            params.append('id', this.id);
            params.append('password', this.password);
            axios.post('http://localhost:8090/insertTest.do', params)
            .then(function(response){

            });
            console.log(this.id, this.password);
        }
    }
}
</script>