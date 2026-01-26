class gameCharacter {
    static id = 5; // 초기 데이터가 4번까지 있으므로 5부터 시작
    #characters = [
        {
            id: 1, name: "신사임걸", cls: "M", sx: "F",
            hp: 203, mp: 395,
            str: 50, int: 50, dex: 50, lux: 50,
            birthDate: "2010-01-01"
        },
        {
            id: 2, name: "흑색전사", cls: "W", sx: "F",
            hp: 203, mp: 395,
            str: 50, int: 50, dex: 50, lux: 50,
            birthDate: "2010-01-01"
        },
        {
            id: 3, name: "도적고양이", cls: "T", sx: "F",
            hp: 203, mp: 395,
            str: 50, int: 50, dex: 50, lux: 50,
            birthDate: "2010-01-01"
        },
        {
            id: 4, name: "못난이궁수", cls: "A", sx: "F",
            hp: 203, mp: 395,
            str: 50, int: 50, dex: 50, lux: 50,
            birthDate: "2010-01-01"
        }
    ];

    createGameCharacter(forInsert) {
        return {
            id: forInsert === `forInsert` ? gameCharacter.id++ : $("#id").val() * 1,
            name: $("#name").val(),
            cls: $("#cls").val(),
            sx: $("input:radio[name=sx]:checked").val(),
            hp: $("#hp").val() * 1,
            mp: $("#mp").val() * 1,
            str: $("#str").val() * 1,
            int: $("#int").val() * 1,
            dex: $("#dex").val() * 1,
            lux: $("#lux").val() * 1,
            birthDate: $("#birthDate").val()
        }
    }

    checkInputValueIsError(forInsert) {
        if (forInsert === `forInsert` && this.#characters.some((character) => {
            return character.id * 1 === $("#id").val() * 1
        })) {
            alert(`아이디가 중복되었습니다`);
            return true;
        }
        if ($("#name").val().length < 2 || $("#name").val().length > 10) {
            alert(`이름은 2글자 이상 10글자 미만으로 해주세요`);
            $("#name").focus();
            return true;
        }

        const birthDate = $("#birthDate").val().split("-");
        const today = new Date();
        const year = today.getFullYear();
        const month = today.getMonth() + 1;
        const date = today.getDate();

        if(birthDate[0]*1 > year*1 ||
            (birthDate[0]*1 === year*1 && birthDate[1]*1 > month*1) ||
            (birthDate[0]*1 === year*1 && birthDate[1]*1 === month*1 && birthDate[2]*1 > date*1)
        ){
            alert(`오늘 날짜 이후로 생일을 설정 할 수 없습니다.`);
            return true;
        }

        const stats = ["str", "int", "dex", "lux"];
        for (const stat of stats) {
            if ($(`#${stat}`).val() < 0 || $(`#${stat}`).val() > 200) {
                alert(`${stat.toUpperCase()}를 0이상 200이하로 설정해주세요.`);
                $(`#${stat}`).focus();
                return true;
            }
        }
        return false;
    }

    insertGameCharacter() {
        if (this.checkInputValueIsError(`forInsert`)) return;
        let newCharacter = this.createGameCharacter(`forInsert`);
        this.#characters.push(newCharacter);
        this.clearInput();
    }

    updateGameCharacter() {
        if (this.checkInputValueIsError(``)) return;
        let updateCharacter = this.createGameCharacter(`forUpdate`);
        let findIndex = this.findCharacterIndex($("#id").val());
        if (findIndex === -1) return;
        this.#characters[findIndex] = updateCharacter;
        this.clearInput();
    }

    deleteGameCharacter() {
        let findIndex = this.findCharacterIndex($("#id").val());
        if (findIndex === -1) return;
        this.#characters.splice(findIndex, 1);
        this.clearInput();
    }

    changeCls(cls) {
        const jobs = { "W": "전사", "M": "마법사", "A": "궁수", "T": "도적" };
        return jobs[cls] || cls;
    }

    changeSx(sx) {
        return sx === "M" ? "남자" : "여자";
    }

    showCharacters(character) {
        return `
    <div class="listDataRow">
      <div class="listItem"><div class="itemData text-wrapper">${character.name}</div></div>
      <div class="listItem"><div class="itemData text-wrapper">${this.changeCls(character.cls)}</div></div>
      <div class="listItem"><div class="itemData text-wrapper">${this.changeSx(character.sx)}</div></div>
      <div class="listItem"><div class="itemData text-wrapper">${character.hp}</div></div>
      <div class="listItem"><div class="itemData text-wrapper">${character.mp}</div></div>
      <div class="listItem"><div class="itemData text-wrapper">${character.birthDate}</div></div>
      <div class="listItem" style="display:none; visibility:hidden;">
        <div class="itemData text-wrapper">${character.id}</div>
      </div>
    </div>`;
    }

    printListHtml() {
        $(".listDataBlock").empty();
        for (let character of this.#characters) {
            $(".listDataBlock").append(this.showCharacters(character));
        }
    }

    printListAttack(selectedId) {
        $("#attStrTarget, #attIntTarget").empty().append(`<option value="0">선택하세요</option>`);
        for (let character of this.#characters) {
            if (character.id * 1 === selectedId * 1) continue;
            $("#attStrTarget, #attIntTarget").append(`<option value="${character.id}">${character.name}</option>`);
        }
    }

    clearInput() {
        $("#id").val(0);
        $("#name").val("");
        $("#cls").val("W");
        $("#sxM").prop("checked", true);
        $("#hp, #mp").val(1000);
        $("#birthDate").val("2021-01-01");
        $("#str, #int, #dex, #lux").val(0);
    }

    printItem(id) {
        let findItem = this.#characters.find((character) => character.id * 1 === id * 1);
        if (findItem) this.setInputData(findItem);
    }

    setInputData(character) {
        $("#id").val(character.id);
        $("#name").val(character.name);
        $("#cls").val(character.cls);
        $(`input[name="sx"][value="${character.sx}"]`).prop("checked", true);
        $("#hp").val(character.hp);
        $("#mp").val(character.mp);
        $("#birthDate").val(character.birthDate);
        $("#str").val(character.str);
        $("#int").val(character.int);
        $("#dex").val(character.dex);
        $("#lux").val(character.lux);
        this.printListAttack(character.id);
    }

    findCharacterIndex(id) {
        return this.#characters.findIndex((character) => character.id * 1 === id * 1);
    }

    attackStr() {
        const targetId = $("#attStrTarget").val() * 1;
        const attacker = this.#characters.find(c => c.id * 1 === $("#id").val() * 1);
        const target = this.#characters.find(c => c.id * 1 === targetId);
        if (!attacker || !target) return;
        target.hp -= attacker.str;
        if (target.hp <= 0) this.#characters.splice(this.findCharacterIndex(targetId), 1);
    }
}

$(() => {
    let characterManager = new gameCharacter();
    characterManager.printListHtml();

    $("#btnAdd").click((e) => {
        e.preventDefault();
        characterManager.insertGameCharacter();
        characterManager.printListHtml();
    });

    $("#btnUpt").click((e) => {
        e.preventDefault();
        characterManager.updateGameCharacter();
        characterManager.printListHtml();
    });

    $("#btnDel").click((e) => {
        e.preventDefault();
        characterManager.deleteGameCharacter();
        characterManager.printListHtml();
    });

    $(document).on("click", ".listDataRow", function() {
        characterManager.printItem($(this).children().last().text());
    });
});