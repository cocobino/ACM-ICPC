function solution(n, t, m, timetable, rst = '') {
    const cru = timetable.map(v => {
        const time = v.split(':')
        return {hour: Number(time[0]), minute: Number(time[1])}
    });
    const isPossible = (bus, cru) => {
        if (cru.hour < bus.hour) {
            return true
        }
        if (cru.hour > bus.hour) {
            return false;
        }
        if (bus.hour === cru.hour) {
            if (cru.minute <= bus.minute) return true;
            else return false;
        }
    }

    cru.sort((a, b) => {
        if (a.hour > b.hour) return 1;
        if (a.hour < b.hour) return -1;
        if (a.hour === b.hour) {
            if (a.minute > b.minute) return 1;
            if (a.minute < b.minute) return -1;
            if (a.minute === b.minute) return 0;
        }
    })

    let bus = {hour: 9, minute: 0};
    let cnt = 0;
    while (cnt < n) {
        cnt++;
        //버스시간에 해당 cru 태우기
        let removeIdx = 0;
        let take = false;
        for (removeIdx = 0; removeIdx < cru.length; removeIdx++) {
            // 버스시간 준수 && 버스정원
            if (!isPossible(bus, cru[removeIdx]) || removeIdx == m) {
                break;
            }
            take = true;
        }

        //solution
        if (take) {
            const takeCru = cru.slice(0, removeIdx);
            //마지막버스일경우
            if (cnt === n) {
                //크루수 < 버스자리
                if (removeIdx < m) {
                    return (`${bus.hour < 10 ? `0${bus.hour}` : bus.hour}:${bus.minute < 10 ? `0${bus.minute}` : bus.minute}`);
                    break;
                }
                //크루수 >= 버스자리
                if (removeIdx >= m) {
                    //버스 시간보다 빠른 첫번째크루
                    for (let i = takeCru.length - 1; i >= 0; i--) {
                        if (isPossible(bus, takeCru[i])) {
                            //버스 시간
                            if(takeCru[0].minute-1 <0) {
                                return `${takeCru[i].hour-1 < 10 ? `0${takeCru[i].hour-1}` : takeCru[i].hour-1}:59`
                            }
                            return(`${takeCru[i].hour < 10 ? `0${takeCru[i].hour}` : takeCru[i].hour}:${takeCru[i].minute-1 < 10 ? `0${takeCru[i].minute-1}` : takeCru[i].minute-1}`)
                            break;
                        }
                    }
                }
                break;
            }
            //대기줄제거
            cru.splice(0, removeIdx);
        }

        //마지막버스일경우
        if (cnt === n) {
            return(`${bus.hour < 10 ? `0${bus.hour}` : bus.hour}:${bus.minute < 10 ? `0${bus.minute}` : bus.minute}`);
        }

        //버스시간추가
        bus = bus.minute + t >= 60 ? {hour: bus.hour + 1, minute: (bus.minute + t) % 60} : {
            hour: bus.hour,
            minute: bus.minute + t
        };

    }

}

solution(2, 10, 2, ["09:10", "09:09", "08:00"]);