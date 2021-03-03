<template>
    <md-toolbar class="md-info">
        <div class="md-toolbar-row">
            <div class="md-toolbar-section-start">
                <a href="/"><h3 class="md-title">Pinosoft</h3></a>           
            </div>
            <div class="md-toolbar-section-end">
                <md-button
                    class="md-just-icon md-simple md-white md-toolbar-toggle"
                >
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </md-button>

                <div class="md-collapse">
                    <md-list>
                        <md-list-item href="#/input">
                        <md-icon>input</md-icon>
                        <p>input</p>
                        </md-list-item>

                        <md-list-item href="javascript:void(0)">
                        <md-icon>list</md-icon>
                        <p>list</p>
                        </md-list-item>

                        <md-list-item href="#/test">
                        <md-icon>build</md-icon>
                        <p>test</p>
                        </md-list-item>

                        <li class="md-list-item">
                            <a
                                href="javascript:void(0)"
                                class="md-list-item-router md-list-item-container md-button-clean dropdown"
                            >
                                <div class="md-list-item-content">
                                    <drop-down direction="down">
                                        <md-button
                                        slot="title"
                                        class="md-button md-button-link md-white md-simple dropdown-toggle"
                                        data-toggle="dropdown"
                                        >
                                        <md-icon>code</md-icon>
                                        <p>code</p>
                                        </md-button>
                                        <ul
                                        class="dropdown-menu"
                                        :class="{ 'dropdown-menu-right': responsive }"
                                        >                       
                                            <li>
                                                <a href="#pablo" class="dropdown-item">code lnput</a>
                                            </li>
                                            <li>
                                                <a href="#pablo" class="dropdown-item"
                                                >code list</a
                                                >
                                            </li>                       
                                        </ul>
                                    </drop-down>
                                </div>
                            </a>
                        </li>
                    </md-list>
                </div>
            </div>
        </div>
    </md-toolbar>
</template>