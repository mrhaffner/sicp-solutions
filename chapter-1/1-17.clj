;; Exercise 1.17
;; page 88

(defn double
    [a]
    (* a 2))

(defn halve
    [a]
    (/ a 2))

(defn fast-*-inner
    [a b]
    (cond   
            (= b 1) a
            (even? b) (fast-* (double a) (halve b))
            :else (fast-* (+ a b) (dec b))))

(defn fast-*
    [a b]
    (if (even? a) (fast-*-inner b a)
        (fast-*-inner a b)))

