<template>
    <form id="inputForm" ecntype="multipart/form-data" method="post">
       
                <md-card>      
                    <md-card-content>
                        <div class="md-layout">
                            <div class="md-layout md-layout-item md-size-100 md-xsmall-size-100 md-small-size-100 md-medium-size-100">
                                <div class="md-layout-item md-size-10 md-xsmall-size-33 md-small-size-10 md-medium-size-10">
                                    <md-button class="md-info md-sm" v-on:click="insertInsa">등록</md-button>
                                </div>
                                <div class="md-layout-item md-size-10 md-xsmall-size-33 md-small-size-10 md-medium-size-10">
                                    <md-button class="md-info md-sm" v-on:click="insertInsaPre">전화면</md-button>
                                </div>
                                <div class="md-layout-item md-size-10 md-xsmall-size-33 md-small-size-10 md-medium-size-10">
                                    <md-button class="md-info md-sm">리셋</md-button>
                                </div>
                            </div>
                            <div class= "md-layout md-layout-item">
                                <div class="md-layout md-layout-item md-size-15 md-xsmall-size-50 md-small-size-20 md-medium-size-20"
                                    :class="{ 'text-center': responsive }"
                                    >
                                    <img
                                        :src="image"
                                        alt="Raised Image"
                                        class="img-raised rounded"
                                        :class="{ 'responsive-image': responsive }"
                                    />
                                    <md-field>
                                    <label>사진 첨부</label>
                                    <md-file v-model="single" accept="image/*" name="uploadProfile"/>
                                    </md-field>
                                </div>
                                <div class="md-layout-item input">          
                                    <div class="md-layout">
                                        <div class="md-layout-item md-size-25 md-xsmall-size-100 md-small-size-30 md-medium-size-25">
                                            <md-field>
                                            <label>사번</label>
                                            <md-input v-model="sabun" type="text" name="sabun" disabled></md-input>
                                            </md-field>
                                        </div>
                                        <div class="md-layout-item md-size-25 md-xsmall-size-50 md-small-size-30 md-medium-size-25">
                                            <md-field>
                                            <label>한글성명</label>
                                            <md-input v-model="name" type="text" name="name" required></md-input>
                                            </md-field>
                                        </div>
                                        <div class="md-layout-item md-size-25 md-xsmall-size-50 md-small-size-30 md-medium-size-25">
                                            <md-field>
                                            <label>영문성명</label>
                                            <md-input v-model="eng_name" type="text" name="eng_name"></md-input>
                                            </md-field>
                                        </div>
                                    </div>
                                    <div class="md-layout">
                                        <div class="md-layout-item md-size-25 md-xsmall-size-100 md-small-size-30 md-medium-size-25">
                                            <md-field>
                                            <label>아이디</label>
                                            <md-input v-model="id" type="text" name="id" required></md-input>
                                            </md-field>
                                        </div>
                                        <div class="md-layout-item md-size-25 md-xsmall-size-50 md-small-size-30 md-medium-size-25">
                                            <md-field>
                                            <label>패스워드</label>
                                            <md-input v-model="pwd" type="text" name="pwd" required></md-input>
                                            </md-field>
                                        </div>
                                        <div class="md-layout-item md-size-25 md-xsmall-size-50 md-small-size-30 md-medium-size-25">
                                            <md-field>
                                            <label>패스워드확인</label>
                                            <md-input v-model="pwd_check" type="text" name="pwd_check" required></md-input>
                                            </md-field>
                                        </div>
                                    </div>
                                    <div class="md-layout">
                                        <div class="md-layout-item md-size-25 md-xsmall-size-50 md-small-size-30 md-medium-size-25">
                                            <md-field>
                                            <label>전화번호</label>
                                            <md-input v-model="phone" type="text" name="phone"></md-input>
                                            </md-field>
                                        </div>
                                        <div class="md-layout-item md-size-25 md-xsmall-size-50 md-small-size-30 md-medium-size-25">
                                            <md-field>
                                            <label>핸드폰번호</label>
                                            <md-input v-model="hp" type="text" name="hp" required></md-input>
                                            </md-field>
                                        </div>
                                        <div class="md-layout md-layout-item md-size-25 md-xsmall-size-100 md-small-size-30 md-medium-size-25">
                                            <div class="md-layout-item md-size-45 md-xsmall-size-40 md-small-size-30 md-medium-size-25">
                                                <md-field>
                                                <label>주민번호</label>
                                                <md-input v-model="floatingLabel" type="text" required></md-input>
                                                </md-field>
                                            </div>
                                            <div class="md-layout-item md-size-15 md-xsmall-size-20 md-small-size-30 md-medium-size-25">
                                                <md-field>
                                                <label></label>
                                                <md-input v-model="floatingLabel" type="text" required></md-input>
                                                </md-field>
                                            </div>
                                            <div class="md-layout-item md-size-40 md-xsmall-size-40 md-small-size-30 md-medium-size-25">
                                                <md-field>
                                                <label></label>
                                                <md-input v-model="floatingLabel" type="text" required></md-input>
                                                </md-field>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="md-layout">
                                        <div class="md-layout-item md-size-10 md-xsmall-size-100 md-small-size-30 md-medium-size-25">
                                            <md-field>
                                            <label>연령</label>
                                            <md-input v-model="age" type="text" name="age"></md-input>
                                            </md-field>
                                        </div>
                                        <div class="md-layout-item md-size-15 md-xsmall-size-100 md-small-size-30 md-medium-size-25">
                                            <md-field>
                                            <label>이메일</label>
                                            <md-input v-model="email_id" type="text" name="email_id" required></md-input>
                                            </md-field>
                                        </div>
                                        <div class="md-layout-item md-size-15 md-xsmall-size-100 md-small-size-30 md-medium-size-25">
                                            <md-field>
                                                <label for="email_domain1">도메인</label>
                                                <md-select v-model="email_domain1" name="email_domain1" id="email_domain1">
                                                    <md-option value="male">남</md-option>
                                                    <md-option value="female">여</md-option>
                                                </md-select>
                                            </md-field>
                                        </div>
                                        <div class="md-layout-item md-size-15 md-xsmall-size-100 md-small-size-30 md-medium-size-25">
                                            <md-field>
                                            <label>직접입력</label>
                                            <md-input v-model="email_domain2" type="email_domain2" name="email_domain2"></md-input>
                                            </md-field>
                                        </div> 
                                        <div class="md-layout-item md-size-10 md-xsmall-size-50 md-small-size-20 md-medium-size-10">
                                            <md-field>
                                            <label for="join_gbn_code">직종</label>
                                            <md-select v-model="join_gbn_code" name="join_gbn_code">
                                                <md-option value="australia">Australia</md-option>
                                                <md-option value="brazil">Brazil</md-option>                                        
                                            </md-select>
                                            </md-field>
                                        </div> 
                                        <div class="md-layout-item md-size-10 md-xsmall-size-50 md-small-size-15 md-medium-size-10">
                                            <md-field>
                                            <label for="sex">성별</label>
                                            <md-select v-model="sex" name="sex" id="sex">
                                                <md-option value="male">남</md-option>
                                                <md-option value="female">여</md-option>
                                            </md-select>
                                            </md-field>
                                        </div>                           
                                    </div> 
                                    <div class="md-layout">                               
                                
                                        <div class="md-layout-item md-size-15 md-xsmall-size-60 md-small-size-20 md-medium-size-25">
                                            <md-field>
                                            <label>우편번호</label>
                                            <md-input v-model="floatingLabel" type="text" name="zip" id="sample4_postcode"></md-input>
                                            </md-field>
                                        </div>
                                        <div class="md-layout-item md-size-10 md-xsmall-size-20 md-small-size-15 md-medium-size-25">
                                            <md-button class="md-info md-sm">주소검색</md-button>
                                        </div>
                                        <div class="md-layout-item md-size-25 md-xsmall-size-100 md-small-size-30 md-medium-size-25">
                                            <md-field>
                                            <label>도로명 주소</label>
                                            <md-input v-model="floatingLabel" type="text" name="addr1" id="sample4_roadAddress"></md-input>
                                            </md-field>
                                            <input type="hidden" id="sample4_jibunAddress" placeholder="지번주소"  size="40">                            
                                        </div>
                                        <div class="md-layout-item md-size-25 md-xsmall-size-100 md-small-size-30 md-medium-size-25">
                                            <md-field>
                                            <label>상세 주소</label>
                                            <md-input v-model="floatingLabel" type="text" name="addr2" id="sample4_detailAddress"></md-input>
                                            </md-field>
                                            <input type="hidden" id="sample4_extraAddress" placeholder="참고항목"  size="60">
                                            <input type="hidden" id="sample4_engAddress" placeholder="영문주소"  size="60" >
                                        </div>
                                    </div>           
                                </div>                        
                            </div>
                            <div class="md-layout md-layout-item md-size-100 md-xsmall-size-100 md-small-size-100 md-medium-size-100">
                                
                            </div>
                            <div class="md-layout md-layout-item md-size-100 md-xsmall-size-100 md-small-size-100 md-medium-size-100">
                                <div class="md-layout-item md-size-25 md-xsmall-size-50 md-small-size-33 md-medium-size-25">
                                    <md-field>
                                    <label for="pos_gbn_code">직위</label>
                                    <md-select v-model="pos_gbn_code" name="pos_gbn_code">
                                        <md-option value="male">남</md-option>
                                        <md-option value="female">여</md-option>
                                    </md-select>
                                    </md-field>
                                </div>            
                                <div class="md-layout-item md-size-25 md-xsmall-size-50 md-small-size-33 md-medium-size-25">
                                    <md-field>
                                    <label for="dept_code">부서</label>
                                    <md-select v-model="dept_code" name="dept_code">
                                        <md-option value="male">남</md-option>
                                        <md-option value="female">여</md-option>
                                    </md-select>
                                    </md-field>
                                </div>
                                <div class="md-layout-item md-size-25 md-xsmall-size-100 md-small-size-33 md-medium-size-25">
                                    <md-field>
                                    <label>연봉</label>
                                    <md-input v-model="floatingLabel" type="text" name="salary"></md-input>
                                    </md-field>
                                </div>
                            </div>
                            <div class="md-layout md-layout-item md-size-100 md-xsmall-size-100 md-small-size-100 md-medium-size-100">
                                <div class="md-layout-item md-size-25 md-xsmall-size-50 md-small-size-25 md-medium-size-25">
                                    <md-field>
                                    <label for="join_yn">입사구분</label>
                                    <md-select v-model="join_yn" name="join_yn">
                                        <md-option value="Y">Y</md-option>
                                        <md-option value="N">N</md-option>
                                    </md-select>
                                    </md-field>
                                </div>            
                                <div class="md-layout-item md-size-25 md-xsmall-size-50 md-small-size-25 md-medium-size-25">
                                    <md-field>
                                    <label for="gart_level">등급</label>
                                    <md-select v-model="gart_level" name="gart_level">
                                        <md-option value="male">남</md-option>
                                        <md-option value="female">여</md-option>
                                    </md-select>
                                    </md-field>
                                </div>
                                <div class="md-layout-item md-size-25 md-xsmall-size-50 md-small-size-25 md-medium-size-25">
                                    <md-field>
                                    <label for="sex">투입여부</label>
                                    <md-select v-model="sex" name="sex" id="sex">
                                        <md-option value="male">남</md-option>
                                        <md-option value="female">여</md-option>
                                    </md-select>
                                    </md-field>
                                </div>
                                <div class="md-layout-item md-size-25 md-xsmall-size-50 md-small-size-25 md-medium-size-25">
                                    <md-field>
                                    <label for="sex">군필여부</label>
                                    <md-select v-model="sex" name="sex" id="sex">
                                        <md-option value="male">남</md-option>
                                        <md-option value="female">여</md-option>
                                    </md-select>
                                    </md-field>
                                </div>
                            </div>
                            <div class="md-layout md-layout-item md-size-100 md-xsmall-size-100 md-small-size-100 md-medium-size-100">
                                <div class="md-layout-item md-size-25 md-xsmall-size-50 md-small-size-25 md-medium-size-25">
                                    <md-field>
                                    <label for="sex">군별</label>
                                    <md-select v-model="sex" name="sex" id="sex">
                                        <md-option value="male">남</md-option>
                                        <md-option value="female">여</md-option>
                                    </md-select>
                                    </md-field>
                                </div>            
                                <div class="md-layout-item md-size-25 md-xsmall-size-50 md-small-size-25 md-medium-size-25">
                                    <md-field>
                                    <label for="sex">계급</label>
                                    <md-select v-model="sex" name="sex" id="sex">
                                        <md-option value="male">남</md-option>
                                        <md-option value="female">여</md-option>
                                    </md-select>
                                    </md-field>
                                </div>
                                <div class="md-layout-item md-size-25 md-xsmall-size-50 md-small-size-25 md-medium-size-25">
                                    <md-datepicker>
                                    <label>입영일자</label>
                                    </md-datepicker>
                                </div>
                                <div class="md-layout-item md-size-25 md-xsmall-size-50 md-small-size-25 md-medium-size-25">
                                    <md-datepicker>
                                    <label>전역일자</label>
                                    </md-datepicker>
                                </div>
                            </div>
                            <div class="md-layout md-layout-item md-size-100 md-xsmall-size-100 md-small-size-100 md-medium-size-100">
                                <div class="md-layout-item md-size-25 md-xsmall-size-50 md-small-size-25 md-medium-size-25">
                                    <md-field>
                                    <label>KOSA등록</label>
                                    <md-input v-model="floatingLabel" type="text"></md-input>
                                    </md-field>
                                </div>            
                                <div class="md-layout-item md-size-25 md-xsmall-size-50 md-small-size-25 md-medium-size-25">
                                    <md-field>
                                    <label>KOSA등급</label>
                                    <md-input v-model="floatingLabel" type="text"></md-input>
                                    </md-field>
                                </div>
                                <div class="md-layout-item md-size-25 md-xsmall-size-50 md-small-size-25 md-medium-size-25">
                                    <md-datepicker>
                                    <label>입사일자</label>
                                    </md-datepicker>
                                </div>
                                <div class="md-layout-item md-size-25 md-xsmall-size-50 md-small-size-25 md-medium-size-25">
                                    <md-datepicker>
                                    <label>퇴사일자</label>
                                    </md-datepicker>
                                </div>
                            </div>
                            
                            <div class="md-layout md-layout-item md-size-100 md-xsmall-size-100 md-small-size-100 md-medium-size-100">
                                <div class="md-layout-item md-size-25 md-xsmall-size-50 md-small-size-25 md-medium-size-25">
                                    <md-field>
                                    <label>사업자번호</label>
                                    <md-input v-model="floatingLabel" type="text"></md-input>
                                    </md-field>
                                </div>            
                                <div class="md-layout-item md-size-25 md-xsmall-size-50 md-small-size-25 md-medium-size-25">
                                    <md-field>
                                    <label>업체명</label>
                                    <md-input v-model="floatingLabel" type="text"></md-input>
                                    </md-field>
                                </div>
                                <div class="md-layout-item md-size-25 md-xsmall-size-50 md-small-size-25 md-medium-size-25">
                                    <md-field>
                                    <label>사업자등록증</label>
                                    <md-file v-model="single" accept="image/*" />
                                    </md-field>
                                </div>
                                <div class="md-layout-item md-size-25 md-xsmall-size-50 md-small-size-25 md-medium-size-25">
                                    <md-field>
                                    <label>이력서</label>
                                    <md-file v-model="single" accept="image/*" />
                                    </md-field>
                                </div>
                            </div>
                            <div class="md-layout md-layout-item md-size-100 md-xsmall-size-100 md-small-size-100 md-medium-size-100">
                                <div class="md-layout-item md-size-50 md-xsmall-size-100 md-small-size-50 md-medium-size-25">
                                    <md-field>
                                    <label>자기소개</label>
                                    <md-textarea v-model="textarea" md-counter="100"></md-textarea>
                                    </md-field>
                                </div>        
                                
                                <div class="md-layout-item md-size-25 md-xsmall-size-50 md-small-size-50 md-medium-size-25">
                                
                                </div>
                                <div class="md-layout-item md-size-25 md-xsmall-size-50 md-small-size-50 md-medium-size-25">
                                
                                </div>
                            </div>
                        </div>        
                    </md-card-content>
                </md-card>        
                 
           
    </form>
</template>

<script>
import { NavTabsCard } from "@/components";


export default {
    data() {
        return {
            image: require("@/assets/img/faces/profile_empty.jpg"),
            responsive: false
        };
    },
    
    methods: {        
        insertInsa() {
            console.log("insertTest");
            var inputForm = document.getElementById('inputForm');       
            console.log(inputForm);            
            console.log('inputForm[0]: ', inputForm[0]);   
            var formData = new FormData(inputForm[0]);
            axios.post('http://localhost:8090/insa/insertInsa.do', formData)
            .then(function(response){

            });
            console.log(formData);
        }

        
    }
}
</script>

<style lang="css"></style>