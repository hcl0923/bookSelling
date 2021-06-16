Vue.component("mininav", {
    template: `
    <div id="mininav">
    <div class="mininav_inner">
        <div id="mininav_left" class="mininav_left">
            <div class="region region-mininav-left">
                <div id="block-block-2" class="block block-block">
                    <div class="content">
                        <div>
                        <span v-if="loginedUser.id">欢迎{{loginedUser.name}} <a href="crbook-user/logout">[退出]</a></span>
                        <span v-else><a href="login.html">[登录]</a><a class="link-regist" href="register.html">[免费注册]</a>
                       </span>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <div class="mininav_right" id="mininav_right">
            <div class="region region-mininav-right">
                <div id="block-block-3" class="block block-block">


                    <div class="content">
                        <ul class="topnav">
                            <li id="wechat"><a class="link4" target="_blank"
                                title="中华书局官方微信">微信<span><p>
                                <img src="sites/all/themes/dushu/images/qrcode_crbook.jpg"/></p></span></a></li>
                            <li class="ddnewhead_cart"><a dd_name="购物车" name="购物车"
                                                          href="cart.html"><i class="icon_card"></i>购物车<b
                                    id="cart_items_count"></b></a></li>
                            <li id="myorder"><a class="link4" target="_blank"
                                                title="我的订单" href="user_order.html">我的订单</a></li>
                            <li id="myaccount"><a class="link4" target="_blank"
                                                  title="我的书屋" href="user_home.html">我的书屋</a></li>
                            <li id="help-center"><a class="link4" target="_blank"
                                                    title="帮助中心" href="node/10">帮助中心</a></li>

                        </ul>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
    `,
    data() {
        return {loginedUser: {}};
    },
    created() {
        //定义函数读取用户信息
        axios.get("crbook-user/getLoginedUser").then(res => {
            if (res.data.data) {
                this.loginedUser = res.data.data;
            }
        })
    }
})
Vue.component("header-wrapper", {
    template: `
<div id="header-wrapper1">
    <div id="header-wrapper2">
        <div id="header">
            <div class="head_main">
                <div class="head_left">
                    <a class="logo" title="灿然书屋（中华书局旗下网上书店）" href="/" id="logo"><img
                            alt="灿然书屋（中华书局旗下网上书店）Logo"
                            src="sites/all/themes/dushu/images/logo.png"/></a>
                    <div id="search_form" class="text_box">
                        <div class="region region-search-form">
                            <div id="block-search-form" class="block block-search">


                                <div class="content">
                                    <form action="/" method="post" id="search-block-form"
                                          accept-charset="UTF-8">
                                        <div>
                                            <div class="container-inline">
                                                <h2 class="element-invisible">搜索表单</h2>
                                                <div
                                                        class="form-item form-type-textfield form-item-search-block-form">
                                                    <label class="element-invisible"
                                                           for="edit-search-block-form--2">搜索 </label> <input
                                                        title="请输入您想搜索的关键词。" type="text"
                                                        id="edit-search-block-form--2" name="search_block_form"
                                                        value="" size="15" maxlength="128" class="form-text"/>
                                                </div>
                                                <div class="form-actions form-wrapper" id="edit-actions">
                                                    <input type="submit" id="edit-submit" name="op" value="搜索"
                                                           class="form-submit"/>
                                                </div>
                                                <input type="hidden" name="form_build_id"
                                                       value="form-l6j1hbEXeqgTEDac-pLnbhpA4pPxh_mX6jlHeqLYmPI"/>
                                                <input type="hidden" name="form_id"
                                                       value="search_block_form"/>
                                            </div>
                                            <div id="advsearch-link">
                                                <a href="/advsearch">高级搜索</a>
                                            </div>
                                        </div>
                                    </form>
                                </div>
                            </div>
                            <div id="block-block-28" class="block block-block">


                                <div class="content">
                                    <div id="hotwords">
                                        <strong>热门搜索：</strong> <a href="/search/content?keyword=史记"
                                                                  target="_blank">史记</a> <a
                                            href="/search/content?keyword=资治通鉴" target="_blank">资治通鉴</a>
                                        <a href="/search/content?keyword=清史稿" target="_blank">清史稿</a>
                                        <a href="/search/content?keyword=二十四史" target="_blank">二十四史</a>
                                        <a href="/search/content?keyword=佛教" target="_blank">佛教</a> <a
                                            href="/search/content?keyword=大藏经" target="_blank">大藏经</a> <a
                                            href="/hotkeywords" target="_blank">更多</a>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="head_right">
                    <div class="region region-head-right">
                        <div id="block-obcustom-shopping-cart"
                             class="block block-obcustom">


                            <div class="content">
                                <div id="shopping-cart-block">
                                    <dl class="">
                                        <dt class="ld">
                                            <s></s><span class="shopping"><span
                                                id="shopping-amount"></span></span><a id="cart-url"
                                                                                      href="/cart">去购物车结算</a>
                                            <b></b>
                                        </dt>
                                    </dl>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
`
})
Vue.component("head-nav", {
    template: `
    <div class="head_nav">
    <div class="head_nav_innner">
        <div class="region region-head-nav">

            <div id="all-categorys" class="all-categorys-class">
                <div class="mt ld">
                    <h2>
                        <a href="#">全部商品分类<b></b></a>
                    </h2>
                </div>
                <div class="mc" id="bookstore-all-terms" load="2">

                    <div class="item fore1" v-for="c in clist">
                        <span data-split="1">
                            <h3>
                                <a :href="'/????/books/category/'+c.id">{{c.name}}</a>
                            </h3> <s></s>
                        </span>

                        <div class="i-mc" style="top: 3px;">
                            <div class="close">×</div>
                            <div class="subitem">

                                <dl class="fore1" v-for="c1 in c.children">
                                    <dt>
                                        <a :href="'/????/books/category/'+c1.id">{{c1.name}}</a>
                                    </dt>
                                    <dd>


                                        <em v-for="c2 in c1.children">
                                         <a :href="'/????/books/category/'+c2.id">{{c2.name}}</a></em>  


                                    </dd>
                                </dl>
                   
                            </div>
                        </div>
                    </div>
                    
                </div>
            </div>

            <ul class="menu">
                <li class="first leaf active-trail"><a href="/" title=""
                                                       class="active">首页</a></li>
                <li class="leaf"><a href="gjzx/" title="">古籍资讯</a></li>
                <li class="leaf"><a href="/books/dxwx" title="">大型文献</a></li>
                <li class="leaf"><a href="/books/xzts" title="">线装图书</a></li>
                <li class="leaf"><a href="/books/lpts" title="">礼品图书</a></li>
                <li class="leaf"><a href="/books/fznj" title="">方志年鉴</a></li>
                <li class="last leaf"><a href="/resources" title="">数据下载</a></li>
            </ul>
        </div>
    </div>
</div>
    `,
    data() {
        return {
            clist: []
        };
    },
    created() {
        axios.get("crbook-book/findRootCategory").then(res => {
            this.clist = res.data.data;

        });
    }

})
